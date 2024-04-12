package bdmajora.backport.item;

import com.mojang.nbt.CompoundTag;
import com.mojang.nbt.ListTag;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntityFlag;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemBanner extends Item {
	public ItemBanner(String name, int id) {
		super(name, id);
		this.setMaxStackSize(1);
	}

	public String getLanguageKey(ItemStack itemstack) {
		return !this.hasFlagBeenDrawnOn(itemstack) && !this.doesFlagContainDyes(itemstack) ? super.getLanguageKey(itemstack) : this.getKey() + ".modified";
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		TileEntityFlag tileentityflag;
		CompoundTag flagData;
		if (world.getBlockId(blockX, blockY, blockZ) == Block.flag.id && !entityplayer.isSneaking()) {
			tileentityflag = (TileEntityFlag)world.getBlockTileEntity(blockX, blockY, blockZ);
			if (tileentityflag != null) {
				flagData = stack.getData().getCompoundOrDefault("FlagData", new CompoundTag());
				if (this.hasFlagBeenDrawnOn(stack) && this.doesFlagContainDyes(stack)) {
					entityplayer.addChatMessage("flag.overwrite");
					return false;
				}

				tileentityflag.copyFlagNBT(flagData);
				stack.getData().putCompound("FlagData", flagData);
				entityplayer.addChatMessage("flag.copied");
				return true;
			}
		}

		if (side == Side.BOTTOM) {
			return false;
		} else if (!world.getBlockMaterial(blockX, blockY, blockZ).isSolid()) {
			return false;
		} else {
			if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
				blockX += side.getOffsetX();
				blockY += side.getOffsetY();
				blockZ += side.getOffsetZ();
			}

			if (blockY >= 0 && blockY < world.getHeightBlocks()) {
				if (!Block.signPostPlanksOak.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
					return false;
				} else {
					world.playBlockSoundEffect(entityplayer, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), Block.flag, EnumBlockSoundEffectType.PLACE);
					world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, Block.flag.id, 0);
					stack.consumeItem(entityplayer);
					tileentityflag = (TileEntityFlag)world.getBlockTileEntity(blockX, blockY, blockZ);
					if (tileentityflag != null) {
						flagData = stack.getData().getCompoundOrDefault("FlagData", (CompoundTag)null);
						if (flagData != null) {
							tileentityflag.readFlagNBT(flagData);
						}

						if (!world.isClientSide && tileentityflag.owner.isEmpty()) {
							entityplayer.displayGUIEditFlag(tileentityflag);
						}
					}

					return true;
				}
			} else {
				return false;
			}
		}
	}

	public boolean hasFlagBeenDrawnOn(ItemStack stack) {
		CompoundTag flagData = stack.getData().getCompound("FlagData");
		if (flagData == null) {
			return false;
		} else {
			byte[] colors = flagData.getByteArray("Colors");
			if (colors == null) {
				return false;
			} else {
				for(int i = 0; i < colors.length; ++i) {
					if (colors[i] != 0) {
						return true;
					}
				}

				return false;
			}
		}
	}

	public boolean doesFlagContainDyes(ItemStack stack) {
		CompoundTag flagData = stack.getData().getCompound("FlagData");
		if (flagData == null) {
			return false;
		} else {
			ListTag items = flagData.getList("Items");
			return items != null && items.tagCount() > 0;
		}
	}
}
