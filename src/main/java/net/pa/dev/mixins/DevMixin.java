package net.pa.dev.mixins;

import net.minecraft.client.gui.screen.TitleScreen;
import net.pa.dev.Dev;
import org.spongepowered.asm.mixin.Mixin;

/**
 * Initializing The Mixin
 */

@Mixin(TitleScreen.class)
public class DevMixin {}