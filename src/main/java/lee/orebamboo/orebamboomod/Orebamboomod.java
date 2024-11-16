package lee.orebamboo.orebamboomod;

import lee.orebamboo.orebamboomod.orebambooitemGroup.ModItemGroup;
import lee.orebamboo.orebamboomod.orebambooBlock.ModBlockRegister;
import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class Orebamboomod implements ModInitializer {

    public static final String MOD_ID = "orebamboomod";
    //模組ID
    @Override
    public void onInitialize() {
        ModItemRegister.initialize();
        ModBlockRegister.initialize();
        ModItemGroup.initialize();

        FuelRegistry.INSTANCE.add(ModItemRegister.COAL_BAMBOO_ITEM,2000);
        FuelRegistry.INSTANCE.add(ModItemRegister.GOLD_BAMBOO_ITEM,3200);
        FuelRegistry.INSTANCE.add(ModItemRegister.DIAMOND_BAMBOO_ITEM,4800);
        FuelRegistry.INSTANCE.add(ModItemRegister.EMERALD_BAMBOO_ITEM,6400);
        FuelRegistry.INSTANCE.add(ModItemRegister.NETHERITE_BAMBOO_ITEM,7200);

    }
}
