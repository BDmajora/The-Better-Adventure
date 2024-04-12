package bdmajora.backport.item.Flowers;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemLilac extends Item {

	public ItemLilac(String name, int id) {
		super(name, id);
		this.maxStackSize = 64;
	}

	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			blockX += side.getOffsetX();
			blockY += side.getOffsetY();
			blockZ += side.getOffsetZ();
		}

		// Create the lilac blocks
		Block lilacBlockBottom = ModBlocks.lilacBottom;
		Block lilacBlockTop = ModBlocks.lilacTop;

		if (!lilacBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
			return false;
		} else if (!world.isAirBlock(blockX, blockY + 1, blockZ)) {
			// If the block above is not air, return false
			return false;
		} else {
			world.editingBlocks = true;
			world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, lilacBlockBottom.id, 0);
			world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, lilacBlockTop.id, 0);
			world.editingBlocks = false;
			world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, lilacBlockBottom.id);
			world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, lilacBlockTop.id);
			world.playBlockSoundEffect((Entity)null, (float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, lilacBlockBottom, EnumBlockSoundEffectType.PLACE);
			itemstack.consumeItem(entityplayer);
			return true;
		}
	}


}
