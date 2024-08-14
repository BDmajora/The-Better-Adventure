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

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initmagmaTexture(CallbackInfo ci) {
		String magmaPackTexture = "/assets/backport/textures/block/magma.png";
		TexturePack magmaPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(magmaPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, magmaPack, magmaPackTexture, "backport:block/magma", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initlanternTexture(CallbackInfo ci) {
		String lanternPackTexture = "/assets/backport/textures/block/lantern.png";
		TexturePack lanternPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(lanternPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, lanternPack, lanternPackTexture, "backport:block/lantern", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initsoulLanternTexture(CallbackInfo ci) {
		String soulLanternPackTexture = "/assets/backport/textures/block/soul_lantern.png";
		TexturePack soulLanternPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(soulLanternPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, soulLanternPack, soulLanternPackTexture, "backport:block/soul_lantern", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initcampfireTexture(CallbackInfo ci) {
		String campfirePackTexture = "/assets/backport/textures/block/campfire_fire.png";
		TexturePack campfirePack = mc.texturePackList.getHighestPriorityTexturePackWithFile(campfirePackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, campfirePack, campfirePackTexture, "backport:block/campfire_fire", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initcampfire_log_litTexture(CallbackInfo ci) {
		String campfire_log_litPackTexture = "/assets/backport/textures/block/campfire_log_lit.png";
		TexturePack campfire_log_litPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(campfire_log_litPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, campfire_log_litPack, campfire_log_litPackTexture, "backport:block/campfire_log_lit", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initsoulfireTexture(CallbackInfo ci) {
		String soulfirePackTexture = "/assets/backport/textures/block/soul_campfire_fire.png";
		TexturePack soulfirePack = mc.texturePackList.getHighestPriorityTexturePackWithFile(soulfirePackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, soulfirePack, soulfirePackTexture, "backport:block/soul_campfire_fire", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initsoul_campfire_log_litTexture(CallbackInfo ci) {
		String soul_campfire_log_litPackTexture = "/assets/backport/textures/block/soul_campfire_log_lit.png";
		TexturePack soul_campfire_log_litPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(soul_campfire_log_litPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, soul_campfire_log_litPack, soul_campfire_log_litPackTexture, "backport:block/soul_campfire_log_lit", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void initsculk_catalyst_side_bloomTexture(CallbackInfo ci) {
		String sculk_catalyst_side_bloomPackTexture = "/assets/backport/textures/block/sculk_catalyst_side_bloom.png";
		TexturePack sculk_catalyst_side_bloomPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_catalyst_side_bloomPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_catalyst_side_bloomPack, sculk_catalyst_side_bloomPackTexture, "backport:block/sculk_catalyst_side_bloom", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void sculk_catalyst_top_bloomTexture(CallbackInfo ci) {
		String sculk_catalyst_top_bloomPackTexture = "/assets/backport/textures/block/sculk_catalyst_top_bloom.png";
		TexturePack sculk_catalyst_top_bloomPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_catalyst_top_bloomPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_catalyst_top_bloomPack, sculk_catalyst_top_bloomPackTexture, "backport:block/sculk_catalyst_top_bloom", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void sculk_sensor_tendril_activeTexture(CallbackInfo ci) {
		String sculk_sensor_tendril_activePackTexture = "/assets/backport/textures/block/sculk_sensor_tendril_active.png";
		TexturePack sculk_sensor_tendril_activePack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_sensor_tendril_activePackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_sensor_tendril_activePack, sculk_sensor_tendril_activePackTexture, "backport:block/sculk_sensor_tendril_active", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void sculk_sensor_tendril_inactiveTexture(CallbackInfo ci) {
		String sculk_sensor_tendril_inactivePackTexture = "/assets/backport/textures/block/sculk_sensor_tendril_inactive.png";
		TexturePack sculk_sensor_tendril_inactivePack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_sensor_tendril_inactivePackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_sensor_tendril_inactivePack, sculk_sensor_tendril_inactivePackTexture, "backport:block/sculk_sensor_tendril_inactive", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void sculk_shrieker_can_summon_inner_topTexture(CallbackInfo ci) {
		String sculk_shrieker_can_summon_inner_topPackTexture = "/assets/backport/textures/block/sculk_shrieker_can_summon_inner_top.png";
		TexturePack sculk_shrieker_can_summon_inner_topPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_shrieker_can_summon_inner_topPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_shrieker_can_summon_inner_topPack, sculk_shrieker_can_summon_inner_topPackTexture, "backport:block/sculk_shrieker_can_summon_inner_top", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void sculk_shrieker_inner_topTexture(CallbackInfo ci) {
		String sculk_shrieker_inner_topPackTexture = "/assets/backport/textures/block/sculk_shrieker_inner_top.png";
		TexturePack sculk_shrieker_inner_topPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_shrieker_inner_topPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_shrieker_inner_topPack, sculk_shrieker_inner_topPackTexture, "backport:block/sculk_shrieker_inner_top", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void sculk_veinTexture(CallbackInfo ci) {
		String sculk_veinPackTexture = "/assets/backport/textures/block/sculk_vein.png";
		TexturePack sculk_veinPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(sculk_veinPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, sculk_veinPack, sculk_veinPackTexture, "backport:block/sculk_vein", false));
	}

	@Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
	public void stonecutterTexture(CallbackInfo ci) {
		String stonecutterPackTexture = "/assets/backport/textures/block/stonecutter_saw.png";
		TexturePack stonecutterPack = mc.texturePackList.getHighestPriorityTexturePackWithFile(stonecutterPackTexture);
		dynamicTextures.add(new DynamicTextureCustom(mc, stonecutterPack, stonecutterPackTexture, "backport:block/stonecutter_saw", false));
	}

	// Add more injections as needed
}
