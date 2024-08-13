package bdmajora.backport.block.dragonfly;

import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import org.useless.dragonfly.model.block.processed.BlockCube;
import org.useless.dragonfly.model.block.BlockModelDragonFly;

import java.util.ArrayList;

public class BlockBarrel extends BlockTransparent {

	public BlockBarrel(String key, int id, Material material) {
		super(key, id, material);
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
	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
		BlockModel<?> model = BlockModelDispatcher.getInstance().getDispatch(this);
		if (!(model instanceof BlockModelDragonFly)) {
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
			return;
		}
		BlockModelDragonFly modelDragonFly = (BlockModelDragonFly) model;
		for (BlockCube cube : modelDragonFly.baseModel.blockCubes) {
			setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
		}
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
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

	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		int meta = world.getBlockMetadata(x, y, z);
		meta += player.isSneaking() ? -1 : 1;
		if (meta < 0) {
			meta += 256;
		}
		if (meta > 255) {
			meta -= 256;
		}
		world.setBlockMetadataWithNotify(x, y, z, meta);
		return true;
	}
}
