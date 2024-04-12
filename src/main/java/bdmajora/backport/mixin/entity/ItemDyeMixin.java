package bdmajora.backport.mixin.entity;

import bdmajora.backport.block.Nether.BlockSaplingCrimsonFungus;
import bdmajora.backport.block.Nether.BlockSaplingWarpedFungus;
import bdmajora.backport.block.ModBlockTags;
import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemDye.class, remap = false)
public abstract class ItemDyeMixin extends Item {

	public ItemDyeMixin(int id) {
		super(id);
	}

	@Inject(method = "onItemUse", at = @At("HEAD"), cancellable = true)
	public void onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
		int j1;
		if (itemstack.getMetadata() == 15) {
			int id = world.getBlockId(blockX, blockY, blockZ);
			if (Block.blocksList[id] instanceof BlockSaplingWarpedFungus) {
				if (!world.isClientSide) {
					((BlockSaplingWarpedFungus) Block.blocksList[id]).grow(world, blockX, blockY, blockZ, world.rand);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}
			if (Block.blocksList[id] instanceof BlockSaplingCrimsonFungus) {
				if (!world.isClientSide) {
					((BlockSaplingCrimsonFungus) Block.blocksList[id]).grow(world, blockX, blockY, blockZ, world.rand);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}

			if (Block.blocksList[id] != null && Block.blocksList[id].hasTag(ModBlockTags.GROWS_NETHER_PLANTS)) {
				if (!world.isClientSide) {
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
					block2:
					for (j1 = 0; j1 < 128; ++j1) {
						int k1 = blockX;
						int l1 = blockY + 1;
						int i2 = blockZ;
						for (int j2 = 0; j2 < j1 / 16; ++j2) {
							int id1 = world.getBlockId(k1 += itemRand.nextInt(3) - 1, (l1 += (itemRand.nextInt(3) - 1) * itemRand.nextInt(3) / 2) - 1, i2 += itemRand.nextInt(3) - 1);
							if (Block.blocksList[id1] == null || !Block.blocksList[id1].hasTag(ModBlockTags.GROWS_NETHER_PLANTS))
								continue block2;
						}
						if (world.getBlockId(k1, l1, i2) != 0) continue;
						if (itemRand.nextInt(10) != 0) {
							//world.setBlockWithNotify(k1, l1, i2, Block.tallgrass.id);
							continue;
						}
						if (itemRand.nextInt(3) != 0) {
							world.setBlockWithNotify(k1, l1, i2, ModBlocks.crimsonFungus.id);
							continue;
						}
						world.setBlockWithNotify(k1, l1, i2, ModBlocks.warpedFungus.id);
					}
				}
				cir.setReturnValue(true);
			}
		}
	}
}
