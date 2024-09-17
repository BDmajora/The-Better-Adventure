package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityWarden;
import bdmajora.backport.entity.models.ModelWarden;
import net.minecraft.client.render.entity.LivingRenderer;

public class WardenRenderer extends LivingRenderer<EntityWarden> {

	public WardenRenderer(ModelWarden modelWarden, float shadowSize) {
		super(modelWarden, shadowSize);
	}

	@Override
	public void render(EntityWarden wardenEntity, double x, double y, double z, float yaw, float partialTicks) {
		// Call the parent render method to handle general entity rendering
		super.render(wardenEntity, x, y, z, yaw, partialTicks);

		// Cast the main model to the Warden model
		ModelWarden model = (ModelWarden) this.mainModel;

		// Sync the tendrils to the head movement, just like the ears of the Piglin
		model.rightTendril.rotateAngleX = model.head.rotateAngleX;
		model.rightTendril.rotateAngleY = model.head.rotateAngleY;

		model.leftTendril.rotateAngleX = model.head.rotateAngleX;
		model.leftTendril.rotateAngleY = model.head.rotateAngleY;

		// This ensures all parts attached to the head rotate with it
	}
}
