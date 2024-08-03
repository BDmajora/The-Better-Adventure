package bdmajora.backport.item.Food;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemSeeds;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.ItemHelper;

import java.util.function.Function;

public class ItemSeedsAccessor extends ItemSeeds {

	private final String textureFile;

	public ItemSeedsAccessor(String name, int id, Block cropsBlock, String textureFile) {
		super(name, id, cropsBlock);
		this.textureFile = textureFile;
	}

}

