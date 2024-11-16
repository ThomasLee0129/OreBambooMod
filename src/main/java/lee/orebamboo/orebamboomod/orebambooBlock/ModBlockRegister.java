package lee.orebamboo.orebamboomod.orebambooBlock;

import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlockRegister {
    public static final Block
        COAL_BAMBOO_SAPLING,
        COAL_BAMBOO,
        COPPER_BMABOO_SAPLING,
        COPPER_BMABOO,
        IRON_BMABOO_SAPLING,
        IRON_BMABOO,
        GOLD_BMABOO_SAPLING,
        GOLD_BMABOO,
        DIAMOND_BMABOO_SAPLING,
        DIAMOND_BMABOO,
        NETHERITE_BMABOO_SAPLING,
        NETHERITE_BMABOO,
        EMERALD_BMABOO_SAPLING,
        EMERALD_BMABOO,
        LAPIS_LAZULI_BMABOO_SAPLING,
        LAPIS_LAZULI_BMABOO;

    static {
        COAL_BAMBOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_COAL),"coal_bamboo",false);
        COAL_BAMBOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_COAL),"coal_bamboo_sapling",false);

        COPPER_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_COPPER),"copper_bamboo",false);
        COPPER_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_COPPER),"copper_bamboo_sapling",false);

        IRON_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_IRON),"iron_bamboo",false);
        IRON_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_IRON),"iron_bamboo_sapling",false);

        GOLD_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_GOLD),"gold_bamboo",false);
        GOLD_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_GOLD),"gold_bamboo_sapling",false);

        DIAMOND_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_DIAMOND),"diamond_bamboo",false);
        DIAMOND_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_DIAMOND),"diamond_bamboo_sapling",false);

        NETHERITE_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_NETHERITE),"netherite_bamboo",false);
        NETHERITE_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_NETHERITE),"netherite_bamboo_sapling",false);

        EMERALD_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_EMERALD),"emerald_bamboo",false);
        EMERALD_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_EMERALD),"emerald_bamboo_sapling",false);

        LAPIS_LAZULI_BMABOO = ModBlock.register(new ModOreBamboo(AbstractBlock.Settings.copy(Blocks.BAMBOO),GetBamooType.bambooType.BAMBOO_LAPIS_LAZULI),"lapis_lazuli_bamboo",false);
        LAPIS_LAZULI_BMABOO_SAPLING = ModBlock.register(new ModOreBambooShootBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SAPLING),GetBamooType.bambooType.BAMBOO_LAPIS_LAZULI),"lapis_lazuli_bamboo_sapling",false);
    }


    public static void initialize(){
    }
}
