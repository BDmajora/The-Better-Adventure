package bdmajora.backport.entity;

import bdmajora.backport.block.entity.TileEntityBanner;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;

public abstract class EntityBannerEdit extends EntityPlayer {
	public EntityBannerEdit(World world) {
		super(world);
	}

	@Override
	public void func_6420_o() {

	}

	public void displayGUIEditBanner(TileEntityBanner tileEntityBanner) {
	}

	public void addChatMessage(String s) {

	}
}
