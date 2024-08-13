package bdmajora.backport.item;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.item.Flowers.*;
import bdmajora.backport.item.Food.*;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
import turniplabs.halplibe.helper.ItemBuilder;

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

	public static final Item crimsonDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/crimson_door")
		.build(new ItemDoor("item.crimsonDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.crimsonDoorBottom, ModBlocks.crimsonDoorTop));

	public static final Item warpedDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/warped_door")
		.build(new ItemDoor("item.warpedDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.warpedDoorBottom, ModBlocks.warpedDoorTop));

	public static final Item acaciaDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/acacia_door")
		.setStackSize(64)
		.build(new ItemDoor("item.acaciaDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.acaciaDoorBottom, ModBlocks.acaciaDoorTop));
	public static Item bambooDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/bamboo_door")
		.setStackSize(64)
		.build(new ItemDoor("item.bambooDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.bambooDoorBottom, ModBlocks.bambooDoorTop));

	public static Item birchDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/birch_door")
		.setStackSize(64)
		.build(new ItemDoor("item.birchDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.birchDoorBottom, ModBlocks.birchDoorTop));

	public static Item cherryDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/cherry_door")
		.setStackSize(64)
		.build(new ItemDoor("item.cherryDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.cherryDoorBottom, ModBlocks.cherryDoorTop));

	public static Item copperDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/copper_door")
		.setStackSize(64)
		.build(new ItemDoor("item.copperDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.copperDoorBottom, ModBlocks.copperDoorTop));

	public static Item darkOakDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/dark_oak_door")
		.setStackSize(64)
		.build(new ItemDoor("item.darkOakDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.darkOakDoorBottom, ModBlocks.darkOakDoorTop));

	public static Item exposedCopperDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/exposed_copper_door")
		.setStackSize(64)
		.build(new ItemDoor("item.exposedCopperDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.exposedCopperDoorBottom, ModBlocks.exposedCopperDoorTop));

	public static Item jungleDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/jungle_door")
		.setStackSize(64)
		.build(new ItemDoor("item.jungleDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.jungleDoorBottom, ModBlocks.jungleDoorTop));

	public static Item mangroveDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/mangrove_door")
		.setStackSize(64)
		.build(new ItemDoor("item.mangroveDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.mangroveDoorBottom, ModBlocks.mangroveDoorTop));

	public static Item oxidizedCopperDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/oxidized_copper_door")
		.setStackSize(64)
		.build(new ItemDoor("item.oxidizedCopperDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.oxidizedCopperDoorBottom, ModBlocks.oxidizedCopperDoorTop));

	public static Item spruceDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/spruce_door")
		.setStackSize(64)
		.build(new ItemDoor("item.spruceDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.spruceDoorBottom, ModBlocks.spruceDoorTop));

	public static Item weatheredCopperDoor = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/weathered_copper_door")
		.setStackSize(64)
		.build(new ItemDoor("item.weatheredCopperDoor", UtilIdRegistrar.nextIdItem(), ModBlocks.weatheredCopperDoorBottom, ModBlocks.weatheredCopperDoorTop));


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
