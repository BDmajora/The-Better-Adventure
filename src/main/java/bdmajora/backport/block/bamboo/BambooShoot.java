package bdmajora.backport.block.bamboo;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.enums.LightLayer;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import org.useless.dragonfly.model.block.BlockModelDragonFly;
import org.useless.dragonfly.model.block.processed.BlockCube;

import java.util.ArrayList;
import java.util.Random;

public class BambooShoot extends BlockTransparent implements IBonemealable {

	public BambooShoot(String key, int id) {
		super(key, id, Material.vegetable);
		this.setTicking(true);
		float f = 0.375f;
		this.setBlockBounds(0.5f - f, 0.0, 0.5f - f, 0.5f + f, 1.0, 0.5f + f);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (world.isAirBlock(x, y + 1, z) && world.getSavedLightValue(LightLayer.Block, x, y + 1, z) >= 1) {
			int height = 1;
			while (world.getBlockId(x, y - height, z) == this.id) {
				++height;
			}
			if (height < 32) {
				world.setBlockWithNotify(x, y + 1, z, this.id);
			}
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		return world.canBlockSeeTheSky(x, y, z) && this.canThisPlantGrowOnThisBlockID(world.getBlockId(x, y - 1, z));
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return super.canPlaceBlockAt(world, x, y, z) && this.canThisPlantGrowOnThisBlockID(world.getBlockId(x, y - 1, z));
	}

	protected boolean canThisPlantGrowOnThisBlockID(int i) {
		if (Block.blocksList[i] == null) {
			return false;
		}
		return Block.blocksList[i].hasTag(BlockTags.GROWS_FLOWERS) || Block.blocksList[i] == this;
	}

	@Override
	public boolean onBonemealUsed(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, Side side, double d, double e) {
		boolean flag = false;

		int height = 0;
		while (world.getBlockId(x, y + height, z) == this.id) {
			++height;
		}

		if (height < 32 && world.isAirBlock(x, y + height, z)) {
			world.setBlockWithNotify(x, y + height, z, ModBlocks.bambooShoot.id);
			flag = true;
		}

		if (entityPlayer.getGamemode().consumeBlocks()) {
			--itemStack.stackSize;
		}
		return flag;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean canPlaceOnSurface() {
		return true;
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}

	@Override
	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
		BlockModel<?> model = BlockModelDispatcher.getInstance().getDispatch(this);
		if (!(model instanceof BlockModelDragonFly)) {
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
			return;
		}
		BlockModelDragonFly modelDragonFly = (BlockModelDragonFly) model;
		for (BlockCube cube : modelDragonFly.baseModel.blockCubes) {
			setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
		}
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		super.onNeighborBlockChange(world, x, y, z, blockId);
		this.checkBlockCoordValid(world, x, y, z);
	}

	protected void checkBlockCoordValid(World world, int x, int y, int z) {
		if (!this.canBlockStay(world, x, y, z)) {
			this.destroyAllAbove(world, x, y, z);
			world.setBlock(x, y, z, 0); // Remove the block if it can't stay
		}
	}

	protected void destroyAllAbove(World world, int x, int y, int z) {
		for (int i = y + 1; i <= 256; i++) { // Assume 256 is the world height limit
			if (world.getBlockId(x, i, z) == this.id) {
				world.setBlock(x, i, z, 0); // Destroy block above
			} else {
				break;
			}
		}
	}

	@Override
	public boolean isClimbable(World world, int x, int y, int z) {
		return true;  // Make the block climbable
	}

	public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;  // No collision box, allows player to climb through
	}
}
