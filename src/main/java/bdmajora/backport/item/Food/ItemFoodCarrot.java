package bdmajora.backport.item.Food;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemFoodCarrot extends ItemFood {
	private final int cropsId;
	private final String texture;

	public ItemFoodCarrot(String name, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfFood, int maxStackSize, Block cropsBlock, String texture) {
		super(name, id, healAmount, ticksPerHeal, favouriteWolfFood, maxStackSize);
		this.cropsId = cropsBlock.id;
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}


	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < 20) {
			entityplayer.heal(this.getHealAmount());
			--itemstack.stackSize;
		}
		return itemstack;
	}


	public boolean onUseItemOnBlock(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			blockX += side.getOffsetX();
			blockY += side.getOffsetY();
			blockZ += side.getOffsetZ();
		}
		if (world.getBlockId(blockX, blockY - 1, blockZ) == Block.farmlandDirt.id && world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			world.setBlockWithNotify(blockX, blockY, blockZ, this.cropsId);
			--itemstack.stackSize;
			return true;
		}
		return false;
	}
}
