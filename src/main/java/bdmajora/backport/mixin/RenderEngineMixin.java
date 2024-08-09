package bdmajora.backport.mixin;

import bdmajora.backport.block.DynamicTextures.DynamicTextureCrimsonStem;
import net.minecraft.client.render.RenderEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

import static bdmajora.backport.backport.MOD_ID;

@Mixin(value = RenderEngine.class, remap = false) // Corrected the attribute to 'remap'
public abstract class RenderEngineMixin {

	@Shadow
	private List<Object> dynamicTextures;

	@Inject(method = "initDynamicTextures", at = @At("TAIL"))
	private void addCustomDynamicTextures(CallbackInfo ci) {
		String texturePath = MOD_ID + ":block/warped_stem"; // Replace with the actual texture path
		int textureId = 1; // Replace with the actual texture ID

		DynamicTextureCrimsonStem crimsonStemTexture = new DynamicTextureCrimsonStem();
		dynamicTextures.add(crimsonStemTexture);
	}
}
