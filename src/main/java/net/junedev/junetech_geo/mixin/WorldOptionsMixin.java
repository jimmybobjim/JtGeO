package net.junedev.junetech_geo.mixin;

import net.junedev.junetech_geo.worldgen.settings.StrataOptions;
import net.junedev.junetech_geo.worldgen.settings.WorldStrataOptions;
import net.minecraft.world.level.levelgen.WorldOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.function.UnaryOperator;

@Mixin(WorldOptions.class)
public class WorldOptionsMixin implements WorldStrataOptions {
    @Unique
    private StrataOptions strataOptions = StrataOptions.DEFAULT;

    @Override
    public StrataOptions getStrataOptions() {
        return strataOptions;
    }

    @Override
    public void setStrataOptions(UnaryOperator<StrataOptions> strataOptions) {
        this.strataOptions = strataOptions.apply(this.strataOptions);
    }
}
