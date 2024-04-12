package bdmajora.backport.item.Food;

import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemFoodBeetRoot extends ItemFoodStackable {
	private Block cropsBlock;

	public ItemFoodBeetRoot(String name, int id, int healAmount, boolean favouriteWolfFood, int maxStackSize, Block cropsBlock) {
		super(name, id, healAmount, favouriteWolfFood, maxStackSize);
		this.cropsBlock = cropsBlock;
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		super.onItemUse(itemstack, entityplayer, world, blockX, blockY, blockY, side, xPlaced, yPlaced);
		if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			blockX += side.getOffsetX();
			blockY += side.getOffsetY();
			blockZ += side.getOffsetZ();
		}
		if (world.getBlockId(blockX, blockY - 1, blockZ) == Block.farmlandDirt.id && world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
			world.setBlockWithNotify(blockX, blockY, blockZ, this.cropsBlock.id);
			world.playBlockSoundEffect(entityplayer,(float)blockX + 0.5f, (float)blockY + 0.5f, (float)blockZ + 0.5f, Block.blocksList[this.cropsBlock.id], EnumBlockSoundEffectType.PLACE);
			itemstack.consumeItem(entityplayer);
			return true;
		}
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < 20){
			entityplayer.inventory.insertItem(new ItemStack(ModItems.seedsBeetRoot, 2), false);
		}
		return super.onItemRightClick(itemstack, world, entityplayer);
	}
}
