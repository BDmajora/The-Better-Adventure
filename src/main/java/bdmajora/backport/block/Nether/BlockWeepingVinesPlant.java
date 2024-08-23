package bdmajora.backport.block.Nether;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockWeepingVinesPlant extends BlockFlower {
	public BlockWeepingVinesPlant(String key, int id) {
		super(key, id);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return world.isAirBlock(x, y, z) && !world.isAirBlock(x, y + 1, z);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		super.onNeighborBlockChange(world, x, y, z, blockId);
		this.checkBlockCoordValid(world, x, y, z);

		int belowBlockId = world.getBlockId(x, y - 1, z);
		int aboveBlockId = world.getBlockId(x, y + 1, z);

		// Correct logic: Check the block below and update the block above
		if (belowBlockId == ModBlocks.weepingVines.id) {
			world.setBlockWithNotify(x, y, z, ModBlocks.weepingVinesPlant.id);
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
		return !world.isAirBlock(x, y + 1, z);
	}

	protected void updateBlockState(World world, int x, int y, int z) {
		int belowBlockId = world.getBlockId(x, y - 1, z);
		int aboveBlockId = world.getBlockId(x, y + 1, z);

		// Update state based on the block below
		if (belowBlockId == ModBlocks.weepingVines.id) {
			world.setBlockWithNotify(x, y, z, ModBlocks.weepingVinesPlant.id);
		}
	}

	@Override
	public boolean isClimbable(World world, int x, int y, int z) {
		return true;
	}

	public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}
}
