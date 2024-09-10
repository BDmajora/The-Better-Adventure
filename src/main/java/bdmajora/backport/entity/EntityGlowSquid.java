package bdmajora.backport.entity;

import bdmajora.backport.item.ModItems;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.animal.EntitySquid;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.world.World;

public class EntityGlowSquid extends EntitySquid {
	public EntityGlowSquid(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("backport", "glowsquid");
		this.setSize(0.95F, 0.95F);
		this.mobDrops.add(new WeightedRandomLootObject(ModItems.inksacGlow.getDefaultStack(), 1, 3));
	}

	@Override
	public boolean getCanSpawnHere() {
       if (this.world.isDaytime()) {
		   return false;
	   }
		return this.world.checkIfAABBIsClear(this.bb);
    }

	@Override
	public int getSkinVariant() {
		int skinVariantCount = 4;
		return this.entityData.getByte(1) % skinVariantCount;
	}

}
