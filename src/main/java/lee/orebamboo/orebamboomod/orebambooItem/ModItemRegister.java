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
    public static final Item COPPER_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.COPPER_BMABOO_SAPLING,
            "copper_bamboo_item"
    );
    public static final Item IRON_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.IRON_BMABOO_SAPLING,
            "iron_bamboo_item"
    );
    public static final Item GOLD_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.GOLD_BMABOO_SAPLING,
            "gold_bamboo_item"
    );
    public static final Item DIAMOND_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.DIAMOND_BMABOO_SAPLING,
            "diamond_bamboo_item"
    );
    public static final Item NETHERITE_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.NETHERITE_BMABOO_SAPLING,
            "netherite_bamboo_item"
    );
    public static final Item EMERALD_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.EMERALD_BMABOO_SAPLING,
            "emerald_bamboo_item"
    );
    public static final Item LAPIS_LAZULI_BAMBOO_ITEM = ModBlockItem.register_blockitem(
            ModBlockRegister.LAPIS_LAZULI_BMABOO_SAPLING,
            "lapis_lazuli_bamboo_item"
    );
    public static void initialize(){}
}