package bdmajora.backport.interfaces.mixins;

import bdmajora.backport.block.entity.TileEntityEnchantmentTable;
import net.minecraft.core.player.inventory.IInventory;

public interface IEntityPlayer
{
	void displayGUIEnchantmentTable(TileEntityEnchantmentTable enchantmentTable);
}
