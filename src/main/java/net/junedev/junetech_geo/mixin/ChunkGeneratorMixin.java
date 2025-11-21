package net.junedev.junetech_geo.mixin;

import net.junedev.junetech_geo.worldgen.chunk.JtGeOChunkGeneratorExtension;
import net.minecraft.world.level.chunk.ChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;

/**
 * Inject {@link JtGeOChunkGeneratorExtension} into all {@link ChunkGenerator}s
 */

@Mixin(ChunkGenerator.class)
public class ChunkGeneratorMixin implements JtGeOChunkGeneratorExtension {
}
