package bdmajora.backport.block.BedModels;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;

public class BlockModelLightblueBed<T extends Block> extends BlockModelBed<T> {
	public BlockModelLightblueBed(Block block) {
		super(block);
		this.atlasIndices[0] = TextureRegistry.getTexture("backport:block/bed/bed_lightblue_foot_front");
		this.atlasIndices[1] = TextureRegistry.getTexture("backport:block/bed/bed_lightblue_foot_side");
		this.atlasIndices[2] = TextureRegistry.getTexture("backport:block/bed/bed_lightblue_foot_top");
		this.atlasIndices[3] = TextureRegistry.getTexture("minecraft:block/bed_head_front");
		this.atlasIndices[4] = TextureRegistry.getTexture("backport:block/bed/bed_lightblue_head_side");
		this.atlasIndices[5] = TextureRegistry.getTexture("backport:block/bed/bed_lightblue_head_top");
	}
}
