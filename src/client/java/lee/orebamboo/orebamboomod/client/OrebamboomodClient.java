package lee.orebamboo.orebamboomod.client;

import lee.orebamboo.orebamboomod.orebambooBlock.ModBlockRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class OrebamboomodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.COAL_BAMBOO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.COAL_BAMBOO, RenderLayer.getCutout());
    }
}
