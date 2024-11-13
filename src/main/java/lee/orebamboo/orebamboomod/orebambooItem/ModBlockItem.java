package lee.orebamboo.orebamboomod.orebambooItem;

import lee.orebamboo.orebamboomod.Orebamboomod;
import lee.orebamboo.orebamboomod.orebambooBlock.ModBlockRegister;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockItem {

    public static Item register_blockitem(Block block,String id){
        Identifier itemID = Identifier.of(Orebamboomod.MOD_ID,id);
        BlockItem blockitem = new BlockItem(block,new Item.Settings());
        return Registry.register(Registries.ITEM,itemID,blockitem);
    }



}
