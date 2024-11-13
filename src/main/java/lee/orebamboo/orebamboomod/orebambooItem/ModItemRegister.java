package lee.orebamboo.orebamboomod.orebambooItem;

import lee.orebamboo.orebamboomod.orebambooBlock.ModBlockRegister;
import net.minecraft.item.Item;

public class ModItemRegister {
    public static final Item BASE_ORE_BAMBOO = ModItem.register(
            new Item(new Item.Settings()),
            "base_ore_bamboo"
    );
    public static final Item POLYMER_BAMBOO = ModItem.register(
            new Item(new Item.Settings()),
            "polymer_bamboo"
    );
    public static final Item COAL_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.COAL_BAMBOO_SAPLING,
            "coal_bamboo_item"
    );

    public static void initialize(){}
}