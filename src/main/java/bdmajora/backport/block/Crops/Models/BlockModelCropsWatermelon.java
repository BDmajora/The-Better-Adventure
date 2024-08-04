package bdmajora.backport.block.Crops.Models;

import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;

import static bdmajora.backport.backport.MOD_ID;

public class BlockModelCropsWatermelon<T extends Block> extends BlockModelStandard<T> {
	public final IconCoordinate[] GROWTH_STAGE_TEXTURES_TOP = new IconCoordinate[]{
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_top_01.png"),
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_top_02.png"),
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_top_03.png"),
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_top_04.png")
	};
	public final IconCoordinate[] GROWTH_STAGE_TEXTURES_SIDE = new IconCoordinate[]{
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_side_01.png"),
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_side_02.png"),
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_side_03.png"),
		TextureRegistry.getTexture(MOD_ID + ":block/watermelon_growing_side_04.png")
	};

	public BlockModelCropsWatermelon(T block) {
		super(block);
	}

	@Override
	public boolean render(Tessellator tessellator, int x, int y, int z) {
		this.block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);
		float brightness = 1.0F;
		if (!LightmapHelper.isLightmapEnabled()) {
			brightness = this.getBlockBrightness(renderBlocks.blockAccess, x, y, z);
		} else {
			tessellator.setLightmapCoord(this.block.getLightmapCoord(renderBlocks.blockAccess, x, y, z));
		}

		int color = BlockColorDispatcher.getInstance().getDispatch(this.block).getWorldColor(renderBlocks.blockAccess, x, y, z);
		float r = (float)(color >> 16 & 255) / 255.0F;
		float g = (float)(color >> 8 & 255) / 255.0F;
		float b = (float)(color & 255) / 255.0F;
		tessellator.setColorOpaque_F(brightness * r, brightness * g, brightness * b);

		int metadata = renderBlocks.blockAccess.getBlockMetadata(x, y, z);
		IconCoordinate texIndex = this.getBlockTextureFromSideAndMetadata(Side.BOTTOM, metadata);
		if (renderBlocks.overrideBlockTexture != null) {
			texIndex = renderBlocks.overrideBlockTexture;
		}

		double minU = texIndex.getIconUMin();
		double maxU = texIndex.getIconUMax();
		double minV = texIndex.getIconVMin();
		double maxV = texIndex.getIconVMax();
		double minX = (double) x + 0.5 - 0.45;
		double maxX = (double) x + 0.5 + 0.45;
		double minZ = (double) z + 0.5 - 0.45;
		double maxZ = (double) z + 0.5 + 0.45;
		double yd = (float)y - 0.0625F;
		tessellator.addVertexWithUV(minX, yd + 1.0 + 0.0, minZ, minU, minV);
		tessellator.addVertexWithUV(minX, yd + 0.0, minZ, minU, maxV);
		tessellator.addVertexWithUV(maxX, yd + 0.0, maxZ, maxU, maxV);
		tessellator.addVertexWithUV(maxX, yd + 1.0 + 0.0, maxZ, maxU, minV);
		tessellator.addVertexWithUV(maxX, yd + 1.0 + 0.0, maxZ, minU, minV);
		tessellator.addVertexWithUV(maxX, yd + 0.0, maxZ, minU, maxV);
		tessellator.addVertexWithUV(minX, yd + 0.0, minZ, maxU, maxV);
		tessellator.addVertexWithUV(minX, yd + 1.0 + 0.0, minZ, maxU, minV);
		tessellator.addVertexWithUV(minX, yd + 1.0 + 0.0, maxZ, minU, minV);
		tessellator.addVertexWithUV(minX, yd + 0.0, maxZ, minU, maxV);
		tessellator.addVertexWithUV(maxX, yd + 0.0, minZ, maxU, maxV);
		tessellator.addVertexWithUV(maxX, yd + 1.0 + 0.0, minZ, maxU, minV);
		tessellator.addVertexWithUV(maxX, yd + 1.0 + 0.0, minZ, minU, minV);
		tessellator.addVertexWithUV(maxX, yd + 0.0, minZ, minU, maxV);
		tessellator.addVertexWithUV(minX, yd + 0.0, maxZ, maxU, maxV);
		tessellator.addVertexWithUV(minX, yd + 1.0 + 0.0, maxZ, maxU, minV);
		return true;
	}

	@Override
	public boolean shouldItemRender3d() {
		return false;
	}

	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		if (data < 1 || data > 4) {
			data = 1;
		}
		if (side == Side.TOP || side == Side.BOTTOM) {
			return this.GROWTH_STAGE_TEXTURES_TOP[data - 1];
		}
		return this.GROWTH_STAGE_TEXTURES_SIDE[data - 1];
	}
}
