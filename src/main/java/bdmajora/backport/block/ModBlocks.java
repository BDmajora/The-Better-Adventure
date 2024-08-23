package bdmajora.backport.block;

import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.block.Crops.*;
import bdmajora.backport.block.Crops.Models.*;
import bdmajora.backport.block.Door.*;
import bdmajora.backport.block.Flowers.Lilac;
import bdmajora.backport.block.Flowers.Peony;
import bdmajora.backport.block.Flowers.RoseBush;
import bdmajora.backport.block.Nether.*;
import bdmajora.backport.block.TrapDoor.*;
import bdmajora.backport.block.Vines.BlockCaveVines;
import bdmajora.backport.block.Vines.BlockCaveVinesLit;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.block.bamboo.BambooSapling;
import bdmajora.backport.block.bamboo.BambooShoot;
import bdmajora.backport.block.bamboo.OldBambooShoot;
import bdmajora.backport.block.dragonfly.*;
import bdmajora.backport.block.metastates.*;
import bdmajora.backport.item.ModItems;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockLadder;
import net.minecraft.core.item.block.ItemBlockSlab;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import net.minecraft.core.world.World;
import org.useless.dragonfly.model.block.DFBlockModelBuilder;
import turniplabs.halplibe.helper.BlockBuilder;
import bdmajora.backport.block.BedModels.*;

import static bdmajora.backport.backport.MOD_ID;

public class ModBlocks {

	public static final Block blackStone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture(MOD_ID + ":block/blackstone_top")
		.setSideTextures(MOD_ID + ":block/blackstone")
		.setBottomTexture(MOD_ID + ":block/blackstone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blackStone", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block chiseledPolishedBlackstone = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/chiseled_polished_blackstone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledPolishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedPolishedBlackstoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cracked_polished_blackstone_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("crackedPolishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block gildedBlackstone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/gilded_blackstone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("gildedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/polished_blackstone_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("polishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstone = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/polished_blackstone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("polishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mushroomStem = new BlockBuilder(MOD_ID)
		.setHardness(0.5f)
		.setResistance(0.5f)
		.setTextures(MOD_ID + ":block/mushroom_stem")
		.setTags(BlockTags.FENCES_CONNECT)
		.build(new Block("mushroomStem",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crackedStoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cracked_stone_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("crackedStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledStoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/chiseled_stone_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStone = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/end_stone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("endStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/end_stone_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("endStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mycelium = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture(MOD_ID + ":block/my_celium_top")
		.setSideTextures(MOD_ID + ":block/my_celium_side")
		.setBottomTexture(MOD_ID + ":block/dirt")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("mycelium",UtilIdRegistrar.nextIdBlock(),Material.grass));

	public static final Block emeraldOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/emerald_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("emeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateEmeraldOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_emerald_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateEmeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block emeraldBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/emerald_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("emeraldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledNetherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/chiseled_nether_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedNetherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cracked_nether_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("crackedNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/nether_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("netherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherGoldOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/nether_gold_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new BlockNetherGoldOre("netherGoldOre", UtilIdRegistrar.nextIdBlock()));

	public static final Block netherQuartzOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/nether_quartz_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("netherQuartzOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redNetherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/red_nether_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("redNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block hayBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/hay_block_top")
		.setSideTextures(MOD_ID + ":block/hay_block_side")
		.setFlammability(5, 5)
		.setBlockModel(BlockModelAxisAligned::new)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("hayBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block coarseDirt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/coarse_dirt")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("coarseDirt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block diorite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/diorite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("diorite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedDiorite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/polished_diorite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("polishedDiorite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block andesite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/andesite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("andesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedAndesite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/polished_andesite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("polishedAndesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/purpur_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("purpurBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurPillar = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/purpur_pillar_top")
		.setSideTextures(MOD_ID + ":block/purpur_pillar")
		.setBlockModel(BlockModelAxisAligned::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("purpurPillar",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherWartBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/nether_wart_block")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new BlockLog("netherWartBlock",UtilIdRegistrar.nextIdBlock()));

	public static final Block warpedWartBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/warped_wart_block")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("warpedWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block boneBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/bone_block_top")
		.setSideTextures(MOD_ID + ":block/bone_block_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(BlockModelAxisAligned::new)
		.build(new BlockAxisAligned("boneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block nylium = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/crimson_nylium")
		.setSideTextures(MOD_ID + ":block/crimson_nylium_side")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, ModBlockTags.GROWS_NETHER_PLANTS, BlockTags.FENCES_CONNECT)
		.build(new Block("nylium",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedNylium = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/warped_nylium")
		.setSideTextures(MOD_ID + ":block/warped_nylium_side")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, ModBlockTags.GROWS_NETHER_PLANTS, BlockTags.FENCES_CONNECT, BlockTags.FENCES_CONNECT)
		.build(new Block("warpedNylium", UtilIdRegistrar.nextIdBlock(), Material.dirt));

	public static final Block crimsonFungus = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/crimson_fungus")
		.build(new BlockSaplingCrimsonFungus("crimson_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block warpedFungus = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/warped_fungus")
		.build(new BlockSaplingWarpedFungus("warped_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block crimsonStem = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures(MOD_ID + ":block/crimson_stem")
		.setTopBottomTextures(MOD_ID + ":block/crimson_stem_top")
		.setTopBottomTextures(MOD_ID + ":block/crimson_stem_top")
		.setBlockModel(BlockModelAxisAligned::new)
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("crimson_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block warpedStem = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures(MOD_ID + ":block/warped_stem")
		.setTopBottomTextures(MOD_ID + ":block/warped_stem_top")
		.setBlockModel(BlockModelAxisAligned::new)
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("warped_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block crimsonPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/crimson_planks")
		.setTopBottomTextures(MOD_ID + ":block/crimson_planks")
		.setTopBottomTextures(MOD_ID + ":block/crimson_planks")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("crimson_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block warpedPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures(MOD_ID + ":block/warped_planks")
		.setTopBottomTextures(MOD_ID + ":block/warped_planks")
		.setTopBottomTextures(MOD_ID + ":block/warped_planks")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("warped_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block shroomlight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setSideTextures(MOD_ID + ":block/shroomlight")
		.setTopBottomTextures(MOD_ID + ":block/shroomlight")
		.setTopBottomTextures(MOD_ID + ":block/shroomlight")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("shroomlight", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block cryingObsidian = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(3.0f)
		.setResistance(3.0f)
		.setTextures(MOD_ID + ":block/crying_obsidian")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cryingObsidian",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lodestone = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/lodestone_top")
		.setSideTextures(MOD_ID + ":block/lodestone_side")
		.setBlockModel(BlockModelAxisAligned::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("lodestone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherSprouts = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/nether_sprouts")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("netherSprouts", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block quartzBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/quartz_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("quartzBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block soulSoil = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.SAND)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/soul_soil")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("soulSoil",UtilIdRegistrar.nextIdBlock(),Material.sand));

	public static final Block target = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/target_top")
		.setSideTextures(MOD_ID + ":block/target_side")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("target",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block ancientDebris = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/ancient_debris_top")
		.setSideTextures(MOD_ID + ":block/ancient_debris_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("ancientDebris",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block loom = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/loom.json")
				.build(block))
		.build(new DragonBlockModel("loom", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block fletchingTable = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fletching_table.json")
				.build(block))
		.build(new DragonBlockModel("fletchingTable", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block smithingTable = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/smithing_table.json")
				.build(block))
		.build(new DragonBlockModel("smithingTable", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block amethystBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/amethyst_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("amethystBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/copper_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("copperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/chiseled_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/copper_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("copperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCopperOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/deepslate_copper_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateCopperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/cut_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedChiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/exposed_chiseled_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("exposedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/exposed_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("exposedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/exposed_cut_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("exposedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedChiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/oxidized_chiseled_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("oxidizedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/oxidized_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("oxidizedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/oxidized_cut_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("oxidizedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawCopperBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/raw_copper_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("rawCopperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredChiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/weathered_chiseled_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("weatheredChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/weathered_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("weatheredCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/weathered_cut_copper")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("weatheredCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawGoldBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/raw_gold_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("rawGoldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawIronBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/raw_iron_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("rawIronBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block calcite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/calcite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("calcite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block dripstoneBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/dripstone_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("dripstoneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block rootedDirt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/rooted_dirt")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("rootedDirt",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block chiseledtuffBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/chiseled_tuff_bricks_top")
		.setSideTextures(MOD_ID + ":block/chiseled_tuff_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledtuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledTuff = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/chiseled_tuff_top")
		.setSideTextures(MOD_ID + ":block/chiseled_tuff")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedTuff = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/polished_tuff")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("polishedTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuffBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/tuff_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("tuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuff = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/tuff")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("tuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block ochrefroglight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTextures(MOD_ID + ":block/ochre_froglight_top")
		.setSideTextures(MOD_ID + ":block/ochre_froglight_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("ochrefroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pearlescentfroglight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTextures(MOD_ID + ":block/pearlescent_froglight_top")
		.setSideTextures(MOD_ID + ":block/pearlescent_froglight_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("pearlescentfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block verdantfroglight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTextures(MOD_ID + ":block/verdant_froglight_top")
		.setSideTextures(MOD_ID + ":block/verdant_froglight_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("verdantfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block seaLantern = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setLuminance(15)
		.setTextures(MOD_ID + ":block/sea_lantern")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("seaLantern",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mud = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/mud")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("mud",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block muddyMangroveRoot = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/muddy_mangrove_roots_top")
		.setSideTextures(MOD_ID + ":block/muddy_mangrove_roots_side")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
		.build(new Block("muddyMangroveRoot",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block mudBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/mud_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("mudBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block packedMud = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/packed_mud")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("packedMud",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block reinforcedDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture(MOD_ID + ":block/reinforced_deepslate_top")
		.setBottomTexture(MOD_ID + ":block/reinforced_deepslate_bottom")
		.setSideTextures(MOD_ID + ":block/reinforced_deepslate_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("reinforcedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block sculk = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/sculk")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("sculk",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block bambooBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/bamboo_block_top")
		.setSideTextures(MOD_ID + ":block/bamboo_block")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("bambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooMosaic = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/bamboo_mosaic")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("bambooMosaic",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/bamboo_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("bambooPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block strippedBambooBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures(MOD_ID + ":block/stripped_bamboo_block_top")
		.setSideTextures(MOD_ID + ":block/stripped_bamboo_block")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("strippedBambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block blackTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/black_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blackTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/blue_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/brown_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("brownTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/cyan_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cyanTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/gray_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("grayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/green_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("greenTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/light_blue_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightBlueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/light_gray_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightGrayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/lime_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("limeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/magenta_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("magentaTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/orange_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("orangeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/pink_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("pinkTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/purple_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("purpleTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/red_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("redTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block terracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("terracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/white_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("whiteTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/yellow_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("yellowTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/black_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blackGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/blue_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/brown_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("brownGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/cyan_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cyanGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/gray_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("grayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/green_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("greenGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/light_blue_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightBlueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/light_gray_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightGrayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/lime_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("limeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/magenta_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("magentaGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/orange_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("orangeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/purple_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("purpleGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/red_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("redGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/white_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("whiteGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/yellow_glazed_terracotta")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("yellowGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magma = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setLuminance(5)
		.setTextures(MOD_ID + ":block/magma")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("magma",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block smoothBasalt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/smooth_basalt")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("smoothBasalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block basalt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setBlockModel(BlockModelAxisAligned::new)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/basalt_top")
		.setSideTextures(MOD_ID + ":block/basalt_side")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("basalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslate = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelAxisAligned::new)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/deepslate_top")
		.setSideTextures(MOD_ID + ":block/deepslate")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("deepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/chiseled_deepslate")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("chiseledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cobbledDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cobbled_deepslate")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cobbledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cracked_deepslate_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("crackedDeepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateTiles = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cracked_deepslate_tiles")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("crackedDeepslateTiles",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCoalOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_coal_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateCoalOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateDiamondOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_diamond_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateDiamondOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateIronOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_iron_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateIronOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateLapisOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_lapis_ore")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("deepslateLapisOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/polished_deepslate")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("polishedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block granite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/granite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("granite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/black_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blackConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/black_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blackConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/blue_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/blue_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/brown_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("brownConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/brown_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("brownConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cyan_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cyanConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cyan_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("cyanConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/gray_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("grayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/gray_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("grayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/green_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("greenConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/green_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("greenConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/light_blue_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightBlueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/light_blue_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightBlueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/light_gray_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightGrayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/light_gray_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("lightGrayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/lime_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("limeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/lime_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("limeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/magenta_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("magentaConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/magenta_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("magentaConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/orange_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("orangeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/orange_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("orangeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/pink_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("pinkConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/pink_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("pinkConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/purple_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("purpleConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/purple_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("purpleConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/red_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("redConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/red_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("redConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/white_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("whiteConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/white_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("whiteConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/yellow_concrete_powder")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("yellowConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/yellow_concrete")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("yellowConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block birchPlank = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/birch_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("birchPlank",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/acacia_log_top")
		.setSideTextures(MOD_ID + ":block/acacia_log")
		.setBlockModel(BlockModelAxisAligned::new)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockLog("acaciaLog", UtilIdRegistrar.nextIdBlock()) {
		});

	public static final Block acaciaPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/acacia_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("acaciaPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/dark_oak_log_top")
		.setSideTextures(MOD_ID + ":block/dark_oak_log")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(BlockModelAxisAligned::new)
		.build(new BlockLog("darkOakLog",UtilIdRegistrar.nextIdBlock()));

	public static final Block darkOakPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/dark_oak_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("darkOakPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jungleLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/jungle_log_top")
		.setSideTextures(MOD_ID + ":block/jungle_log")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(BlockModelAxisAligned::new)
		.build(new BlockLog("jungleLog",UtilIdRegistrar.nextIdBlock()));

	public static final Block junglePlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/jungle_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("junglePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangroveLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/mangrove_log_top")
		.setSideTextures(MOD_ID + ":block/mangrove_log")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(BlockModelAxisAligned::new)
		.build(new BlockLog("mangroveLog",UtilIdRegistrar.nextIdBlock()));

	public static final Block mangrovePlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/mangrove_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("mangrovePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block spruceLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures(MOD_ID + ":block/spruce_log_top")
		.setSideTextures(MOD_ID + ":block/spruce_log")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(BlockModelAxisAligned::new)
		.build(new BlockLog("spruceLog",UtilIdRegistrar.nextIdBlock()));

	public static final Block sprucePlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/spruce_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("sprucePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block cherryPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cherry_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("cherryPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crimsonDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/crimson_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/crimson_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new CrimsonDoor("crimsonDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.crimsonDoor)};
			}
		});

	public static final Block crimsonDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/crimson_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/crimson_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new CrimsonDoor("crimsonDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.crimsonDoor)};
			}
		});

	public static final Block warpedDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/warped_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/warped_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new WarpedDoor("warpedDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.warpedDoor )};
			}
		});

	public static final Block warpedDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/warped_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/warped_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new WarpedDoor("warpedDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.warpedDoor )};
			}
		});

	public static final Block acaciaDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/acacia_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/acacia_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new AcaciaDoor("acaciaDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.acaciaDoor)};
			}
		});

	public static final Block acaciaDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/acacia_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/acacia_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new AcaciaDoor("acaciaDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.acaciaDoor)};
			}
		});

	public static final Block bambooDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/bamboo_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/bamboo_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new BambooDoor("bambooDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bambooDoor)};
			}
		});

	public static final Block bambooDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/bamboo_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/bamboo_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new BambooDoor("bambooDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bambooDoor)};
			}
		});

	public static final Block birchDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/birch_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/birch_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new BirchDoor("birchDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.birchDoor)};
			}
		});

	public static final Block birchDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/birch_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/birch_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new BirchDoor("birchDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.birchDoor)};
			}
		});

	public static final Block cherryDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cherry_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/cherry_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new CherryDoor("cherryDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.cherryDoor)};
			}
		});

	public static final Block cherryDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cherry_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/cherry_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new CherryDoor("cherryDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.cherryDoor)};
			}
		});

	public static final Block copperDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/copper_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/copper_door_top"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new CopperDoor("copperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.copperDoor)};
			}
		});

	public static final Block copperDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/copper_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/copper_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new CopperDoor("copperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.copperDoor)};
			}
		});

	public static final Block darkOakDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/dark_oak_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/dark_oak_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new DarkOakDoor("darkOakDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.darkOakDoor)};
			}
		});

	public static final Block darkOakDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/dark_oak_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/dark_oak_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new DarkOakDoor("darkOakDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.darkOakDoor)};
			}
		});

	public static final Block exposedCopperDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/exposed_copper_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/exposed_copper_door_top"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new ExposedCopperDoor("exposedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.exposedCopperDoor)};
			}
		});

	public static final Block exposedCopperDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/exposed_copper_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/exposed_copper_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new ExposedCopperDoor("exposedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.exposedCopperDoor)};
			}
		});

	public static final Block jungleDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/jungle_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/jungle_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new JungleDoor("jungleDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.jungleDoor)};
			}
		});

	public static final Block jungleDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/jungle_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/jungle_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new JungleDoor("jungleDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.jungleDoor)};
			}
		});

	public static final Block mangroveDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/mangrove_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/mangrove_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new MangroveDoor("mangroveDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.mangroveDoor)};
			}
		});

	public static final Block mangroveDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/mangrove_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/mangrove_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new MangroveDoor("mangroveDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.mangroveDoor)};
			}
		});

	public static final Block oxidizedCopperDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/oxidized_copper_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/oxidized_copper_door_top"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new OxidizedCopperDoor("oxidizedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.oxidizedCopperDoor)};
			}
		});

	public static final Block oxidizedCopperDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/oxidized_copper_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/oxidized_copper_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new OxidizedCopperDoor("oxidizedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.oxidizedCopperDoor)};
			}
		});

	public static final Block spruceDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/spruce_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/spruce_door_top"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new SpruceDoor("spruceDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.spruceDoor)};
			}
		});

	public static final Block spruceDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/spruce_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/spruce_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new SpruceDoor("spruceDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.spruceDoor)};
			}
		});

	public static final Block weatheredCopperDoorTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/weathered_copper_door_top")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/weathered_copper_door_top"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new WeatheredCopperDoor("weatheredCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.weatheredCopperDoor)};
			}
		});

	public static final Block weatheredCopperDoorBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/weathered_copper_door_bottom")
		.setBlockModel(block -> new BlockModelDoor<>(block).withTextures(MOD_ID + ":block/weathered_copper_door_bottom"))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new WeatheredCopperDoor("weatheredCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.weatheredCopperDoor)};
			}
		});

	public static final Block acaciaTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/acacia_trapdoor")
		.setSideTextures(MOD_ID + ":block/acacia_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new AcaciaTrapDoor("acaciaTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block bambooTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/bamboo_trapdoor")
		.setSideTextures(MOD_ID + ":block/bamboo_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BambooTrapDoor("bambooTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cherryTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/cherry_trapdoor")
		.setSideTextures(MOD_ID + ":block/cherry_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new CherryTrapDoor("cherryTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block copperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/copper_trapdoor")
		.setSideTextures(MOD_ID + ":block/copper_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new CopperTrapDoor("copperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block crimsonTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/crimson_trapdoor")
		.setSideTextures(MOD_ID + ":block/crimson_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new CrimsonTrapDoor("crimsonTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block darkOakTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/dark_oak_trapdoor")
		.setSideTextures(MOD_ID + ":block/dark_oak_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new DarkOakTrapDoor("darkOakTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block exposedCopperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/exposed_copper_trapdoor")
		.setSideTextures(MOD_ID + ":block/exposed_copper_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new ExposedCopperTrapDoor("exposedCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block jungleTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/jungle_trapdoor")
		.setSideTextures(MOD_ID + ":block/jungle_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new JungleTrapDoor("jungleTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block mangroveTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/mangrove_trapdoor")
		.setSideTextures(MOD_ID + ":block/mangrove_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new MangroveTrapDoor("mangroveTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block oxidizedCopperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/oxidized_copper_trapdoor")
		.setSideTextures(MOD_ID + ":block/oxidized_copper_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new OxidizedCopperTrapDoor("oxidizedCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block spruceTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/spruce_trapdoor")
		.setSideTextures(MOD_ID + ":block/spruce_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new SpruceTrapDoor("spruceTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block warpedTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/warped_trapdoor")
		.setSideTextures(MOD_ID + ":block/warped_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new WarpedTrapDoor("warpedTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block weatheredCopperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/weathered_copper_trapdoor")
		.setSideTextures(MOD_ID + ":block/weathered_copper_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new WarpedTrapDoor("weatheredCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block birchTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/birch_trapdoor")
		.setSideTextures(MOD_ID + ":block/birch_trapdoor_side")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BirchTrapDoor("birchTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block barrel = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures(MOD_ID + ":block/barrel_top")
		.setSideTextures(MOD_ID + ":block/barrel_side")
		.setBlockModel(BlockModelAxisAligned::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("barrel", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block beeNest = new BlockBuilder(MOD_ID)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/bee_nest.json")
				.build(block))
		.build(new DragonBlockModel("beeNest", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block beeHive = new BlockBuilder(MOD_ID)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/beehive.json")
				.build(block))
		.build(new DragonBlockModel("beeHive", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block crafter = new BlockBuilder(MOD_ID)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/crafter.json")
				.build(block))
		.build(new DragonBlockModel("crafter", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block honeyBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture(MOD_ID + ":block/honey_block_top")
		.setBottomTexture(MOD_ID + ":block/honey_block_bottom")
		.setSideTextures(MOD_ID + ":block/honey_block_side")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("honeyBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block honeyCombBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/honeycomb_block")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("honeyCombBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jigsaw = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture(MOD_ID + ":block/jigsaw_top")
		.setBottomTexture(MOD_ID + ":block/jigsaw_bottom")
		.setNorthTexture(MOD_ID + ":block/jigsaw_side")
		.setEastTexture(MOD_ID + ":block/jigsaw_side")
		.setWestTexture(MOD_ID + ":block/jigsaw_side")
		.setSouthTexture(MOD_ID + ":block/jigsaw_lock")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("jigsaw",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block soulTorch = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.FIRE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/soul_torch")
		.setLuminance(15)
		.setBlockModel(BlockModelTorch::new)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockSoulTorch("soulTorch",UtilIdRegistrar.nextIdBlock()));

	public static final Block mossBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures(MOD_ID + ":block/moss_block")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("mossBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block prismarineBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/prismarine_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("prismarineBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block azureBluet = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/azure_bluet")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("azureBluet", UtilIdRegistrar.nextIdBlock()));

	public static final Block cornflower = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/cornflower")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("cornflower", UtilIdRegistrar.nextIdBlock()));

	public static final Block lilyOfTheValley = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/lily_of_the_valley")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("lilyOfTheValley", UtilIdRegistrar.nextIdBlock()));

	public static final Block orangeTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/orange_tulip")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("orangeTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block oxeyeDaisy = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/oxeye_daisy")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("oxeyeDaisy", UtilIdRegistrar.nextIdBlock()));

	public static final Block pinkTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/pink_tulip")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("pinkTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block redTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/red_tulip")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("redTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block whiteTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/white_tulip")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("whiteTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block witherRose = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/wither_rose")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("witherRose", UtilIdRegistrar.nextIdBlock()));

	public static final Block blackStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/black_stained_glass")
		.build(new BlockColouredGlass("blackStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block blueStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/blue_stained_glass")
		.build(new BlockColouredGlass("blueStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block brownStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/brown_stained_glass")
		.build(new BlockColouredGlass("brownStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block cyanStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/cyan_stained_glass")
		.build(new BlockColouredGlass("cyanStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block grayStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/gray_stained_glass")
		.build(new BlockColouredGlass("grayStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block greenStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/green_stained_glass")
		.build(new BlockColouredGlass("greenStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block lightBlueStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/light_blue_stained_glass")
		.build(new BlockColouredGlass("lightBlueStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block lightGrayStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/light_gray_stained_glass")
		.build(new BlockColouredGlass("lightGrayStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block limeStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/lime_stained_glass")
		.build(new BlockColouredGlass("limeStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block magentaStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/magenta_stained_glass")
		.build(new BlockColouredGlass("magentaStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block orangeStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/orange_stained_glass")
		.build(new BlockColouredGlass("orangeStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block pinkStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/pink_stained_glass")
		.build(new BlockColouredGlass("pinkStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block purpleStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/purple_stained_glass")
		.build(new BlockColouredGlass("purpleStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block redStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/red_stained_glass")
		.build(new BlockColouredGlass("redStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block tintedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/tinted_glass")
		.build(new BlockColouredGlass("tintedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block yellowStainedGlass = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures(MOD_ID + ":block/yellow_stained_glass")
		.build(new BlockColouredGlass("yellowStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block weepingVines = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/weeping_vines")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockWeepingVinesPlant("weepingVines", UtilIdRegistrar.nextIdBlock()));

	public static final Block twistingVines = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/twisting_vines")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockTwistingVinesPlant("twistingVines", UtilIdRegistrar.nextIdBlock()));

	public static final Block weepingVinesPlant = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setBlockDrop(weepingVines)
		.setTextures(MOD_ID + ":block/weeping_vines_plant")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BlockWeepingVinesPlant("weepingVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block twistingVinesPlant = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setBlockDrop(twistingVines)
		.setTextures(MOD_ID + ":block/twisting_vines_plant")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BlockTwistingVinesPlant("twistingVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVines = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/cave_vines")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockCaveVines("caveVines", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesPlant = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/cave_vines_plant")
		.setBlockDrop(caveVines)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BlockCaveVines("caveVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesLit = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setLuminance(15)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/cave_vines_lit")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setLuminance(15)
		.build(new BlockCaveVinesLit("caveVinesLit", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesPlantLit = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setLuminance(15)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/cave_vines_plant_lit")
		.setBlockDrop(caveVinesLit)
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setLuminance(15)
		.build(new BlockCaveVinesLit("caveVinesPlantLit", UtilIdRegistrar.nextIdBlock()));

	public static final Block vine = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setLuminance(15)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.SHEARS_DO_SILK_TOUCH)
		.setBlockModel(BlockModelLadder::new)
		.setTextures(MOD_ID + ":block/vine")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockLadder("vine", UtilIdRegistrar.nextIdBlock()));

	public static final Block lilacTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures(MOD_ID + ":block/lilac_top")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new Lilac("lilacTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{}; // Returns nothing if the top block is broken
			}
		});

	public static final Block lilacBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures(MOD_ID + ":block/lilac_bottom")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new Lilac("lilacBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false) {
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.lilac)};
			}
		});

	public static final Block peonyTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures(MOD_ID + ":block/peony_top")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new Peony("peonyTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{}; // Returns nothing if the top block is broken
			}
		});

	public static final Block peonyBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures(MOD_ID + ":block/peony_bottom")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new Peony("peonyBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.peony)};
			}
		});

	public static final Block roseBushTop = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures(MOD_ID + ":block/rose_bush_top")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new RoseBush("roseBushTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{}; // Returns nothing if the top block is broken
			}
		});

	public static final Block roseBushBottom = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures(MOD_ID + ":block/rose_bush_bottom")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setVisualUpdateOnMetadata()
		.build(new RoseBush("roseBushBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.roseBush)};
			}
		});

	public static final Block sunflowerTop = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/sunflower_top.json")
				.build(block))
		.build(new DragonBlockModel("sunflowerTop", UtilIdRegistrar.nextIdBlock(), Material.wood))
		.withTags(BlockTags.NOT_IN_CREATIVE_MENU);

	public static final Block sunflowerBottom = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/sunflower_bottom.json")
				.build(block))
		.build(new DragonBlockModel("sunflowerBottom", UtilIdRegistrar.nextIdBlock(), Material.wood))
		.withTags(BlockTags.NOT_IN_CREATIVE_MENU);

	public static final Block modernDragonEgg = new BlockBuilder(MOD_ID)
		.setIcon(MOD_ID + ":block/icon/dragon_egg")
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/dragon_egg.json")
				.build(block))
		.build(new DragonBlockModel("exampleDragon", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block modernBeacon = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/beacon.json")
				.build(block))
		.build(new DragonBlockModel("exampleBeacon", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cauldron = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/water_cauldron_full.json")
				.build(block))
		.build(new DragonBlockModel("exampleCauldron", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block brewing = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("block/brewing/brewing_stand.json")
				.setBlockState("brewing_stand.json")
				.setMetaStateInterpreter(new BrewingMetaState())
				.build(block))
		.build(new DragonBlockModel("exampleBrewingStand", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block bookshelf = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("block/bookshelf/chiseled_bookshelf_inventory.json")
				.setBlockState("chiseled_bookshelf.json")
				.setMetaStateInterpreter(new BookshelfMetaState())
				.build(block))
		.build(new BlockBookshelf("exampleBookshelf", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block anvil = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/anvil.json")
				.setBlockState("backport", "anvil.json")
				.setMetaStateInterpreter(new AnvilMetaState())
				.build(block))
		.build(new BlockAnvil("anvil", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block lantern = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/lantern.json")
				.setBlockState("backport", "lantern.json")
				.setMetaStateInterpreter(new LanternMetaState())
				.build(block))
		.build(new BlockLantern("lantern", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block soulLantern = new BlockBuilder(MOD_ID)
		.setLuminance(10)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/soul_lantern.json")
				.setBlockState("backport", "soul_lantern.json")
				.setMetaStateInterpreter(new LanternMetaState())
				.build(block))
		.build(new BlockLantern("soulLantern", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block lectern = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/lectern.json")
				.setBlockState("backport", "lectern.json")
				.setMetaStateInterpreter(new LecternMetaState())
				.build(block))
		.build(new BlockLecturn("lectern", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block campfire = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/campfire.json")
				.setBlockState("backport", "campfire.json")
				.setMetaStateInterpreter(new CampFireMetaState())
				.build(block))
		.build(new DragonBlockModel("campfire", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block soulfire = new BlockBuilder(MOD_ID)
		.setLuminance(10)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/soul_campfire.json")
				.setBlockState("backport", "soul_campfire.json")
				.setMetaStateInterpreter(new CampFireMetaState())
				.build(block))
		.build(new DragonBlockModel("soulfire", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block endPortalFrame = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/end_portal_frame.json")
				.build(block))
		.build(new DragonBlockModel("endPortalFrame", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block endRod = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/end_rod.json")
				.build(block))
		.build(new DragonBlockModel("endRod", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block sculkCatalyst = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/sculk_catalyst.json")
				.build(block))
		.build(new DragonBlockModel("sculkCatalyst", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block sculkSensor = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/sculk_sensor.json")
				.build(block))
		.build(new DragonBlockModel("sculkSensor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block sculkShrieker = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/sculk_shrieker.json")
				.build(block))
		.build(new DragonBlockModel("sculkShrieker", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block sculkVein = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/sculk_vein.json")
				.build(block))
		.build(new DragonBlockModel("sculkVein", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block calibratedSculkSensor = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/calibrated_sculk_sensor.json")
				.build(block))
		.build(new DragonBlockModel("calibratedSculkSensor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block blackShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/black_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/blue_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/brown_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/cyan_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/gray_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/green_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/light_blue_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/light_gray_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/lime_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/magenta_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeShulkerBox = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/orange_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/pink_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/purple_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/red_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block shulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("shulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/white_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/yellow_shulker_box")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block composter = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/composter.json")
				.build(block))
		.build(new DragonBlockModel("composter", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block hopper = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/hopper.json")
				.build(block))
		.build(new DragonBlockModel("hopper", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block scaffolding = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/scaffolding_stable.json")
				.build(block))
		.build(new BlockScaffolding("scaffolding", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block amethystCluster = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/amethyst_cluster.json")
				.build(block))
		.build(new DragonBlockModel("amethystCluster", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block azalea = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/azalea.json")
				.build(block))
		.build(new DragonBlockModel("azalea", UtilIdRegistrar.nextIdBlock(), Material.leaves));

	public static final Block floweringAzalea = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/flowering_azalea.json")
				.build(block))
		.build(new DragonBlockModel("floweringAzalea", UtilIdRegistrar.nextIdBlock(), Material.leaves));

	public static final Block azaleaLeaves = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/azalea_leaves.json")
				.build(block))
		.build(new DragonBlockModel("azaleaLeaves", UtilIdRegistrar.nextIdBlock(), Material.leaves));

	public static final Block floweringAzaleaLeaves = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/flowering_azalea_leaves.json")
				.build(block))
		.build(new DragonBlockModel("floweringAzaleaLeaves", UtilIdRegistrar.nextIdBlock(), Material.leaves));

	public static final Block bigDripleaf = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/big_dripleaf.json")
				.build(block))
		.build(new DragonBlockModel("bigDripleaf", UtilIdRegistrar.nextIdBlock(), Material.leaves));

	public static final Block buddingAmethyst = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/budding_amethyst.json")
				.build(block))
		.build(new DragonBlockModel("buddingAmethyst", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block blueIce = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/blue_ice")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
		.build(new Block("blueIce",UtilIdRegistrar.nextIdBlock(),Material.ice));

	public static final Block blackCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/black_carpet.json")
				.build(block))
		.build(new DragonBlockModel("blackCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block blueCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/blue_carpet.json")
				.build(block))
		.build(new DragonBlockModel("blueCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block brownCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/brown_carpet.json")
				.build(block))
		.build(new DragonBlockModel("brownCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block cyanCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/cyan_carpet.json")
				.build(block))
		.build(new DragonBlockModel("cyanCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block grayCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/gray_carpet.json")
				.build(block))
		.build(new DragonBlockModel("grayCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block greenCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/green_carpet.json")
				.build(block))
		.build(new DragonBlockModel("greenCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block lightBlueCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/light_blue_carpet.json")
				.build(block))
		.build(new DragonBlockModel("lightBlueCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block lightGrayCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/light_gray_carpet.json")
				.build(block))
		.build(new DragonBlockModel("lightGrayCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block limeCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/lime_carpet.json")
				.build(block))
		.build(new DragonBlockModel("limeCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block magentaCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/magenta_carpet.json")
				.build(block))
		.build(new DragonBlockModel("magentaCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block mossCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/moss_carpet.json")
				.build(block))
		.build(new DragonBlockModel("mossCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block orangeCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/orange_carpet.json")
				.build(block))
		.build(new DragonBlockModel("orangeCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block pinkCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pink_carpet.json")
				.build(block))
		.build(new DragonBlockModel("pinkCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block purpleCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/purple_carpet.json")
				.build(block))
		.build(new DragonBlockModel("purpleCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block redCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/red_carpet.json")
				.build(block))
		.build(new DragonBlockModel("redCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block whiteCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/white_carpet.json")
				.build(block))
		.build(new DragonBlockModel("whiteCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block yellowCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/yellow_carpet.json")
				.build(block))
		.build(new DragonBlockModel("yellowCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block chain = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/chain.json")
				.setBlockState("backport", "chain.json")
				.setMetaStateInterpreter(new ChainMetaState())
				.build(block))
		.build(new BlockChain("chain", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block smoker = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/smoker.json")
				.setBlockState("backport", "smoker.json")
				.setMetaStateInterpreter(new SmokerMetaState())
				.build(block))
		.build(new BlockSmoker("smoker", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block stonecutter = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/stonecutter.json")
				.setBlockState("backport", "stonecutter.json")
				.setMetaStateInterpreter(new StoneCutterMetaState())
				.build(block))
		.build(new BlockStoneCutter("stonecutter", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block grindstone = new BlockBuilder(MOD_ID)
		.setTags()
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/grindstone.json")
				.setBlockState("backport", "grindstone.json")
				.setMetaStateInterpreter(new GrindStoneMetaState())
				.build(block))
		.build(new BlockGrindStone("grindstone", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block cropsBeetRoot = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(BlockModelCropsBeetRoot::new)
		.build(new BlockCropsBeetRoot("crops.BeetRoot", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block cropsCarrot = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(BlockModelCropsCarrot::new)
		.build(new BlockCropsCarrot("crops.Carrot", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block cropsPotato = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(BlockModelCropsPotato::new)
		.build(new BlockCropsPotato("crops.potato", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block cropsTorchFlower = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(BlockModelCropsTorchFlower::new)
		.build(new BlockCropsTorchFlower("crops.TorchFlower", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block blockWatermelon = new BlockBuilder(MOD_ID)
		.setSideTextures(MOD_ID + ":block/melonSide")
		.setTopBottomTextures(MOD_ID + ":block/melonTop")
		.build(new BlockWatermelon("block.melon",  UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cropsWatermelon = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(BlockModelCropsWatermelon::new)
		.build(new BlockCropsWatermelon("crops.watermelon", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block glassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/glass_pane_post.json")
				.setBlockState("backport", "glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("glassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block blackStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/black_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/black_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("blackStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block blueStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/blue_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/blue_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("blueStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block brownStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/brown_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/brown_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("brownStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block cyanStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/cyan_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/cyan_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("cyanStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block grayStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/gray_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/gray_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("grayStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block greenStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/green_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/green_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("greenStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block lightBlueStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/light_blue_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/light_blue_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("lightBlueStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block lightGrayStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/light_gray_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/light_gray_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("lightGrayStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block limeStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/lime_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/lime_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("limeStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block magentaStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/magenta_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/magenta_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("magentaStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block orangeStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/orange_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/orange_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("orangeStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block pinkStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/pink_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/pink_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("pinkStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block purpleStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/purple_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/purple_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("purpleStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block redStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/red_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/red_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("redStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block whiteStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/white_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/white_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("whiteStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block yellowStainedGlassPane = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pane/yellow_stained_glass_pane_post.json")
				.setBlockState("backport", "panes/yellow_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(block))
		.build(new BlockGlassPane("yellowStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass));

	public static final Block pitcherPlantTop = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pitcher/pitcher_plant_top.json")
				.build(block))
		.build(new DragonBlockModel("pitcherPlantTop", UtilIdRegistrar.nextIdBlock(), Material.plant))
		.withTags(BlockTags.NOT_IN_CREATIVE_MENU);

	public static final Block pitcherPlantBottom = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/pitcher/pitcher_plant_bottom.json")
				.build(block))
		.build(new DragonBlockModel("pitcherPlantBottom", UtilIdRegistrar.nextIdBlock(), Material.plant))
		.withTags(BlockTags.NOT_IN_CREATIVE_MENU);

	public static final Block birchFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/birch_fence_inventory.json")
				.setBlockState("backport", "fence/birch_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("birchFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block acaciaFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/acacia_fence_inventory.json")
				.setBlockState("backport", "fence/acacia_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("acaciaFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block bambooFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/bamboo_fence_inventory.json")
				.setBlockState("backport", "fence/bamboo_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("bambooFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cherryFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/cherry_fence_inventory.json")
				.setBlockState("backport", "fence/cherry_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("cherryFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block crimsonFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setFlammability(0, 0)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/crimson_fence_inventory.json")
				.setBlockState("backport", "fence/crimson_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("crimsonFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block darkOakFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/dark_oak_fence_inventory.json")
				.setBlockState("backport", "fence/dark_oak_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("darkOakFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block jungleFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/jungle_fence_inventory.json")
				.setBlockState("backport", "fence/jungle_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("jungleFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block mangroveFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/mangrove_fence_inventory.json")
				.setBlockState("backport", "fence/mangrove_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("mangroveFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block spruceFence = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/spruce_fence_inventory.json")
				.setBlockState("backport", "fence/spruce_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("spruceFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block warpedFence = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/warped_fence_inventory.json")
				.setBlockState("backport", "fence/warped_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("warpedFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block netherBrickFence = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/fence/nether_brick_fence_inventory.json")
				.setBlockState("backport", "fence/nether_brick_fence.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("netherBrickFence", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block blackstoneWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/blackstone_wall_inventory.json")
				.setBlockState("backport", "wall/blackstone_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("blackstoneWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block brickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/brick_wall_inventory.json")
				.setBlockState("backport", "wall/brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("brickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block dioriteWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/diorite_wall_inventory.json")
				.setBlockState("backport", "wall/diorite_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("dioriteWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block graniteWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/granite_wall_inventory.json")
				.setBlockState("backport", "wall/granite_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("graniteWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block cobbledDeepslateWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/cobbled_deepslate_wall_inventory.json")
				.setBlockState("backport", "wall/cobbled_deepslate_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("cobbledDeepslateWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block cobblestoneWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/cobblestone_wall_inventory.json")
				.setBlockState("backport", "wall/cobblestone_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("cobblestoneWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block deepslateBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/deepslate_brick_wall_inventory.json")
				.setBlockState("backport", "wall/deepslate_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("deepslateBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block deepslateTileWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/deepslate_tile_wall_inventory.json")
				.setBlockState("backport", "wall/deepslate_tile_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("deepslateTileWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block endStoneBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/end_stone_brick_wall_inventory.json")
				.setBlockState("backport", "wall/end_stone_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("endStoneBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block mossyCobblestoneWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/mossy_cobblestone_wall_inventory.json")
				.setBlockState("backport", "wall/mossy_cobblestone_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("mossyCobblestoneWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block mossyStoneBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/mossy_stone_brick_wall_inventory.json")
				.setBlockState("backport", "wall/mossy_stone_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("mossyStoneBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block mudBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/mud_brick_wall_inventory.json")
				.setBlockState("backport", "wall/mud_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("mudBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block netherBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/nether_brick_wall_inventory.json")
				.setBlockState("backport", "wall/nether_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("netherBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block polishedBlackstoneBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/polished_blackstone_brick_wall_inventory.json")
				.setBlockState("backport", "wall/polished_blackstone_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("polishedBlackstoneBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block polishedBlackstoneWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/polished_blackstone_wall_inventory.json")
				.setBlockState("backport", "wall/polished_blackstone_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("polishedBlackstoneWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block polishedDeepslateWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/polished_deepslate_wall_inventory.json")
				.setBlockState("backport", "wall/polished_deepslate_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("polishedDeepslateWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block polishedTuffWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/polished_tuff_wall_inventory.json")
				.setBlockState("backport", "wall/polished_tuff_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("polishedTuffWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block prismarineWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/prismarine_wall_inventory.json")
				.setBlockState("backport", "wall/prismarine_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("prismarineWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block redNetherBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/red_nether_brick_wall_inventory.json")
				.setBlockState("backport", "wall/red_nether_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("redNetherBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block redSandstoneWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/red_sandstone_wall_inventory.json")
				.setBlockState("backport", "wall/red_sandstone_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("redSandstoneWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block sandstoneWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/sandstone_wall_inventory.json")
				.setBlockState("backport", "wall/sandstone_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("sandstoneWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block stoneBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/stone_brick_wall_inventory.json")
				.setBlockState("backport", "wall/stone_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("stoneBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block tuffBrickWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/tuff_brick_wall_inventory.json")
				.setBlockState("backport", "wall/tuff_brick_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("tuffBrickWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block tuffWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/tuff_wall_inventory.json")
				.setBlockState("backport", "wall/tuff_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("tuffWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block andesiteWall = new BlockBuilder(MOD_ID)
		.setFlammability(0, 0)
		.setTags(BlockTags.FENCES_CONNECT)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/wall/andesite_wall_inventory.json")
				.setBlockState("backport", "wall/andesite_wall.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(block))
		.build(new DragonBlockModel("andesiteWall", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block acaciaStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(acaciaPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block andesiteStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(andesite, UtilIdRegistrar.nextIdBlock()));

	public static final Block bambooMosaicStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(bambooMosaic, UtilIdRegistrar.nextIdBlock()));

	public static final Block bambooStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(bambooPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block birchStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(birchPlank, UtilIdRegistrar.nextIdBlock()));

	public static final Block blackstoneStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(blackStone, UtilIdRegistrar.nextIdBlock()));

	public static final Block cherryStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(cherryPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block cobbledDeepslateStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(cobbledDeepslate, UtilIdRegistrar.nextIdBlock()));

	public static final Block crimsonStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(crimsonPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block cutCopperStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(cutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block darkOakStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(darkOakPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block prismarine = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/prismarine")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("prismarine",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block prismarineStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(prismarine, UtilIdRegistrar.nextIdBlock()));

	public static final Block deepslateBrickStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(deepslateBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block deepslateTile = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/deepslate_tiles")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateTile",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateTileStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(deepslateTile, UtilIdRegistrar.nextIdBlock()));

	public static final Block dioriteStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(diorite, UtilIdRegistrar.nextIdBlock()));

	public static final Block endStoneBrickStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(endStoneBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block exposedCutCopperStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(exposedCutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block graniteStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(granite, UtilIdRegistrar.nextIdBlock()));

	public static final Block jungleStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(junglePlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block mangroveStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(mangrovePlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block cobbleStoneMossyStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(Block.cobbleStoneMossy, UtilIdRegistrar.nextIdBlock()));

	public static final Block mossyStoneBricks = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/mossy_stone_bricks")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("mossyStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mossyStoneBrickStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(mossyStoneBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block mudBrickStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(mudBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block netherBricksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(netherBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block oxidizedCutCopperStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(oxidizedCutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedAndesiteStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedAndesite, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedBlackstoneBricksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedBlackstoneBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedBlackstoneStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedBlackstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedDeepslateStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedDeepslate, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedDioriteStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedDiorite, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedGranite = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures(MOD_ID + ":block/polished_granite")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedGranite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedGraniteStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedGranite, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedTuffStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(polishedTuff, UtilIdRegistrar.nextIdBlock()));

	public static final Block prismarineBricksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(prismarineBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block purpurBlockStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(purpurBlock, UtilIdRegistrar.nextIdBlock()));

	public static final Block blockQuartzStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(Block.blockQuartz, UtilIdRegistrar.nextIdBlock()));

	public static final Block redNetherBricksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(redNetherBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block redSandstone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures(MOD_ID + ":block/red_sandstone")
		.setTopTexture(MOD_ID + ":block/red_sandstone_top")
		.setBottomTexture(MOD_ID + ":block/red_sandstone_bottom")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redSandstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redSandstoneStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(redSandstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block sandstoneStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(Block.sandstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block sprucePlanksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(sprucePlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block brickStoneStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(Block.brickStone, UtilIdRegistrar.nextIdBlock()));

	public static final Block stoneStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(Block.stone, UtilIdRegistrar.nextIdBlock()));

	public static final Block tuffBricksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(tuffBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block tuffStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(tuff, UtilIdRegistrar.nextIdBlock()));

	public static final Block warpedPlanksStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(warpedPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block weatheredCutCopperStairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelStairs::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockStairs(weatheredCutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block acaciaSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(acaciaPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block andesiteSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(andesite, UtilIdRegistrar.nextIdBlock()));

	public static final Block bambooMosaicSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(bambooMosaic, UtilIdRegistrar.nextIdBlock()));

	public static final Block bambooPlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(bambooPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block birchPlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(birchPlank, UtilIdRegistrar.nextIdBlock()));

	public static final Block blackStoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(blackStone, UtilIdRegistrar.nextIdBlock()));

	public static final Block cherryPlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(cherryPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block cobbledDeepslateSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(cobbledDeepslate, UtilIdRegistrar.nextIdBlock()));

	public static final Block crimsonPlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(crimsonPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block cutCopperSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(cutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block cutRedSandstone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture(MOD_ID + ":block/red_sandstone_top")
		.setBottomTexture(MOD_ID + ":block/red_sandstone_bottom")
		.setSideTextures(MOD_ID + ":block/cut_red_sandstone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cutRedSandstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cutRedSandstoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(cutRedSandstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block cutSandstone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture(MOD_ID + ":block/sandstone_top")
		.setBottomTexture(MOD_ID + ":block/sandstone_bottom")
		.setSideTextures(MOD_ID + ":block/cut_sandstone")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cutSandstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cutSandstoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(cutSandstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block darkOakPlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(darkOakPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block deepslateBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(deepslateBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block deepslateTileSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(deepslateTile, UtilIdRegistrar.nextIdBlock()));

	public static final Block dioriteSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(diorite, UtilIdRegistrar.nextIdBlock()));

	public static final Block endStoneBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(endStoneBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block exposedCutCopperSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(exposedCutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block graniteSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(granite, UtilIdRegistrar.nextIdBlock()));

	public static final Block junglePlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(junglePlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block mangrovePlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(mangrovePlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block cobbleStoneMossySlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(Block.cobbleStoneMossy, UtilIdRegistrar.nextIdBlock()));

	public static final Block mossyStoneBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(mossyStoneBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block mudBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(mudBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block netherBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(netherBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block oxidizedCutCopperSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(oxidizedCutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedAndesiteSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(polishedAndesite, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedBlackstoneBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(polishedBlackstoneBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedBlackstoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(polishedBlackstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedDioriteSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(polishedDiorite, UtilIdRegistrar.nextIdBlock()));

	public static final Block polishedTuffSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(polishedTuff, UtilIdRegistrar.nextIdBlock()));

	public static final Block prismarineBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(prismarineBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block purpurBlockSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(purpurBlock, UtilIdRegistrar.nextIdBlock()));

	public static final Block blockQuartzSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(Block.blockQuartz, UtilIdRegistrar.nextIdBlock()));

	public static final Block redNetherBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(redNetherBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block redSandstoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(redSandstone, UtilIdRegistrar.nextIdBlock()));

	public static final Block sprucePlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(sprucePlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block brickStoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(Block.brickStone, UtilIdRegistrar.nextIdBlock()));

	public static final Block stoneSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(Block.stone, UtilIdRegistrar.nextIdBlock()));

	public static final Block tuffBricksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(tuffBricks, UtilIdRegistrar.nextIdBlock()));

	public static final Block tuffSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(tuff, UtilIdRegistrar.nextIdBlock()));

	public static final Block warpedPlanksSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(warpedPlanks, UtilIdRegistrar.nextIdBlock()));

	public static final Block weatheredCutCopperSlab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelSlab::new)
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockSlab(weatheredCutCopper, UtilIdRegistrar.nextIdBlock()));

	public static final Block acaciaGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/acacia_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("acaciaGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block bambooGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/bamboo_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("bambooGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block birchGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/birch_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("birchGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block cherryGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/cherry_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("cherryGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block crimsonGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/crimson_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("crimsonGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block darkOakGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/dark_oak_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("darkOakGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block jungleGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/jungle_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("jungleGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block mangroveGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/mangrove_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("mangroveGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block spruceGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/spruce_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("spruceGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block warpedGate = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.5f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(BlockModelFenceGate::new)
		.setTextures(MOD_ID + ":block/warped_planks")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.setHardness(2)
		.setResistance(2.0f)
		.setTicking(true)
		.build(new BlockFenceGate("warpedGate", UtilIdRegistrar.nextIdBlock()));

	public static final Block bedBlack = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelBlackBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.black", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedBlack)};
			}
		});

	public static final Block bedBlue = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelBlueBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.blue", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedBlue)};
			}
		});

	public static final Block bedBrown = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelBrownBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.brown", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedBrown)};
			}
		});

	public static final Block bedCyan = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelCyanBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.cyan", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedCyan)};
			}
		});

	public static final Block bedGray = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelGrayBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.gray", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedGray)};
			}
		});

	public static final Block bedGreen = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelGreenBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.green", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedGreen)};
			}
		});

	public static final Block bedLightblue = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelLightblueBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Lightblue", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedLightblue)};
			}
		});

	public static final Block bedLightgray = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelLightGrayBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Lightgray", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedLightgray)};
			}
		});

	public static final Block bedLime = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelLimeBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Lime", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedLime)};
			}
		});

	public static final Block bedMagenta = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelMagentaBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Magenta", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedMagenta)};
			}
		});

	public static final Block bedOrange = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelOrangeBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Orange", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedOrange)};
			}
		});

	public static final Block bedPink = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelPinkBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Pink", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedPink)};
			}
		});

	public static final Block bedPurple = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelPinkBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Purple", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedPurple)};
			}
		});

	public static final Block bedWhite = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelWhiteBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.White", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedWhite)};
			}
		});

	public static final Block bedYellow = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelYellowBed::new)
		.setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setHardness(0.5f)
		.setResistance(1.0f)
		.build(new BlockBed("bed.Yellow", UtilIdRegistrar.nextIdBlock()) {
			@Override
			public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
				return new ItemStack[]{new ItemStack(ModItems.bedYellow)};
			}
		});

	public static final Block allium = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/allium")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("allium", UtilIdRegistrar.nextIdBlock()));

	public static final Block cartographyTable = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/cartography_table.json")
				.build(block))
		.build(new DragonBlockModel("cartographyTable", UtilIdRegistrar.nextIdBlock(), Material.cloth));

	public static final Block darkPrismarine = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setTextures(MOD_ID + ":block/dark_prismarine")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("darkPrismarine", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block brownMushroomBlock = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setTextures(MOD_ID + ":block/brown_mushroom_block")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("brownMushroomBlock", UtilIdRegistrar.nextIdBlock(), Material.stone));

	public static final Block bambooShoot = new BlockBuilder(MOD_ID)
		.setTags(BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/bamboo/bamboo1_age0.json")
				.build(block))
		.build(new BambooShoot("bambooShoot", UtilIdRegistrar.nextIdBlock()));

	public static final Block oldbambooShoot = new BlockBuilder(MOD_ID)
		.setBlockDrop(bambooShoot)
		.setTags(BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport", "block/bamboo/bamboo1_age1.json")
				.build(block))
		.build(new OldBambooShoot("oldbambooShoot", UtilIdRegistrar.nextIdBlock()));

	public static final Block bambooSapling = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures(MOD_ID + ":block/bamboo_stage0")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooSapling("bambooSapling", UtilIdRegistrar.nextIdBlock()));


	public static void register() {
	}

}
