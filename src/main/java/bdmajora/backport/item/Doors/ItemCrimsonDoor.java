package bdmajora.backport.item.Doors;

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

public class ItemCrimsonDoor extends Item {

	public ItemCrimsonDoor(String name, int id, String texture) {
		super(name, id);
		this.texture = texture;
		this.maxStackSize = 64;
	}

	private String texture;

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

		// Create the door blocks
		Block doorBlockBottom = ModBlocks.crimsonDoorBottom;
		Block doorBlockTop = ModBlocks.crimsonDoorTop;

		if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
			return false;
		} else {
			Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
			int meta = dir.getHorizontalIndex();
			int xOffset = -dir.getOffsetX();
			int zOffset = -dir.getOffsetZ();
			int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
			int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
			boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
			boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
			boolean isMirrored = false;
			if (isDoorLeft && !isDoorRight) {
				isMirrored = true;
			} else if (isSolidBlockRight > isSolidBlockLeft) {
				isMirrored = true;
			}

			if (isMirrored) {
				meta = meta - 1 & 3;
				meta += 4;
				meta |= 8;
			}

			world.editingBlocks = true;
			world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
			world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
			world.editingBlocks = false;
			world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
			world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
			world.playBlockSoundEffect((Entity)null, (float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
			itemstack.consumeItem(entityplayer);
			return true;
		}
	}
}
