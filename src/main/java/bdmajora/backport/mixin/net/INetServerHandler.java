package bdmajora.backport.mixin.net;

import bdmajora.backport.network.packet.PacketEnchantItem;

public interface INetServerHandler
{
	void handleEnchantItem(PacketEnchantItem packet);
}
