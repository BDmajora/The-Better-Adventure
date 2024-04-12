package bdmajora.backport.item;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlock;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import bdmajora.backport.block.Vines.BlockVine;
import bdmajora.backport.block.ModBlocks;

public class ItemBlockVine extends ItemBlock {
	private BlockVine blockVine;
	private String name;
	private int id;

	public ItemBlockVine(String name, int id, BlockVine block) {
		super(block);
		this.name = name;
		this.id = id;
		this.blockVine = block;
		this.maxStackSize = 64;
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		Side sideForPlacement;
		Block clickedBlock = world.getBlock(x, y, z);
		if (clickedBlock == ModBlocks.vine && !player.isSneaking()) {
			Side clickedVineSide = this.blockVine.getSideFromMeta(world.getBlockMetadata(x, y, z));
			while (world.getBlock(x, y, z) == ModBlocks.vine && this.blockVine.getSideFromMeta(world.getBlockMetadata(x, y, z)) == clickedVineSide) {
				--y;
			}
			int meta = this.blockVine.getMetaForSide(clickedVineSide);
			if (this.blockVine.canExistAt(world, x, y, z, meta)) {
				return this.placeBlock(world, x, y, z, meta, player, stack, clickedVineSide, 0.5);
			}
			return false;
		}
		if (!world.canPlaceInsideBlock(x, y, z)) {
			x += side.getOffsetX();
			y += side.getOffsetY();
			z += side.getOffsetZ();
		}
		if ((sideForPlacement = this.blockVine.getSideForPlacement(world, x, y, z, side)) == null) {
			return false;
		}
		int meta = this.blockVine.getMetaForSide(sideForPlacement);
		if (this.blockVine.canExistAt(world, x, y, z, meta)) {
			return this.placeBlock(world, x, y, z, meta, player, stack, sideForPlacement, yPlaced);
		}
		return false;
	}

	public boolean placeBlock(World world, int x, int y, int z, int meta, EntityPlayer player, ItemStack stack, Side side, double sideHeight) {
		if (world.canPlaceInsideBlock(x, y, z) && world.canBlockBePlacedAt(this.blockID, x, y, z, false, side) && stack.consumeItem(player) && world.setBlockAndMetadataWithNotify(x, y, z, this.blockID, meta)) {
			Block.getBlock(this.blockID).onBlockPlaced(world, x, y, z, side, player, sideHeight);
			world.playBlockSoundEffect(player, (float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f, ModBlocks.vine, EnumBlockSoundEffectType.PLACE);
			return true;
		}
		return false;
	}
}
