package net.MarkustheSlime.twosidesmod.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

public class MarkeHudOverlay {
    private static final ResourceLocation FILLED_ENERGY = new ResourceLocation(TwoSidesMod.MOD_ID,
            "textures/marke_energy/filled_energy.png");
    private static final ResourceLocation EMPTY_ENERGY = new ResourceLocation(TwoSidesMod.MOD_ID,
            "textures/marke_energy/empty_energy.png");

    public static final IGuiOverlay HUD_ENERGY = ((gui, poseStack, partialTick, width, height) -> {
        int x = width / 2;
        int y = height;

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, EMPTY_ENERGY);
        for (int i = 0; i < 10; i++) {
            GuiComponent.blit(poseStack, x - 94 + (i * 9), y - 54, 0, 0, 12, 12,
                    12, 12);
        }

        RenderSystem.setShaderTexture(0, FILLED_ENERGY);
        for (int i = 0; i < 10; i++) {
            if (ClientEnergyData.getPlayerEnergy() > i) {
                GuiComponent.blit(poseStack, x - 94 + (i * 9), y - 54, 0, 0, 12, 12,
                        12, 12);
            } else {
                break;
            }
        }
    });
}
