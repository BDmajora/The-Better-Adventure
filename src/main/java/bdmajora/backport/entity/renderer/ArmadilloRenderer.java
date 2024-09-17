package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityArmadillo;
import bdmajora.backport.entity.models.ModelArmadillo;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.tessellator.Tessellator;

public class ArmadilloRenderer extends LivingRenderer<EntityArmadillo> {
	public ModelArmadillo modelArmadilloMain;

	public ArmadilloRenderer(ModelArmadillo modelArmadillo, float shadowSize) {
		super(modelArmadillo, shadowSize);
		this.modelArmadilloMain = modelArmadillo;
	}

	public void renderArmadillo(EntityArmadillo entityArmadillo, double x, double y, double z, float yaw, float partialTick) {
		// Set the rolled-up state in the model
		this.modelArmadilloMain.setRolledUp(entityArmadillo.isRolledUp());

		// Call the parent render method
		super.render(entityArmadillo, x, y, z, yaw, partialTick);
	}

	@Override
	public void render(EntityArmadillo entityArmadillo, double x, double y, double z, float yaw, float partialTick) {
		this.renderArmadillo(entityArmadillo, x, y, z, yaw, partialTick);
	}

	@Override
	public void doRender(Tessellator tessellator, EntityArmadillo entityArmadillo, double x, double y, double z, float yaw, float partialTick) {
		this.renderArmadillo(entityArmadillo, x, y, z, yaw, partialTick);
	}
}
