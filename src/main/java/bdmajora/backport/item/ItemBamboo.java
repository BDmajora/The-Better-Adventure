package bdmajora.backport.item;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemBamboo extends Item {
	private final Block bambooToPlace;

	public ItemBamboo(String name, int id, Block bambooToPlace) {
		super(name, id);
		this.bambooToPlace = bambooToPlace;
	}

	@Override
	public boolean onUseItemOnBlock(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		// Adjust the block position based on the side clicked
		if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			blockX += side.getOffsetX();
			blockY += side.getOffsetY();
			blockZ += side.getOffsetZ();
		}

		// Check if the block can be placed at the target location
		if (world.isAirBlock(blockX, blockY, blockZ) && world.canPlaceOnSurfaceOfBlock(blockX, blockY - 1, blockZ)) {
			world.setBlockWithNotify(blockX, blockY, blockZ, this.bambooToPlace.id);
			itemstack.consumeItem(entityplayer);  // Consume the item after placing the block
			return true;
		} else {
			return false;
		}
	}
}
