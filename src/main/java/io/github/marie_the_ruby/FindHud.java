package io.github.marie_the_ruby;

import eu.midnightdust.lib.util.MidnightColorUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Hand;

public class FindHud {
	private static TextRenderer fontRenderer;
	public FindHud(MinecraftClient client) {
		fontRenderer = client.textRenderer;

	}
	public static void draw(MatrixStack matrixStack) {
		MatrixStack thing = new MatrixStack();

		// Get text rendering working right, it does not scale with the window.

		thing.scale(1f,1f,1f);
		if (FindConfig.anchor) {
			fontRenderer.drawWithShadow(thing, MinecraftClient.getInstance().player.getStackInHand(Hand.MAIN_HAND).getTranslationKey(), 0, 0, MidnightColorUtil.hex2Rgb(FindConfig.nameColor).getRGB());
		} else {
			fontRenderer.drawWithShadow(thing, MinecraftClient.getInstance().player.getStackInHand(Hand.MAIN_HAND).getTranslationKey(), 100, 100, MidnightColorUtil.hex2Rgb(FindConfig.nameColor).getRGB());
		}
	}
}
