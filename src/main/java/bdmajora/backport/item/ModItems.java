package bdmajora.backport.item;

import bdmajora.backport.backport;
import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.item.Doors.*;
import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.item.Flowers.ItemLilac;
import bdmajora.backport.item.Flowers.ItemPeony;
import bdmajora.backport.item.Flowers.ItemRoseBush;
import bdmajora.backport.item.Flowers.ItemSunFlower;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemHelper;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.ItemSeeds;

public class ModItems {
	// Items
	public static final Item recordPigStep = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "disc_pig_step"), "disc_pig_step.png");
	public static final Item record11 = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_11"), "music_disc_11.png");
	public static final Item recordOtherSide = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_other_side"), "music_disc_other_side.png");
	public static final Item recordRelic = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_relic"), "music_disc_relic.png");
	public static final Item record5 = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_5"), "music_disc_5.png");

	//nether items
	public static final Item netherBrick = ItemHelper.createItem(backport.MOD_ID, new ItemAccessor("item.brick", UtilIdRegistrar.nextIdItem(), "nether_brick"), "nether_brick.png");

	//Doors
	public static final Item crimsonDoor = ItemHelper.createItem(backport.MOD_ID, new ItemCrimsonDoor("item.crimsonDoor", UtilIdRegistrar.nextIdItem()), "crimson_door.png");

	public static final Item wardpedDoor = ItemHelper.createItem(backport.MOD_ID, new ItemWarpedDoor("item.warpedDoor", UtilIdRegistrar.nextIdItem()), "warped_door.png");

	public static final Item acaciaDoor = ItemHelper.createItem(backport.MOD_ID, new ItemAcaciaDoor("item.acaciaDoor", UtilIdRegistrar.nextIdItem()), "acacia_door.png");

	public static final Item bambooDoor = ItemHelper.createItem(backport.MOD_ID, new ItemBambooDoor("item.bambooDoor", UtilIdRegistrar.nextIdItem()), "bamboo_door.png");

	public static final Item birchDoor = ItemHelper.createItem(backport.MOD_ID, new ItemBirchDoor("item.birchDoor", UtilIdRegistrar.nextIdItem()), "birch_door.png");

	public static final Item cherryDoor = ItemHelper.createItem(backport.MOD_ID, new ItemCherryDoor("item.cherryDoor", UtilIdRegistrar.nextIdItem()), "cherry_door.png");

	public static final Item copperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemCopperDoor("item.copperDoor", UtilIdRegistrar.nextIdItem()), "copper_door.png");

	public static final Item darkOakDoor = ItemHelper.createItem(backport.MOD_ID, new ItemDarkOakDoor("item.darkOakDoor", UtilIdRegistrar.nextIdItem()), "dark_oak_door.png");

	public static final Item exposedCopperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemExposedCopperDoor("item.exposedCopperDoor", UtilIdRegistrar.nextIdItem()), "exposed_copper_door.png");

	public static final Item jungleDoor = ItemHelper.createItem(backport.MOD_ID, new ItemJungleDoor("item.jungleDoor", UtilIdRegistrar.nextIdItem()), "jungle_door.png");

	public static final Item mangroveDoor = ItemHelper.createItem(backport.MOD_ID, new ItemMangroveDoor("item.mangroveDoor", UtilIdRegistrar.nextIdItem()), "mangrove_door.png");

	public static final Item oxidizedCopperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemOxidizedCopperDoor("item.oxidizedCopperDoor", UtilIdRegistrar.nextIdItem()), "oxidized_copper_door.png");

	public static final Item spruceDoor = ItemHelper.createItem(backport.MOD_ID, new ItemSpruceDoor("item.spruceDoor", UtilIdRegistrar.nextIdItem()), "spruce_door.png");

	public static final Item weatheredCopperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemWeatheredCopperDoor("item.weatheredCopperDoor", UtilIdRegistrar.nextIdItem()), "weathered_copper_door.png");

	//food

	public static final Item glowBerries = ItemHelper.createItem(backport.MOD_ID, new ItemFoodGlowBerries("item.glowBerries", UtilIdRegistrar.nextIdItem(), 4, false, 64), "glow_berries.png");

	//plants

	public static final Item vine = ItemHelper.createItem(backport.MOD_ID, new ItemBlockVine("item.vine", UtilIdRegistrar.nextIdBlock(), (BlockVine) ModBlocks.vine), "vine.png");

	public static final Item lilac = ItemHelper.createItem(backport.MOD_ID, new ItemLilac("item.lilac", UtilIdRegistrar.nextIdItem()), "lilac_top.png");

	public static final Item peony = ItemHelper.createItem(backport.MOD_ID, new ItemPeony("item.peony", UtilIdRegistrar.nextIdItem()), "peony_top.png");

	public static final Item roseBush = ItemHelper.createItem(backport.MOD_ID, new ItemRoseBush("item.roseBush", UtilIdRegistrar.nextIdItem()), "rose_bush_top.png");

	public static final Item sunflower = ItemHelper.createItem(backport.MOD_ID, new ItemSunFlower("item.sunflower", UtilIdRegistrar.nextIdItem()), "sunflower_top.png");


	public static void register() {
	}
}
