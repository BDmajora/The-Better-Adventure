package bdmajora.backport.block.dragonfly;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFenceThin;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockGlassPane extends BlockFenceThin {
	public BlockGlassPane(String key, int id) {
		super(key, id, Material.glass);
	}

	@Override
	public boolean canConnectTo(WorldSource worldSource, int x, int y, int z) {
		int l = worldSource.getBlockId(x, y, z);
		return Block.hasTag(l, BlockTags.FENCES_CONNECT) || l == this.id || l == Block.cobbleStone.id;
	}

	public boolean shouldDrawColumn(World world, int x, int y, int z) {
		boolean drawColumn = this.shouldDrawColumn_do(world, x, y, z);
		if (drawColumn) {
			return true;
		} else {
			int oy;
			for(oy = 1; world.getBlockId(x, y + oy, z) == this.id; ++oy) {
			}

			--oy;

			boolean drawColumnFromOther;
			for(drawColumnFromOther = false; world.getBlockId(x, y + oy, z) == this.id; --oy) {
				if (this.shouldDrawColumn_do(world, x, y + oy, z)) {
					drawColumnFromOther = true;
					break;
				}
			}

			return drawColumnFromOther;
		}
	}

	@Override
	public int getTextureIndex() {
		return 0;
	}

	@Override
	public int getTextureIndexAtTop() {
		return 0;
	}

	@Override
	public int getTextureIndexAtBottom() {
		return 0;
	}

	@Override
	public int getColumnTextureIndex() {
		return 0;
	}

	@Override
	public int getRenderBlockPass()
	{
		return 1;
	}

	private boolean shouldDrawColumn_do(World world, int x, int y, int z) {
		boolean connectNorth = this.canConnectTo(world, x + Direction.NORTH.getOffsetX(), y + Direction.NORTH.getOffsetY(), z + Direction.NORTH.getOffsetZ());
		boolean connectSouth = this.canConnectTo(world, x + Direction.SOUTH.getOffsetX(), y + Direction.SOUTH.getOffsetY(), z + Direction.SOUTH.getOffsetZ());
		boolean connectEast = this.canConnectTo(world, x + Direction.EAST.getOffsetX(), y + Direction.EAST.getOffsetY(), z + Direction.EAST.getOffsetZ());
		boolean connectWest = this.canConnectTo(world, x + Direction.WEST.getOffsetX(), y + Direction.WEST.getOffsetY(), z + Direction.WEST.getOffsetZ());
		boolean lineNorthSouth = connectNorth && connectSouth;
		boolean lineEastWest = connectEast && connectWest;
		return !lineNorthSouth && !lineEastWest || lineNorthSouth && lineEastWest || lineNorthSouth && (connectEast || connectWest) || lineEastWest && (connectNorth || connectSouth);
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		if (dropCause == EnumDropCause.PICK_BLOCK || dropCause == EnumDropCause.SILK_TOUCH) {
			return new ItemStack[]{new ItemStack(this)};
		}
		return new ItemStack[]{};
	}
}
