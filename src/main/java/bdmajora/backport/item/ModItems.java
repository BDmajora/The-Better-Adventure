package bdmajora.backport.item;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.item.Doors.*;
import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.item.Flowers.*;
import bdmajora.backport.item.Food.*;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemSeeds;
import turniplabs.halplibe.helper.ItemHelper;

import static bdmajora.backport.backport.MOD_ID;

public class ModItems {
	// Items
	public static final Item recordPigStep = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "disc_pig_step", "Lena Raine", MOD_ID + ":item/disc_pig_step"));
	public static final Item record11 = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_11", "C418", MOD_ID + ":item/music_disc_11"));
	public static final Item recordOtherSide = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_other_side", "Lena Raine", MOD_ID + ":item/music_disc_other_side"));
	public static final Item recordRelic = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_relic", "Aaron Cherof", MOD_ID + ":item/music_disc_relic"));
	public static final Item record5 = ItemHelper.createItem(MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_5", "Samuel Åberg", MOD_ID + ":item/music_disc_5"));

	//nether items
	public static final Item netherBrick = ItemHelper.createItem(MOD_ID, new ItemAccessor("item.brick", UtilIdRegistrar.nextIdItem(), "nether_brick", MOD_ID + ":item/nether_brick"));

	//Doors
	public static final Item crimsonDoor = ItemHelper.createItem(MOD_ID, new ItemCrimsonDoor("item.crimsonDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/crimson_door"));

	public static final Item wardpedDoor = ItemHelper.createItem(MOD_ID, new ItemWarpedDoor("item.warpedDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/warped_door"));

	public static final Item acaciaDoor = ItemHelper.createItem(MOD_ID, new ItemAcaciaDoor("item.acaciaDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/acacia_door"));

	public static final Item bambooDoor = ItemHelper.createItem(MOD_ID, new ItemBambooDoor("item.bambooDoor", UtilIdRegistrar.nextIdItem(),MOD_ID + ":item/bamboo_door"));

	public static final Item birchDoor = ItemHelper.createItem(MOD_ID, new ItemBirchDoor("item.birchDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/birch_door"));

	public static final Item cherryDoor = ItemHelper.createItem(MOD_ID, new ItemCherryDoor("item.cherryDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/cherry_door"));

	public static final Item copperDoor = ItemHelper.createItem(MOD_ID, new ItemCopperDoor("item.copperDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/copper_door"));

	public static final Item darkOakDoor = ItemHelper.createItem(MOD_ID, new ItemDarkOakDoor("item.darkOakDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/dark_oak_door"));

	public static final Item exposedCopperDoor = ItemHelper.createItem(MOD_ID, new ItemExposedCopperDoor("item.exposedCopperDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/exposed_copper_door"));

	public static final Item jungleDoor = ItemHelper.createItem(MOD_ID, new ItemJungleDoor("item.jungleDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + MOD_ID + ":item/item/jungle_door"));

	public static final Item mangroveDoor = ItemHelper.createItem(MOD_ID, new ItemMangroveDoor("item.mangroveDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/mangrove_door"));

	public static final Item oxidizedCopperDoor = ItemHelper.createItem(MOD_ID, new ItemOxidizedCopperDoor("item.oxidizedCopperDoor", UtilIdRegistrar.nextIdItem(),MOD_ID + ":item/oxidized_copper_door"));

	public static final Item spruceDoor = ItemHelper.createItem(MOD_ID, new ItemSpruceDoor("item.spruceDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/spruce_door.png"));

	public static final Item weatheredCopperDoor = ItemHelper.createItem(MOD_ID, new ItemWeatheredCopperDoor("item.weatheredCopperDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/weathered_copper_door"));

	//food

	public static final Item glowBerries = ItemHelper.createItem(MOD_ID, new ItemFoodGlowBerries("item.glowBerries", UtilIdRegistrar.nextIdItem(), 4, 10,false, 64, MOD_ID + ":item/glow_berries"));

	public static final Item foodBeetRoot = ItemHelper.createItem(MOD_ID, new ItemFoodBeetRoot("item.foodBeetRoot", UtilIdRegistrar.nextIdItem(), 4, 10,false, 64, ModBlocks.cropsBeetRoot, MOD_ID + ":item/beetroot"));

	public static final Item foodCarrot = ItemHelper.createItem(MOD_ID, new ItemFoodCarrot("food.Carrot", UtilIdRegistrar.nextIdItem(), 1, 10,false, 64, ModBlocks.cropsCarrot, MOD_ID + ":item/carrot.png"));

	public static final Item foodPotatoRaw = ItemHelper.createItem(MOD_ID, new ItemFoodPotatoRaw("food.potato.raw", UtilIdRegistrar.nextIdItem(), 1, 10, false, 64, ModBlocks.cropsPotato, MOD_ID + ":item/potato_raw"));
	public static final Item foodPotatoBaked = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.potato.baked", UtilIdRegistrar.nextIdItem(), 2, 10, false, 64, MOD_ID + ":item/potato_baked"));

	public static final Item foodTorchFlower = ItemHelper.createItem(MOD_ID, new ItemFoodTorchFlower("food.TorchFlower", UtilIdRegistrar.nextIdItem(), 1, 10, false, 64, ModBlocks.cropsTorchFlower, MOD_ID + ":item/torchflower"));

	public static final Item foodWatermelonSlice = ItemHelper.createItem(MOD_ID, new ItemFoodWatermelonSlice("food.watermelon.slice", UtilIdRegistrar.nextIdItem(), 2, 10,false, 64, MOD_ID + ":item/watermelonSlice"));

	public static final Item foodBeetRootSoup = ItemHelper.createItem(MOD_ID, new ItemFoodWithBowl("food.BeetRootSoup", UtilIdRegistrar.nextIdItem(), 10, 10,false, 64, MOD_ID + ":item/beetroot_soup"));

	public static final Item foodBeefRaw = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.beef.raw", UtilIdRegistrar.nextIdItem(), 2, 10, true, 64, MOD_ID + ":item/beef_raw"));
	public static final Item foodBeefCooked = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.beef.cooked", UtilIdRegistrar.nextIdItem(), 8, 10,true, 64, MOD_ID + ":item/beef_cooked"));

	public static final Item foodChickenRaw = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.chicken.raw", UtilIdRegistrar.nextIdItem(), 2, 10,true, 64, MOD_ID + ":item/chicken_raw"));
	public static final Item foodChickenCooked = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.chicken.cooked", UtilIdRegistrar.nextIdItem(), 6, 10,true, 64, MOD_ID + ":item/chicken_cooked"));

	public static final Item foodMuttonRaw = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.mutton.raw", UtilIdRegistrar.nextIdItem(), 2, 10,true, 64, MOD_ID + ":item/mutton_raw"));
	public static final Item foodMuttonCooked = ItemHelper.createItem(MOD_ID, new ItemFoodAccessor("food.mutton.cooked", UtilIdRegistrar.nextIdItem(), 5, 10,true, 64, MOD_ID + ":item/mutton_cooked"));

	//seeds
	public static final Item seedsBeetRoot = ItemHelper.createItem(MOD_ID, new ItemSeedsAccessor("seeds.BeetRoot", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsBeetRoot, MOD_ID + ":item/beetroot_seeds"));
	public static final Item seedsTorchFlower = ItemHelper.createItem(MOD_ID, new ItemSeedsAccessor("seeds.TorchFlower", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsTorchFlower, MOD_ID + ":item/torchflower_seeds"));
	public static final Item seedsWatermelon = ItemHelper.createItem(MOD_ID, new ItemSeedsAccessor("seeds.watermelon", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsWatermelon, MOD_ID + ":item/seeds_watermelon"));
	public static final Item seedsPitcherPod = ItemHelper.createItem(MOD_ID, new ItemSeedsAccessor("seeds.PitcherPod", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsBeetRoot, MOD_ID + ":item/pitcher_pod"));


	//plants

	public static final Item vine = ItemHelper.createItem(MOD_ID, new ItemBlockVine("item.vine", UtilIdRegistrar.nextIdBlock(), (BlockVine) ModBlocks.vine, MOD_ID + ":item/vine"));

	public static final Item lilac = ItemHelper.createItem(MOD_ID, new ItemLilac("item.lilac", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/lilac_top"));

	public static final Item peony = ItemHelper.createItem(MOD_ID, new ItemPeony("item.peony", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/peony_top"));

	public static final Item roseBush = ItemHelper.createItem(MOD_ID, new ItemRoseBush("item.roseBush", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/rose_bush_top"));

	public static final Item sunflower = ItemHelper.createItem(MOD_ID, new ItemSunFlower("item.sunflower", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/sunflower_top"));

	public static final Item pitcherFlower = ItemHelper.createItem(MOD_ID, new ItemPitcher("item.pitcherFlower", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/pitcher_plant"));


	//Banners

//	public static final Item banner = (new ItemBanner("banner", UtilIdRegistrar.nextIdItem()).setIconCoord(11, 8).setFull3D());

	public static void register() {
	}
}
