package bdmajora.backport.block.dragonfly;

import bdmajora.backport.block.entity.TileEntityEnchantmentTable;
import bdmajora.backport.interfaces.mixins.IEntityPlayer;
import net.minecraft.core.block.BlockTileEntity;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import org.useless.dragonfly.model.block.processed.BlockCube;
import org.useless.dragonfly.model.block.processed.ModernBlockModel;

import java.util.ArrayList;

public class BlockEnchantmentTable extends BlockTileEntity
{
	public org.useless.dragonfly.model.block.processed.ModernBlockModel model;
	public BlockEnchantmentTable(String key, int id, Material material, ModernBlockModel model)
	{
		super(key, id, material);
		setBlockBounds(0, 0, 0, 1, 12f / 16, 1);
		this.model = model;
	}

	@Override
	public boolean isSolidRender()
	{
		return false;
	}

	@Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xPlaced, double yPlaced)
	{
		if (world.isClientSide) return true;

		TileEntityEnchantmentTable tile = (TileEntityEnchantmentTable) world.getBlockTileEntity(x, y, z);
		if (tile != null)
			((IEntityPlayer)player).displayGUIEnchantmentTable(tile);

		return true;
	}

	@Override
	protected TileEntity getNewBlockEntity()
	{
		return new TileEntityEnchantmentTable();
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
