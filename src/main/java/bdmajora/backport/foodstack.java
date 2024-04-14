package bdmajora.backport;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;

public class foodstack {
	public void initializeItems() {
		Item.foodBread.setMaxStackSize(64);
		Item.foodPorkchopRaw.setMaxStackSize(64);
		Item.foodPorkchopCooked.setMaxStackSize(64);
		Item.foodFishRaw.setMaxStackSize(64);
		Item.foodFishCooked.setMaxStackSize(64);
		Item.foodApple.setMaxStackSize(64);
		Item.foodAppleGold.setMaxStackSize(64);
		Item.foodCookie.setMaxStackSize(64);
		Item.foodCake.setMaxStackSize(64);
		Item.foodStewMushroom.setMaxStackSize(64);

	}
}
