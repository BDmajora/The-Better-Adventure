package bdmajora.backport.mixin.net;

import bdmajora.backport.api.ISwiming;
import bdmajora.backport.packet.ISwimPacket;
import bdmajora.backport.packet.SwimPacket;
import net.minecraft.server.entity.player.EntityPlayerMP;
import net.minecraft.server.net.handler.NetServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = NetServerHandler.class, remap = false)
public class NetServerHandlerMixin implements ISwimPacket {
	@Shadow
	private EntityPlayerMP playerEntity;
	@Override
	public void betterWithAquatic$handleSwim(SwimPacket packet) {
		if (playerEntity instanceof ISwiming) {
			((ISwiming) playerEntity).setSwimming(packet.swim);
		}

	}
}
