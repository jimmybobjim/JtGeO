package net.junedev.junetech_geo.mixin;

import net.junedev.junetech_geo.worldgen.chunk.JtGeOChunkStatus;
import net.minecraft.world.level.chunk.ChunkStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

/**
 * Replace the parent {@link ChunkStatus} of {@link ChunkStatus#SURFACE} with {@link JtGeOChunkStatus#STONE_REPLACER}
 */

@Mixin(ChunkStatus.class)
public class ChunkStatusMixin {
    @ModifyArg(
            method = "<clinit>",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/chunk/ChunkStatus;registerSimple(Ljava/lang/String;Lnet/minecraft/world/level/chunk/ChunkStatus;ILjava/util/EnumSet;Lnet/minecraft/world/level/chunk/ChunkStatus$ChunkType;Lnet/minecraft/world/level/chunk/ChunkStatus$SimpleGenerationTask;)Lnet/minecraft/world/level/chunk/ChunkStatus;", ordinal = 2),
            index = 1)
    private static ChunkStatus redirectSurfaceParent(ChunkStatus pParent) {
        return JtGeOChunkStatus.STONE_REPLACER;
    }
}
