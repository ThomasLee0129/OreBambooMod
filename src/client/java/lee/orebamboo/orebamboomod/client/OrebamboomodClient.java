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

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.COPPER_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.COPPER_BMABOO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.IRON_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.IRON_BMABOO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.GOLD_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.GOLD_BMABOO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.DIAMOND_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.DIAMOND_BMABOO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.NETHERITE_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.NETHERITE_BMABOO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.EMERALD_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.EMERALD_BMABOO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.LAPIS_LAZULI_BMABOO_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlockRegister.LAPIS_LAZULI_BMABOO, RenderLayer.getCutout());
    }
}
