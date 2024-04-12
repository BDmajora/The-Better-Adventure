package bdmajora.backport.item.Food;

import bdmajora.backport.item.ModItems;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class ItemFoodWatermelonSlice extends ItemFoodStackable {
	public ItemFoodWatermelonSlice(String name, int id, int healAmount, boolean favouriteWolfFood, int maxStackSize) {
		super(name, id, healAmount, favouriteWolfFood, maxStackSize);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < 20){
			entityplayer.inventory.insertItem(new ItemStack(ModItems.seedsWatermelon, 1), false);
		}
		return super.onItemRightClick(itemstack, world, entityplayer);
	}
}
