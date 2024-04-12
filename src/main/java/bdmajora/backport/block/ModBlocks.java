package bdmajora.backport.block;

import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.backport;
import bdmajora.backport.block.Door.*;
import bdmajora.backport.block.Flowers.Lilac;
import bdmajora.backport.block.Flowers.Peony;
import bdmajora.backport.block.Nether.*;
import bdmajora.backport.block.TrapDoor.*;
import bdmajora.backport.block.Vines.BlockCaveVinesLit;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.block.Vines.BlockVines;
import bdmajora.backport.block.dragonfly.BlockBookshelf;
//import bdmajora.backport.tile.BellTileEntity;
//import bdmajora.backport.client.tesr.BellTileEntityRenderer;
import net.minecraft.client.render.block.color.BlockColorWater;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockAxisAligned;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

public class ModBlocks {

	public static final Block blackStone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("blackstone_top.png")
		.setSideTextures("blackstone.png")
		.setBottomTexture("blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledPolishedBlackstone = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_polished_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledPolishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedPolishedBlackstoneBricks = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_polished_blackstone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedPolishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block gildedBlackstone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gilded_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("gildedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstoneBricks = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_blackstone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstone = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mushroomStem = new BlockBuilder(backport.MOD_ID)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mushroom_stem.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("mushroomStem",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crackedStoneBricks = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledStoneBricks = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStone = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("end_stone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("endStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStoneBricks = new BlockBuilder(backport.MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("end_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("endStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mycelium = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("my_celium_top.png")
		.setSideTextures("my_celium_side.png")
		.setBottomTexture("dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("mycelium",UtilIdRegistrar.nextIdBlock(),Material.grass));

	public static final Block emeraldOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateEmeraldOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("deepslate_emerald_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateEmeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block emeraldBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledNetherBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedNetherBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("netherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherGoldOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_gold_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new BlockNetherGoldOre("netherGoldOre", UtilIdRegistrar.nextIdBlock()));

	public static final Block netherQuartzOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_quartz_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("netherQuartzOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redNetherBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block hayBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("hay_block_top.png")
		.setSideTextures("hay_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("hayBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block coarseDirt = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("coarse_dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("coarseDirt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block diorite = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("diorite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("diorite",UtilIdRegistrar.nextIdBlock(),Material.stone));
	public static final Block polishedDiorite = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_diorite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedDiorite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block andesite = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("andesite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("andesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedAndesite = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_andesite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedAndesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purpur_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpurBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurPillar = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("purpur_pillar_top.png")
		.setSideTextures("purpur_pillar.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpurPillar",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherWartBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_wart_block.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("netherWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedWartBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("warped_wart_block.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("warpedWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block boneBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("bone_block_top.png")
		.setSideTextures("bone_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("boneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block nylium = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("crimson_nylium.png")
		.setSideTextures("crimson_nylium_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, ModBlockTags.GROWS_NETHER_PLANTS)
		.build(new Block("nylium",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedNylium = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("warped_nylium.png")
		.setSideTextures("warped_nylium_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, ModBlockTags.GROWS_NETHER_PLANTS)
		.build(new Block("warpedNylium", UtilIdRegistrar.nextIdBlock(), Material.dirt));

	public static final Block crimsonFungus = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("crimson_fungus.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingCrimsonFungus("crimson_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));
	public static final Block warpedFungus = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("warped_fungus.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("warped_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));
	public static final Block crimsonStem = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setSideTextures("crimson_stem.png")
		.setTopBottomTexture("crimson_stem_top.png")
		.setTopBottomTexture("crimson_stem_top.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("crimson_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));
	public static final Block warpedStem = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setSideTextures("warped_stem.png")
		.setTopBottomTexture("warped_stem_top.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("warped_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));
	public static final Block crimsonPlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures("crimson_planks.png")
		.setTopBottomTexture("crimson_planks.png")
		.setTopBottomTexture("crimson_planks.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("crimson_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));
	public static final Block warpedPlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures("warped_planks.png")
		.setTopBottomTexture("warped_planks.png")
		.setTopBottomTexture("warped_planks.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("warped_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block shroomlight = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setSideTextures("shroomlight.png")
		.setTopBottomTexture("shroomlight.png")
		.setTopBottomTexture("shroomlight.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("shroomlight", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block cryingObsidian = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("crying_obsidian.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cryingObsidian",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lodestone = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("lodestone_top.png")
		.setSideTextures("lodestone_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lodestone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherSprouts = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("nether_sprouts.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("netherSprouts", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block quartzBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("quartz_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("quartzBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block soulSoil = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.SAND)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("soul_soil.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("soulSoil",UtilIdRegistrar.nextIdBlock(),Material.sand));

	public static final Block target = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("target_top.png")
		.setSideTextures("target_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("target",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block ancientDebris = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("ancient_debris_top.png")
		.setSideTextures("ancient_debris_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("ancientDebris",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block loom = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/loom.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "loom.json"), new bdmajora.backport.block.metastates.SmokerMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockLoom("loom", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/loom.json")));


	public static final Block fletchingTable = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/fletching_table.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "fletching_table.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("fletchingTable", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/fletching_table.json")));

	public static final Block smithingTable = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/smithing_table.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "smithing_table.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("smithingTable", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/smithing_table.json")));


	public static final Block amethystBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("amethyst_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("amethystBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("copper_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("copperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("copper_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("copperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCopperOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("deepslate_copper_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateCopperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cutCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedChiseledCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCutCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedChiseledCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCutCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawCopperBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_copper_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawCopperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredChiseledCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCutCopper = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawGoldBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_gold_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawGoldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawIronBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_iron_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawIronBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block calcite = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("calcite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("calcite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block dripstoneBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("dripstone_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("dripstoneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block rootedDirt = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("rooted_dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("rootedDirt",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block chiseledtuffBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("chiseled_tuff_bricks_top.png")
		.setSideTextures("chiseled_tuff_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledtuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledTuff = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("chiseled_tuff_top.png")
		.setSideTextures("chiseled_tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedTuff = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuffBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("tuff_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("tuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuff = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("tuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block ochrefroglight = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTexture("ochre_froglight_top.png")
		.setSideTextures("ochre_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("ochrefroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pearlescentfroglight = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTexture("pearlescent_froglight_top.png")
		.setSideTextures("pearlescent_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pearlescentfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block verdantfroglight = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTexture("verdant_froglight_top.png")
		.setSideTextures("verdant_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("verdantfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block seaLantern = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setLuminance(15)
		.setTextures("sea_lantern.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("seaLantern",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mud = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mud.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("mud",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block muddyMangroveRoot = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("muddy_mangrove_roots_top.png")
		.setSideTextures("muddy_mangrove_roots_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("muddyMangroveRoot",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block mudBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mud_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("mudBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block packedMud = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("packed_mud.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("packedMud",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block reinforcedDeepslate = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("reinforced_deepslate_top.png")
		.setBottomTexture("reinforced_deepslate_bottom.png")
		.setSideTextures("reinforced_deepslate_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("reinforcedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block sculk = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setTextures("sculk.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("sculk",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block bambooBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("bamboo_block_top.png")
		.setSideTextures("bamboo_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooMosaic = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("bamboo_mosaic.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooMosaic",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooPlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("bamboo_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block strippedBambooBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("stripped_bamboo_block_top.png")
		.setSideTextures("stripped_bamboo_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("strippedBambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block blackTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("black_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("blue_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("brown_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cyan_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gray_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("green_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_blue_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_gray_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("lime_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("magenta_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("orange_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("pink_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purple_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block terracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("terracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("white_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("yellow_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("black_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("blue_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("brown_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cyan_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gray_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("green_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_blue_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_gray_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("lime_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("magenta_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("orange_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purple_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("white_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("yellow_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magma = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setLuminance(5)
		.setTextures("magma.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magma",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block smoothBasalt = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("smooth_basalt.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("smoothBasalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block basalt = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("basalt_top.png")
		.setSideTextures("basalt_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("basalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslate = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("deepslate_top.png")
		.setSideTextures("deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledDeepslate = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("chiseled_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cobbledDeepslate = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cobbled_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cobbledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cracked_deepslate_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedDeepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateTiles = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cracked_deepslate_tiles.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedDeepslateTiles",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCoalOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_coal_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateCoalOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateDiamondOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_diamond_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateDiamondOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateIronOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_iron_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateIronOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateLapisOre = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_lapis_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateLapisOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedDeepslate = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("polished_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block granite = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("granite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("granite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcretePowder = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcrete = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block birchPlank = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("birchPlank",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaLog = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("acacia_log_top.png")
		.setSideTextures("acacia_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("acaciaLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaPlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("acaciaPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakLog = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("dark_oak_log_top.png")
		.setSideTextures("dark_oak_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("darkOakLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakPlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("darkOakPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jungleLog = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("jungle_log_top.png")
		.setSideTextures("jungle_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("jungleLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block junglePlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("junglePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangroveLog = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("mangrove_log_top.png")
		.setSideTextures("mangrove_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("mangroveLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangrovePlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("mangrovePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block spruceLog = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("spruce_log_top.png")
		.setSideTextures("spruce_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("spruceLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block sprucePlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("sprucePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block cherryPlanks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("cherryPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crimsonDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("crimson_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("crimsonDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block crimsonDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("crimson_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("crimsonDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block warpedDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("warped_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("warpedDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block warpedDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("warped_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WarpedDoor("wardpedDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block acaciaDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new AcaciaDoor("acaciaDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block acaciaDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new AcaciaDoor("acaciaDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block bambooDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("bamboo_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooDoor("bambooDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block bambooDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("bamboo_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooDoor("bambooDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block birchDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BirchDoor("birchDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block birchDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BirchDoor("birchDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block cherryDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CherryDoor("cherryDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block cherryDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CherryDoor("cherryDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block copperDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CopperDoor("copperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block copperDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CopperDoor("copperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block darkOakDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new DarkOakDoor("darkOakDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block darkOakDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new DarkOakDoor("darkOakDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block exposedCopperDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("exposed_copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new ExposedCopperDoor("exposedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block exposedCopperDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("exposed_copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new ExposedCopperDoor("exposedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block jungleDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new JungleDoor("jungleDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block jungleDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new JungleDoor("jungleDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block mangroveDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new MangroveDoor("mangroveDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block mangroveDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new MangroveDoor("mangroveDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block oxidizedCopperDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("oxidized_copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new OxidizedCopperDoor("oxidizedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block oxidizedCopperDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("oxidized_copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new OxidizedCopperDoor("oxidizedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block spruceDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new SpruceDoor("spruceDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block spruceDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new SpruceDoor("spruceDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block weatheredCopperDoorTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("weathered_copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WeatheredCopperDoor("weatheredCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block weatheredCopperDoorBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("weathered_copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WeatheredCopperDoor("weatheredCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block acaciaTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("acacia_trapdoor.png")
		.setSideTextures("acacia_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new AcaciaTrapDoor("acaciaTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block bambooTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("bamboo_trapdoor.png")
		.setSideTextures("bamboo_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BambooTrapDoor("bambooTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cherryTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("cherry_trapdoor.png")
		.setSideTextures("cherry_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new CherryTrapDoor("cherryTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block copperTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("copper_trapdoor.png")
		.setSideTextures("copper_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new CopperTrapDoor("copperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block crimsonTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("crimson_trapdoor.png")
		.setSideTextures("crimson_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new CrimsonTrapDoor("crimsonTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block darkOakTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("dark_oak_trapdoor.png")
		.setSideTextures("dark_oak_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new DarkOakTrapDoor("darkOakTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block exposedCopperTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("exposed_copper_trapdoor.png")
		.setSideTextures("exposed_copper_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new ExposedCopperTrapDoor("exposedCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block jungleTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("jungle_trapdoor.png")
		.setSideTextures("jungle_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new JungleTrapDoor("jungleTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block mangroveTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("mangrove_trapdoor.png")
		.setSideTextures("mangrove_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new MangroveTrapDoor("mangroveTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block oxidizedCopperTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("oxidized_copper_trapdoor.png")
		.setSideTextures("oxidized_copper_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new OxidizedCopperTrapDoor("oxidizedCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block spruceTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("spruce_trapdoor.png")
		.setSideTextures("spruce_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new SpruceTrapDoor("spruceTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block warpedTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("warped_trapdoor.png")
		.setSideTextures("warped_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new WarpedTrapDoor("warpedTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block weatheredCopperTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("weathered_copper_trapdoor.png")
		.setSideTextures("weathered_copper_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new WarpedTrapDoor("weatheredCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block birchTrapDoor = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTexture("birch_trapdoor.png")
		.setSideTextures("birch_trapdoor_side.png")
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BirchTrapDoor("birchTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

//	public static final Block barrel = new BlockBuilder(backport.MOD_ID)
// .setBlockSound(BlockSounds.WOOD)
//		.setHardness(2.0f)
//		.setResistance(2.0f)
//		.setTopTexture("barrel_top.png")
//		.setBottomTexture("barrel_bottom.png")
//		.setSideTextures("barrel_side.png")
//		.setTags(BlockTags.MINEABLE_BY_AXE)
//		.build(new Block("barrel", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block barrel = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/barrel.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "barrel.json"), new bdmajora.backport.block.metastates.BarrelMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockBarrel("barrel", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/barrel.json")));


	public static final Block beeNest = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("bee_nest_top.png")
		.setBottomTexture("bee_nest_bottom.png")
		.setNorthTexture("bee_nest_side.png")
		.setEastTexture("bee_nest_side.png")
		.setWestTexture("bee_nest_side.png")
		.setSouthTexture("bee_nest_front.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("beeNest",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block beeNestHoney = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("bee_nest_top.png")
		.setBottomTexture("bee_nest_bottom.png")
		.setNorthTexture("bee_nest_side.png")
		.setEastTexture("bee_nest_side.png")
		.setWestTexture("bee_nest_side.png")
		.setSouthTexture("bee_nest_front_honey.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("beeNestHoney",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block beeHive = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("beehive_end.png")
		.setNorthTexture("beehive_side.png")
		.setEastTexture("beehive_side.png")
		.setWestTexture("beehive_side.png")
		.setSouthTexture("beehive_front.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("beeHive",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block beeHiveHoney = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("beehive_end.png")
		.setNorthTexture("beehive_side.png")
		.setEastTexture("beehive_side.png")
		.setWestTexture("beehive_side.png")
		.setSouthTexture("beehive_front_honey.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("beeHiveHoney",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crafter = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("crafter_top.png")
		.setBottomTexture("crafter_bottom.png")
		.setNorthTexture("crafter_north.png")
		.setEastTexture("crafter_east.png")
		.setWestTexture("crafter_west.png")
		.setSouthTexture("crafter_south.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("crafter",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crafterTriggered = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("crafter_top_triggered.png")
		.setBottomTexture("crafter_bottom.png")
		.setNorthTexture("crafter_north.png")
		.setEastTexture("crafter_east_triggered.png")
		.setWestTexture("crafter_west_triggered.png")
		.setSouthTexture("crafter_south_triggered.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("crafterTriggered",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crafterCrafting = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("crafter_top_crafting.png")
		.setBottomTexture("crafter_bottom.png")
		.setNorthTexture("crafter_north.png")
		.setEastTexture("crafter_east_crafting.png")
		.setWestTexture("crafter_west_crafting.png")
		.setSouthTexture("crafter_south.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("crafterCrafting",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block honeyBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("honey_block_top.png")
		.setBottomTexture("honey_block_bottom.png")
		.setSideTextures("honey_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("honeyBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block honeyCombBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("honeycomb_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("honeyCombBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jigsaw = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("jigsaw_top.png")
		.setBottomTexture("jigsaw_bottom.png")
		.setNorthTexture("jigsaw_side.png")
		.setEastTexture("jigsaw_side.png")
		.setWestTexture("jigsaw_side.png")
		.setSouthTexture("jigsaw_lock.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("jigsaw",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block soulTorch = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.FIRE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("soul_torch.png")
		.setLuminance(15)
		.setBlockModel((new BlockModelRenderBlocks(2)))
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSoulTorch("soulTorch",UtilIdRegistrar.nextIdBlock()));

	public static final Block mossBlock = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("moss_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("mossBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block prismarineBricks = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("prismarine_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("prismarineBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block azureBluet = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("azure_bluet.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("azureBluet", UtilIdRegistrar.nextIdBlock()));

	public static final Block cornflower = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("cornflower.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("cornflower", UtilIdRegistrar.nextIdBlock()));

	public static final Block lilyOfTheValley = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("lily_of_the_valley.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("lilyOfTheValley", UtilIdRegistrar.nextIdBlock()));

	public static final Block orangeTulip = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("orange_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("orangeTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block oxeyeDaisy = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("oxeye_daisy.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("oxeyeDaisy", UtilIdRegistrar.nextIdBlock()));

	public static final Block pinkTulip = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("pink_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("pinkTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block redTulip = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("red_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("redTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block whiteTulip = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("white_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("whiteTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block witherRose = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("wither_rose.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("witherRose", UtilIdRegistrar.nextIdBlock()));

	public static final Block blackStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("black_stained_glass.png")
		.build(new BlockColouredGlass("blackStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block blueStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("blue_stained_glass.png")
		.build(new BlockColouredGlass("blueStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block brownStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("brown_stained_glass.png")
		.build(new BlockColouredGlass("brownStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block cyanStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("cyan_stained_glass.png")
		.build(new BlockColouredGlass("cyanStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block grayStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("gray_stained_glass.png")
		.build(new BlockColouredGlass("grayStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block greenStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("green_stained_glass.png")
		.build(new BlockColouredGlass("greenStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block lightBlueStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("light_blue_stained_glass.png")
		.build(new BlockColouredGlass("lightBlueStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block lightGrayStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("light_gray_stained_glass.png")
		.build(new BlockColouredGlass("lightGrayStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block limeStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("lime_stained_glass.png")
		.build(new BlockColouredGlass("limeStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block magentaStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("magenta_stained_glass.png")
		.build(new BlockColouredGlass("magentaStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block orangeStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("orange_stained_glass.png")
		.build(new BlockColouredGlass("orangeStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block pinkStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("pink_stained_glass.png")
		.build(new BlockColouredGlass("pinkStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block purpleStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("purple_stained_glass.png")
		.build(new BlockColouredGlass("purpleStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block redStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("red_stained_glass.png")
		.build(new BlockColouredGlass("redStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block tintedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("tinted_glass.png")
		.build(new BlockColouredGlass("tintedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block yellowStainedGlass = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("yellow_stained_glass.png")
		.build(new BlockColouredGlass("yellowStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

//	public static final Block banner = new BlockBuilder(backport.MOD_ID)
// .setBlockSound(BlockSounds.WOOD)
//		.setHardness(0.0f)
//		.setResistance(0.5f)
//		.setBlockModel(new BlockModelRenderBlocks(1))
//		.setTextures("banner.png")
//		.setTags(BlockTags.MINEABLE_BY_AXE)
//		.build(new BlockBanner("banner", UtilIdRegistrar.nextIdBlock()));

//	, BlockTags.NOT_IN_CREATIVE_MENU
	public static final Block weepingVines = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("weeping_vines.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockWeepingVines("weepingVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block twistingVines = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("twisting_vines.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockTwistingVinesPlant("twistingVines", UtilIdRegistrar.nextIdBlock()));
	public static final Block weepingVinesPlant = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("weeping_vines_plant.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockWeepingVinesPlant("weepingVinesPlant", UtilIdRegistrar.nextIdBlock()));
	public static final Block twistingVinesPlant = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("twisting_vines_plant.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockTwistingVinesPlant("twistingVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVines = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("cave_vines.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockVines("caveVines", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesPlant = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("cave_vines_plant.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockVines("caveVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesLit = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("cave_vines_lit.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setLuminance(15)
		.build(new BlockCaveVinesLit("caveVinesLit", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesPlantLit = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("cave_vines_plant_lit.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setLuminance(15)
		.build(new BlockCaveVinesLit("caveVinesPlantLit", UtilIdRegistrar.nextIdBlock()));

	public static final Block vine = new BlockBuilder(backport.MOD_ID)
		.setTextures("vine.png")
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.1f)
		.setResistance(0.1f)
		.setBlockModel(new BlockModelRenderBlocks(8))
		.setTags(BlockTags.MINEABLE_BY_SHEARS,BlockTags.SHEARS_DO_SILK_TOUCH)
		.build(new BlockVine("vine", UtilIdRegistrar.nextIdBlock()));

	public static final Block lilacTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("lilac_top.png")
		.setBlockModel(new BlockModelRenderBlocks(1))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("lilacTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true));

	public static final Block lilacBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("lilac_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(1))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("lilacBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false));

	public static final Block peonyTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("peony_top.png")
		.setBlockModel(new BlockModelRenderBlocks(1))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Peony("peonyTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true));

	public static final Block peonyBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("peony_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(1))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("peonyBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false));

	public static final Block roseBushTop = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("rose_bush_top.png")
		.setBlockModel(new BlockModelRenderBlocks(1))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Peony("roseBushTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true));

	public static final Block roseBushBottom = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("rose_bush_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(1))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("roseBushBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false));

	public static final Block sunflowerTop = new BlockBuilder(backport.MOD_ID)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockDrop(null)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sunflower_top.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "sunflower.json"), null, true))
		.build(new bdmajora.backport.block.Flowers.Sunflower("sunflowerTop", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sunflower_top.json")));

	public static final Block sunflowerBottom  = new BlockBuilder(backport.MOD_ID)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.setBlockDrop(null)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sunflower_bottom.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "sunflower.json"), null, true))
		.build(new bdmajora.backport.block.Flowers.Sunflower("sunflowerBottom ", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sunflower_bottom.json")));

	public static final Block testBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/testblock.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("testblock", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/testblock.json")));

	public static final Block testBlock2 = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/testblock2.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("testblock2", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/testblock2.json")));

	public static final Block testBlock3 = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/testblock3.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("testblock3", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/testblock3.json")));

	public static final Block modernDragonEgg = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/dragon_egg.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("exampleDragon", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/dragon_egg.json")));

	public static final Block modernBeacon = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/beacon.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("exampleBeacon", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/beacon.json")));

	public static final Block sideTest = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/pyramid.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("testblock4", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/pyramid.json")));

	public static final Block btaStool = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/stool.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("exampleStool", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/stool.json")));

	public static final Block cauldron = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/water_cauldron_full.json")))
		.setBlockColor(new BlockColorWater())
		.build(new bdmajora.backport.block.dragonfly.BlockModel("exampleCauldron", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/water_cauldron_full.json")));

	public static final Block stairs = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/stairs.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "test_stairs.json"), new bdmajora.backport.block.metastates.StairsMetaStateInterpreter(), true))
		.build(new BlockStairs(Block.dirt,UtilIdRegistrar.nextIdBlock())).withLitInteriorSurface(true);

	public static final Block brewing = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/brewing/brewing_stand.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "brewing_stand.json"), new bdmajora.backport.block.metastates.BrewingMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("exampleBrewingStand", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/brewing/brewing_stand.json")));

	public static final Block fence = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/fence/birch_fence_inventory.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "test_fence.json"), new bdmajora.backport.block.metastates.FenceMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("exampleFence", UtilIdRegistrar.nextIdBlock(), Material.dirt, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/fence/birch_fence_inventory.json"))).withTags(BlockTags.FENCES_CONNECT);

	public static final Block bookshelf = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/bookshelf/chiseled_bookshelf_inventory.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "chiseled_bookshelf.json"), new bdmajora.backport.block.metastates.BookshelfMetaState(), true))
		.build(new BlockBookshelf("exampleBookshelf", UtilIdRegistrar.nextIdBlock(), Material.dirt));

	public static final Block anvil = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/anvil.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "anvil.json"), new bdmajora.backport.block.metastates.AnvilMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockAnvil("anvil", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/anvil.json")));

	public static final Block lantern = new BlockBuilder(backport.MOD_ID)
		.setLuminance(15)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/lantern.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "lantern.json"), new bdmajora.backport.block.metastates.LanternMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockLantern("lantern", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/lantern.json")));

	public static final Block soulLantern = new BlockBuilder(backport.MOD_ID)
		.setLuminance(10)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/soul_lantern.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "soul_lantern.json"), new bdmajora.backport.block.metastates.LanternMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockLantern("soulLantern", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/soul_lantern.json")));

	public static final Block lectern = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/lectern.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "lectern.json"), new bdmajora.backport.block.metastates.LecternMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockLecturn("lectern", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/lectern.json")));

	public static final Block campfire = new BlockBuilder(backport.MOD_ID)
		.setLuminance(15)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/campfire.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "campfire.json"), new bdmajora.backport.block.metastates.CampFireMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("campfire", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/campfire.json")));

	public static final Block soulfire = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/soul_campfire.json")))
		.setLuminance(10)
		.build(new bdmajora.backport.block.dragonfly.BlockModel("soulfire", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/soul_campfire.json")));

	public static final Block campfireoff = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/campfire_off.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("campfireoff", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/campfire_off.json")));

	public static final Block endPortalFrameFilled = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/end_portal_frame_filled.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("endPortalFrameFilled", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/end_portal_frame_filled.json")));
	public static final Block endPortalFrame= new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/end_portal_frame.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("endPortalFrame", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/end_portal_frame.json")));

	public static final Block endRod = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/end_rod.json")))
		.setLuminance(15)
		.build(new bdmajora.backport.block.dragonfly.BlockModel("endRod", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/end_rod.json")));

	public static final Block sculkCatalyst = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_catalyst.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("sculkCatalyst", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_catalyst.json")));

	public static final Block sculkSensor = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_sensor.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("sculkSensor", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_sensor.json")));

	public static final Block sculkShrieker = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_shrieker.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("sculkShrieker", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_shrieker.json")));

	public static final Block sculkVein = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_vein.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("sculkVein", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/sculk_vein.json")));

	public static final Block calibratedSculkSensor = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/calibrated_sculk_sensor.json")))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("calibratedSculkSensor", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/calibrated_sculk_sensor.json")));

	public static final Block blackShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block shulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("shulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowShulkerBox = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block composter = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/composter.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "composter.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("composter", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/composter.json")));

	public static final Block hopper = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/hopper.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "hopper.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("hopper", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/hopper.json")));

	public static final Block scaffolding = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/scaffolding_stable.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "scaffolding.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("scaffolding", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/scaffolding_stable.json")));

	public static final Block amethystCluster = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/amethyst_cluster.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "amethyst_cluster.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("amethystCluster", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/amethyst_cluster.json")));

	public static final Block azalea = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/azalea.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "azalea.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("azalea", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/azalea.json")));

	public static final Block floweringAzalea = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/flowering_azalea.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "flowering_azalea.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("floweringAzalea", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/flowering_azalea.json")));

	public static final Block azaleaLeaves = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/azalea_leaves.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "azalea_leaves.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("azaleaLeaves", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/azalea_leaves.json")));

	public static final Block floweringAzaleaLeaves = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/flowering_azalea_leaves.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "flowering_azalea_leaves.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("floweringAzaleaLeaves", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/flowering_azalea_leaves.json")));

	public static final Block bigDripleaf = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/big_dripleaf.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "big_dripleaf.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("bigDripleaf", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/big_dripleaf.json")));

	public static final Block buddingAmethyst = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/budding_amethyst.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "budding_amethyst.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("buddingAmethyst", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/budding_amethyst.json")));
	public static final Block blueIce = new BlockBuilder(backport.MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_ice.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setSlipperiness(1200)
		.build(new Block("blueIce",UtilIdRegistrar.nextIdBlock(),Material.ice));

	public static final Block bell = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "item/bell.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "bell.json"), new bdmajora.backport.block.metastates.BellMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockBell("bell", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "item/bell.json")));


	public static final Block blackCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/black_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "black_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("blackCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/black_carpet.json")));

	public static final Block blueCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/blue_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "blue_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("blueCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/blue_carpet.json")));

	public static final Block brownCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/brown_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "brown_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("brownCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/brown_carpet.json")));

	public static final Block cyanCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/cyan_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "cyan_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("cyanCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/cyan_carpet.json")));

	public static final Block grayCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/gray_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "gray_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("grayCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/gray_carpet.json")));

	public static final Block greenCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/green_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "green_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("greenCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/green_carpet.json")));

	public static final Block lightBlueCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/light_blue_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "light_blue_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("lightBlueCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/light_blue_carpet.json")));

	public static final Block lightGrayCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/light_gray_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "light_gray_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("lightGrayCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/light_gray_carpet.json")));

	public static final Block limeCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/lime_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "lime_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("limeCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/lime_carpet.json")));

	public static final Block magentaCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/magenta_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "magenta_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("magentaCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/magenta_carpet.json")));

	public static final Block mossCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/moss_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "moss_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("mossCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/moss_carpet.json")));

	public static final Block orangeCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/orange_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "orange_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("orangeCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/orange_carpet.json")));

	public static final Block pinkCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/pink_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "pink_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("pinkCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/pink_carpet.json")));

	public static final Block purpleCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/purple_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "purple_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("purpleCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/purple_carpet.json")));

	public static final Block redCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/red_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "red_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("redCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/red_carpet.json")));

	public static final Block whiteCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/white_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "white_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("whiteCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/white_carpet.json")));

	public static final Block yellowCarpet = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/yellow_carpet.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "yellow_carpet.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockModel("yellowCarpet", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/yellow_carpet.json")));

//	Stane glass does not seem possible even with dragonfly, I will wait for an update to see if it gets better, maybe it's an entity and that's why.
//	public static final Block blackStainedGlassPane = new BlockBuilder(backport.MOD_ID)
//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/pane/black_stained_glass_pane_side_alt.json"),
//			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "black_stained_glass_pane.json"), null, true))
//			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "black_stained_glass_pane.json"), null, true))
//		.build(new bdmajora.backport.block.dragonfly.BlockModel("blackStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/pane/black_stained_glass_pane_side_alt.json")));

	public static final Block chain = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/chain.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "chain.json"), new bdmajora.backport.block.metastates.ChainMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockChain("chain", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/chain.json")));

	public static final Block enchantmentTable = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/enchanting_table.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "enchanting_table.json"), null, true))
		.build(new bdmajora.backport.block.dragonfly.BlockEnchantmentTable("enchantmentTable", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/chain.json")));

	public static final Block smoker = new BlockBuilder(backport.MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/smoker.json"),
			ModelHelper.getOrCreateBlockState(backport.MOD_ID, "smoker.json"), new bdmajora.backport.block.metastates.SmokerMetaState(), true))
		.build(new bdmajora.backport.block.dragonfly.BlockSmoker("smoker", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(backport.MOD_ID, "block/smoker.json")));

	public static void register() {
	}
}
