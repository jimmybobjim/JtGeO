package net.junedev.junetech_geo.mixin;

import com.google.common.collect.ImmutableList;
import net.junedev.junetech_geo.worldgen.chunk.JtGeOChunkStatus;
import net.minecraft.server.commands.ResetChunksCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Ensure the stone replacer is ran in the {@link ResetChunksCommand}
 */

@Mixin(ResetChunksCommand.class)
public class ResetChunksCommandMixin {
    @Redirect( method = "resetChunks", at = @At(value = "INVOKE", target = "Lcom/google/common/collect/ImmutableList;of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;", remap = false))
    private static <E> ImmutableList<Object> resetChunks(E biomes, E noise, E surface, E carvers, E features, E initializeLight) {
        return ImmutableList.of(biomes, JtGeOChunkStatus.STONE_REPLACER, noise, surface, carvers, features, initializeLight);
    }
}
