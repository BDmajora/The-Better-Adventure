package bdmajora.backport.world.gen;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureSmallFungi extends WorldFeature {
	private int plantBlockId;

	public WorldFeatureSmallFungi(int i) {
		this.plantBlockId = i;
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		for (int l = 0; l < 64; ++l) {
			int k1;
			int j1;
			int i1 = x + random.nextInt(8) - random.nextInt(8);
			if (!world.isAirBlock(i1, j1 = y + random.nextInt(4) - random.nextInt(4), k1 = z + random.nextInt(8) - random.nextInt(8)) || !(Block.blocksList[this.plantBlockId]).canBlockStay(world, i1, j1, k1))
				continue;
			world.setBlock(i1, j1, k1, this.plantBlockId);
		}
		return true;
	}
}

