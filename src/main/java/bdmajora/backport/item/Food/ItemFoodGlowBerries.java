package bdmajora.backport.item.Food;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class ItemFoodGlowBerries extends ItemFood {

	private final String texture;

	public ItemFoodGlowBerries(String name, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfFood, int maxStackSize, String texture) {
		super(name, id, healAmount, ticksPerHeal, favouriteWolfFood, maxStackSize);
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}


	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < 20) {
			entityplayer.heal(getHealAmount());
			--itemstack.stackSize;
		}
		return itemstack;
	}
}
