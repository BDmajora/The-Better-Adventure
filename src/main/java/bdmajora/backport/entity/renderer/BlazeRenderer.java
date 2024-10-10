package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityBlaze;
import bdmajora.backport.entity.models.ModelBlaze;
import net.minecraft.client.render.entity.LivingRenderer;

public class BlazeRenderer extends LivingRenderer<EntityBlaze> {

	public BlazeRenderer(ModelBlaze modelBlaze, float shadowSize) {
		super(modelBlaze, shadowSize);
	}

	@Override
	public void render(EntityBlaze entityBlaze, double x, double y, double z, float yaw, float partialTicks) {
		// Call the parent render method
		super.render(entityBlaze, x, y, z, yaw, partialTicks);

		// Access the blaze model
		ModelBlaze model = (ModelBlaze) this.mainModel;

		// No rotation logic for upper body parts, keeping the render method minimal
		// The rest of the entity rendering is handled by the parent class

		// No head rotation or part-specific logic needed for this entity
	}
}
