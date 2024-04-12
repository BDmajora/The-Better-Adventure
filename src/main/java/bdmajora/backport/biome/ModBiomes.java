package bdmajora.backport.biome;

import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public class ModBiomes extends Biomes {
	public static Biome CRIMSON_FOREST = new BiomeCrimsonForest();
	public static Biome WARPED_FOREST = new BiomeWarpedForest();

	public static void initializeBiomes() {
		Biomes.register("backport.biome.crimson_forest", CRIMSON_FOREST);
		Biomes.register("backport.biome.warped_forest", WARPED_FOREST);
	}
}
