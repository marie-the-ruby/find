package io.github.marie_the_ruby;

import net.minecraft.client.MinecraftClient;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class FindMain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "F.I.N.D";
	public static final Logger LOGGER = LoggerFactory.getLogger("F.I.N.D.");
	private static Thread requestThread;

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Does anyone actually read these?");
		FindConfig.init("F.I.N.D.", FindConfig.class);
		requestThread = new Thread() {
			public void run() {

				// MAKE THIS SHIT RUN BETTER

				while (true) try {
					Thread.sleep(100);
					if (MinecraftClient.getInstance().world != null) {

					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


		};
	}
}
