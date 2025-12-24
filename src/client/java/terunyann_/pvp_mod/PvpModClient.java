package terunyann_.pvp_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import terunyann_.pvp_mod.registry.Blocks;


public class PvpModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        BlockRenderLayerMap.putBlock(Blocks.BORDER_BLOCK, BlockRenderLayer.TRANSLUCENT);
    }
}