package bdmajora.backport.block.Vines;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.world.World;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.phys.AABB;

public class BlockCaveVinesLit extends BlockFlower {
	public BlockCaveVinesLit(String key, int id) {
		super(key, id);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		// Allows the block to be placed if the block above is solid and the current position is air
		return world.isAirBlock(x, y, z) && !world.isAirBlock(x, y + 1, z);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		super.onNeighborBlockChange(world, x, y, z, blockId);
		this.checkBlockCoordValid(world, x, y, z);
	}

	protected final void checkBlockCoordValid(World world, int x, int y, int z) {
		if (!this.canBlockStay(world, x, y, z)) {
			world.setBlock(x, y, z, 0); // Remove the block if it can't stay
		} else {
			this.updateBlockState(world, x, y, z); // Update block state if necessary
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		// Allows the block to stay as long as there is a solid block above it
		return !world.isAirBlock(x, y + 1, z);
	}

	protected void updateBlockState(World world, int x, int y, int z) {
		int aboveBlockId = world.getBlockId(x, y + 1, z);

		// If the block above is also a vine, update the current block to vine plant lit
		if (aboveBlockId == this.id) {
			world.setBlockWithNotify(x, y, z, ModBlocks.caveVinesPlantLit.id);
		}

		// If the block above is the same as this one, set the block above to vine plant lit
		if (aboveBlockId == this.id) {
			world.setBlockWithNotify(x, y + 1, z, ModBlocks.caveVinesPlantLit.id);
		}
	}

	@Override
	public boolean isClimbable(World world, int x, int y, int z) {
		return true;  // Make the block climbable
	}

	public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;  // No collision box, allows player to climb through
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileentity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack(this)};
			default:
				return new ItemStack[]{new ItemStack(ModItems.glowBerries, 1)};  // Drop glow berries by default
		}
	}
}
