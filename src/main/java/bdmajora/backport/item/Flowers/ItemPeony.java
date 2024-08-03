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

public class ItemPeony extends Item {
	private String texture;

	public ItemPeony(String name, int id, String texture) {
		super(name, id);
		this.maxStackSize = 64;
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			blockX += side.getOffsetX();
			blockY += side.getOffsetY();
			blockZ += side.getOffsetZ();
		}

		Block peonyBlockBottom = ModBlocks.peonyBottom;
		Block peonyBlockTop = ModBlocks.peonyTop;

		if (!peonyBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
			return false;
		} else if (!world.isAirBlock(blockX, blockY + 1, blockZ)) {
			// If the block above is not air, return false
			return false;
		} else {
			world.editingBlocks = true;
			world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, peonyBlockBottom.id, 0);
			world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, peonyBlockTop.id, 0);
			world.editingBlocks = false;
			world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, peonyBlockBottom.id);
			world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, peonyBlockTop.id);
			world.playBlockSoundEffect((Entity)null, (float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, peonyBlockBottom, EnumBlockSoundEffectType.PLACE);
			itemstack.consumeItem(entityplayer);
			return true;
		}
	}
}
