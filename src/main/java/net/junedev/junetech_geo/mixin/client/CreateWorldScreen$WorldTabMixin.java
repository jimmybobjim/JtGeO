package net.junedev.junetech_geo.mixin.client;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.junedev.junetech_geo.client.screen.JtGeOWorldPresetScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.layouts.GridLayout;
import net.minecraft.client.gui.layouts.LayoutElement;
import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;


@OnlyIn(Dist.CLIENT)
@Mixin(CreateWorldScreen.WorldTab.class)
public abstract class CreateWorldScreen$WorldTabMixin {
    @Unique
    private static final Component
            CUSTOM_STRATA_ENABLED = Component.translatable("junetech_geo.select_world.custom_strata_enabled"),
            CUSTOM_STRATA_DISABLED = Component.translatable("junetech_geo.select_world.custom_strata_disabled"),
            CUSTOMISE_STRATA = Component.translatable("junetech_geo.select_world.customise_strata");

    @Unique
    protected boolean customStrataEnabled = true;

    @WrapOperation(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/layouts/GridLayout$RowHelper;addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", ordinal = 1))
    private <T extends LayoutElement> T init(GridLayout.RowHelper rowHelper, T customizeButton, Operation<T> original, @Local(argsOnly = true) CreateWorldScreen createWorldScreen) {
        // Intellij thinks this gives an error for some reason, it still works fine
        T call = original.call(rowHelper, customizeButton);

        WorldCreationUiState uiState = createWorldScreen.getUiState();

        Button enableCustomStrata = rowHelper.addChild(Button.builder(CUSTOM_STRATA_ENABLED,
                button -> {
                    customStrataEnabled = !customStrataEnabled;
                    button.setMessage(customStrataEnabled ? CUSTOM_STRATA_ENABLED : CUSTOM_STRATA_DISABLED);
                    uiState.onChanged();
                }).build());
        Button customiseStrata = rowHelper.addChild(Button.builder(CUSTOMISE_STRATA,
                button -> {
                    createWorldScreen.getMinecraft().setScreen(new JtGeOWorldPresetScreen(createWorldScreen, uiState));
                }).build());

        uiState.addListener(state -> customiseStrata.active = customStrataEnabled);

        return call;
    }
}
