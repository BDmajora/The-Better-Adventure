package bdmajora.backport.block.Nether;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.world.gen.WorldFeatureNetherFungi;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class BlockSaplingCrimsonFungus extends Block {
	public BlockSaplingCrimsonFungus(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return super.canPlaceBlockAt(world, x, y, z) && this.canThisPlantGrowOnThisBlockID(world.getBlockId(x, y - 1, z));
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		super.onNeighborBlockChange(world, x, y, z, blockId);
		this.func_268_h(world, x, y, z);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		this.func_268_h(world, x, y, z);
	}

	protected final void func_268_h(World world, int i, int j, int k) {
		if (!this.canBlockStay(world, i, j, k)) {
			this.dropBlockWithCause(world, EnumDropCause.WORLD, i, j, k, world.getBlockMetadata(i, j, k), null);
			world.setBlockWithNotify(i, j, k, 0);
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		return (this.canThisPlantGrowOnThisBlockID(world.getBlockId(x, y - 1, z)));
	}


	public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean canThisPlantGrowOnThisBlockID(int i) {
		return i == ModBlocks.warpedNylium.id || i == ModBlocks.nylium.id;
	}

	public void grow(World world, int i, int j, int k, Random random) {
		WorldFeatureNetherFungi treeSmall = new WorldFeatureNetherFungi(ModBlocks.netherWartBlock.id, ModBlocks.crimsonStem.id, true);
		world.setBlock(i, j, k, 0);
		if (!((WorldFeature) treeSmall).generate(world, random, i, j, k)) {
			world.setBlock(i, j, k, this.id);
		}
	}
}

