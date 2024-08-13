package bdmajora.backport.block.Flowers;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class Lilac extends Block {
	public final boolean isTop;

	public Lilac(String name, int id, Material material, boolean isTop) {
		super(name, id, material);
		this.isTop = isTop;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		if (isTop) {
			return new ItemStack[]{}; // Returns nothing if the top block is broken
		}
		return new ItemStack[]{new ItemStack(ModItems.lilac)};
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		if (y >= world.getHeightBlocks() - 1) {
			return false;
		} else {
			return world.canPlaceOnSurfaceOfBlock(x, y - 1, z) && super.canPlaceBlockAt(world, x, y, z) && super.canPlaceBlockAt(world, x, y + 1, z);
		}
	}
}
