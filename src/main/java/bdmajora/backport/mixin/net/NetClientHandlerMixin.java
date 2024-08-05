package bdmajora.backport.mixin.net;

import bdmajora.backport.backport;

import bdmajora.backport.interfaces.mixins.IEntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.net.handler.NetClientHandler;
import net.minecraft.core.block.entity.TileEntityFurnace;
import net.minecraft.core.net.packet.Packet100OpenWindow;
import net.minecraft.core.net.packet.Packet103SetSlot;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(value= NetClientHandler.class, remap = false)
public class NetClientHandlerMixin
{
	@Final
	@Shadow
	private Minecraft mc;

	@Inject(method = "handleOpenWindow", at = @At("TAIL"))
	public void handleOpenWindow(Packet100OpenWindow packet, CallbackInfo info)
	{
		if (packet.inventoryType != backport.config.getInt("enchantment_window_type_id")) return;
		if (!packet.windowTitle.equals(backport.ENCHANTMENT_TABLE_NAME)) return;

		this.mc.thePlayer.craftingInventory.windowId = packet.windowId;

	}


}
