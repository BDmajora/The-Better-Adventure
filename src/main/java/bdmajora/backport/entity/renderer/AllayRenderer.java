package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityAllay;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.util.helper.MathHelper;

public class AllayRenderer extends LivingRenderer<EntityAllay> {

	public AllayRenderer(ModelBase modelbase, float f) {
		super(modelbase, f);
	}

	public void renderAllay(EntityAllay entityAllay, double d, double d1, double d2, float f, float f1) {
		super.render(entityAllay, d, d1, d2, f, f1);
	}

	public float getWingRotation(EntityAllay entityAllay, float f) {
		float f1 = entityAllay.field_756_e + (entityAllay.field_752_b - entityAllay.field_756_e) * f;
		float f2 = entityAllay.field_757_d + (entityAllay.destPos - entityAllay.field_757_d) * f;
		return (MathHelper.sin(f1) + 1.0F) * f2;
	}

	public float ticksExisted(EntityAllay entityAllay, float partialTick) {
		return this.getWingRotation(entityAllay, partialTick);
	}

	@Override
	public void render(EntityAllay entityAllay, double x, double y, double z, float yaw, float partialTick) {
		this.renderAllay(entityAllay, x, y, z, yaw, partialTick);
	}

	public void doRender(Tessellator tessellator, EntityAllay entityAllay, double x, double y, double z, float yaw, float partialTick) {
		this.renderAllay(entityAllay, x, y, z, yaw, partialTick);
	}
}
