package bdmajora.backport.block.Crops.Models;

import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;

import static bdmajora.backport.backport.MOD_ID;

public class BlockModelCropsPotato<T extends Block> extends BlockModelStandard<T> {
	public final IconCoordinate[] growthStageTextures = new IconCoordinate[]{
		TextureRegistry.getTexture(MOD_ID + ":block/potato_growing_01"),
		TextureRegistry.getTexture(MOD_ID + ":block/potato_growing_02"),
		TextureRegistry.getTexture(MOD_ID + ":block/potato_growing_03"),
		TextureRegistry.getTexture(MOD_ID + ":block/potato_growing_04")
	};

	public BlockModelCropsPotato(Block block) {
		super(block);
	}

	public boolean render(Tessellator tessellator, int x, int y, int z) {
		this.block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);
		float brightness = 1.0F;
		tessellator.setColorOpaque_F(brightness, brightness, brightness);

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

	public boolean shouldItemRender3d() {
		return false;
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		return this.growthStageTextures[MathHelper.clamp(data, 0, 3)];
	}
}
