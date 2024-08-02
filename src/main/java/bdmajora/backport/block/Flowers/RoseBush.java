package bdmajora.backport.block.Flowers;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class RoseBush extends Block {

	public RoseBush(String name, int id, Material material, boolean isTop) {
		super(name, id, material);
		// Additional custom properties or logic can be added here
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(ModItems.roseBush)};
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		Block blockBelow = world.getBlock(x, y - 1, z);
		return blockBelow == ModBlocks.roseBushBottom || super.canPlaceBlockAt(world, x, y, z);
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public float getHardness() {
		return 0.0F; // Makes the block break instantly
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, Side side, int meta, EntityPlayer player, Item item) {
		super.onBlockDestroyedByPlayer(world, x, y, z, side, meta, player, item);
		if (world.getBlock(x, y + 1, z) == ModBlocks.roseBushTop) {
			world.setBlockWithNotify(x, y + 1, z, 0); // Destroys the top half
		} else if (world.getBlock(x, y - 1, z) == ModBlocks.roseBushBottom) {
			world.setBlockWithNotify(x, y - 1, z, 0); // Destroys the bottom half
		}
	}
}
