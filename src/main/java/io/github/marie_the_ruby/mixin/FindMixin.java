package io.github.marie_the_ruby.mixin;

import io.github.marie_the_ruby.FindHud;
import io.github.marie_the_ruby.FindMain;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.IOException;


@Environment(EnvType.CLIENT)
@Mixin(value = InGameHud.class)
public abstract class FindMixin {
		private FindHud findHud;

		@Shadow
		@Final
		private MinecraftClient client;

		@Inject(method = "<init>(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/client/render/item/ItemRenderer;)V", at = @At(value = "RETURN"))
		private void onInit(MinecraftClient client, ItemRenderer itemRenderer, CallbackInfo ci) throws IOException
		{
			this.findHud = new FindHud(client);
		}

		@Inject(method = "render", at = @At("HEAD"))
		private void onDraw(MatrixStack matrixStack, float esp, CallbackInfo ci)
		{
			if (!MinecraftClient.getInstance().options.debugEnabled)
				FindHud.draw(matrixStack);
		}
	}
