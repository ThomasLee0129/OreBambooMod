package lee.orebamboo.orebamboomod.orebambooItem;

import lee.orebamboo.orebamboomod.Orebamboomod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static Item register(Item item,String id){
        Identifier itemID = Identifier.of(Orebamboomod.MOD_ID,id);
        Item registeredItem = Registry.register(Registries.ITEM,itemID,item);
        return registeredItem;
    }


}
