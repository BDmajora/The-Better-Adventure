package bdmajora.backport;

import bdmajora.backport.biome.ModBiomes;
import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.world.gen.WorldFeatureNetherFungi;
import bdmajora.backport.world.gen.WorldFeatureSmallFungi;
import net.minecraft.core.world.biome.Biome;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.nether.api.ChunkDecoratorNetherAPI;

public class TerrainAPIPlugin implements TerrainAPI {
	@Override
	public String getModID() {
		return backport.MOD_ID;
	}

	@Override
	public void onInitialize() {
		ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(backport.MOD_ID, ModBlocks.netherGoldOre, 12, 24, 1F, false);
		ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(backport.MOD_ID, ModBlocks.netherQuartzOre, 14, 20, 1F, false);
		ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureNetherFungi(ModBlocks.netherWartBlock.id, ModBlocks.crimsonStem.id, false), 1, 1F, 68, new Biome[]{ModBiomes.CRIMSON_FOREST});
		ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureNetherFungi(ModBlocks.warpedWartBlock.id, ModBlocks.warpedStem.id, false), 1, 1F, 68, new Biome[]{ModBiomes.WARPED_FOREST});
		ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureSmallFungi(ModBlocks.warpedFungus.id), 2, 1F, 8, new Biome[]{ModBiomes.WARPED_FOREST});
		ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureSmallFungi(ModBlocks.crimsonFungus.id), 4, 1F, 3, new Biome[]{ModBiomes.WARPED_FOREST});
		ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureSmallFungi(ModBlocks.warpedFungus.id), 4, 1F, 3, new Biome[]{ModBiomes.CRIMSON_FOREST});
		ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureSmallFungi(ModBlocks.crimsonFungus.id), 2, 1F, 8, new Biome[]{ModBiomes.CRIMSON_FOREST});
	}
}
