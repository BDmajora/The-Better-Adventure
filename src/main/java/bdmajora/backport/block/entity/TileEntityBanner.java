package bdmajora.backport.block.entity;

import com.mojang.nbt.CompoundTag;
import com.mojang.nbt.ListTag;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntityFlag;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.net.packet.Packet;
import net.minecraft.core.net.packet.Packet140TileEntityData;
import net.minecraft.core.player.inventory.IInventory;

public class TileEntityBanner extends TileEntityFlag {
	public final int CANVAS_WIDTH = 20;
	public final int CANVAS_HEIGHT = 40;
	public final byte[] BannerColors = new byte[384];
	public ItemStack[] items = new ItemStack[3];
	public String owner = "";

	public TileEntityBanner() {
	}

	public byte getColor(int x, int y) {
		int xSample = x;
		int ySample = y;
		if (x < 0) {
			xSample = 0;
		}

		if (x >= 20) {
			xSample = 19;
		}

		if (y < 0) {
			ySample = 0;
		}

		if (y >= 40) {
			ySample = 39;
		}

		int colorIndex = this.BannerColors[xSample + 20 * ySample] - 1;
		if (colorIndex >= 0 && colorIndex < this.items.length) {
			return this.items[colorIndex] != null && this.items[colorIndex].itemID == Item.dye.id ? (byte)(this.items[colorIndex].getMetadata() & 39) : 39;
		} else {
			return 39;
		}
	}

	public void writeToNBT(CompoundTag tag) {
		super.writeToNBT(tag);
		this.writeBannerNBT(tag);
	}

	public void writeBannerNBT(CompoundTag tag) {
		byte[] packedColors = this.packBannerColors(this.BannerColors);
		tag.putByteArray("Colors", packedColors);
		tag.putString("Owner", this.owner);
		ListTag list = new ListTag();

		for(int i = 0; i < this.items.length; ++i) {
			if (this.items[i] != null) {
				CompoundTag compound = new CompoundTag();
				compound.putByte("Slot", (byte)i);
				this.items[i].writeToNBT(compound);
				list.addTag(compound);
			}
		}

		tag.putList("Items", list);
	}

	public void readFromNBT(CompoundTag tag) {
		super.readFromNBT(tag);
		this.readBannerNBT(tag);
	}

	public void readBannerNBT(CompoundTag tag) {
		byte[] packedColors = tag.getByteArrayOrDefault("Colors", (byte[])null);
		if (packedColors == null) {
			packedColors = new byte[96];
		}

		byte[] unpackedColors = this.unpackBannerColors(packedColors);
		System.arraycopy(unpackedColors, 0, this.BannerColors, 0, 384);
		this.owner = tag.getStringOrDefault("Owner", "");
		ListTag list = tag.getList("Items");
		this.items = new ItemStack[this.getSizeInventory()];

		for(int i = 0; i < list.tagCount(); ++i) {
			CompoundTag compound = (CompoundTag)list.tagAt(i);
			int slot = compound.getByte("Slot");
			if (slot < this.items.length && slot > -1) {
				this.items[slot] = ItemStack.readItemStackFromNbt(compound);
			}
		}

	}

	public void copyBannerNBT(CompoundTag tag) {
		byte[] packedColors = this.packBannerColors(this.BannerColors);
		String copyOwner = tag.getStringOrDefault("Owner", "");
		if (copyOwner.isEmpty()) {
			tag.putString("Owner", this.owner);
		}

		tag.putByteArray("Colors", packedColors);
	}

	private byte[] packBannerColors(byte[] unpacked) {
		byte[] packed = new byte[96];

		for(int i = 0; i < 96; ++i) {
			packed[i] = 0;
			packed[i] = (byte)(packed[i] | (unpacked[i * 4 + 0] & 3) << 0);
			packed[i] = (byte)(packed[i] | (unpacked[i * 4 + 1] & 3) << 2);
			packed[i] = (byte)(packed[i] | (unpacked[i * 4 + 2] & 3) << 4);
			packed[i] = (byte)(packed[i] | (unpacked[i * 4 + 3] & 3) << 6);
		}

		return packed;
	}

	private byte[] unpackBannerColors(byte[] packed) {
		byte[] unpacked = new byte[384];

		for(int i = 0; i < 96; ++i) {
			unpacked[i * 4 + 0] = (byte)((packed[i] & 3) >> 0);
			unpacked[i * 4 + 1] = (byte)((packed[i] & 12) >> 2);
			unpacked[i * 4 + 2] = (byte)((packed[i] & 48) >> 4);
			unpacked[i * 4 + 3] = (byte)((packed[i] & 192) >> 6);
		}

		return unpacked;
	}

	public int getSizeInventory() {
		return 3;
	}

	public ItemStack getStackInSlot(int i) {
		i -= 36;
		return i >= 0 && i < 3 ? this.items[i] : null;
	}

	public ItemStack decrStackSize(int index, int numToTake) {
		index -= 36;
		if (this.items[index] != null) {
			ItemStack splitStack;
			if (this.items[index].stackSize <= numToTake) {
				splitStack = this.items[index];
				this.items[index] = null;
				this.onInventoryChanged();
				return splitStack;
			} else {
				splitStack = this.items[index].splitStack(numToTake);
				if (this.items[index].stackSize <= 0) {
					this.items[index] = null;
				}

				this.onInventoryChanged();
				return splitStack;
			}
		} else {
			return null;
		}
	}

	public Packet getDescriptionPacket() {
		return new Packet140TileEntityData(this);
	}

	public void setInventorySlotContents(int index, ItemStack stack) {
		index -= 36;
		this.items[index] = stack;
		this.onInventoryChanged();
	}

	public String getInvName() {
		return "Banner";
	}

	public int getInventoryStackLimit() {
		return 1;
	}

	public boolean canInteractWith(EntityPlayer entityplayer) {
		if (this.worldObj.getBlockTileEntity(this.x, this.y, this.z) != this) {
			return false;
		} else {
			return entityplayer.distanceToSqr((double)this.x + 0.5, (double)this.y + 0.5, (double)this.z + 0.5) <= 64.0;
		}
	}

	public void sortInventory() {
	}
}
