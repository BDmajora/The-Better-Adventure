package bdmajora.backport;


import bdmajora.backport.entity.models.FrogModel;
import net.fabricmc.api.ClientModInitializer;
import org.useless.dragonfly.helper.ModelHelper;
import org.useless.dragonfly.model.entity.BenchEntityModel;
import turniplabs.halplibe.helper.SoundHelper;

import static bdmajora.backport.backport.MOD_ID;

public class backportmodclient implements ClientModInitializer {

	public static final BenchEntityModel modelFrog = ModelHelper.getOrCreateEntityModel(MOD_ID, "entity/frog.geo.json", FrogModel.class);

	@Override
	public void onInitializeClient() {
		// Add streaming for the music disc
		SoundHelper.addStreaming(MOD_ID, "disc_pig_step.ogg");
		SoundHelper.addStreaming(MOD_ID, "music_disc_11.ogg");
		SoundHelper.addStreaming(MOD_ID, "music_disc_other_side.ogg");
		SoundHelper.addStreaming(MOD_ID, "music_disc_relic.ogg");
		SoundHelper.addStreaming(MOD_ID, "music_disc_5.ogg");
	}
}
