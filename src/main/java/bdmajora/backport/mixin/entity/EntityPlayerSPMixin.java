package bdmajora.backport.mixin.entity;

import bdmajora.backport.block.entity.TileEntityBanner;
import bdmajora.backport.block.entity.TileEntityEnchantmentTable;
import bdmajora.backport.gui.GuiEditBanner;
import bdmajora.backport.gui.GuiEnchantmentTable;
import bdmajora.backport.interfaces.mixins.IEntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.EntityPlayerSP;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.player.inventory.InventoryPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = EntityPlayerSP.class, remap = false)
public class EntityPlayerSPMixin implements IEntityPlayer
{

	@Shadow
	protected Minecraft mc;

	@Override
	public void displayGUIEnchantmentTable(TileEntityEnchantmentTable enchantmentTable)
	{
		mc.displayGuiScreen(new GuiEnchantmentTable(this.mc.thePlayer.inventory, enchantmentTable));
	}

	@Override
	public void displayGUIEditBanner(TileEntityBanner banner)
	{
		EntityPlayer player = this.mc.thePlayer;
		mc.displayGuiScreen(new GuiEditBanner(player, banner));
	}

}
