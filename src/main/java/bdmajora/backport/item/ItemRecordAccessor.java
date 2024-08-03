package bdmajora.backport.item;

import net.minecraft.core.item.ItemRecord;

public class ItemRecordAccessor extends ItemRecord {
	private final String texture;

	protected ItemRecordAccessor(String name, int id, String recordName, String recordAuthor, String texture) {
		super(name, id, recordName, recordAuthor);
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}
}
