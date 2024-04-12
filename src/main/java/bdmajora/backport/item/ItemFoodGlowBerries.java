package bdmajora.backport.item;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemFoodGlowBerries extends ItemFoodStackable {

	public ItemFoodGlowBerries(String name, int id, int healAmount, boolean favouriteWolfFood, int maxStackSize) {
		super(name, id, healAmount, favouriteWolfFood, maxStackSize);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < 20){
			entityplayer.heal(healAmount);
			--itemstack.stackSize;
		}
		return itemstack;
	}
}

