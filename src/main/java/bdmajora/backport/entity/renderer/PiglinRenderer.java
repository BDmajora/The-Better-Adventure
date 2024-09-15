package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityPiglin;
import bdmajora.backport.entity.models.ModelPiglin;
import net.minecraft.client.render.entity.LivingRenderer;

public class PiglinRenderer extends LivingRenderer<EntityPiglin> {

	public PiglinRenderer(ModelPiglin modelPiglin, float shadowSize) {
		super(modelPiglin, shadowSize);
	}

	@Override
	public void render(EntityPiglin entityPiglin, double x, double y, double z, float yaw, float partialTicks) {
		super.render(entityPiglin, x, y, z, yaw, partialTicks);
	}
}
