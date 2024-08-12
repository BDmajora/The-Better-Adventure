package bdmajora.backport.mixin;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.client.render.dynamictexture.DynamicTextureCustom;
import net.minecraft.client.render.texturepack.TexturePack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = RenderEngine.class, remap = false)
public abstract class RenderEngineMixin {
	@Shadow private List<DynamicTexture> dynamicTextures;
	@Shadow @Final public Minecraft mc;

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initcrimsonStemTexture(CallbackInfo ci) {
		String crimsonStemTexture = "/assets/backport/textures/block/crimson_stem.png";
		TexturePack crimsonStemPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(crimsonStemTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, crimsonStemPack, crimsonStemTexture, "backport:block/crimson_stem", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initwarpedStemTexture(CallbackInfo ci) {
		String warpedStemPackTexture = "/assets/backport/textures/block/warped_stem.png";
		TexturePack warpedStemPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(warpedStemPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, warpedStemPack, warpedStemPackTexture, "backport:block/warped_stem", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initseaLanternTexture(CallbackInfo ci) {
		String seaLanternPackTexture = "/assets/backport/textures/block/sea_lantern.png";
		TexturePack seaLanternPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(seaLanternPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, seaLanternPack, seaLanternPackTexture, "backport:block/sea_lantern", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initsculkTexture(CallbackInfo ci) {
		String sculkPackTexture = "/assets/backport/textures/block/sculk.png";
		TexturePack sculkPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculkPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculkPack, sculkPackTexture, "backport:block/sculk", false));
	}

	// Add more injections as needed
}
