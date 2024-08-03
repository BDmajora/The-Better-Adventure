package bdmajora.backport.item;

import net.minecraft.core.item.Item;

public class ItemAccessor extends Item {
	private String texture;

	protected ItemAccessor(String name, int id, String s, String texture) {
		super(name, id);
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}
}
