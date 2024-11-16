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


    public static Block getBambooType(Enum type){
        switch (type){
            case bambooType.BAMBOO_COAL:
                return ModBlockRegister.COAL_BAMBOO;
            case bambooType.BAMBOO_COPPER:
                return ModBlockRegister.COPPER_BMABOO;
            case bambooType.BAMBOO_IRON:
                return ModBlockRegister.IRON_BMABOO;
            case bambooType.BAMBOO_GOLD:
                return ModBlockRegister.GOLD_BMABOO;
            case bambooType.BAMBOO_DIAMOND:
                return ModBlockRegister.DIAMOND_BMABOO;
            case bambooType.BAMBOO_NETHERITE:
                return ModBlockRegister.NETHERITE_BMABOO;
            case bambooType.BAMBOO_EMERALD:
                return ModBlockRegister.EMERALD_BMABOO;
            case bambooType.BAMBOO_LAPIS_LAZULI:
                return ModBlockRegister.LAPIS_LAZULI_BMABOO;
            default:
                return null;
        }

    }

    public static Block getBambooSaplingType(Enum type){
        switch (type){
            case bambooType.BAMBOO_COAL:
                return ModBlockRegister.COAL_BAMBOO_SAPLING;
            case bambooType.BAMBOO_COPPER:
                return ModBlockRegister.COPPER_BMABOO_SAPLING;
            case bambooType.BAMBOO_IRON:
                return ModBlockRegister.IRON_BMABOO_SAPLING;
            case bambooType.BAMBOO_GOLD:
                return ModBlockRegister.GOLD_BMABOO_SAPLING;
            case bambooType.BAMBOO_DIAMOND:
                return ModBlockRegister.DIAMOND_BMABOO_SAPLING;
            case bambooType.BAMBOO_NETHERITE:
                return ModBlockRegister.NETHERITE_BMABOO_SAPLING;
            case bambooType.BAMBOO_EMERALD:
                return ModBlockRegister.EMERALD_BMABOO_SAPLING;
            case bambooType.BAMBOO_LAPIS_LAZULI:
                return ModBlockRegister.LAPIS_LAZULI_BMABOO_SAPLING;
            default:
                return null;
        }
    }

    public static Item getBambooItem(Enum type){
        switch (type){
            case bambooType.BAMBOO_COAL:
                return ModItemRegister.COAL_BAMBOO_ITEM;
            case bambooType.BAMBOO_COPPER:
                return ModItemRegister.COPPER_BAMBOO_ITEM;
            case bambooType.BAMBOO_IRON:
                return ModItemRegister.IRON_BAMBOO_ITEM;
            case bambooType.BAMBOO_GOLD:
                return ModItemRegister.GOLD_BAMBOO_ITEM;
            case bambooType.BAMBOO_DIAMOND:
                return ModItemRegister.DIAMOND_BAMBOO_ITEM;
            case bambooType.BAMBOO_NETHERITE:
                return ModItemRegister.NETHERITE_BAMBOO_ITEM;
            case bambooType.BAMBOO_EMERALD:
                return ModItemRegister.EMERALD_BAMBOO_ITEM;
            case bambooType.BAMBOO_LAPIS_LAZULI:
                return ModItemRegister.LAPIS_LAZULI_BAMBOO_ITEM;
            default:
                return null;
        }
    }
}
