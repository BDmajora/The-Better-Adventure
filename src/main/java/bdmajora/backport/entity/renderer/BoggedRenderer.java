package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityBogged;
import bdmajora.backport.entity.models.ModelBogged;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.tessellator.Tessellator;

public class BoggedRenderer extends LivingRenderer<EntityBogged> {
	public ModelBogged modelBoggedMain;

	public BoggedRenderer(ModelBogged modelBogged, float shadowSize) {
		super(modelBogged, shadowSize);
		this.modelBoggedMain = modelBogged;
	}

	public void renderBogged(EntityBogged entityBogged, double x, double y, double z, float yaw, float partialTicks) {
		super.render(entityBogged, x, y, z, yaw, partialTicks);
	}

	@Override
	public void render(EntityBogged entityBogged, double x, double y, double z, float yaw, float partialTicks) {
		this.renderBogged(entityBogged, x, y, z, yaw, partialTicks);
	}

	public void doRender(Tessellator tessellator, EntityBogged entityBogged, double x, double y, double z, float yaw, float partialTicks) {
		this.renderBogged(entityBogged, x, y, z, yaw, partialTicks);
	}
}
