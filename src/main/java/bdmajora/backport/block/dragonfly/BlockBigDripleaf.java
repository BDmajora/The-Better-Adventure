package bdmajora.backport.block.dragonfly;

import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import org.useless.dragonfly.model.block.BlockModelDragonFly;
import org.useless.dragonfly.model.block.processed.BlockCube;

import java.util.ArrayList;

import bdmajora.backport.block.ModBlocks;

public class BlockBigDripleaf extends BlockTransparent {
	public BlockBigDripleaf(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int meta = world.getBlockMetadata(x, y, z) & 0x11111100;
		Direction hRotation = entity.getHorizontalPlacementDirection(side);
		if (hRotation == Direction.NORTH) {
			meta |= 2;
		} else if (hRotation == Direction.EAST) {
			meta |= 1;
		} else if (hRotation == Direction.SOUTH) {
			meta |= 3;
		} else if (hRotation == Direction.WEST) {
			meta |= 0;
		}
		world.setBlockMetadataWithNotify(x, y, z, meta);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		super.onNeighborBlockChange(world, x, y, z, blockId);
		this.checkBlockCoordValid(world, x, y, z);

		int aboveBlockId = world.getBlockId(x, y + 1, z);

		// Replace the current block with bigDripleafStem if the block above is also bigDripleaf
		if (aboveBlockId == ModBlocks.bigDripleaf.id) {
			// Extract the current metadata
			int meta = world.getBlockMetadata(x, y, z);

			// Replace with bigDripleafStem and apply the updated metadata
			world.setBlockAndMetadataWithNotify(x, y, z, ModBlocks.bigDripleafStem.id, meta);
		}
	}

	protected final void checkBlockCoordValid(World world, int x, int y, int z) {
		if (!this.canBlockStay(world, x, y, z)) {
			world.setBlock(x, y, z, 0);
		} else {
			this.updateBlockState(world, x, y, z);
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		return !world.isAirBlock(x, y - 1, z);
	}

	protected void updateBlockState(World world, int x, int y, int z) {
		int aboveBlockId = world.getBlockId(x, y + 1, z);

		// Ensure the block below becomes bigDripleafStem if the block above is bigDripleaf
		if (aboveBlockId == ModBlocks.bigDripleaf.id) {
			// Extract the current metadata
			int meta = world.getBlockMetadata(x, y, z);

			// Replace with bigDripleafStem and apply the updated metadata
			world.setBlockAndMetadataWithNotify(x, y, z, ModBlocks.bigDripleafStem.id, meta);
		}
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
}
