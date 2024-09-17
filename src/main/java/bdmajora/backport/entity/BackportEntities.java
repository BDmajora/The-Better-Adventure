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
		EntityHelper.createEntity(EntityFish.class, entityID, "Fish", () -> new RenderFish(new FishModel(), 0.3F));
		EntityHelper.createEntity(EntityPiglin.class, entityID + 2, "Piglin", () -> new PiglinRenderer(new ModelPiglin(), 0.5F)); // Add the new entity
		EntityHelper.createEntity(EntityPiglinBrute.class, entityID + 2, "PiglinBrute", () -> new PiglinRenderer(new ModelPiglin(), 0.5F)); // Add the new entity
		EntityHelper.createEntity(EntityZombifiedPiglin.class, entityID + 2, "ZombifiedPiglin", () -> new ZombifiedPiglinRenderer(new ModelPiglin(), 0.5F)); // Add the new entity
		EntityHelper.createEntity(EntityBee.class, entityID++, "Bee", () -> new BeeRenderer(new ModelBee(), 0.2f));
		EntityHelper.createEntity(EntityWarden.class, entityID + 2, "Warden", () -> new WardenRenderer(new ModelWarden(), 0.5F)); // Add the new entity
		EntityHelper.createEntity(EntityTurtle.class, entityID++, "Turtle", () -> new TurtleRenderer(new ModelTurtle(), 0.5f));
		EntityHelper.createEntity(EntityAllay.class, entityID++, "Allay", () -> new AllayRenderer(new ModelAllay(), 0.2f));
		EntityHelper.createEntity(EntityArmadillo.class, entityID++, "Armadillo", () -> new ArmadilloRenderer(new ModelArmadillo(), 0.2f));


	}
}
