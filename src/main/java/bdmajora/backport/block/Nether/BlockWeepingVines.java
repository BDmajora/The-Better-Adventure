package bdmajora.backport.block.Nether;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.world.World;
import java.util.Random;

public class BlockWeepingVines extends BlockFlower {
	public BlockWeepingVines(String key, int id) {
		super(key, id);
		this.setTicking(true);
		float f = 0.5f;
		this.setBlockBounds(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
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


	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);
		if (world.getBlockLightValue(x, y + 1, z) >= 9) {
			int belowBlockId = world.getBlockId(x, y - 1, z);
			if (belowBlockId == 0) {
				// Add a new BlockWeepingVines below the current block
				world.setBlockWithNotify(x, y - 1, z, this.id);
				// Replace the current block with a BlockWeepingVinesPlant
				world.setBlockWithNotify(x, y, z, ModBlocks.weepingVinesPlant.id);
			}
		}
	}


}
