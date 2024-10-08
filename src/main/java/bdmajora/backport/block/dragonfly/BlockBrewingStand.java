package bdmajora.backport.block.dragonfly;

import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import org.useless.dragonfly.model.block.BlockModelDragonFly;
import org.useless.dragonfly.model.block.processed.BlockCube;

import java.util.ArrayList;
import java.util.HashMap;

public class BlockBrewingStand extends BlockTransparent {

	public BlockBrewingStand(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xHit, double yHit) {
		int meta = world.getBlockMetadata(x, y, z);
		// Example interaction: Cycle through bottles on right-click
		meta = (meta + 1) % 8; // Cycle through 8 possible states (3 bottles = 3 bits)
		world.setBlockMetadataWithNotify(x, y, z, meta);
		return true;
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

	public HashMap<String, String> getStateMap(int meta) {
		HashMap<String, String> result = new HashMap<>();
		result.put("has_bottle_0", (meta & 0b1) == 0b1 ? "true" : "false");
		result.put("has_bottle_1", (meta & 0b10) == 0b10 ? "true" : "false");
		result.put("has_bottle_2", (meta & 0b100) == 0b100 ? "true" : "false");
		return result;
	}
}
