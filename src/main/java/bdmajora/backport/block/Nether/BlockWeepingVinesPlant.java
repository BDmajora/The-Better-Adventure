package bdmajora.backport.block.Nether;

import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.world.World;

public class BlockWeepingVinesPlant extends BlockFlower {
	public BlockWeepingVinesPlant(String key, int id) {
		super(key, id);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		// This allows the block to be placed on the bottom of blocks and on any block
		return world.isAirBlock(x, y, z) && !world.isAirBlock(x, y + 1, z);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		super.onNeighborBlockChange(world, x, y, z, blockId);
		this.checkBlockCoordValid(world, x, y, z);
	}

	protected final void checkBlockCoordValid(World world, int i, int j, int k) {
		if (!this.canBlockStay(world, i, j, k)) {
			world.setBlock(i, j, k, 0);
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		// This allows the block to stay as long as there is a block above it
		return !world.isAirBlock(x, y + 1, z);
	}
}
