package bdmajora.backport.block.bamboo;

import bdmajora.backport.block.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BambooSapling extends Block implements IBonemealable {

	public BambooSapling(String key, int id) {
		super(key, id, Material.vegetable);
		float f = 0.375f;
		this.setBlockBounds(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (world.isAirBlock(x, y + 1, z)) {
			world.setBlockWithNotify(x, y, z, ModBlocks.bambooShoot.id);
		}
	}

	@Override
	public boolean onBonemealUsed(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, Side side, double hitX, double hitY) {
		if (world.isAirBlock(x, y + 1, z)) {
			world.setBlockWithNotify(x, y, z, ModBlocks.bambooShoot.id);
			if (player.getGamemode().consumeBlocks()) {
				--itemStack.stackSize;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		return world.getBlockId(x, y - 1, z) != 0;
	}
}
