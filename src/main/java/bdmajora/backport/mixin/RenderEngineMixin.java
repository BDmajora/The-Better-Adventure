package bdmajora.backport.mixin;

import bdmajora.backport.block.DynamicTextures.DynamicTextureCrimsonStem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.texturepack.TexturePack;
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

	@Shadow
	public abstract TexturePack getTexturePack();

	@Shadow
	public abstract Minecraft getMinecraft();

	@Inject(method = "initDynamicTextures", at = @At("TAIL"))
	private void addCustomDynamicTextures(CallbackInfo ci) {
		Minecraft mc = getMinecraft();
		TexturePack texturePack = getTexturePack();

		String texturePath = MOD_ID + ":block/crimson_stem";

		DynamicTextureCrimsonStem crimsonStemTexture = new DynamicTextureCrimsonStem(mc, texturePack);
		dynamicTextures.add(crimsonStemTexture);
	}
}
