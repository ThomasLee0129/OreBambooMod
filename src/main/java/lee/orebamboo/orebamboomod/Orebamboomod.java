package lee.orebamboo.orebamboomod;

import lee.orebamboo.orebamboomod.orebambooitemGroup.ModItemGroup;
import lee.orebamboo.orebamboomod.orebambooBlock.ModBlockRegister;
import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.fabricmc.api.ModInitializer;

public class Orebamboomod implements ModInitializer {

    public static final String MOD_ID = "orebamboomod";
    //模組ID
    @Override
    public void onInitialize() {
        ModItemRegister.initialize();
        ModBlockRegister.initialize();
        ModItemGroup.initialize();
    }
}
