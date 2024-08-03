//package bdmajora.backport.item;
//
//import bdmajora.backport.block.ModBlocks;
//import com.mojang.nbt.CompoundTag;
//import com.mojang.nbt.ListTag;
//import net.minecraft.core.block.Block;
//import net.minecraft.core.enums.EnumBlockSoundEffectType;
//import net.minecraft.core.item.ItemFlag;
//import net.minecraft.core.item.ItemStack;
//import net.minecraft.core.util.helper.Side;
//import net.minecraft.core.world.World;
//import bdmajora.backport.block.entity.TileEntityBanner;
//import bdmajora.backport.entity.EntityBannerEdit;
//
//public class ItemBanner extends ItemFlag {
//	public ItemBanner(String name, int id) {
//		super(name, id);
//		this.setMaxStackSize(1);
//	}
//
//	@Override
//	public String getLanguageKey(ItemStack itemstack) {
//		return !this.hasBannerBeenDrawnOn(itemstack) && !this.doesBannerContainDyes(itemstack) ? super.getLanguageKey(itemstack) : this.getKey() + ".modified";
//	}
//
//
//	public boolean onItemUse(ItemStack stack, EntityBannerEdit entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
//		TileEntityBanner tileentitybanner;
//		CompoundTag BannerData;
//		if (world.getBlockId(blockX, blockY, blockZ) == ModBlocks.banner.id && !entityplayer.isSneaking()) {
//			tileentitybanner = (TileEntityBanner)world.getBlockTileEntity(blockX, blockY, blockZ);
//			if (tileentitybanner != null) {
//				BannerData = stack.getData().getCompoundOrDefault("BannerData", new CompoundTag());
//				if (this.hasBannerBeenDrawnOn(stack) && this.doesBannerContainDyes(stack)) {
//					entityplayer.addChatMessage("Banner.overwrite");
//					return false;
//				}
//
//				tileentitybanner.copyBannerNBT(BannerData);
//				BannerData.putString("Owner", entityplayer.username);
//				stack.getData().putCompound("BannerData", BannerData);
//				entityplayer.addChatMessage("Banner.copied");
//				return true;
//			}
//		}
//
//		if (side == Side.BOTTOM) {
//			return false;
//		} else if (!world.getBlockMaterial(blockX, blockY, blockZ).isSolid()) {
//			return false;
//		} else {
//			if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
//				blockX += side.getOffsetX();
//				blockY += side.getOffsetY();
//				blockZ += side.getOffsetZ();
//			}
//
//			if (blockY >= 0 && blockY < world.getHeightBlocks()) {
//				if (!Block.signPostPlanksOak.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
//					return false;
//				} else {
//					world.playBlockSoundEffect(entityplayer, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), ModBlocks.banner, EnumBlockSoundEffectType.PLACE);
//					world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, ModBlocks.banner.id, 0);
//					stack.consumeItem(entityplayer);
//					tileentitybanner = (TileEntityBanner)world.getBlockTileEntity(blockX, blockY, blockZ);
//					if (tileentitybanner != null) {
//						BannerData = stack.getData().getCompoundOrDefault("BannerData", (CompoundTag)null);
//						if (BannerData != null) {
//							tileentitybanner.readBannerNBT(BannerData);
//						}
//
//						if (!world.isClientSide && tileentitybanner.owner.isEmpty()) {
//							entityplayer.displayGUIEditBanner(tileentitybanner);
//						}
//					}
//
//					return true;
//				}
//			} else {
//				return false;
//			}
//		}
//	}
//
//
//	public boolean hasBannerBeenDrawnOn(ItemStack stack) {
//		CompoundTag BannerData = stack.getData().getCompound("BannerData");
//		if (BannerData == null) {
//			return false;
//		} else {
//			byte[] colors = BannerData.getByteArray("Colors");
//			if (colors == null) {
//				return false;
//			} else {
//				for(int i = 0; i < colors.length; ++i) {
//					if (colors[i] != 0) {
//						return true;
//					}
//				}
//
//				return false;
//			}
//		}
//	}
//
//
//	public boolean doesBannerContainDyes(ItemStack stack) {
//		CompoundTag BannerData = stack.getData().getCompound("BannerData");
//		if (BannerData == null) {
//			return false;
//		} else {
//			ListTag items = BannerData.getList("Items");
//			return items != null && items.tagCount() > 0;
//		}
//	}
//}
