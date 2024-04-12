package bdmajora.backport.mixin;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.block.Crops.*;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockCropsPumpkin;
import net.minecraft.core.block.BlockCropsWheat;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemDye.class, remap = false)
public class ItemDyeMixin {
	@Inject(method = "onItemUse", at = @At("HEAD"), cancellable = true)
	private void addCropFertilization(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
		if (itemstack.getMetadata() == 15) {
			int id = world.getBlockId(blockX, blockY, blockZ);
			int meta = world.getBlockMetadata(blockX, blockY, blockZ);
			if (id == ModBlocks.cropsWatermelon.id && meta < 5) {
				if (!world.isClientSide) {
					((BlockCropsWatermelon)ModBlocks.cropsWatermelon).fertilize(world, blockX, blockY, blockZ);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}
			if (id == ModBlocks.cropsPotato.id && meta < 3) {
				if (!world.isClientSide) {
					((BlockCropsPotato) ModBlocks.cropsPotato).fertilize(world, blockX, blockY, blockZ);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}
			if (id == ModBlocks.cropsBeetRoot.id && meta < 3) {
				if (!world.isClientSide) {
					((BlockCropsBeetRoot) ModBlocks.cropsBeetRoot).fertilize(world, blockX, blockY, blockZ);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}
			if (id == ModBlocks.cropsCarrot.id && meta < 3) {
				if (!world.isClientSide) {
					((BlockCropsCarrot) ModBlocks.cropsCarrot).fertilize(world, blockX, blockY, blockZ);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}
			if (id == ModBlocks.cropsTorchFlower.id && meta < 3) {
				if (!world.isClientSide) {
					((BlockCropsTorchFlower) ModBlocks.cropsTorchFlower).fertilize(world, blockX, blockY, blockZ);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}
		}
	}
}

