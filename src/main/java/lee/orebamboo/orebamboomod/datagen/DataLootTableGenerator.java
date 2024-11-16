package lee.orebamboo.orebamboomod.datagen;

import lee.orebamboo.orebamboomod.orebambooBlock.ModBlockRegister;
import lee.orebamboo.orebamboomod.orebambooItem.ModItemRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DataLootTableGenerator extends FabricBlockLootTableProvider {

    public DataLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataOutput,registryLookup);
    }
    @Override
    public void generate(){

        addDrop(ModBlockRegister.COAL_BAMBOO,drops(ModItemRegister.COAL_BAMBOO_ITEM));
        addDrop(ModBlockRegister.COAL_BAMBOO_SAPLING,drops(ModItemRegister.COAL_BAMBOO_ITEM));

        addDrop(ModBlockRegister.COPPER_BMABOO,drops(ModItemRegister.COPPER_BAMBOO_ITEM));
        addDrop(ModBlockRegister.COPPER_BMABOO_SAPLING,drops(ModItemRegister.COPPER_BAMBOO_ITEM));

        addDrop(ModBlockRegister.IRON_BMABOO,drops(ModItemRegister.IRON_BAMBOO_ITEM));
        addDrop(ModBlockRegister.IRON_BMABOO_SAPLING,drops(ModItemRegister.IRON_BAMBOO_ITEM));

        addDrop(ModBlockRegister.GOLD_BMABOO,drops(ModItemRegister.GOLD_BAMBOO_ITEM));
        addDrop(ModBlockRegister.GOLD_BMABOO_SAPLING,drops(ModItemRegister.GOLD_BAMBOO_ITEM));

        addDrop(ModBlockRegister.DIAMOND_BMABOO,drops(ModItemRegister.DIAMOND_BAMBOO_ITEM));
        addDrop(ModBlockRegister.DIAMOND_BMABOO_SAPLING,drops(ModItemRegister.DIAMOND_BAMBOO_ITEM));

        addDrop(ModBlockRegister.EMERALD_BMABOO,drops(ModItemRegister.EMERALD_BAMBOO_ITEM));
        addDrop(ModBlockRegister.EMERALD_BMABOO_SAPLING,drops(ModItemRegister.EMERALD_BAMBOO_ITEM));

        addDrop(ModBlockRegister.NETHERITE_BMABOO,drops(ModItemRegister.NETHERITE_BAMBOO_ITEM));
        addDrop(ModBlockRegister.NETHERITE_BMABOO_SAPLING,drops(ModItemRegister.NETHERITE_BAMBOO_ITEM));

        addDrop(ModBlockRegister.LAPIS_LAZULI_BMABOO,drops(ModItemRegister.LAPIS_LAZULI_BAMBOO_ITEM));
        addDrop(ModBlockRegister.LAPIS_LAZULI_BMABOO_SAPLING,drops(ModItemRegister.LAPIS_LAZULI_BAMBOO_ITEM));
    }

    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack myPack = fabricDataGenerator.createPack();
        myPack.addProvider(DataLootTableGenerator::new);
    }
}
