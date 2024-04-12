package bdmajora.backport.block.dragonfly;

import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import useless.dragonfly.model.block.processed.BlockCube;
import useless.dragonfly.model.block.processed.BlockModel;
import net.minecraft.core.util.phys.AABB;

import java.util.ArrayList;

public class BlockBarrel extends BlockTransparent {

	public useless.dragonfly.model.block.processed.BlockModel model;

	public BlockBarrel(String key, int id, Material material, BlockModel model) {
		super(key, id, material, true);
		this.model = model; // Initialize the model field

	}

	@Override
	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int meta = world.getBlockMetadata(x, y, z) & 0x11111100;
		Direction hRotation = entity.getHorizontalPlacementDirection(side);
		if (hRotation == Direction.NORTH) {
			meta |= 1;
		} else if (hRotation == Direction.EAST) {
			meta |= 2;
		} else if (hRotation == Direction.SOUTH) {
			meta |= 0;
		} else if (hRotation == Direction.WEST) {
			meta |= 3;
		} else if (hRotation == Direction.UP) {
			meta |= 7;
		} else if (hRotation == Direction.DOWN) {
			meta |= 7;
		}
		world.setBlockMetadataWithNotify(x, y, z, meta);
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean canPlaceOnSurface() {
		return true;
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
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

