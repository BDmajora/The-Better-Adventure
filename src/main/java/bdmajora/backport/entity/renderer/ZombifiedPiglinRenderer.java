package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityZombifiedPiglin;
import bdmajora.backport.entity.models.ModelPiglin;
import net.minecraft.client.render.entity.LivingRenderer;

public class ZombifiedPiglinRenderer extends LivingRenderer<EntityZombifiedPiglin> {

	public ZombifiedPiglinRenderer(ModelPiglin modelPiglin, float shadowSize) {
		super(modelPiglin, shadowSize);
	}

	@Override
	public void render(EntityZombifiedPiglin entityZombifiedPiglin, double x, double y, double z, float yaw, float partialTicks) {
		// Make sure to call the parent render method
		super.render(entityZombifiedPiglin, x, y, z, yaw, partialTicks);

		// Manually adjust the snout, tusks, and ears based on the head's position and rotation
		ModelPiglin model = (ModelPiglin) this.mainModel;

		model.leftEar.rotateAngleX = model.head.rotateAngleX;
		model.leftEar.rotateAngleY = model.head.rotateAngleY;

		model.rightEar.rotateAngleX = model.head.rotateAngleX;
		model.rightEar.rotateAngleY = model.head.rotateAngleY;

		// This ensures all parts attached to the head rotate with it
	}
}
