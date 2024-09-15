package bdmajora.backport;

import bdmajora.backport.biome.ModBiomes;
import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.crafting.ModCraftingManager;
import bdmajora.backport.entity.*;
import bdmajora.backport.item.ModItems;
import bdmajora.backport.network.packet.PacketEnchantItem;
import bdmajora.backport.world.biome.provider.BiomeProviderNether;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.minecraft.client.gui.guidebook.mobs.MobInfoRegistry;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.enums.EnumCreatureType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.server.entity.ServerSkinVariantList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.NetworkHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;

public class backport implements ModInitializer, GameStartEntrypoint, PreLaunchEntrypoint, RecipeEntrypoint {

	public static final String MOD_ID = "backport";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int START_COST_OFFSET = 5;
	public static String ENCHANTMENT_TABLE_NAME = "Enchantment Table";

	public static ConfigHandler config;

	private void handleConfig() {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id", "7000");
		prop.setProperty("starting_item_id", "30000");
		prop.setProperty("max_enchantment_cost", "12000");
		prop.setProperty("enchantment_window_type_id", "24");
		prop.setProperty("packet_enchant_id", "190");
		prop.setProperty("expensive_crafting", "true");
		prop.setProperty("default_item_enchantability", "15");

		config = new ConfigHandler(MOD_ID, prop);
		UtilIdRegistrar.initIds(config.getInt("starting_block_id"), config.getInt("starting_item_id"));

		config.updateConfig();
	}

	@Override
	public void onInitialize() {
		LOGGER.info("backport loading! Watch out for bugs");
		handleConfig();

		// Register the Parrot Entity
		Biomes.OVERWORLD_RAINFOREST.getSpawnableList(EnumCreatureType.creature).add(new SpawnListEntry(EntityParrot.class, 102));

		// Register entities with skin counts
		ServerSkinVariantList.registerSkinCount(EntityGoat.class, 4);
		ServerSkinVariantList.registerSkinCount(EntityGlowSquid.class, 4);
		ServerSkinVariantList.registerSkinCount(EntityAxolotl.class, 5);

		// Add spawn entries for entities in all biomes
		for (Biome b : Registries.BIOMES) {
			b.getSpawnableList(EnumCreatureType.waterCreature).add(new SpawnListEntry(EntityGlowSquid.class, 5));
			b.getSpawnableList(EnumCreatureType.waterCreature).add(new SpawnListEntry(EntityAxolotl.class, 25));
			b.getSpawnableList(EnumCreatureType.creature).add(new SpawnListEntry(EntityGoat.class, 102));
			b.getSpawnableList(EnumCreatureType.monster).add(new SpawnListEntry(EntityDrowned.class, 100));
			b.getSpawnableList(EnumCreatureType.waterCreature).add(new SpawnListEntry(EntityFish.class, 100));
		}

		// Initialize sounds
		BackportSounds.init();

		LOGGER.info("BackPort loaded successfully!");
		LOGGER.info("Caves and Cliffs initialized.");
	}

	@Override
	public void beforeGameStart() {
		ModBlocks.register();
		ModItems.register();
		new foodstack().initializeItems();
		ModBiomes.initializeBiomes();
		BiomeProviderNether.init();

		// Initialize Entities
		new BackportEntities().initializeEntities();
	}

	@Override
	public void afterGameStart() {
		// Further game start logic
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
		// Namespace initialization if required
	}
}
