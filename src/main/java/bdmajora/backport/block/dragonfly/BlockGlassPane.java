package bdmajora.backport.block.dragonfly;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFenceThin;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import org.useless.dragonfly.model.block.processed.ModernBlockModel;

public class BlockGlassPane extends BlockFenceThin {
	private final String glassPane;
	private final int id;
	private final Material glass;
	private final ModernBlockModel model;

	// Constructor using default material and no model
	public BlockGlassPane(String key, int id) {
		super(key, id, Material.glass);
		this.glassPane = key;
		this.id = id;
		this.glass = Material.glass;
		this.model = null; // No model provided
	}

	// Constructor using all parameters including a model
	public BlockGlassPane(String glassPane, int id, Material glass, ModernBlockModel model) {
		super(glassPane, id, glass);
		this.glassPane = glassPane;
		this.id = id;
		this.glass = glass;
		this.model = model;
	}

	@Override
	public boolean canConnectTo(WorldSource worldSource, int x, int y, int z) {
		int l = worldSource.getBlockId(x, y, z);
		return Block.hasTag(l, BlockTags.FENCES_CONNECT) || l == this.id || l == Block.cobbleStone.id;
	}

	@Override
	public boolean shouldDrawColumn(WorldSource worldSource, int x, int y, int z) {
		boolean drawColumn = this.shouldDrawColumn_do(worldSource, x, y, z);
		if (drawColumn) {
			return true;
		} else {
			int oy;
			for (oy = 1; worldSource.getBlockId(x, y + oy, z) == this.id; ++oy) {
			}

			--oy;

			boolean drawColumnFromOther;
			for (drawColumnFromOther = false; worldSource.getBlockId(x, y + oy, z) == this.id; --oy) {
				if (this.shouldDrawColumn_do(worldSource, x, y + oy, z)) {
					drawColumnFromOther = true;
					break;
				}
			}

			return drawColumnFromOther;
		}
	}

	private boolean shouldDrawColumn_do(WorldSource worldSource, int x, int y, int z) {
		boolean connectNorth = this.canConnectTo(worldSource, x + Direction.NORTH.getOffsetX(), y + Direction.NORTH.getOffsetY(), z + Direction.NORTH.getOffsetZ());
		boolean connectSouth = this.canConnectTo(worldSource, x + Direction.SOUTH.getOffsetX(), y + Direction.SOUTH.getOffsetY(), z + Direction.SOUTH.getOffsetZ());
		boolean connectEast = this.canConnectTo(worldSource, x + Direction.EAST.getOffsetX(), y + Direction.EAST.getOffsetY(), z + Direction.EAST.getOffsetZ());
		boolean connectWest = this.canConnectTo(worldSource, x + Direction.WEST.getOffsetX(), y + Direction.WEST.getOffsetY(), z + Direction.WEST.getOffsetZ());
		boolean lineNorthSouth = connectNorth && connectSouth;
		boolean lineEastWest = connectEast && connectWest;
		return !lineNorthSouth && !lineEastWest || lineNorthSouth && lineEastWest || lineNorthSouth && (connectEast || connectWest) || lineEastWest && (connectNorth || connectSouth);
	}

	@Override
	public AABB getCollisionBoundingBoxFromPool(WorldSource worldSource, int x, int y, int z) {
		boolean connectXPos = this.canConnectTo(worldSource, x + 1, y, z);
		boolean connectXNeg = this.canConnectTo(worldSource, x - 1, y, z);
		boolean connectZPos = this.canConnectTo(worldSource, x, y, z + 1);
		boolean connectZNeg = this.canConnectTo(worldSource, x, y, z - 1);
		return AABB.getBoundingBoxFromPool((double)((float)x + (connectXNeg ? 0.0F : 0.375F)), (double)y, (double)((float)z + (connectZNeg ? 0.0F : 0.375F)), (double)((float)(x + 1) - (connectXPos ? 0.0F : 0.375F)), (double)((float)y + 1.0F), (double)((float)(z + 1) - (connectZPos ? 0.0F : 0.375F)));
	}

	@Override
	public AABB getSelectedBoundingBoxFromPool(WorldSource worldSource, int x, int y, int z) {
		return this.getCollisionBoundingBoxFromPool(worldSource, x, y, z);
	}

	@Override
	public void setBlockBoundsBasedOnState(WorldSource worldSource, int x, int y, int z) {
		AABB aabb = this.getCollisionBoundingBoxFromPool(worldSource, x, y, z);
		this.minX = aabb.minX - (double)x;
		this.minY = aabb.minY - (double)y;
		this.minZ = aabb.minZ - (double)z;
		this.maxX = aabb.maxX - (double)x;
		this.maxY = aabb.maxY - (double)y;
		this.maxZ = aabb.maxZ - (double)z;
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
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		if (dropCause == EnumDropCause.PICK_BLOCK || dropCause == EnumDropCause.SILK_TOUCH) {
			return new ItemStack[]{new ItemStack(this)};
		}
		return new ItemStack[]{};
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}
}
