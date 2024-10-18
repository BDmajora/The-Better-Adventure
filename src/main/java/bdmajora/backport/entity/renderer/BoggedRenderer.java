package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityBogged;
import bdmajora.backport.entity.models.ModelBogged;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class BoggedRenderer extends LivingRenderer<EntityBogged> {
	public ModelBogged modelBoggedMain;

	// Constructor to initialize the model and shadow size
	public BoggedRenderer(ModelBogged modelBogged, float shadowSize) {
		super(modelBogged, shadowSize);
		this.modelBoggedMain = modelBogged;
	}

	// Render method that ensures the entity and the held item are rendered
	@Override
	public void render(EntityBogged entityBogged, double x, double y, double z, float yaw, float partialTicks) {
		super.render(entityBogged, x, y, z, yaw, partialTicks);
		this.renderHeldItem(entityBogged);  // Call to render the held item
	}

	// Method to render the held item in the entity's hand
	protected void renderHeldItem(EntityBogged entityBogged) {
		ItemStack itemStack = entityBogged.getHeldItem();
		if (itemStack != null && itemStack.getItem() != null) {
			GL11.glPushMatrix();

			// Translate the right arm to align the held item properly
			this.modelBoggedMain.bipedRightArm.postRender(0.0625F);  // Use the right arm's position

			// Adjust item position and orientation based on whether it's a block or regular item
			if (itemStack.itemID > 0 && itemStack.itemID < Block.blocksList.length &&
				((BlockModel<?>) BlockModelDispatcher.getInstance().getDispatch(Block.blocksList[itemStack.itemID])).shouldItemRender3d()) {
				float scale = 0.35f;
				GL11.glTranslatef(0.075f, -0.3f, -0.35f);
				GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
				GL11.glScalef(scale *= 0.75f, -scale, scale);
			} else {
				float scale = 0.375f;
				GL11.glTranslatef(0.25f, -0.25f, -0.35f);
				GL11.glScalef(scale, scale, scale);
				GL11.glRotatef(50.0f, 0.0f, 0.0f, 1.0f);
				GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
				GL11.glRotatef(70.0f, 1.0f, 0.0f, 1.0f);
			}

			// Render the item using the ItemModelDispatcher
			ItemModelDispatcher.getInstance().getDispatch(itemStack).renderItem(Tessellator.instance, this.renderDispatcher.itemRenderer, entityBogged, itemStack);
			GL11.glPopMatrix();
		}
	}
}
