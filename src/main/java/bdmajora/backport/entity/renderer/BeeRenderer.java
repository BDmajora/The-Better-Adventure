package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityBee;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.util.helper.MathHelper;

public class BeeRenderer extends LivingRenderer<EntityBee> {

	public BeeRenderer(ModelBase modelbase, float shadowSize) {
		super(modelbase, shadowSize);
	}

	// Method to render the bee
	public void renderBee(EntityBee entityBee, double x, double y, double z, float yaw, float partialTick) {
		super.render(entityBee, x, y, z, yaw, partialTick);
	}

	// Method for calculating wing rotation based on bee's movement
	public float getWingRotation(EntityBee entityBee, float partialTick) {
		float wingTime = entityBee.prevWingPosition + (entityBee.wingPosition - entityBee.prevWingPosition) * partialTick;
		float wingRotation = entityBee.prevDestPos + (entityBee.destPos - entityBee.prevDestPos) * partialTick;
		return (MathHelper.sin(wingTime) + 1.0F) * wingRotation;
	}

	// Overrides the render method to include wing rotation
	@Override
	public void render(EntityBee entityBee, double x, double y, double z, float yaw, float partialTick) {
		this.renderBee(entityBee, x, y, z, yaw, partialTick);
	}

	// Renders the bee using Tessellator
	public void doRender(Tessellator tessellator, EntityBee entityBee, double x, double y, double z, float yaw, float partialTick) {
		this.renderBee(entityBee, x, y, z, yaw, partialTick);
	}
}
