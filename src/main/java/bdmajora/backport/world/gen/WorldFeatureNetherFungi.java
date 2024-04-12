package bdmajora.backport.world.gen;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureNetherFungi extends WorldFeature {
	protected int leavesID;
	protected int logID;
	protected boolean planted;

	public WorldFeatureNetherFungi(int leavesID, int logID, boolean planted) {
		this.leavesID = leavesID;
		this.logID = logID;
		this.planted = planted;
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		if (world.getBlockId(x, y - 1, z) != ModBlocks.warpedNylium.id && world.getBlockId(x, y - 1, z) != ModBlocks.nylium.id) {
			return false;
		}
		int i = 4 + random.nextInt(13 - 4);
		if (random.nextInt(12) == 0) {
			i *= 2;
		}

		boolean flag = !planted && random.nextFloat() < 0.06F;
		world.setBlock(x, y, z, 0);
		this.placeStem(world, random, x, y, z, i, flag);
		this.placeHat(world, random, x, y, z, i, flag);

		return true;
	}

	public boolean canThisPlantGrowOnThisBlock(int i) {
		return i == Block.netherrack.id || i == ModBlocks.nylium.id || i == ModBlocks.warpedNylium.id;
	}

	private void placeStem(
		World world, Random random, int x, int y, int z, int p_285249_, boolean p_285355_
	) {
		int i = p_285355_ ? 1 : 0;

		for (int j = -i; j <= i; ++j) {
			for (int k = -i; k <= i; ++k) {
				boolean flag = p_285355_ && Math.abs(j) == i && Math.abs(k) == i;

				for (int l = 0; l < p_285249_; ++l) {
					if (world.getBlockId(x + j, y + l, z + k) == 0) {
						if (planted) {
							world.setBlock(x + j, y + l, z + k, logID);
						} else if (flag) {
							if (random.nextFloat() < 0.1F) {
								world.setBlock(x + j, y + l, z + k, logID);
							}
						} else {
							world.setBlock(x + j, y + l, z + k, logID);
						}
					}
				}
			}
		}
	}

	private void placeHat(
		World world, Random random, int x, int y, int z, int p_285156_, boolean p_285265_
	) {
		boolean flag = this.leavesID == ModBlocks.netherWartBlock.id;
		int i = Math.min(random.nextInt(1 + p_285156_ / 3) + 5, p_285156_);
		int j = p_285156_ - i;

		for (int k = j; k <= p_285156_; ++k) {
			int l = k < p_285156_ - random.nextInt(3) ? 2 : 1;
			if (i > 8 && k < j + 4) {
				l = 3;
			}

			if (p_285265_) {
				++l;
			}

			for (int i1 = -l; i1 <= l; ++i1) {
				for (int j1 = -l; j1 <= l; ++j1) {
					boolean flag1 = i1 == -l || i1 == l;
					boolean flag2 = j1 == -l || j1 == l;
					boolean flag3 = !flag1 && !flag2 && k != p_285156_;
					boolean flag4 = flag1 && flag2;
					boolean flag5 = k < j + 3;
					if (world.getBlockId(x + i1, y + k, z + j1) == 0) {
						if (world.getBlockId(x + i1, y + k, z + j1) != 0) {
							world.setBlock(x + i1, y + k, z + j1, 0);
						}

						if (flag5) {
							if (!flag3) {
								this.placeHatDropBlock(world, random, x + i1, y + k, z + j1, flag);
							}
						} else if (flag3) {
							this.placeHatBlock(world, random, x + i1, y + k, z + j1, 0.1F, 0.2F, flag ? 0.1F : 0.0F);
						} else if (flag4) {
							this.placeHatBlock(world, random, x + i1, y + k, z + j1, 0.01F, 0.7F, flag ? 0.083F : 0.0F);
						} else {
							this.placeHatBlock(world, random, x + i1, y + k, z + j1, 5.0E-4F, 0.98F, flag ? 0.07F : 0.0F);
						}
					}
				}
			}
		}
	}

	private void placeHatBlock(
		World world, Random random, int x, int y, int z,
		float p_225054_,
		float p_225055_,
		float p_225056_
	) {
		if (random.nextFloat() < p_225054_) {
			world.setBlock(x, y, z, ModBlocks.shroomlight.id);
		} else if (random.nextFloat() < p_225055_) {
			world.setBlock(x, y, z, this.leavesID);
			if (random.nextFloat() < p_225056_) {
				tryPlaceWeepingVines(world, random, x, y, z);
			}
		}
	}

	private void placeHatDropBlock(World world, Random random, int x, int y, int z, boolean p_225069_) {
		if (world.getBlockId(x, y - 1, z) == this.leavesID) {
			world.setBlock(x, y, z, this.leavesID);
		} else if ((double) random.nextFloat() < 0.15) {
			world.setBlock(x, y, z, this.leavesID);
			if (p_225069_ && random.nextInt(11) == 0) {
				tryPlaceWeepingVines(world, random, x, y, z);
			}
		}
	}

	private static void tryPlaceWeepingVines(World world, Random random, int x, int y, int z) {
		if (world.getBlockId(x, y - 1, z) == 0) {
			/*int i = Mth.nextInt(p_225073_, 1, 5);
			if (p_225073_.nextInt(7) == 0) {
				i *= 2;
			}*/

			int j = 23;
			int k = 25;
		}
	}
}

