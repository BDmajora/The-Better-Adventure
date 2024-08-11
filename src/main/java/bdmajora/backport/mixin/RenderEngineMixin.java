package bdmajora.backport.mixin;

import bdmajora.backport.block.DynamicTextures.DynamicTextureCrimsonStem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.client.render.texturepack.TexturePack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

import static bdmajora.backport.backport.MOD_ID;

@Mixin(value = RenderEngine.class, remap = false)
public abstract class RenderEngineMixin {

	@Shadow @Final
	private List<DynamicTexture> dynamicTextures;

	@Shadow @Final
	private Minecraft mc;

	@Inject(method = "initDynamicTextures", at = @At("TAIL"))
	private void addCustomDynamicTextures(CallbackInfo ci) {
		String texturePath = "/assets/" + MOD_ID + "/textures/block/crimson_stem.png";
		TexturePack texturePack = mc.texturePackList.getHighestPriorityTexturePackWithFile(texturePath);

		if (texturePack != null) {
			DynamicTextureCrimsonStem crimsonStemTexture = new DynamicTextureCrimsonStem(mc, texturePack);
			dynamicTextures.add(crimsonStemTexture);
		}
	}
}
