//package bdmajora.backport.block.client;
//
//import bdmajora.backport.block.entity.TileEntityBell;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.render.EntityRenderDispatcher;
//import net.minecraft.client.render.block.model.BlockModelDispatcher;
//import net.minecraft.client.render.entity.ItemEntityRenderer;
//import net.minecraft.client.render.tileentity.TileEntityRenderer;
//import net.minecraft.core.entity.EntityItem;
//import net.minecraft.core.item.ItemStack;
//import net.minecraft.core.item.block.ItemBlock;
//import net.minecraft.core.util.helper.MathHelper;
//import org.lwjgl.opengl.GL11;
//
//public class TileEntityBellRenderer extends TileEntityRenderer<TileEntityBell> {
//	private final BellModel model = new BellModel();
//	private static final String texturePath = "assets/futuremc/textures/entity/bell/bell_body.png";
//	private final EntityItem entityItem = new EntityItem(null);
//	private final ItemEntityRenderer renderer = new ItemEntityRenderer();
//
//	{
//		renderer.setRenderDispatcher(EntityRenderDispatcher.instance);
//	}
//
//	@Override
//	public void doRender(TileEntityBell bell, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
//		GL11.glPushMatrix();
//		GL11.glTranslatef((float)x + 0.5F, (float)y + 0.75F, (float)z + 0.5F);
//		float t = bell.getRingingTicks() + partialTicks;
//		GL11.glTranslatef(0.0F, 0.1F + MathHelper.sin(t * 0.1F) * 0.01F, 0.0F);
//
//		float f1 = bell.getRot() - bell.getPrevRot();
//		while (f1 >= Math.PI) f1 -= (Math.PI * 2.0F);
//		while (f1 < -Math.PI) f1 += (Math.PI * 2.0F);
//
//		float f2 = bell.getPrevRot() + f1 * partialTicks;
//		GL11.glRotatef(-f2 * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
//		GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
//		this.loadTexture(texturePath);
//		model.renderBell(0.0F, 0.0F);
//		GL11.glPopMatrix();
//	}
//}
