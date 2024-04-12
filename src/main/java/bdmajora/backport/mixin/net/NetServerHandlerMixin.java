package bdmajora.backport.mixin.net;

import bdmajora.backport.network.packet.PacketEnchantItem;
import bdmajora.backport.inventory.ContainerEnchantmentTable;
import net.minecraft.core.player.inventory.Container;
import net.minecraft.server.entity.player.EntityPlayerMP;
import net.minecraft.server.net.handler.NetServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = NetServerHandler.class, remap = false)
public class NetServerHandlerMixin implements INetServerHandler
{
	@Shadow private EntityPlayerMP playerEntity;

	@Override
	public void handleEnchantItem(PacketEnchantItem packet)
	{
		Container container = playerEntity.craftingInventory;

		if (!(container instanceof ContainerEnchantmentTable)) return;

		ContainerEnchantmentTable enchantment = (ContainerEnchantmentTable) container;

		enchantment.enchantItem(playerEntity, packet.enchantmentOption);
	}
}
