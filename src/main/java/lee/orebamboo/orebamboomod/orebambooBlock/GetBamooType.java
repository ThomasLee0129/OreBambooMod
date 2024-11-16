package lee.orebamboo.orebamboomod.orebambooBlock;

import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class GetBamooType {

    public enum bambooType{
        BAMBOO_COAL,
        BAMBOO_COPPER,
        BAMBOO_IRON,
        BAMBOO_GOLD,
        BAMBOO_DIAMOND,
        BAMBOO_NETHERITE,
        BAMBOO_EMERALD,
        BAMBOO_LAPIS_LAZULI,
    }


    public static Block getBambooType(Enum<bambooType> type){
        return switch (type) {
            case bambooType.BAMBOO_COAL -> ModBlockRegister.COAL_BAMBOO;
            case bambooType.BAMBOO_COPPER -> ModBlockRegister.COPPER_BMABOO;
            case bambooType.BAMBOO_IRON -> ModBlockRegister.IRON_BMABOO;
            case bambooType.BAMBOO_GOLD -> ModBlockRegister.GOLD_BMABOO;
            case bambooType.BAMBOO_DIAMOND -> ModBlockRegister.DIAMOND_BMABOO;
            case bambooType.BAMBOO_NETHERITE -> ModBlockRegister.NETHERITE_BMABOO;
            case bambooType.BAMBOO_EMERALD -> ModBlockRegister.EMERALD_BMABOO;
            case bambooType.BAMBOO_LAPIS_LAZULI -> ModBlockRegister.LAPIS_LAZULI_BMABOO;
            default -> null;
        };

    }

    public static Block getBambooSaplingType(Enum<bambooType> type){
        return switch (type) {
            case bambooType.BAMBOO_COAL -> ModBlockRegister.COAL_BAMBOO_SAPLING;
            case bambooType.BAMBOO_COPPER -> ModBlockRegister.COPPER_BMABOO_SAPLING;
            case bambooType.BAMBOO_IRON -> ModBlockRegister.IRON_BMABOO_SAPLING;
            case bambooType.BAMBOO_GOLD -> ModBlockRegister.GOLD_BMABOO_SAPLING;
            case bambooType.BAMBOO_DIAMOND -> ModBlockRegister.DIAMOND_BMABOO_SAPLING;
            case bambooType.BAMBOO_NETHERITE -> ModBlockRegister.NETHERITE_BMABOO_SAPLING;
            case bambooType.BAMBOO_EMERALD -> ModBlockRegister.EMERALD_BMABOO_SAPLING;
            case bambooType.BAMBOO_LAPIS_LAZULI -> ModBlockRegister.LAPIS_LAZULI_BMABOO_SAPLING;
            default -> null;
        };
    }

    public static Item getBambooItem(Enum<bambooType> type){
        return switch (type) {
            case bambooType.BAMBOO_COAL -> ModItemRegister.COAL_BAMBOO_ITEM;
            case bambooType.BAMBOO_COPPER -> ModItemRegister.COPPER_BAMBOO_ITEM;
            case bambooType.BAMBOO_IRON -> ModItemRegister.IRON_BAMBOO_ITEM;
            case bambooType.BAMBOO_GOLD -> ModItemRegister.GOLD_BAMBOO_ITEM;
            case bambooType.BAMBOO_DIAMOND -> ModItemRegister.DIAMOND_BAMBOO_ITEM;
            case bambooType.BAMBOO_NETHERITE -> ModItemRegister.NETHERITE_BAMBOO_ITEM;
            case bambooType.BAMBOO_EMERALD -> ModItemRegister.EMERALD_BAMBOO_ITEM;
            case bambooType.BAMBOO_LAPIS_LAZULI -> ModItemRegister.LAPIS_LAZULI_BAMBOO_ITEM;
            default -> null;
        };
    }
}
