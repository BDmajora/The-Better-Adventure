package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityPolarBear;
import bdmajora.backport.entity.models.ModelPolarBear;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.tessellator.Tessellator;

public class PolarBearRenderer extends LivingRenderer<EntityPolarBear> {
	public ModelPolarBear modelPolarBearMain;

	public PolarBearRenderer(ModelPolarBear modelPolarBear, float shadowSize) {
		super(modelPolarBear, shadowSize);
		this.modelPolarBearMain = modelPolarBear;
	}

	@Override
	public void render(EntityPolarBear entityPolarBear, double x, double y, double z, float yaw, float partialTick) {
		// Call the parent render method
		super.render(entityPolarBear, x, y, z, yaw, partialTick);
	}

	@Override
	public void doRender(Tessellator tessellator, EntityPolarBear entityPolarBear, double x, double y, double z, float yaw, float partialTick) {
		this.render(entityPolarBear, x, y, z, yaw, partialTick);
	}
}
