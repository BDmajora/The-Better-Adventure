package bdmajora.backport.mixin.entity;

import bdmajora.backport.block.Nether.BlockSaplingCrimsonFungus;
import bdmajora.backport.block.Nether.BlockSaplingWarpedFungus;
import bdmajora.backport.block.ModBlockTags;
import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.block.entity.TileEntitySign;
import net.minecraft.core.net.command.TextFormatting;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.type.WorldTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemDye.class, remap = false)
public abstract class ItemDyeMixin extends Item {

	public ItemDyeMixin(int id) {
		super(id);
	}

	@Inject(method = "onUseItemOnBlock", at = @At("HEAD"), cancellable = true)
	public void onUseItemOnBlock(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
		int j1;
		if (itemstack.getMetadata() == 15) {
			int id = world.getBlockId(blockX, blockY, blockZ);

			// Handle BlockSaplingWarpedFungus
			if (Block.blocksList[id] instanceof BlockSaplingWarpedFungus) {
				if (!world.isClientSide) {
					((BlockSaplingWarpedFungus) Block.blocksList[id]).grow(world, blockX, blockY, blockZ, world.rand);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}

			// Handle BlockSaplingCrimsonFungus
			if (Block.blocksList[id] instanceof BlockSaplingCrimsonFungus) {
				if (!world.isClientSide) {
					((BlockSaplingCrimsonFungus) Block.blocksList[id]).grow(world, blockX, blockY, blockZ, world.rand);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}

			// Handle ModBlockTags.GROWS_NETHER_PLANTS
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

			// Original onUseItemOnBlock logic for grass, flowers, and signs
			if (id == Block.dirt.id) {
				if (!world.isClientSide && Block.lightBlock[world.getBlockId(blockX, blockY + 1, blockZ)] <= 2) {
					j1 = Block.grass.id;
					if (world.dimensionData.getWorldType() == WorldTypes.OVERWORLD_RETRO) {
						j1 = Block.grassRetro.id;
					}

					world.setBlockWithNotify(blockX, blockY, blockZ, j1);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}

			if (id == Block.dirtScorched.id) {
				if (!world.isClientSide && Block.lightBlock[world.getBlockId(blockX, blockY + 1, blockZ)] <= 2) {
					j1 = Block.grassScorched.id;
					world.setBlockWithNotify(blockX, blockY, blockZ, j1);
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}
				}
				cir.setReturnValue(true);
			}

			if (Block.blocksList[id] != null && Block.blocksList[id].hasTag(BlockTags.GROWS_FLOWERS)) {
				if (!world.isClientSide) {
					if (entityplayer.getGamemode().consumeBlocks()) {
						--itemstack.stackSize;
					}

					label161:
					for (j1 = 0; j1 < 128; ++j1) {
						int k1 = blockX;
						int l1 = blockY + 1;
						int i2 = blockZ;

						int r;
						for (r = 0; r < j1 / 16; ++r) {
							k1 += itemRand.nextInt(3) - 1;
							l1 += (itemRand.nextInt(3) - 1) * itemRand.nextInt(3) / 2;
							i2 += itemRand.nextInt(3) - 1;
							int id1 = world.getBlockId(k1, l1 - 1, i2);
							if (Block.blocksList[id1] == null || !Block.blocksList[id1].hasTag(BlockTags.GROWS_FLOWERS)) {
								continue label161;
							}
						}

						if (world.getBlockId(k1, l1, i2) == 0) {
							if (itemRand.nextInt(10) != 0) {
								if (world.getBlockId(k1, l1 - 1, i2) != Block.dirtScorched.id && world.getBlockId(k1, l1 - 1, i2) != Block.dirtScorchedRich.id) {
									world.setBlockWithNotify(k1, l1, i2, Block.tallgrass.id);
								} else {
									world.setBlockWithNotify(k1, l1, i2, Block.spinifex.id);
								}
							} else {
								r = itemRand.nextInt(12);
								Biome biome = world.getBlockBiome(k1, l1, i2);
								if (r < 1) {
									world.setBlockWithNotify(k1, l1, i2, Block.flowerYellow.id);
								} else if (r < 2) {
									world.setBlockWithNotify(k1, l1, i2, Block.flowerRed.id);
								} else if (r >= 4 || biome != Biomes.OVERWORLD_BIRCH_FOREST && biome != Biomes.OVERWORLD_SEASONAL_FOREST) {
									if (r < 6 && (biome == Biomes.OVERWORLD_MEADOW || biome == Biomes.OVERWORLD_BOREAL_FOREST || biome == Biomes.OVERWORLD_SHRUBLAND)) {
										world.setBlockWithNotify(k1, l1, i2, Block.flowerPurple.id);
									} else if (r >= 8 || biome != Biomes.OVERWORLD_FOREST && biome != Biomes.OVERWORLD_SWAMPLAND && biome != Biomes.OVERWORLD_RAINFOREST && biome != Biomes.OVERWORLD_GRASSLANDS && biome != Biomes.OVERWORLD_CAATINGA) {
										if (r < 10 && (biome == Biomes.OVERWORLD_PLAINS || biome == Biomes.OVERWORLD_GRASSLANDS || biome == Biomes.OVERWORLD_OUTBACK || biome == Biomes.OVERWORLD_OUTBACK_GRASSY)) {
											world.setBlockWithNotify(k1, l1, i2, Block.flowerOrange.id);
										}
									} else {
										world.setBlockWithNotify(k1, l1, i2, Block.flowerLightBlue.id);
									}
								} else {
									world.setBlockWithNotify(k1, l1, i2, Block.flowerPink.id);
								}
							}
						}
					}
				}

				cir.setReturnValue(true);
			}
		}
	}

}
