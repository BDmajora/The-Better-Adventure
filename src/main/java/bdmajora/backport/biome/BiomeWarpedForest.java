package bdmajora.backport.biome;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.world.biome.BiomeNether;

public class BiomeWarpedForest extends BiomeNether {

	public BiomeWarpedForest() {
		super("BiomeWarpedForest");
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (short) ModBlocks.warpedNylium.id;
	}
}
