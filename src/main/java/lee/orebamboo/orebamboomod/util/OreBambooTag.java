package lee.orebamboo.orebamboomod.util;

import lee.orebamboo.orebamboomod.Orebamboomod;
import net.minecraft.block.Block;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagBuilder;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class OreBambooTag {
    public static final TagKey<Block> ORE_BAMBOO_PLANTABLE_ON = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Orebamboomod.MOD_ID,"ore_bamboo_plantable_on"));

}
