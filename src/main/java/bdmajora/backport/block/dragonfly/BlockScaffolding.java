package bdmajora.backport.block.dragonfly;

import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import org.useless.dragonfly.model.block.BlockModelDragonFly;
import org.useless.dragonfly.model.block.processed.BlockCube;

import java.util.ArrayList;

public class BlockScaffolding extends BlockTransparent {

	public BlockScaffolding(String key, int id, Material material) {
		super(key, id, material);
	}

	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		int meta = world.getBlockMetadata(x, y, z);
		meta += player.isSneaking() ? -1 : 1;
		if (meta < 0) {
			meta += 256;
		}
		if (meta > 255) {
			meta -= 256;
		}
		world.setBlockMetadataWithNotify(x, y, z, meta);
		return true;
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
		if (model instanceof BlockModelDragonFly) {
			BlockModelDragonFly modelDragonFly = (BlockModelDragonFly) model;
			for (BlockCube cube : modelDragonFly.baseModel.blockCubes) {
				setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
				if (cube.yMax() == 1.0) {
					// Only add the top bounding box
					AABB topBoundingBox = this.getCollisionBoundingBoxFromPool(world, x, y, z);
					if (topBoundingBox != null && aabb.intersectsWith(topBoundingBox)) {
						aabbList.add(topBoundingBox);
					}
				}
			}
		} else {
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
		}
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}

	@Override
	public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z)
	{
		return null;
	}

	@Override
	public boolean isClimbable(World world, int x, int y, int z) {
		return true; // Make the block climbable
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
}
