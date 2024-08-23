package bdmajora.backport.block.bamboo;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
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
		if (world.isAirBlock(x, y + 1, z)) {
			int height;
			for (height = 1; world.getBlockId(x, y - height, z) == this.id; ++height) {
				// Count the height of the bamboo stack
			}

			if (height < 32) { // Limit bamboo height to 32 blocks
				world.setBlockWithNotify(x, y + 1, z, this.id); // Grow bamboo upwards
			}
		}
	}

	public void growBambooOnTop(World world, int x, int y, int z) {
		int height;
		for (height = 1; world.getBlockId(x, y + height, z) == this.id; ++height) {
			// Count how many bamboo blocks are stacked
		}

		if (world.isAirBlock(x, y + height, z)) {
			world.setBlockWithNotify(x, y + height, z, this.id); // Place a new bamboo block on top
		}
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		int blockBelow = world.getBlockId(x, y - 1, z);
		if (blockBelow == this.id) {
			return true;
		} else if (Block.blocksList[blockBelow] == null) {
			return false;
		} else {
			return Block.blocksList[blockBelow].hasTag(BlockTags.GROWS_FLOWERS);
		}
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		this.checkBlockCoordValid(world, x, y, z);
	}

	protected final void checkBlockCoordValid(World world, int x, int y, int z) {
		if (!this.canBlockStay(world, x, y, z)) {
			this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), (TileEntity) null);
			world.setBlockWithNotify(x, y, z, 0);
		}
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(ModItems.bamboo, 1)};
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		return this.canPlaceBlockAt(world, x, y, z);
	}

	public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean onBonemealUsed(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		if (!world.isClientSide) {
			this.growBambooOnTop(world, blockX, blockY, blockZ); // Grow bamboo on top when bonemeal is used
			if (entityplayer.getGamemode().consumeBlocks()) {
				--itemstack.stackSize; // Decrease bonemeal stack size
			}
		}
		return true;
	}
}
