package bdmajora.backport.block.container;

import java.util.List;

import bdmajora.backport.block.entity.TileEntityBanner;
import net.minecraft.core.InventoryAction;
import net.minecraft.core.block.entity.TileEntityFlag;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.player.inventory.Container;
import net.minecraft.core.player.inventory.IInventory;
import net.minecraft.core.player.inventory.slot.Slot;
import net.minecraft.core.player.inventory.slot.SlotDye;

public class ContainerBanner extends Container {
	public TileEntityBanner tileEntity;

	public ContainerBanner(IInventory inv, TileEntityBanner banner) {
		this.tileEntity = banner;
		this.addSlot(new SlotDye(banner, 36, 129, 10));
		this.addSlot(new SlotDye(banner, 37, 129, 32));
		this.addSlot(new SlotDye(banner, 38, 129, 54));

		int i;
		for(i = 0; i < 3; ++i) {
			for(int x = 0; x < 9; ++x) {
				this.addSlot(new Slot(inv, x + i * 9 + 9, 8 + x * 18, 113 + i * 18));
			}
		}

		for(i = 0; i < 9; ++i) {
			this.addSlot(new Slot(inv, i, 8 + i * 18, 171));
		}

	}

	public List<Integer> getMoveSlots(InventoryAction action, Slot slot, int target, EntityPlayer player) {
		if (slot.id >= 0 && slot.id <= 2) {
			return this.getSlots(0, 3, false);
		} else if (action == InventoryAction.MOVE_SIMILAR) {
			return this.getSlots(3, 36, false);
		} else if (action == InventoryAction.MOVE_ALL) {
			return slot.id < 27 ? this.getSlots(3, 27, false) : this.getSlots(30, 9, false);
		} else {
			return null;
		}
	}

	public List<Integer> getTargetSlots(InventoryAction action, Slot slot, int target, EntityPlayer player) {
		return slot.id >= 0 && slot.id <= 2 ? this.getSlots(3, 36, false) : this.getSlots(0, 3, false);
	}

	public boolean isUsableByPlayer(EntityPlayer entityplayer) {
		return this.tileEntity.canInteractWith(entityplayer);
	}
}
