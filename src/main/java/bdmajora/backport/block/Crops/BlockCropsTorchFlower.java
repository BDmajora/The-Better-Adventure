package bdmajora.backport.block.Crops;

import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import java.util.Random;

public class BlockCropsTorchFlower extends BlockFlower implements IBonemealable {
	private static final int MAX_GROWTH_STAGE = 3;

	public BlockCropsTorchFlower(String key, int id) {
		super(key, id);
		this.setTicking(true);
		this.setBonemealable(); // Ensure the crop can be fertilized
		float f = 0.5f;
		this.setBlockBounds(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
	}

	@Override
	public boolean canThisPlantGrowOnThisBlockID(int i) {
		return i == Block.farmlandDirt.id;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);
		if (world.getBlockLightValue(x, y + 1, z) >= 9) {
			int l = world.getBlockMetadata(x, y, z);
			if (l < MAX_GROWTH_STAGE && rand.nextInt((int)(100.0f / this.getGrowthRate(world, x, y, z))) == 0) {
				world.setBlockMetadataWithNotify(x, y, z, ++l);
			}
		}
	}

	public void fertilize(World world, int i, int j, int k) {
		world.setBlockMetadataWithNotify(i, j, k, MAX_GROWTH_STAGE);
	}

	private float getGrowthRate(World world, int x, int y, int z) {
		float growthRate = 1.0f;
		int idNegZ = world.getBlockId(x, y, z - 1);
		int idPosZ = world.getBlockId(x, y, z + 1);
		int idNegX = world.getBlockId(x - 1, y, z);
		int idPosX = world.getBlockId(x + 1, y, z);
		int idNegXNegZ = world.getBlockId(x - 1, y, z - 1);
		int idPosXNegZ = world.getBlockId(x + 1, y, z - 1);
		int idPosXPosZ = world.getBlockId(x + 1, y, z + 1);
		int idNegXPosZ = world.getBlockId(x - 1, y, z + 1);
		boolean xNeighbor = idNegX == this.id || idPosX == this.id;
		boolean zNeighbor = idNegZ == this.id || idPosZ == this.id;
		boolean diagNeighbor = idNegXNegZ == this.id || idPosXNegZ == this.id || idPosXPosZ == this.id || idNegXPosZ == this.id;

		for (int dx = x - 1; dx <= x + 1; ++dx) {
			for (int dz = z - 1; dz <= z + 1; ++dz) {
				int id = world.getBlockId(dx, y - 1, dz);
				float growthRateMod = 0.0f;
				if (id == Block.farmlandDirt.id) {
					growthRateMod = 1.0f;
					if (world.getBlockMetadata(dx, y - 1, dz) > 0) {
						growthRateMod = 3.0f;
					}
				}
				if (dx != x || dz != z) {
					growthRateMod /= 4.0f;
				}
				growthRate += growthRateMod;
			}
		}

		if (diagNeighbor || xNeighbor && zNeighbor) {
			growthRate /= 2.0f;
		}

		if (world.seasonManager.getCurrentSeason() != null) {
			growthRate *= world.seasonManager.getCurrentSeason().cropGrowthFactor;
		}

		return growthRate;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		if (meta != MAX_GROWTH_STAGE) {
			return new ItemStack[]{new ItemStack(ModItems.seedsTorchFlower)};
		}
		return new ItemStack[]{new ItemStack(ModItems.foodTorchFlower, world.rand.nextInt(3) + 1), new ItemStack(ModItems.foodTorchFlower)};
	}

	@Override
	public boolean onBonemealUsed(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		int metadata = world.getBlockMetadata(blockX, blockY, blockZ);
		if (metadata < MAX_GROWTH_STAGE) {
			this.fertilize(world, blockX, blockY, blockZ);
			if (!world.isClientSide && entityplayer.getGamemode().consumeBlocks()) {
				--itemstack.stackSize;
			}
			return true;
		}
		return false;
	}
}
