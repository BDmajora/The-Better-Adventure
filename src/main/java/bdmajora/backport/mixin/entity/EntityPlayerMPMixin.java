package bdmajora.backport.mixin.entity;

import bdmajora.backport.backport;
import bdmajora.backport.interfaces.mixins.IEntityPlayer;
import net.minecraft.core.crafting.ICrafting;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.net.packet.Packet100OpenWindow;
import net.minecraft.core.world.World;
import net.minecraft.server.entity.player.EntityPlayerMP;
import net.minecraft.server.net.handler.NetServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = EntityPlayerMP.class, remap = false)
public abstract class EntityPlayerMPMixin extends EntityPlayer implements IEntityPlayer, ICrafting
{
	@Shadow
	protected abstract void getNextWindowId();

	@Shadow
	private int currentWindowId;

	@Shadow
	public NetServerHandler playerNetServerHandler;

	public EntityPlayerMPMixin(World world)
	{
		super(world);
	}



//	@Override
//	public void displayGUIEditBanner(TileEntityBanner banner)
//	{
//		this.getNextWindowId();
//
//		this.playerNetServerHandler.sendPacket(
//			new Packet100OpenWindow(
//				this.currentWindowId,
//				backport.config.getInt("enchantment_window_type_id"),
//				banner.getInvName(),
//				banner.getSizeInventory()
//			));
//
//		this.craftingInventory = new ContainerBanner(this.inventory, banner);
//		this.craftingInventory.windowId = this.currentWindowId;
//		this.craftingInventory.onContainerInit(this);
//	}

}

