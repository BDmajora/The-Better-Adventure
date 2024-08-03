package bdmajora.backport.item.Food;

import bdmajora.backport.item.ModItems;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class ItemFoodWatermelonSlice extends ItemFood {
	private final String texture;

	public ItemFoodWatermelonSlice(String name, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfFood, int maxStackSize, String texture) {
		super(name, id, healAmount, ticksPerHeal, favouriteWolfFood, maxStackSize);
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < entityplayer.getMaxHealth()) {
			entityplayer.inventory.insertItem(new ItemStack(ModItems.seedsWatermelon, 1), false);
		}
		return super.onUseItem(itemstack, world, entityplayer);
	}
}
