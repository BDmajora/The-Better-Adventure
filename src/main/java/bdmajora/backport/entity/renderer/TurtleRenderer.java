package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityTurtle;
import bdmajora.backport.entity.models.ModelTurtle;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class TurtleRenderer extends LivingRenderer<EntityTurtle> {
	public ModelTurtle modelTurtleMain;

	public TurtleRenderer(ModelTurtle modelTurtle, float shadowSize) {
		super(modelTurtle, shadowSize);
		this.modelTurtleMain = modelTurtle;
	}

	public void renderTurtle(EntityTurtle entityTurtle, double d, double d1, double d2, float f, float f1) {
		super.render(entityTurtle, d, d1, d2, f, f1);
	}

	public void render(EntityTurtle entityTurtle, double x, double y, double z, float yaw, float partialTick) {
		this.renderTurtle(entityTurtle, x, y, z, yaw, partialTick);
	}

	public void doRender(Tessellator tessellator, EntityTurtle entityTurtle, double x, double y, double z, float yaw, float partialTick) {
		this.renderTurtle(entityTurtle, x, y, z, yaw, partialTick);
	}


}
