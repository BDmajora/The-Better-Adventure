package bdmajora.backport.entity;

import bdmajora.backport.entity.models.*;
import bdmajora.backport.entity.renderer.*;
import turniplabs.halplibe.helper.EntityHelper;

public class BackportEntities {
	public static int entityID = 120;

	public void initializeEntities() {
		EntityHelper.createEntity(EntityParrot.class, entityID++, "Parrot", () -> new ParrotRenderer(new ModelParrot(), 0.2f));
		EntityHelper.createEntity(EntityGlowSquid.class, entityID++, "Glowsquid", () -> new GlowSquidRenderer(new ModelGlowSquid(), 0.7f));
		EntityHelper.createEntity(EntityGoat.class, entityID++, "Goat", () -> new GoatRenderer(new ModelGoat(), 0.7f));
		EntityHelper.createEntity(EntityAxolotl.class, entityID++, "Axolotl", () -> new AxolotlRenderer(new ModelAxolotl(), 0.5f));
		EntityHelper.createEntity(EntityDrowned.class, entityID + 2, "Drowned", () -> new DrownedRenderer(new ModelDrowned(), 0.5F)); // Add the new entity
	}
}
