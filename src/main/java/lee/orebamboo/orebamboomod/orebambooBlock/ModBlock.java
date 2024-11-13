package lee.orebamboo.orebamboomod.orebambooBlock;

import lee.orebamboo.orebamboomod.Orebamboomod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static Block register(Block block,String name,boolean blockitem){
        Identifier id = Identifier.of(Orebamboomod.MOD_ID,name);

        if (blockitem){
            BlockItem blockItem = new BlockItem(block,new Item.Settings());
            Registry.register(Registries.ITEM,id,blockItem);
        }

        return Registry.register(Registries.BLOCK,id,block);
    }


    public static Block register_ore_bamboo(ModOreBamboo block,String name,Block bamboo_block,Block sapling){
        Identifier id = Identifier.of(Orebamboomod.MOD_ID,name);
        block.orebambooblock = bamboo_block;
        block.orebambooshootblock = sapling;
        return Registry.register(Registries.BLOCK,id,block);
    }

    public static Block register_ore_bamboo_sapling(ModOreBambooShootBlock block,String name,Block sapling,Item item){
        Identifier id = Identifier.of(Orebamboomod.MOD_ID,name);
        block.orebambooblock = sapling;
        block.orebambooshootitem = item;
        return Registry.register(Registries.BLOCK,id,block);
    }
}
