package bdmajora.backport;

import bdmajora.backport.biome.ModBiomes;
import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.crafting.ModCraftingManager;
import bdmajora.backport.entity.*;
import bdmajora.backport.item.ModItems;
import bdmajora.backport.network.packet.PacketEnchantItem;
import bdmajora.backport.packet.SwimPacket;
import bdmajora.backport.world.biome.provider.BiomeProviderNether;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.minecraft.client.gui.guidebook.mobs.MobInfoRegistry;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.enums.EnumCreatureType;
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
	private static final boolean enable_swim;
	public static String ENCHANTMENT_TABLE_NAME = "Enchantment Table";

	public static ConfigHandler config;

	// Static block to ensure enable_swim is initialized correctly
	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id", "7000");
		prop.setProperty("starting_item_id", "30000");
		prop.setProperty("max_enchantment_cost", "12000");
		prop.setProperty("enchantment_window_type_id", "24");
		prop.setProperty("packet_enchant_id", "190");
		prop.setProperty("expensive_crafting", "true");
		prop.setProperty("default_item_enchantability", "15");
		prop.setProperty("enable_swim", "true"); // Default value in config

		config = new ConfigHandler(MOD_ID, prop);
		enable_swim = config.getBoolean("enable_swim");
		UtilIdRegistrar.initIds(config.getInt("starting_block_id"), config.getInt("starting_item_id"));

		config.updateConfig();
	}

	@Override
	public void onInitialize() {
		LOGGER.info("backport loading! Watch out for bugs");

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
			b.getSpawnableList(EnumCreatureType.monster).add(new SpawnListEntry(EntityPiglin.class, 100));
			b.getSpawnableList(EnumCreatureType.monster).add(new SpawnListEntry(EntityPiglinBrute.class, 100));
			b.getSpawnableList(EnumCreatureType.monster).add(new SpawnListEntry(EntityZombifiedPiglin.class, 100));
			b.getSpawnableList(EnumCreatureType.creature).add(new SpawnListEntry(EntityBee.class, 102));
			b.getSpawnableList(EnumCreatureType.monster).add(new SpawnListEntry(EntityWarden.class, 100));
			b.getSpawnableList(EnumCreatureType.waterCreature).add(new SpawnListEntry(EntityTurtle.class, 100));
			b.getSpawnableList(EnumCreatureType.creature).add(new SpawnListEntry(EntityAllay.class, 102));
			b.getSpawnableList(EnumCreatureType.creature).add(new SpawnListEntry(EntityArmadillo.class, 102));

		}

		// Initialize sounds
		BackportSounds.init();
		LOGGER.info("BackPort loaded successfully!");
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

	public static boolean isEnableSwim() {
		return enable_swim;
	}

	@Override
	public void onPreLaunch() {
		NetworkHelper.register(PacketEnchantItem.class, true, false);

		// Register the swim packet if swimming is enabled
		if (isEnableSwim()) {
			NetworkHelper.register(SwimPacket.class, true, false); // Assuming SwimPacket handles the swim feature
		}
	}

	@Override
	public void onRecipesReady() {
		ModCraftingManager.onRecipesReady();
	}

	public void initNamespaces() {
		// Namespace initialization if required
	}
}
