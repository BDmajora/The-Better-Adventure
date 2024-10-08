package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityBat;
import bdmajora.backport.entity.models.ModelBat;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.util.helper.MathHelper;

public class BatRenderer extends LivingRenderer<EntityBat> {

	private final ModelBat modelBat;

	public BatRenderer(ModelBase modelbase, float f) {
		super(modelbase, f);
		this.modelBat = (ModelBat) modelbase; // Cast to ModelBat for specific bat model usage
	}

	public void renderBat(EntityBat entityBat, double x, double y, double z, float yaw, float partialTick) {
		super.render(entityBat, x, y, z, yaw, partialTick);
		this.setWingRotation(entityBat, partialTick); // Adjust wing rotation during rendering
	}

	public float getWingRotation(EntityBat entityBat, float partialTick) {
		float wingSwing = entityBat.limbSwing + (entityBat.limbYaw - entityBat.limbSwing) * partialTick;
		float wingSpeed = MathHelper.cos(wingSwing * 0.6662F);
		return wingSpeed;
	}

	public void setWingRotation(EntityBat entityBat, float partialTick) {
		// Set the rotation angles of the wings using the ModelBat fields
		float wingRotation = getWingRotation(entityBat, partialTick);
		modelBat.rightWing.rotateAngleY = wingRotation;
		modelBat.leftWing.rotateAngleY = -wingRotation;
		modelBat.rightWingTip.rotateAngleY = wingRotation * 0.5F;
		modelBat.leftWingTip.rotateAngleY = -wingRotation * 0.5F;
	}

	@Override
	public void render(EntityBat entityBat, double x, double y, double z, float yaw, float partialTick) {
		this.renderBat(entityBat, x, y, z, yaw, partialTick);
	}

	public void doRender(Tessellator tessellator, EntityBat entityBat, double x, double y, double z, float yaw, float partialTick) {
		this.renderBat(entityBat, x, y, z, yaw, partialTick);
	}
}
