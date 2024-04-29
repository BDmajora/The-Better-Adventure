package bdmajora.backport.block;

import bdmajora.backport.item.ModItems;
import com.mojang.nbt.CompoundTag;
import net.minecraft.core.block.BlockTileEntity;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import bdmajora.backport.block.entity.TileEntityBanner;
import bdmajora.backport.entity.EntityBannerEdit;

public class BlockBanner extends BlockTileEntity {
	public BlockBanner(String key, int id, Material material) {
		super(key, id, material);
		float f = 0.125F;
		float f1 = 1.0F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
	}

	public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isSolidRender() {
		return false;
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		ItemStack stack = new ItemStack(ModItems.banner);
		if (tileEntity != null) {
			CompoundTag compound = new CompoundTag();
			((TileEntityBanner)tileEntity).writeBannerNBT(compound);
			stack.getData().putCompound("BannerData", compound);
		}

		return new ItemStack[]{stack};
	}

	public boolean blockActivated(World world, int x, int y, int z, EntityBannerEdit player) {
		if (!world.isClientSide) {
			TileEntityBanner Banner = (TileEntityBanner)world.getBlockTileEntity(x, y, z);
			if (Banner.owner != null && !Banner.owner.isEmpty() && !player.username.equals(Banner.owner)) {
				return false;
			} else {
				int heldItemId = player.getHeldItem() != null ? player.getHeldItem().itemID : 0;
				if (heldItemId != Item.map.id && heldItemId != ModItems.banner.id) {
					player.displayGUIEditBanner(Banner);
					return true;
				} else {
					return false;
				}
			}
		} else {
			return true;
		}
	}

	protected TileEntity getNewBlockEntity() {
		try {
			return new TileEntityBanner();
		} catch (Exception var2) {
			Exception exception = var2;
			throw new RuntimeException(exception);
		}
	}

}
