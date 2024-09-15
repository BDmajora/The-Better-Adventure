package bdmajora.backport.mixin.net;

import bdmajora.backport.backport;
import bdmajora.backport.interfaces.mixins.IEntityPlayer;
import bdmajora.backport.packet.ISwimPacket;
import bdmajora.backport.packet.SwimPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.net.handler.NetClientHandler;
import net.minecraft.core.block.entity.TileEntityFurnace;
import net.minecraft.core.net.handler.NetHandler;
import net.minecraft.core.net.packet.Packet;
import net.minecraft.core.net.packet.Packet100OpenWindow;
import net.minecraft.core.net.packet.Packet103SetSlot;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = NetClientHandler.class, remap = false)
public class NetClientHandlerMixin implements ISwimPacket {

	// Minecraft instance to handle in-game actions
	@Final
	@Shadow
	private Minecraft mc;

	// Inject into the handleOpenWindow method to handle custom enchantment windows
	@Inject(method = "handleOpenWindow", at = @At("TAIL"))
	public void handleOpenWindow(Packet100OpenWindow packet, CallbackInfo info) {
		if (packet.inventoryType != backport.config.getInt("enchantment_window_type_id")) return;
		if (!packet.windowTitle.equals(backport.ENCHANTMENT_TABLE_NAME)) return;

		this.mc.thePlayer.craftingInventory.windowId = packet.windowId;
	}

	// Implement better_with_aquatic functionality to handle swimming packets
	@Override
	public void betterWithAquatic$handleSwim(SwimPacket packet) {
		this.handleInvalidPacket(packet);
	}

	// Shadow method from NetHandler to handle invalid packets
	@Shadow
	public void handleInvalidPacket(Packet packet) {
	}
}
