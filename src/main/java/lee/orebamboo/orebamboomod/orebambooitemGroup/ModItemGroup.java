package lee.orebamboo.orebamboomod.orebambooitemGroup;

import lee.orebamboo.orebamboomod.Orebamboomod;
import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> ORE_BAMBOO_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Orebamboomod.MOD_ID,"item_group"));
    public static final ItemGroup ORE_BAMBOO_ITEM_GROUP = FabricItemGroup.builder()
            .icon(()-> new ItemStack(ModItemRegister.BASE_ORE_BAMBOO))
            .displayName(Text.translatable("itemGroup.ore_bamboo_mod"))
            .build();



    public static void initialize(){
        Registry.register(Registries.ITEM_GROUP,ORE_BAMBOO_ITEM_GROUP_KEY,ORE_BAMBOO_ITEM_GROUP);
        //模組頁面註冊
        ItemGroupEvents.modifyEntriesEvent(ORE_BAMBOO_ITEM_GROUP_KEY).register(itemGroup -> {
                itemGroup.add(ModItemRegister.BASE_ORE_BAMBOO);
                itemGroup.add(ModItemRegister.POLYMER_BAMBOO);
                itemGroup.add(ModItemRegister.COAL_BAMBOO_ITEM);
            }
        );
    }
}
