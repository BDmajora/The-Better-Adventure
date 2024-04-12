package bdmajora.backport.block.Flowers;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import useless.dragonfly.model.block.processed.BlockCube;
import useless.dragonfly.model.block.processed.BlockModel;
import net.minecraft.core.util.phys.AABB;

import java.util.ArrayList;

public class Sunflower extends Block {

	public BlockModel model;

	public Sunflower(String name, int id, Material material, BlockModel model) {
		super(name, id, material);
		this.model = model;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(ModItems.sunflower)};
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		Block blockBelow = world.getBlock(x, y - 1, z);
		return blockBelow == ModBlocks.sunflowerBottom || super.canPlaceBlockAt(world, x, y, z);
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public float getHardness() {
		return 0.0F; // Makes the block break instantly
	}

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta, EntityPlayer player) {
		super.onBlockDestroyedByPlayer(world, x, y, z, meta, player, ModItems.sunflower);
		if (world.getBlock(x, y + 1, z) == ModBlocks.sunflowerTop) {
			world.setBlockWithNotify(x, y + 1, z, 0); // Destroys the top half
		} else if (world.getBlock(x, y - 1, z) == ModBlocks.sunflowerBottom) {
			world.setBlockWithNotify(x, y - 1, z, 0); // Destroys the bottom half
		}
	}

	@Override
	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
		for (BlockCube cube: model.blockCubes) {
			setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
		}
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}
}
