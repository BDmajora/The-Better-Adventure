package bdmajora.backport.item.Flowers;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemFlower extends Item {
	protected final Block flowerBlockBottom;
	protected final Block flowerBlockTop;

	public ItemFlower(String name, int id, Block flowerBlockBottom, Block flowerBlockTop) {
		super(name, id);
		this.maxStackSize = 64;
		this.flowerBlockBottom = flowerBlockBottom;
		this.flowerBlockTop = flowerBlockTop;
	}

	public boolean onUseItemOnBlock(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			blockX += side.getOffsetX();
			blockY += side.getOffsetY();
			blockZ += side.getOffsetZ();
		}

		if (!this.flowerBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
			return false;
		} else {
			Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
			int meta = dir.getHorizontalIndex();

			// Ensure correct block placement by swapping the top and bottom
			world.editingBlocks = true;
			world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, this.flowerBlockTop.id, meta);
			world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, this.flowerBlockBottom.id, meta);
			world.editingBlocks = false;
			world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, this.flowerBlockTop.id);
			world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, this.flowerBlockBottom.id);
			world.playBlockSoundEffect(entityplayer, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), this.flowerBlockBottom, EnumBlockSoundEffectType.PLACE);
			itemstack.consumeItem(entityplayer);
			return true;
		}
	}
}
