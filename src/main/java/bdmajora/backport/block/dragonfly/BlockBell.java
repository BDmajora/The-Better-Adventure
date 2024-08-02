//package bdmajora.backport.block.dragonfly;
//
//import net.minecraft.core.block.Block;
//import net.minecraft.core.block.BlockTransparent;
//import net.minecraft.core.block.entity.TileEntity;
//import net.minecraft.core.block.material.Material;
//import net.minecraft.core.block.tag.BlockTags;
//import net.minecraft.core.entity.EntityLiving;
//import net.minecraft.core.util.helper.Direction;
//import net.minecraft.core.util.helper.Side;
//import net.minecraft.core.world.World;
//import useless.dragonfly.model.block.processed.BlockCube;
//import useless.dragonfly.model.block.processed.BlockModel;
//import net.minecraft.core.util.phys.AABB;
////import bdmajora.backport.tile.BellTileEntity;
//
//import java.util.ArrayList;
//
//public class BlockBell extends BlockTransparent {
//	public BlockModel model;
//
//	public BlockBell(String key, int id, Material material, BlockModel model) {
//		super(key, id, material, true);
//		this.model = model;
//	}
//
//	@Override
//	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
//		int meta = world.getBlockMetadata(x, y, z) & 0x11111100;
//		Direction hRotation = entity.getHorizontalPlacementDirection(side);
//		if (hRotation == Direction.NORTH) {
//			meta |= 2;
//		}
//		if (hRotation == Direction.EAST) {
//			meta |= 1;
//		}
//		if (hRotation == Direction.SOUTH) {
//			meta |= 3;
//		}
//		if (hRotation == Direction.WEST) {
//			meta |= 0;
//		}
//		if ((side == Side.BOTTOM || side != Side.TOP && sideHeight >= 0.5) && (world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF))) {
//			meta |= 0b10000; // Set the fifth bit to indicate that the bell is hanging
//		}
//		world.setBlockMetadataWithNotify(x, y, z, meta);
//	}
//
//	@Override
//	public boolean renderAsNormalBlock() {
//		return false;
//	}
//
//	@Override
//	public boolean canPlaceOnSurface() {
//		return true;
//	}
//
//	@Override
//	public int getRenderBlockPass() {
//		return 0;
//	}
//	@Override
//	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
//		for (BlockCube cube: model.blockCubes) {
//			setBlockBounds(cube.xMin(), cube.yMin(), cube.zMin(), cube.xMax(), cube.yMax(), cube.zMax());
//			super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
//		}
//		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
//	}
//
////	public TileEntity createNewTileEntity(World world, int meta) {
////		return new BellTileEntity();
////	}
//}
