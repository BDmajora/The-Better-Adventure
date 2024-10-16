package bdmajora.backport;

import bdmajora.backport.biome.ModBiomes;
import bdmajora.backport.block.ModBlocks;
//import bdmajora.backport.block.client.EnchantmentTableRenderer;
import bdmajora.backport.crafting.ModCraftingManager;
import bdmajora.backport.item.ModItems;
//import bdmajora.backport.tile.BellTileEntity;
import bdmajora.backport.network.packet.PacketEnchantItem;
import bdmajora.backport.world.biome.provider.BiomeProviderNether;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.tessellator.Tessellator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.helper.NetworkHelper;

import java.util.Properties;

public class backport implements ModInitializer, GameStartEntrypoint, PreLaunchEntrypoint, RecipeEntrypoint {

	public static final String MOD_ID = "backport";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int START_COST_OFFSET = 5;
	public static String ENCHANTMENT_TABLE_NAME = "Enchantment Table";

	public static ConfigHandler config;  // Made public and static

	private void handleConfig() {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","7000");
		prop.setProperty("starting_item_id","30000");
		prop.setProperty("max_enchantment_cost", "12000");
		prop.setProperty("enchantment_window_type_id", "24");  // Added this line
		prop.setProperty("packet_enchant_id", "190");
		prop.setProperty("expensive_crafting", "true");
		prop.setProperty("default_item_enchantability", "15");

		config = new ConfigHandler(MOD_ID,prop);  // Now refers to the class level variable
		UtilIdRegistrar.initIds(config.getInt("starting_block_id"), config.getInt("starting_item_id"));

		config.updateConfig();
	}

	@Override
	public void onInitialize() {
		LOGGER.info("backport loading! watch out for bugs");
		handleConfig();

		LOGGER.info("BackPort loaded successfully!");
	}

	@Override
	public void beforeGameStart() {
		ModBlocks.register();
		ModItems.register();
		new foodstack().initializeItems();
		ModBiomes.initializeBiomes();
		BiomeProviderNether.init();

	}

	@Override
	public void afterGameStart() {
//		System.out.println("The length of the BlockCoords used textures array is: " + BlockCoords.usedCoordinates.length);
	}


	@Override
	public void onPreLaunch() {
		NetworkHelper.register(PacketEnchantItem.class, true, false);
	}

	@Override
	public void onRecipesReady() {
		ModCraftingManager.onRecipesReady();

	}

	public void initNamespaces() {
	}
}
