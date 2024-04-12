package bdmajora.backport.biome;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.world.biome.BiomeNether;

public class BiomeCrimsonForest extends BiomeNether {

	public BiomeCrimsonForest() {
		super("BiomeCrimsonForest");
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (short) ModBlocks.nylium.id;
	}
}
