package bdmajora.backport.mixin.net;

import bdmajora.backport.network.packet.PacketEnchantItem;
import net.minecraft.core.player.inventory.Container;
import net.minecraft.server.entity.player.EntityPlayerMP;
import net.minecraft.server.net.handler.NetServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = NetServerHandler.class, remap = false)
public class NetServerHandlerMixin
{
	@Shadow private EntityPlayerMP playerEntity;


}
