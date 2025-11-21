package net.junedev.junetech_geo.client.screen;

import net.junedev.junetech_geo.worldgen.settings.StrataOptions;
import net.junedev.junetech_geo.worldgen.settings.WorldStrataOptions;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.OptionsList;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class JtGeOWorldPresetScreen extends Screen {
    private final CreateWorldScreen parent;
    private final WorldCreationUiState state;

    private OptionsList options;
    private OptionInstance<Boolean> test;

    public JtGeOWorldPresetScreen(CreateWorldScreen parent, WorldCreationUiState state) {
        super(Component.translatable("junetech_geo.tooltip.create_world.title"));

        this.parent = parent;
        this.state = state;
    }

    @Override
    protected void init() {
        assert minecraft != null;

        StrataOptions strataOptions = getCurrentStrataOptions();

        options = new OptionsList(minecraft, width, height, 32, height-32, 25);

        options.addBig(
                test = OptionInstance.createBoolean("junetech_geo.create_world.test", strataOptions.test(), val -> {})
        );

        addWidget(options);

        addRenderableWidget(Button.builder(CommonComponents.GUI_DONE, button -> {
            applySettings();
            minecraft.setScreen(parent);
        }).bounds(width/2-155, height-28, 150, 20).build());
        addRenderableWidget(Button.builder(CommonComponents.GUI_CANCEL, button -> {
            minecraft.setScreen(parent);
        }).bounds(width/2+5, height-28, 150, 20).build());
    }

    private void applySettings() {
        state.setSettings(state.getSettings().withOptions(worldOptions -> {
            WorldStrataOptions.from(worldOptions).setStrataOptions(this::getNewStrataOptions);
            return worldOptions;
        }));
    }

    private StrataOptions getNewStrataOptions(StrataOptions old) {
        return new StrataOptions(
                test.get()
        );
    }

    private StrataOptions getCurrentStrataOptions() {
        return WorldStrataOptions.from(state.getSettings().options()).getStrataOptions();
    }

    @Override
    public void onClose() {
        assert minecraft != null;
        minecraft.setScreen(parent);
    }

    @Override
    public void render(@NotNull GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pGuiGraphics);
        options.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        pGuiGraphics.drawCenteredString(font, title, width/2, 8, 16777215);
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
    }
}
