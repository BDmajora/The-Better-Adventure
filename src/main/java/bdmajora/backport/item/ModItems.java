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
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ItemHelper;

import static bdmajora.backport.backport.MOD_ID;

public class ModItems {
	// Items

	//Music Discs
	public static Item recordPigStep = recordPigStep = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/disc_pig_step")
		.setStackSize(1)
		.build(new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "disc_pig_step", "Lena Raine", MOD_ID + ":disc_pig_step"));

	public static Item record11 = record11 = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/music_disc_11")
		.setStackSize(1)
		.build(new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_11", "C418", MOD_ID + ":music_disc_11"));

	public static Item recordOtherSide = recordOtherSide = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/music_disc_other_side")
		.setStackSize(1)
		.build(new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_other_side", "Lena Raine", MOD_ID + ":music_disc_other_side"));

	public static Item recordRelic = recordRelic = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/music_disc_relic")
		.setStackSize(1)
		.build(new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_relic", "Aaron Cherof", MOD_ID + ":music_disc_relic"));

	public static Item record5 = record5 = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/music_disc_5")
		.setStackSize(1)
		.build(new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_5", "Aaron Cherof", MOD_ID + ":music_disc_5"));

	//nether items

	public static Item netherBrick = netherBrick = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/nether_brick")
		.setStackSize(64)
		.build(new ItemAccessor("item.brick", UtilIdRegistrar.nextIdItem(), "nether_brick", MOD_ID + ":item/nether_brick"));


	//Doors

	public static Item crimsonDoor = crimsonDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/crimson_door")
		.setStackSize(64)
		.build(new ItemCrimsonDoor("item.crimsonDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/crimson_door"));

	public static Item wardpedDoor  = wardpedDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/warped_door")
		.setStackSize(64)
		.build(new ItemWarpedDoor("item.warpedDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/warped_door"));

	public static Item acaciaDoor  = acaciaDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/acacia_door")
		.setStackSize(64)
		.build(new ItemAcaciaDoor("item.acaciaDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/acacia_door"));

	public static Item bambooDoor  = bambooDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/bamboo_door")
		.setStackSize(64)
		.build(new ItemBambooDoor("item.bambooDoor", UtilIdRegistrar.nextIdItem(),MOD_ID + ":item/bamboo_door"));

	public static Item birchDoor  = birchDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/birch_door")
		.setStackSize(64)
		.build( new ItemBirchDoor("item.birchDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/birch_door"));

	public static Item cherryDoor  = cherryDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/birch_door")
		.setStackSize(64)
		.build(new ItemCherryDoor("item.cherryDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/cherry_door"));

	public static Item copperDoor  = copperDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/copper_door")
		.setStackSize(64)
		.build(new ItemCopperDoor("item.copperDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/copper_door"));

	public static Item darkOakDoor = darkOakDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/dark_oak_door")
		.setStackSize(64)
		.build(new ItemDarkOakDoor("item.darkOakDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/dark_oak_door"));

	public static Item exposedCopperDoor = exposedCopperDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/exposed_copper_door")
		.setStackSize(64)
		.build(new ItemExposedCopperDoor("item.exposedCopperDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/exposed_copper_door"));

	public static Item jungleDoor = jungleDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/jungle_door")
		.setStackSize(64)
		.build(new ItemJungleDoor("item.jungleDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + MOD_ID + ":item/jungle_door"));

	public static Item mangroveDoor = mangroveDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/mangrove_door")
		.setStackSize(64)
		.build(new ItemMangroveDoor("item.mangroveDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/mangrove_door"));

	public static Item oxidizedCopperDoor = oxidizedCopperDoor  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/oxidized_copper_door")
		.setStackSize(64)
		.build(new ItemOxidizedCopperDoor("item.oxidizedCopperDoor", UtilIdRegistrar.nextIdItem(),MOD_ID + ":item/oxidized_copper_door"));

	public static Item spruceDoor = spruceDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/spruce_door")
		.setStackSize(64)
		.build(new ItemSpruceDoor("item.spruceDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/spruce_door"));

	public static Item weatheredCopperDoor = weatheredCopperDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/weathered_copper_door")
		.setStackSize(64)
		.build(new ItemWeatheredCopperDoor("item.weatheredCopperDoor", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/weathered_copper_door"));

	//food
	public static Item glowBerries = glowBerries = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/glow_berries")
		.setStackSize(64)
		.build(new ItemFoodGlowBerries("item.glowBerries", UtilIdRegistrar.nextIdItem(), 4, 10,false, 64, MOD_ID + ":item/glow_berries"));

	public static Item foodBeetRoot = foodBeetRoot = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/beetroot")
		.setStackSize(64)
		.build(new ItemFoodBeetRoot("item.foodBeetRoot", UtilIdRegistrar.nextIdItem(), 4, 10,false, 64, ModBlocks.cropsBeetRoot, MOD_ID + ":item/beetroot"));

	public static Item foodCarrot = foodCarrot = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/carrot")
		.setStackSize(64)
		.build(new ItemFoodCarrot("food.Carrot", UtilIdRegistrar.nextIdItem(), 1, 10,false, 64, ModBlocks.cropsCarrot, MOD_ID + ":item/carrot"));

	public static Item foodPotatoRaw = foodPotatoRaw = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/potato_raw")
		.setStackSize(64)
		.build(new ItemFoodPotatoRaw("food.potato.raw", UtilIdRegistrar.nextIdItem(), 1, 10, false, 64, ModBlocks.cropsPotato, MOD_ID + ":item/potato_raw"));

	public static Item foodPotatoBaked = foodPotatoBaked = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/potato_baked")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.potato.baked", UtilIdRegistrar.nextIdItem(), 2, 10, false, 64, MOD_ID + ":item/potato_baked"));

	public static Item foodTorchFlower = foodTorchFlower = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/torchflower")
		.setStackSize(64)
		.build(new ItemFoodTorchFlower("food.TorchFlower", UtilIdRegistrar.nextIdItem(), 1, 10, false, 64, ModBlocks.cropsTorchFlower, MOD_ID + ":item/torchflower"));

	public static Item foodWatermelonSlice = foodWatermelonSlice = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/watermelonSlice")
		.setStackSize(64)
		.build(new ItemFoodWatermelonSlice("food.watermelon.slice", UtilIdRegistrar.nextIdItem(), 2, 10,false, 64, MOD_ID + ":item/watermelonSlice"));

	public static Item foodBeetRootSoup = foodBeetRootSoup = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/beetroot_soup")
		.setStackSize(64)
		.build(new ItemFoodWithBowl("food.BeetRootSoup", UtilIdRegistrar.nextIdItem(), 10, 10,false, 64, MOD_ID + ":item/beetroot_soup"));

	public static Item foodBeefRaw = foodBeefRaw = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/beef_raw")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.beef.raw", UtilIdRegistrar.nextIdItem(), 2, 10, true, 64, MOD_ID + ":item/beef_raw"));

	public static Item foodBeefCooked = foodBeefCooked = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/beef_cooked")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.beef.cooked", UtilIdRegistrar.nextIdItem(), 8, 10,true, 64, MOD_ID + ":item/beef_cooked"));

	public static Item foodChickenRaw  = foodChickenRaw  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/chicken_raw")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.chicken.raw", UtilIdRegistrar.nextIdItem(), 2, 10,true, 64, MOD_ID + ":item/chicken_raw"));

	public static Item foodChickenCooked  = foodChickenCooked  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/chicken_cooked")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.chicken.cooked", UtilIdRegistrar.nextIdItem(), 6, 10,true, 64, MOD_ID + ":item/chicken_cooked"));

	public static Item foodMuttonRaw  = foodMuttonRaw  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/mutton_raw")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.mutton.raw", UtilIdRegistrar.nextIdItem(), 6, 10,true, 64, MOD_ID + ":item/mutton_raw"));

	public static Item foodMuttonCooked  = foodMuttonRaw  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/beef_cooked")
		.setStackSize(64)
		.build(new ItemFoodAccessor("food.mutton.cooked", UtilIdRegistrar.nextIdItem(), 5, 10,true, 64, MOD_ID + ":item/mutton_cooked"));

	//seeds
	public static Item seedsBeetRoot  = seedsBeetRoot  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/beetroot_seeds")
		.setStackSize(64)
		.build(new ItemSeedsAccessor("seeds.BeetRoot", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsBeetRoot, MOD_ID + ":item/beetroot_seeds"));

	public static Item seedsTorchFlower  = seedsTorchFlower  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/torchflower_seeds")
		.setStackSize(64)
		.build(new ItemSeedsAccessor("seeds.TorchFlower", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsTorchFlower, MOD_ID + ":item/torchflower_seeds"));

	public static Item seedsWatermelon  = seedsWatermelon  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seeds_watermelon")
		.setStackSize(64)
		.build(new ItemSeedsAccessor("seeds.watermelon", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsWatermelon, MOD_ID + ":item/seeds_watermelon"));

	public static Item seedsPitcherPod  = seedsPitcherPod  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/pitcher_pod")
		.setStackSize(64)
		.build(new ItemSeedsAccessor("seeds.PitcherPod", UtilIdRegistrar.nextIdItem(), ModBlocks.cropsBeetRoot, MOD_ID + ":item/pitcher_pod"));

	//plants

	public static Item vine  = vine  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/vine")
		.setStackSize(64)
		.build(new ItemBlockVine("item.vine", UtilIdRegistrar.nextIdBlock(), (BlockVine) ModBlocks.vine, MOD_ID + ":item/vine"));

	public static Item lilac  = lilac  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/lilac_top")
		.setStackSize(64)
		.build(new ItemLilac("item.lilac", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/lilac_top"));

	public static Item peony  = peony  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/peony_top")
		.setStackSize(64)
		.build(new ItemPeony("item.peony", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/peony_top"));

	public static Item roseBush  = roseBush  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/rose_bush_top")
		.setStackSize(64)
		.build(new ItemRoseBush("item.roseBush", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/rose_bush_top"));

	public static Item sunflower  = sunflower  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/sunflower_top")
		.setStackSize(64)
		.build(new ItemSunFlower("item.sunflower", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/sunflower_top"));

	public static Item pitcherFlower  = pitcherFlower  = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/pitcher_plant")
		.setStackSize(64)
		.build(new ItemPitcher("item.pitcherFlower", UtilIdRegistrar.nextIdItem(), MOD_ID + ":item/pitcher_plant"));

	//Banners

//	public static final Item banner = (new ItemBanner("banner", UtilIdRegistrar.nextIdItem()).setIconCoord(11, 8).setFull3D());

	public static void register() {
	}
}
