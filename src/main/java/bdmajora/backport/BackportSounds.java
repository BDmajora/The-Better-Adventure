package bdmajora.backport;

import turniplabs.halplibe.helper.SoundHelper;

public class BackportSounds {

	private static final String MOD_ID = "backport";

	public static void init() {
		// Registering CaveCliff sounds
		SoundHelper.addSound(MOD_ID, "goathorn1.ogg");
		SoundHelper.addSound(MOD_ID, "goathorn2.ogg");
		SoundHelper.addSound(MOD_ID, "goathorn3.ogg");
		SoundHelper.addSound(MOD_ID, "goathorn4.ogg");

		SoundHelper.addSound(MOD_ID, "goatidle1.ogg");
		SoundHelper.addSound(MOD_ID, "goatidle2.ogg");
		SoundHelper.addSound(MOD_ID, "goatidle3.ogg");

		SoundHelper.addSound(MOD_ID, "goatdeath1.ogg");
		SoundHelper.addSound(MOD_ID, "goatdeath2.ogg");
		SoundHelper.addSound(MOD_ID, "goatdeath3.ogg");

		SoundHelper.addSound(MOD_ID, "axolotlidle1.ogg");
		SoundHelper.addSound(MOD_ID, "axolotlidle2.ogg");

		SoundHelper.addSound(MOD_ID, "axolotlhurt1.ogg");
		SoundHelper.addSound(MOD_ID, "axolotlhurt2.ogg");

		SoundHelper.addSound(MOD_ID, "axolotldeath1.ogg");
		SoundHelper.addSound(MOD_ID, "axolotldeath2.ogg");

		// Registering Parrot sounds directly
		SoundHelper.addSound(MOD_ID, "parrotidle1.ogg");
		SoundHelper.addSound(MOD_ID, "parrotidle2.ogg");
		SoundHelper.addSound(MOD_ID, "parrotidle3.ogg");
		SoundHelper.addSound(MOD_ID, "parrotidle4.ogg");

		SoundHelper.addSound(MOD_ID, "parrothurt1.ogg");
		SoundHelper.addSound(MOD_ID, "parrothurt2.ogg");

		SoundHelper.addSound(MOD_ID, "parrotdeath1.ogg");
		SoundHelper.addSound(MOD_ID, "parrotdeath2.ogg");
	}
}
