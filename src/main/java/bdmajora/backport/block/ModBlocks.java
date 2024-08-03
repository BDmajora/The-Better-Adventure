package bdmajora.backport.block;

import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.backport;
import bdmajora.backport.block.Crops.*;
import bdmajora.backport.block.Door.*;
import bdmajora.backport.block.Flowers.Lilac;
import bdmajora.backport.block.Flowers.Peony;
import bdmajora.backport.block.Flowers.Pitcher;
import bdmajora.backport.block.Flowers.Sunflower;
import bdmajora.backport.block.Nether.*;
import bdmajora.backport.block.TrapDoor.*;
import bdmajora.backport.block.Vines.BlockCaveVinesLit;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.block.Vines.BlockVines;
import bdmajora.backport.block.dragonfly.*;
import bdmajora.backport.block.dragonfly.BlockModel;
import bdmajora.backport.block.metastates.*;
import net.minecraft.client.render.block.color.BlockColorWater;

import net.minecraft.client.render.block.model.*;
import net.minecraft.core.block.*;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import org.useless.dragonfly.model.block.DFBlockModelBuilder;
import turniplabs.halplibe.helper.BlockBuilder;
import org.useless.dragonfly.helper.ModelHelper;
import org.useless.dragonfly.model.block.BlockModelDragonFly;

import static bdmajora.backport.backport.MOD_ID;

public class ModBlocks {

	public static final Block blackStone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("blackstone_top.png")
		.setSideTextures("blackstone.png")
		.setBottomTexture("blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledPolishedBlackstone = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_polished_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledPolishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedPolishedBlackstoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_polished_blackstone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedPolishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block gildedBlackstone = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gilded_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("gildedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_blackstone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstone = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mushroomStem = new BlockBuilder(MOD_ID)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mushroom_stem.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("mushroomStem",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crackedStoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledStoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStone = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("end_stone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("endStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStoneBricks = new BlockBuilder(MOD_ID)
 		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("end_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("endStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mycelium = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("my_celium_top.png")
		.setSideTextures("my_celium_side.png")
		.setBottomTexture("dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("mycelium",UtilIdRegistrar.nextIdBlock(),Material.grass));

	public static final Block emeraldOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateEmeraldOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("deepslate_emerald_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateEmeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block emeraldBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledNetherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedNetherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("netherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherGoldOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_gold_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new BlockNetherGoldOre("netherGoldOre", UtilIdRegistrar.nextIdBlock()));

	public static final Block netherQuartzOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_quartz_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("netherQuartzOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redNetherBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block hayBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("hay_block_top.png")
		.setSideTextures("hay_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("hayBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block coarseDirt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("coarse_dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("coarseDirt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block diorite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("diorite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("diorite",UtilIdRegistrar.nextIdBlock(),Material.stone));
	public static final Block polishedDiorite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_diorite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedDiorite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block andesite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("andesite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("andesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedAndesite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_andesite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedAndesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purpur_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpurBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurPillar = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("purpur_pillar_top.png")
		.setSideTextures("purpur_pillar.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpurPillar",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherWartBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_wart_block.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("netherWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedWartBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("warped_wart_block.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("warpedWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block boneBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("bone_block_top.png")
		.setSideTextures("bone_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("boneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block nylium = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("crimson_nylium.png")
		.setSideTextures("crimson_nylium_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, ModBlockTags.GROWS_NETHER_PLANTS)
		.build(new Block("nylium",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedNylium = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("warped_nylium.png")
		.setSideTextures("warped_nylium_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, ModBlockTags.GROWS_NETHER_PLANTS)
		.build(new Block("warpedNylium", UtilIdRegistrar.nextIdBlock(), Material.dirt));

	public static final Block crimsonFungus = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("crimson_fungus.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingCrimsonFungus("crimson_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block warpedFungus = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("warped_fungus.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("warped_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block crimsonStem = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(BlockModelLantern::new)
		.setSideTextures("crimson_stem.png")
		.setTopBottomTextures("crimson_stem_top.png")
		.setTopBottomTextures("crimson_stem_top.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("crimson_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block warpedStem = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(BlockModelLantern::new)
		.setSideTextures("warped_stem.png")
		.setTopBottomTextures("warped_stem_top.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("warped_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block crimsonPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures("crimson_planks.png")
		.setTopBottomTextures("crimson_planks.png")
		.setTopBottomTextures("crimson_planks.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("crimson_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block warpedPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures("warped_planks.png")
		.setTopBottomTextures("warped_planks.png")
		.setTopBottomTextures("warped_planks.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("warped_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block shroomlight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setSideTextures("shroomlight.png")
		.setTopBottomTextures("shroomlight.png")
		.setTopBottomTextures("shroomlight.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("shroomlight", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block cryingObsidian = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("crying_obsidian.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cryingObsidian",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lodestone = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("lodestone_top.png")
		.setSideTextures("lodestone_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lodestone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherSprouts = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("nether_sprouts.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("netherSprouts", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block quartzBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("quartz_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("quartzBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block soulSoil = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.SAND)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("soul_soil.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("soulSoil",UtilIdRegistrar.nextIdBlock(),Material.sand));

	public static final Block target = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("target_top.png")
		.setSideTextures("target_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("target",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block ancientDebris = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("ancient_debris_top.png")
		.setSideTextures("ancient_debris_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("ancientDebris",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final BlockBuilder loom = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/loom.json")
					.setBlockState("backport","loom.json")
						.setMetaStateInterpreter(new LoomMetaState())
		.build(new BlockLoom("loom", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/loom.json"))));

	public static final BlockBuilder fletchingTable = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/fletching_table.json")
				.setBlockState("backport","fletching_table.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("fletchingTable", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/fletching_table.json"))));

	public static final BlockBuilder smithingTable = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/smithing_table.json")
				.setBlockState("backport","smithing_table.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("smithingTable", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/smithing_table.json"))));

	public static final Block amethystBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("amethyst_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("amethystBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("copper_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("copperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("copper_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("copperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCopperOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("deepslate_copper_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateCopperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedChiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedChiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawCopperBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_copper_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawCopperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredChiseledCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCutCopper = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawGoldBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_gold_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawGoldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawIronBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_iron_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawIronBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block calcite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("calcite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("calcite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block dripstoneBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("dripstone_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("dripstoneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block rootedDirt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("rooted_dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("rootedDirt",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block chiseledtuffBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("chiseled_tuff_bricks_top.png")
		.setSideTextures("chiseled_tuff_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledtuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledTuff = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("chiseled_tuff_top.png")
		.setSideTextures("chiseled_tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedTuff = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuffBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("tuff_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("tuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuff = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("tuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block ochrefroglight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTextures("ochre_froglight_top.png")
		.setSideTextures("ochre_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("ochrefroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pearlescentfroglight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTextures("pearlescent_froglight_top.png")
		.setSideTextures("pearlescent_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pearlescentfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block verdantfroglight = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTextures("verdant_froglight_top.png")
		.setSideTextures("verdant_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("verdantfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block seaLantern = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(BlockModelLantern::new)
		.setLuminance(15)
		.setTextures("sea_lantern.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("seaLantern",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mud = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mud.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("mud",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block muddyMangroveRoot = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("muddy_mangrove_roots_top.png")
		.setSideTextures("muddy_mangrove_roots_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("muddyMangroveRoot",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block mudBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mud_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("mudBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block packedMud = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("packed_mud.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("packedMud",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block reinforcedDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("reinforced_deepslate_top.png")
		.setBottomTexture("reinforced_deepslate_bottom.png")
		.setSideTextures("reinforced_deepslate_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("reinforcedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block sculk = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(BlockModelLantern::new)
		.setTextures("sculk.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("sculk",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block bambooBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("bamboo_block_top.png")
		.setSideTextures("bamboo_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooMosaic = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("bamboo_mosaic.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooMosaic",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("bamboo_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("bambooPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block strippedBambooBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTextures("stripped_bamboo_block_top.png")
		.setSideTextures("stripped_bamboo_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("strippedBambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block blackTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("black_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("blue_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("brown_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cyan_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gray_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("green_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_blue_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_gray_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("lime_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("magenta_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("orange_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("pink_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purple_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block terracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("terracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("white_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("yellow_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("black_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("blue_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("brown_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cyan_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gray_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("green_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_blue_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_gray_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("lime_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("magenta_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("orange_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purple_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("white_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowGlazedTerracotta = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("yellow_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magma = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(BlockModelLantern::new)
		.setLuminance(5)
		.setTextures("magma.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magma",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block smoothBasalt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("smooth_basalt.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("smoothBasalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block basalt = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("basalt_top.png")
		.setSideTextures("basalt_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("basalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("deepslate_top.png")
		.setSideTextures("deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("chiseled_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cobbledDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cobbled_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cobbledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cracked_deepslate_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedDeepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateTiles = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cracked_deepslate_tiles.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedDeepslateTiles",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCoalOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_coal_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateCoalOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateDiamondOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_diamond_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateDiamondOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateIronOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_iron_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateIronOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateLapisOre = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_lapis_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateLapisOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedDeepslate = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("polished_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block granite = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("granite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("granite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcretePowder = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcrete = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block birchPlank = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("birchPlank",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("acacia_log_top.png")
		.setSideTextures("acacia_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("acaciaLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("acaciaPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("dark_oak_log_top.png")
		.setSideTextures("dark_oak_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("darkOakLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("darkOakPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jungleLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("jungle_log_top.png")
		.setSideTextures("jungle_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("jungleLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block junglePlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("junglePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangroveLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("mangrove_log_top.png")
		.setSideTextures("mangrove_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("mangroveLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangrovePlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("mangrovePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block spruceLog = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("spruce_log_top.png")
		.setSideTextures("spruce_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("spruceLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block sprucePlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new Block("sprucePlanks, BlockTags.FENCES_CONNECT",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block cherryPlanks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
		.build(new BlockAxisAligned("cherryPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crimsonDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("crimson_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("crimsonDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block crimsonDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("crimson_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("crimsonDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block warpedDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("warped_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("warpedDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block warpedDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("warped_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WarpedDoor("wardpedDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block acaciaDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new AcaciaDoor("acaciaDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block acaciaDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new AcaciaDoor("acaciaDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block bambooDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("bamboo_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooDoor("bambooDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block bambooDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("bamboo_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooDoor("bambooDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block birchDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BirchDoor("birchDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block birchDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BirchDoor("birchDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block cherryDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CherryDoor("cherryDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block cherryDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CherryDoor("cherryDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block copperDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("copper_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CopperDoor("copperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block copperDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("copper_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CopperDoor("copperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block darkOakDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new DarkOakDoor("darkOakDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block darkOakDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new DarkOakDoor("darkOakDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block exposedCopperDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("exposed_copper_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new ExposedCopperDoor("exposedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block exposedCopperDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("exposed_copper_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new ExposedCopperDoor("exposedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block jungleDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new JungleDoor("jungleDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block jungleDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new JungleDoor("jungleDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block mangroveDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new MangroveDoor("mangroveDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block mangroveDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new MangroveDoor("mangroveDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block oxidizedCopperDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("oxidized_copper_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new OxidizedCopperDoor("oxidizedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block oxidizedCopperDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("oxidized_copper_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new OxidizedCopperDoor("oxidizedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block spruceDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new SpruceDoor("spruceDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block spruceDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new SpruceDoor("spruceDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block weatheredCopperDoorTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("weathered_copper_door_top.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WeatheredCopperDoor("weatheredCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block weatheredCopperDoorBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("weathered_copper_door_bottom.png")
		.setBlockModel(BlockModelDoor::new)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WeatheredCopperDoor("weatheredCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block acaciaTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("acacia_trapdoor.png")
		.setSideTextures("acacia_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new AcaciaTrapDoor("acaciaTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block bambooTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("bamboo_trapdoor.png")
		.setSideTextures("bamboo_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BambooTrapDoor("bambooTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cherryTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("cherry_trapdoor.png")
		.setSideTextures("cherry_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new CherryTrapDoor("cherryTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block copperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("copper_trapdoor.png")
		.setSideTextures("copper_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new CopperTrapDoor("copperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block crimsonTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("crimson_trapdoor.png")
		.setSideTextures("crimson_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new CrimsonTrapDoor("crimsonTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block darkOakTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("dark_oak_trapdoor.png")
		.setSideTextures("dark_oak_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new DarkOakTrapDoor("darkOakTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block exposedCopperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("exposed_copper_trapdoor.png")
		.setSideTextures("exposed_copper_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new ExposedCopperTrapDoor("exposedCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block jungleTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("jungle_trapdoor.png")
		.setSideTextures("jungle_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new JungleTrapDoor("jungleTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block mangroveTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("mangrove_trapdoor.png")
		.setSideTextures("mangrove_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new MangroveTrapDoor("mangroveTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block oxidizedCopperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("oxidized_copper_trapdoor.png")
		.setSideTextures("oxidized_copper_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new OxidizedCopperTrapDoor("oxidizedCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block spruceTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("spruce_trapdoor.png")
		.setSideTextures("spruce_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new SpruceTrapDoor("spruceTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block warpedTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("warped_trapdoor.png")
		.setSideTextures("warped_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_AXE)
		.build(new WarpedTrapDoor("warpedTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block weatheredCopperTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.METAL)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("weathered_copper_trapdoor.png")
		.setSideTextures("weathered_copper_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
		.setVisualUpdateOnMetadata()
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new WarpedTrapDoor("weatheredCopperTrapDoor", UtilIdRegistrar.nextIdBlock(), Material.metal));

	public static final Block birchTrapDoor = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(5.0f)
		.setResistance(2000.0f)
		.setTopBottomTextures("birch_trapdoor.png")
		.setSideTextures("birch_trapdoor_side.png")
		.setBlockModel(BlockModelTrapDoor::new)
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

	public static final BlockBuilder barrel = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/barrel.json")
				.setBlockState("backport","barrel.json")
				.setMetaStateInterpreter(new BarrelMetaState())
				.build(new BlockBarrel("barrel", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/barrel.json")).withTags((BlockTags.NOT_IN_CREATIVE_MENU))));


	public static final Block beeNest = new BlockBuilder(MOD_ID)
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

	public static final Block beeNestHoney = new BlockBuilder(MOD_ID)
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

	public static final Block beeHive = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("beehive_end.png")
		.setNorthTexture("beehive_side.png")
		.setEastTexture("beehive_side.png")
		.setWestTexture("beehive_side.png")
		.setSouthTexture("beehive_front.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("beeHive",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block beeHiveHoney = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTextures("beehive_end.png")
		.setNorthTexture("beehive_side.png")
		.setEastTexture("beehive_side.png")
		.setWestTexture("beehive_side.png")
		.setSouthTexture("beehive_front_honey.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("beeHiveHoney",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crafter = new BlockBuilder(MOD_ID)
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

	public static final Block crafterTriggered = new BlockBuilder(MOD_ID)
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

	public static final Block crafterCrafting = new BlockBuilder(MOD_ID)
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

	public static final Block honeyBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopTexture("honey_block_top.png")
		.setBottomTexture("honey_block_bottom.png")
		.setSideTextures("honey_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("honeyBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block honeyCombBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("honeycomb_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("honeyCombBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jigsaw = new BlockBuilder(MOD_ID)
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

	public static final Block soulTorch = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.FIRE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("soul_torch.png")
		.setLuminance(15)
		.setBlockModel(BlockModelTorch::new)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSoulTorch("soulTorch",UtilIdRegistrar.nextIdBlock()));

	public static final Block mossBlock = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("moss_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("mossBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block prismarineBricks = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("prismarine_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("prismarineBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block azureBluet = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("azure_bluet.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("azureBluet", UtilIdRegistrar.nextIdBlock()));

	public static final Block cornflower = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("cornflower.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("cornflower", UtilIdRegistrar.nextIdBlock()));

	public static final Block lilyOfTheValley = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("lily_of_the_valley.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("lilyOfTheValley", UtilIdRegistrar.nextIdBlock()));

	public static final Block orangeTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("orange_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("orangeTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block oxeyeDaisy = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("oxeye_daisy.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("oxeyeDaisy", UtilIdRegistrar.nextIdBlock()));

	public static final Block pinkTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("pink_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("pinkTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block redTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("red_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("redTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block whiteTulip = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("white_tulip.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("whiteTulip", UtilIdRegistrar.nextIdBlock()));

	public static final Block witherRose = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("wither_rose.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockFlower("witherRose", UtilIdRegistrar.nextIdBlock()));

	public static final Block blackStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("black_stained_glass.png")
		.build(new BlockColouredGlass("blackStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block blueStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("blue_stained_glass.png")
		.build(new BlockColouredGlass("blueStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block brownStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("brown_stained_glass.png")
		.build(new BlockColouredGlass("brownStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block cyanStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("cyan_stained_glass.png")
		.build(new BlockColouredGlass("cyanStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block grayStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("gray_stained_glass.png")
		.build(new BlockColouredGlass("grayStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block greenStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("green_stained_glass.png")
		.build(new BlockColouredGlass("greenStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block lightBlueStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("light_blue_stained_glass.png")
		.build(new BlockColouredGlass("lightBlueStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block lightGrayStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("light_gray_stained_glass.png")
		.build(new BlockColouredGlass("lightGrayStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block limeStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("lime_stained_glass.png")
		.build(new BlockColouredGlass("limeStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block magentaStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("magenta_stained_glass.png")
		.build(new BlockColouredGlass("magentaStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block orangeStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("orange_stained_glass.png")
		.build(new BlockColouredGlass("orangeStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block pinkStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("pink_stained_glass.png")
		.build(new BlockColouredGlass("pinkStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block purpleStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("purple_stained_glass.png")
		.build(new BlockColouredGlass("purpleStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block redStainedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("red_stained_glass.png")
		.build(new BlockColouredGlass("redStainedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block tintedGlass = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GLASS)
		.setHardness(0.3f)
		.setResistance(1.5f)
		.setTextures("tinted_glass.png")
		.build(new BlockColouredGlass("tintedGlass", UtilIdRegistrar.nextIdBlock(), Material.glass, false));

	public static final Block yellowStainedGlass = new BlockBuilder(MOD_ID)
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
	public static final Block weepingVines = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("weeping_vines.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockWeepingVines("weepingVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block twistingVines = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("twisting_vines.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockTwistingVinesPlant("twistingVines", UtilIdRegistrar.nextIdBlock()));
	public static final Block weepingVinesPlant = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("weeping_vines_plant.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockWeepingVinesPlant("weepingVinesPlant", UtilIdRegistrar.nextIdBlock()));
	public static final Block twistingVinesPlant = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("twisting_vines_plant.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockTwistingVinesPlant("twistingVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVines = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("cave_vines.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockVines("caveVines", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesPlant = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("cave_vines_plant.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockVines("caveVinesPlant", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesLit = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("cave_vines_lit.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setLuminance(15)
		.build(new BlockCaveVinesLit("caveVinesLit", UtilIdRegistrar.nextIdBlock()));

	public static final Block caveVinesPlantLit = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(BlockModelCrossedSquares::new)
		.setTextures("cave_vines_plant_lit.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.setLuminance(15)
		.build(new BlockCaveVinesLit("caveVinesPlantLit", UtilIdRegistrar.nextIdBlock()));

	public static final Block vine = new BlockBuilder(MOD_ID)
		.setTextures("vine.png")
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.1f)
		.setResistance(0.1f)
		.setBlockModel(BlockModelLadder::new)
		.setTags(BlockTags.MINEABLE_BY_SHEARS,BlockTags.SHEARS_DO_SILK_TOUCH)
		.build(new BlockVine("vine", UtilIdRegistrar.nextIdBlock()));

	public static final Block lilacTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("lilac_top.png")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("lilacTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true));

	public static final Block lilacBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("lilac_bottom.png")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("lilacBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false));

	public static final Block peonyTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("peony_top.png")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Peony("peonyTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true));

	public static final Block peonyBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("peony_bottom.png")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("peonyBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false));

	public static final Block roseBushTop = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("rose_bush_top.png")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Peony("roseBushTop", UtilIdRegistrar.nextIdBlock(), Material.plant, true));

	public static final Block roseBushBottom = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.0f)
		.setTextures("rose_bush_bottom.png")
		.setBlockModel(BlockModelCrossedSquares::new)
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new Lilac("roseBushBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, false));

	public static final BlockBuilder sunflowerTop = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/sunflower_top.json")
				.setBlockState("backport","sunflower_top.json")
				.setMetaStateInterpreter(null)
				.build(new Sunflower("sunflowerTop", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sunflower_top.json")).withTags((BlockTags.NOT_IN_CREATIVE_MENU))));

	public static final BlockBuilder sunflowerBottom = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/sunflower_bottom.json")
				.setBlockState("backport","sunflower.json")
				.setMetaStateInterpreter(null)
				.build(new Sunflower("sunflowerTop", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sunflower_top.json")).withTags((BlockTags.NOT_IN_CREATIVE_MENU))));

	public static final BlockBuilder testBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/testblock.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("testblock", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/testblock.json"))));

	public static final BlockBuilder testBlock2 = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/testblock2.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("testblock2", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/testblock2.json"))));

	public static final BlockBuilder testBlock3 = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/testblock3.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("testblock3", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/testblock3.json"))));

	public static final BlockBuilder modernDragonEgg = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/dragon_egg.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("exampleDragon", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/dragon_egg.json"))));

	public static final BlockBuilder modernBeacon = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/beacon.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("exampleBeacon", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/beacon.json"))));

	public static final BlockBuilder sideTest = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/pyramid.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("testblock4", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/pyramid.json"))));

	public static final BlockBuilder btaStool = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/stool.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("exampleStool", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/stool.json"))));

	public static final BlockBuilder cauldron = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/water_cauldron_full.json")
				.setMetaStateInterpreter(null)
				.build(new BlockModel("exampleCauldron", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/water_cauldron_full.json"))));

	public static final BlockBuilder stairs = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/stairs.json")
				.setMetaStateInterpreter(new StairsMetaStateInterpreter())
				.build(new BlockStairs(Block.dirt,UtilIdRegistrar.nextIdBlock())));

	public static final BlockBuilder brewing = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/brewing_stand.json")
				.setMetaStateInterpreter(new BrewingMetaState())
				.build(new BlockModel("exampleBrewingStand", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/brewing_stand.json"))));

	public static final BlockBuilder fence = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/fence/birch_fence_inventory.json")
				.setMetaStateInterpreter(new FenceMetaState())
				.build(new BlockModel("exampleFence", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/fence/birch_fence_inventory.json"))));

	public static final BlockBuilder bookshelf = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/bookshelf/chiseled_bookshelf_inventory.json")
				.setMetaStateInterpreter(new BookshelfMetaState())
				.build(new BlockBookshelf("exampleBookshelf", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/bookshelf/chiseled_bookshelf_inventory.json"))));

	public static final BlockBuilder anvil = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/anvil.json")
				.setBlockState("backport", "anvil.json")
				.setMetaStateInterpreter(new AnvilMetaState())
				.build(new BlockAnvil("anvil", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/anvil.json"))));

	public static final BlockBuilder lantern = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/lantern.json")
				.setBlockState("backport", "lantern.json")
				.setMetaStateInterpreter(new LanternMetaState())
				.build(new BlockLantern("lantern", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/lantern.json"))));

	public static final BlockBuilder soulLantern = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/soul_lantern.json")
				.setBlockState("backport", "soul_lantern.json")
				.setMetaStateInterpreter(new LanternMetaState())
				.build(new BlockLantern("soulLantern", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/soul_lantern.json"))));

	public static final BlockBuilder lectern = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/lectern.json")
				.setBlockState("backport", "lectern.json")
				.setMetaStateInterpreter(new LecternMetaState())
				.build(new BlockLecturn("lectern", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/lectern.json"))));

	public static final BlockBuilder campfire = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/campfire.json")
				.setBlockState("backport", "campfire.json")
				.setMetaStateInterpreter(new CampFireMetaState())
				.build(new BlockModel("campfire", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/campfire.json"))));

	public static final BlockBuilder soulfire = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/soul_campfire.json")
				.setBlockState("backport", "soul_campfire.json")
				.setMetaStateInterpreter(new CampFireMetaState())
				.build(new BlockModel("soulfire", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/soul_campfire.json"))));

	public static final BlockBuilder campfireoff = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/campfire_off.json")
				.setBlockState("backport", "campfire_off.json")
				.setMetaStateInterpreter(new CampFireMetaState())
				.build(new BlockModel("soulfire", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/campfire_off.json"))));

	public static final BlockBuilder endPortalFrameFilled = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/end_portal_frame_filled.json")
				.setBlockState("backport", "end_portal_frame_filled.json")
				.build(new BlockModel("endPortalFrameFilled", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/end_portal_frame_filled.json"))));

	public static final BlockBuilder endPortalFrame = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/end_portal_frame.json")
				.setBlockState("backport", "end_portal_frame.json")
				.build(new BlockModel("endPortalFrame", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/end_portal_frame.json"))));

	public static final BlockBuilder endRod = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/end_rod.json")
				.setBlockState("backport", "end_rod.json")
				.build(new BlockModel("endRod", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/end_rod.json"))));

	public static final BlockBuilder sculkCatalyst = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/sculk_catalyst.json")
				.setBlockState("backport", "sculk_catalyst.json")
				.build(new BlockModel("sculkCatalyst", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sculk_catalyst.json"))));

	public static final BlockBuilder sculkSensor = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/sculk_sensor.json")
				.setBlockState("backport", "sculk_sensor.json")
				.build(new BlockModel("sculkSensor", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sculk_sensor.json"))));

	public static final BlockBuilder sculkShrieker = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/sculk_shrieker.json")
				.setBlockState("backport", "sculk_shrieker.json")
				.build(new BlockModel("sculkShrieker", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sculk_shrieker.json"))));

	public static final BlockBuilder sculkVein = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/sculk_vein.json")
				.setBlockState("backport", "sculk_vein.json")
				.build(new BlockModel("sculkVein", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sculk_vein.json"))));

	public static final BlockBuilder calibratedSculkSensor = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/calibrated_sculk_sensor.json")
				.setBlockState("backport", "calibrated_sculk_sensor.json")
				.build(new BlockModel("calibratedSculkSensor", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/calibrated_sculk_sensor.json"))));


	public static final Block blackShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block shulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("shulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowShulkerBox = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_shulker_box.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowShulkerBox",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final BlockBuilder composter = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/composter.json")
				.setBlockState("backport", "composter.json")
				.build(new BlockModel("composter", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/composter.json"))));

	public static final BlockBuilder hopper = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/hopper.json")
				.setBlockState("backport", "hopper.json")
				.build(new BlockModel("hopper", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/hopper.json"))));

	public static final BlockBuilder scaffolding = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/scaffolding_stable.json")
				.setBlockState("backport", "scaffolding.json")
				.build(new BlockModel("scaffolding", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/scaffolding_stable.json"))));

	public static final BlockBuilder amethystCluster = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/amethyst_cluster.json")
				.setBlockState("backport", "amethyst_cluster.json")
				.build(new BlockModel("amethystCluster", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/amethyst_cluster.json"))));

	public static final BlockBuilder azalea = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/azalea.json")
				.setBlockState("backport", "azalea.json")
				.build(new BlockModel("azalea", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/azalea.json"))));

	public static final BlockBuilder floweringAzalea = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/flowering_azalea.json")
				.setBlockState("backport", "flowering_azalea.json")
				.build(new BlockModel("floweringAzalea", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/flowering_azalea.json"))));

	public static final BlockBuilder azaleaLeaves = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/azalea_leaves.json")
				.setBlockState("backport", "azalea_leaves.json")
				.build(new BlockModel("azaleaLeaves", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/azalea_leaves.json"))));

	public static final BlockBuilder floweringAzaleaLeaves = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/flowering_azalea_leaves.json")
				.setBlockState("backport", "flowering_azalea_leaves.json")
				.build(new BlockModel("floweringAzaleaLeaves", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/flowering_azalea_leaves.json"))));

	public static final BlockBuilder bigDripleaf = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/big_dripleaf.json")
				.setBlockState("backport", "big_dripleaf.json")
				.build(new BlockModel("bigDripleaf", UtilIdRegistrar.nextIdBlock(), Material.leaves, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/big_dripleaf.json"))));

	public static final BlockBuilder buddingAmethyst = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/budding_amethyst.json")
				.setBlockState("backport", "budding_amethyst.json")
				.build(new BlockModel("buddingAmethyst", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/budding_amethyst.json"))));

	public static final Block blueIce = new BlockBuilder(MOD_ID)
 .setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_ice.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.setSlipperiness(1200)
		.build(new Block("blueIce",UtilIdRegistrar.nextIdBlock(),Material.ice));

	public static final BlockBuilder blackCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/black_carpet.json")
				.setBlockState("backport", "black_carpet.json")
				.build(new BlockModel("blackCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/black_carpet.json"))));

	public static final BlockBuilder blueCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/blue_carpet.json")
				.setBlockState("backport", "blue_carpet.json")
				.build(new BlockModel("blueCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blue_carpet.json"))));

	public static final BlockBuilder brownCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/brown_carpet.json")
				.setBlockState("backport", "brown_carpet.json")
				.build(new BlockModel("brownCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/brown_carpet.json"))));

	public static final BlockBuilder cyanCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/cyan_carpet.json")
				.setBlockState("backport", "cyan_carpet.json")
				.build(new BlockModel("cyanCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/cyan_carpet.json"))));

	public static final BlockBuilder grayCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/gray_carpet.json")
				.setBlockState("backport", "gray_carpet.json")
				.build(new BlockModel("grayCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gray_carpet.json"))));

	public static final BlockBuilder greenCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/green_carpet.json")
				.setBlockState("backport", "green_carpet.json")
				.build(new BlockModel("greenCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/green_carpet.json"))));

	public static final BlockBuilder lightBlueCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/light_blue_carpet.json")
				.setBlockState("backport", "light_blue_carpet.json")
				.build(new BlockModel("lightBlueCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/light_blue_carpet.json"))));

	public static final BlockBuilder lightGrayCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/light_gray_carpet.json")
				.setBlockState("backport", "light_gray_carpet.json")
				.build(new BlockModel("lightGrayCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/light_gray_carpet.json"))));

	public static final BlockBuilder limeCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/lime_carpet.json")
				.setBlockState("backport", "lime_carpet.json")
				.build(new BlockModel("limeCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/lime_carpet.json"))));

	public static final BlockBuilder magentaCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/magenta_carpet.json")
				.setBlockState("backport", "magenta_carpet.json")
				.build(new BlockModel("magentaCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/magenta_carpet.json"))));

	public static final BlockBuilder mossCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/moss_carpet.json")
				.setBlockState("backport", "moss_carpet.json")
				.build(new BlockModel("mossCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/moss_carpet.json"))));

	public static final BlockBuilder orangeCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/orange_carpet.json")
				.setBlockState("backport", "orange_carpet.json")
				.build(new BlockModel("orangeCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/orange_carpet.json"))));

	public static final BlockBuilder pinkCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/pink_carpet.json")
				.setBlockState("backport", "pink_carpet.json")
				.build(new BlockModel("pinkCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/pink_carpet.json"))));

	public static final BlockBuilder purpleCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/purple_carpet.json")
				.setBlockState("backport", "purple_carpet.json")
				.build(new BlockModel("purpleCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/purple_carpet.json"))));

	public static final BlockBuilder redCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/red_carpet.json")
				.setBlockState("backport", "red_carpet.json")
				.build(new BlockModel("redCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/red_carpet.json"))));

	public static final BlockBuilder whiteCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/white_carpet.json")
				.setBlockState("backport", "white_carpet.json")
				.build(new BlockModel("whiteCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/white_carpet.json"))));

	public static final BlockBuilder yellowCarpet = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/yellow_carpet.json")
				.setBlockState("backport", "yellow_carpet.json")
				.build(new BlockModel("yellowCarpet", UtilIdRegistrar.nextIdBlock(), Material.cloth, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/yellow_carpet.json"))));

	public static final BlockBuilder chain = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/chain.json")
				.setBlockState("backport", "chain.json")
				.setMetaStateInterpreter(new ChainMetaState())
				.build(new BlockChain("chain", UtilIdRegistrar.nextIdBlock(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/chain.json"))));

	public static final BlockBuilder enchantmentTable = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/enchanting_table.json")
				.setBlockState("backport", "enchanting_table.json")
				.build(new BlockEnchantmentTable("enchantmentTable", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/enchanting_table.json"))));

	public static final BlockBuilder smoker = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/smoker.json")
				.setBlockState("backport", "smoker.json")
				.setMetaStateInterpreter(new SmokerMetaState())
				.build(new BlockSmoker("smoker", UtilIdRegistrar.nextIdBlock(), Material.wood, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/smoker.json"))));

	public static final BlockBuilder stonecutter = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/stonecutter.json")
				.setBlockState("backport", "stonecutter.json")
				.setMetaStateInterpreter(new StoneCutterMetaState())
				.build(new BlockStoneCutter("stonecutter", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/stonecutter.json"))));

	public static final BlockBuilder grindstone = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/grindstone.json")
				.setBlockState("backport", "grindstone.json")
				.setMetaStateInterpreter(new GrindStoneMetaState())
				.build(new BlockGrindStone("grindstone", UtilIdRegistrar.nextIdBlock(), Material.stone, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/grindstone.json"))));

	public static final Block cropsBeetRoot = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelCropsWheat::new)
		.build(new BlockCropsBeetRoot("crops.BeetRoot", UtilIdRegistrar.nextIdBlock())
		.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block cropsCarrot = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelCropsWheat::new)
		.build(new BlockCropsCarrot("crops.Carrot", UtilIdRegistrar.nextIdBlock()))
		.withDisabledStats()
		.withDisabledNeighborNotifyOnMetadataChange()
		.withLitInteriorSurface(true);

	public static final Block cropsPotato = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelCropsWheat::new)
		.build(new BlockCropsPotato("crops.potato", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block cropsTorchFlower = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelCrossedSquares::new)
		.build(new BlockCropsTorchFlower("crops.TorchFlower", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final Block blockWatermelon = new BlockBuilder(MOD_ID)
		.setSideTextures("melonSide.png")
		.setTopBottomTextures("melonTop.png")
		.build(new BlockWatermelon("block.melon",  UtilIdRegistrar.nextIdBlock(), Material.wood));

	public static final Block cropsWatermelon = new BlockBuilder(MOD_ID)
		.setBlockModel(BlockModelCropsPumpkin::new)
		.build(new BlockCropsWatermelon("crops.watermelon", UtilIdRegistrar.nextIdBlock())
			.withDisabledStats()
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true));

	public static final BlockBuilder glassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/glass_pane_post.json")
				.setBlockState("backport", "glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("glassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/glass_pane_post.json"))));

	public static final BlockBuilder blackStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/black_stained_glass_pane_post.json")
				.setBlockState("backport", "black_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("blackStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/black_stained_glass_pane_post.json"))));

	public static final BlockBuilder blueStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/blue_stained_glass_pane_post.json")
				.setBlockState("backport", "blue_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("blueStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blue_stained_glass_pane_post.json"))));

	public static final BlockBuilder brownStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/brown_stained_glass_pane_post.json")
				.setBlockState("backport", "brown_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("brownStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/brown_stained_glass_pane_post.json"))));

	public static final BlockBuilder cyanStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/cyan_stained_glass_pane_post.json")
				.setBlockState("backport", "cyan_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("cyanStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/cyan_stained_glass_pane_post.json"))));

	public static final BlockBuilder grayStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/gray_stained_glass_pane_post.json")
				.setBlockState("backport", "gray_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("grayStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/gray_stained_glass_pane_post.json"))));

	public static final BlockBuilder greenStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/green_stained_glass_pane_post.json")
				.setBlockState("backport", "green_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("greenStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/green_stained_glass_pane_post.json"))));

	public static final BlockBuilder lightBlueStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/light_blue_stained_glass_pane_post.json")
				.setBlockState("backport", "light_blue_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("lightBlueStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/light_blue_stained_glass_pane_post.json"))));

	public static final BlockBuilder lightGrayStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/light_gray_stained_glass_pane_post.json")
				.setBlockState("backport", "light_gray_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("lightGrayStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/light_gray_stained_glass_pane_post.json"))));

	public static final BlockBuilder limeStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/lime_stained_glass_pane_post.json")
				.setBlockState("backport", "lime_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("limeStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/lime_stained_glass_pane_post.json"))));

	public static final BlockBuilder magentaStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/magenta_stained_glass_pane_post.json")
				.setBlockState("backport", "magenta_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("magentaStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/magenta_stained_glass_pane_post.json"))));

	public static final BlockBuilder orangeStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/orange_stained_glass_pane_post.json")
				.setBlockState("backport", "orange_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("orangeStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/orange_stained_glass_pane_post.json"))));

	public static final BlockBuilder pinkStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/pink_stained_glass_pane_post.json")
				.setBlockState("backport", "pink_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("pinkStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/pink_stained_glass_pane_post.json"))));

	public static final BlockBuilder purpleStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/purple_stained_glass_pane_post.json")
				.setBlockState("backport", "purple_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("purpleStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/purple_stained_glass_pane_post.json"))));

	public static final BlockBuilder redStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/red_stained_glass_pane_post.json")
				.setBlockState("backport", "red_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("redStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/red_stained_glass_pane_post.json"))));

	public static final BlockBuilder whiteStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/white_stained_glass_pane_post.json")
				.setBlockState("backport", "white_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("whiteStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/white_stained_glass_pane_post.json"))));

	public static final BlockBuilder yellowStainedGlassPane = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/yellow_stained_glass_pane_post.json")
				.setBlockState("backport", "yellow_stained_glass_pane.json")
				.setMetaStateInterpreter(new GlassPaneMetaState())
				.build(new BlockGlassPane("yellowStainedGlassPane", UtilIdRegistrar.nextIdBlock(), Material.glass, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/yellow_stained_glass_pane_post.json"))));

	public static final BlockBuilder pitcherPlantTop = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/pitcher_plant_top.json")
				.setBlockState("backport", "pitcher_plant.json")
				.build(new Pitcher("pitcherPlantTop", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/pitcher_plant_top.json"))));

	public static final BlockBuilder pitcherPlantBottom = new BlockBuilder(MOD_ID)
		.setBlockModel(
			block -> new DFBlockModelBuilder(MOD_ID)
				.setBlockModel("backport","block/pitcher_plant_bottom.json")
				.setBlockState("backport", "pitcher_plant.json")
				.build(new Pitcher("pitcherPlantBottom", UtilIdRegistrar.nextIdBlock(), Material.plant, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/pitcher_plant_bottom.json"))));

	public static void register() {
	}


}
