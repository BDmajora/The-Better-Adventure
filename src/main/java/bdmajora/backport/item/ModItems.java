package bdmajora.backport.item;

import bdmajora.backport.backport;
import bdmajora.backport.block.Crops.BlockCropsBeetRoot;
import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.item.Doors.*;
import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.item.Flowers.*;
import bdmajora.backport.item.Food.*;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.item.ItemSeeds;
import turniplabs.halplibe.helper.ItemHelper;

import static bdmajora.backport.backport.MOD_ID;

public class ModItems {
	// Items
	public static final Item recordPigStep = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "disc_pig_step"), "disc_pig_step.png");
	public static final Item record11 = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_11"), "music_disc_11.png");
	public static final Item recordOtherSide = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_other_side"), "music_disc_other_side.png");
	public static final Item recordRelic = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_relic"), "music_disc_relic.png");
	public static final Item record5 = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_5"), "music_disc_5.png");

	//nether items
	public static final Item netherBrick = ItemHelper.createItem(MOD_ID, new ItemAccessor("item.brick", UtilIdRegistrar.nextIdItem(), "nether_brick"), "nether_brick.png");

	//Doors
	public static final Item crimsonDoor = ItemHelper.createItem(MOD_ID, new ItemCrimsonDoor("item.crimsonDoor", UtilIdRegistrar.nextIdItem()), "crimson_door.png");

	public static final Item wardpedDoor = ItemHelper.createItem(MOD_ID, new ItemWarpedDoor("item.warpedDoor", UtilIdRegistrar.nextIdItem()), "warped_door.png");

	public static final Item acaciaDoor = ItemHelper.createItem(MOD_ID, new ItemAcaciaDoor("item.acaciaDoor", UtilIdRegistrar.nextIdItem()), "acacia_door.png");

	public static final Item bambooDoor = ItemHelper.createItem(MOD_ID, new ItemBambooDoor("item.bambooDoor", UtilIdRegistrar.nextIdItem()), "bamboo_door.png");

	public static final Item birchDoor = ItemHelper.createItem(MOD_ID, new ItemBirchDoor("item.birchDoor", UtilIdRegistrar.nextIdItem()), "birch_door.png");

	public static final Item cherryDoor = ItemHelper.createItem(MOD_ID, new ItemCherryDoor("item.cherryDoor", UtilIdRegistrar.nextIdItem()), "cherry_door.png");

	public static final Item copperDoor = ItemHelper.createItem(MOD_ID, new ItemCopperDoor("item.copperDoor", UtilIdRegistrar.nextIdItem()), "copper_door.png");

	public static final Item darkOakDoor = ItemHelper.createItem(MOD_ID, new ItemDarkOakDoor("item.darkOakDoor", UtilIdRegistrar.nextIdItem()), "dark_oak_door.png");

	public static final Item exposedCopperDoor = ItemHelper.createItem(MOD_ID, new ItemExposedCopperDoor("item.exposedCopperDoor", UtilIdRegistrar.nextIdItem()), "exposed_copper_door.png");

	public static final Item jungleDoor = ItemHelper.createItem(MOD_ID, new ItemJungleDoor("item.jungleDoor", UtilIdRegistrar.nextIdItem()), "jungle_door.png");

	public static final Item mangroveDoor = ItemHelper.createItem(MOD_ID, new ItemMangroveDoor("item.mangroveDoor", UtilIdRegistrar.nextIdItem()), "mangrove_door.png");

	public static final Item oxidizedCopperDoor = ItemHelper.createItem(MOD_ID, new ItemOxidizedCopperDoor("item.oxidizedCopperDoor", UtilIdRegistrar.nextIdItem()), "oxidized_copper_door.png");

	public static final Item spruceDoor = ItemHelper.createItem(MOD_ID, new ItemSpruceDoor("item.spruceDoor", UtilIdRegistrar.nextIdItem()), "spruce_door.png");

	public static final Item weatheredCopperDoor = ItemHelper.createItem(MOD_ID, new ItemWeatheredCopperDoor("item.weatheredCopperDoor", UtilIdRegistrar.nextIdItem()), "weathered_copper_door.png");

	//food

	public static final Item glowBerries = ItemHelper.createItem(MOD_ID, new ItemFoodGlowBerries("item.glowBerries", UtilIdRegistrar.nextIdItem(), 4, false, 64), "glow_berries.png");

	public static final Item foodBeetRoot = ItemHelper.createItem(MOD_ID, new ItemFoodBeetRoot("item.foodBeetRoot", UtilIdRegistrar.nextIdItem(), 4, false, 64, ModBlocks.cropsBeetRoot), "beetroot.png");

	public static final Item foodCarrot = ItemHelper.createItem(MOD_ID, new ItemFoodCarrot("food.Carrot", UtilIdRegistrar.nextIdItem(), 1, false, 64, ModBlocks.cropsCarrot), "carrot.png");

	public static final Item foodPotatoRaw = ItemHelper.createItem(MOD_ID, new ItemFoodPotatoRaw("food.potato.raw", UtilIdRegistrar.nextIdItem(), 1, false, 64, ModBlocks.cropsPotato), "potato_raw.png");
	public static final Item foodPotatoBaked = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.potato.baked", UtilIdRegistrar.nextIdItem(), 2, false, 64), "potato_baked.png");

	public static final Item foodTorchFlower = ItemHelper.createItem(MOD_ID, new ItemFoodTorchFlower("food.TorchFlower", UtilIdRegistrar.nextIdItem(), 1, false, 64, ModBlocks.cropsTorchFlower), "torchflower.png");

	public static final Item foodWatermelonSlice = ItemHelper.createItem(MOD_ID, new ItemFoodWatermelonSlice("food.watermelon.slice", UtilIdRegistrar.nextIdItem(), 2, false, 64), "watermelonSlice.png");

	public static final Item foodBeetRootSoup = ItemHelper.createItem(MOD_ID, new ItemFoodWithBowl("food.BeetRootSoup", UtilIdRegistrar.nextIdItem(), 10, false), "beetroot_soup.png");

	public static final Item foodBeefRaw = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.beef.raw", UtilIdRegistrar.nextIdItem(), 2, true, 64), "beef_raw.png");
	public static final Item foodBeefCooked = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.beef.cooked", UtilIdRegistrar.nextIdItem(), 8, true, 64), "beef_cooked.png");

	public static final Item foodChickenRaw = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.chicken.raw", UtilIdRegistrar.nextIdItem(), 2, true, 64), "chicken_raw.png");
	public static final Item foodChickenCooked = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.chicken.cooked", UtilIdRegistrar.nextIdItem(), 6, true, 64), "chicken_cooked.png");

	public static final Item foodMuttonRaw = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.mutton.raw", UtilIdRegistrar.nextIdItem(), 2, true, 64), "mutton_raw.png");
	public static final Item foodMuttonCooked = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.mutton.cooked", UtilIdRegistrar.nextIdItem(), 5, true, 64), "mutton_cooked.png");

	//seeds
	public static final Item seedsBeetRoot = ItemHelper.createItem(MOD_ID, new ItemSeeds("seeds.BeetRoot", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsBeetRoot), "beetroot_seeds.png");
	public static final Item seedsTorchFlower = ItemHelper.createItem(MOD_ID, new ItemSeeds("seeds.TorchFlower", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsTorchFlower), "torchflower_seeds.png");
	public static final Item seedsWatermelon = ItemHelper.createItem(MOD_ID, new ItemSeeds("seeds.watermelon", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsWatermelon), "seeds_watermelon.png");
	public static final Item seedsPitcherPod = ItemHelper.createItem(MOD_ID, new ItemSeeds("seeds.PitcherPod", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsBeetRoot), "pitcher_pod.png");


	//plants

	public static final Item vine = ItemHelper.createItem(MOD_ID, new ItemBlockVine("item.vine", UtilIdRegistrar.nextIdBlock(), (BlockVine) ModBlocks.vine), "vine.png");

	public static final Item lilac = ItemHelper.createItem(MOD_ID, new ItemLilac("item.lilac", UtilIdRegistrar.nextIdItem()), "lilac_top.png");

	public static final Item peony = ItemHelper.createItem(MOD_ID, new ItemPeony("item.peony", UtilIdRegistrar.nextIdItem()), "peony_top.png");

	public static final Item roseBush = ItemHelper.createItem(MOD_ID, new ItemRoseBush("item.roseBush", UtilIdRegistrar.nextIdItem()), "rose_bush_top.png");

	public static final Item sunflower = ItemHelper.createItem(MOD_ID, new ItemSunFlower("item.sunflower", UtilIdRegistrar.nextIdItem()), "sunflower_top.png");

	public static final Item pitcherFlower = ItemHelper.createItem(MOD_ID, new ItemPitcher("item.pitcherFlower", UtilIdRegistrar.nextIdItem()), "pitcher_plant.png");


	public static void register() {
	}
}
