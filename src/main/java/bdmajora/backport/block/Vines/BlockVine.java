package bdmajora.backport.block.Vines;

import net.minecraft.core.block.BlockLadder;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockVine extends BlockLadder {
	public BlockVine(String key, int id, Material grass) {
		super(key, id);
		this.setTicking(true);
		float f = 0.5f;
		this.setBlockBounds(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
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
		// This allows the block to stay as long as there is a block on any side of it
		return !world.isAirBlock(x + 1, y, z) || !world.isAirBlock(x - 1, y, z) || !world.isAirBlock(x, y, z + 1) || !world.isAirBlock(x, y, z - 1);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);
		if (world.getBlockLightValue(x, y + 1, z) >= 9) {
			int belowBlockId = world.getBlockId(x, y - 1, z);
			if (belowBlockId == 0) {
				// Add a new BlockVine below the current block
				world.setBlockWithNotify(x, y - 1, z, this.id);
				// Replace the current block with a BlockVine
				world.setBlockWithNotify(x, y, z, this.id);
			}
		}
	}

	// Add the getMetaForSide method from the ItemBlockLadder class
	public int getMetaForSide(Side side) {
		if (side == Side.NORTH) {
			return 2;
		}
		if (side == Side.SOUTH) {
			return 3;
		}
		if (side == Side.WEST) {
			return 4;
		}
		if (side == Side.EAST) {
			return 5;
		}
		return 0;
	}

}
