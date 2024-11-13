package lee.orebamboo.orebamboomod.orebambooBlock;

import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlockRegister {
    public static final Block
        COAL_BAMBOO_SAPLING,
        COAL_BAMBOO;

    static {
        COAL_BAMBOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO)),"coal_bamboo",false);
        COAL_BAMBOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING)),"coal_bamboo_sapling",false);


    }


    public static void initialize(){
    }
}
