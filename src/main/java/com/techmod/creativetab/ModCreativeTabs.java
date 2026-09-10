package com.techmod.creativetab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.techmod.TechModMain;
import com.techmod.block.ModBlocks;
import com.techmod.item.ModItems;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            ForgeRegistries.CREATIVE_MODE_TABS, TechModMain.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TECH_MOD_TAB = CREATIVE_TABS.register("tech_tab",
            () -> CreativeModeTab.builder()
                    .title(net.minecraft.network.chat.Component.literal("Tech Mod"))
                    .withTabsBefore(CreativeModeTab.BUILDING_BLOCKS)
                    .icon(() -> ModBlocks.COAL_GENERATOR.get().asItem().getDefaultInstance())
                    .displayItems((enabledFeatures, output) -> {
                        // Blocks
                        output.accept(ModBlocks.COAL_GENERATOR.get().asItem());
                        output.accept(ModBlocks.ENERGY_CABLE.get().asItem());
                        output.accept(ModBlocks.ENERGY_STORAGE.get().asItem());
                        output.accept(ModBlocks.ELECTRIC_FURNACE.get().asItem());
                        output.accept(ModBlocks.COMPRESSOR.get().asItem());
                        output.accept(ModBlocks.CRUSHER.get().asItem());
                        output.accept(ModBlocks.TECH_CRAFTING_TABLE.get().asItem());
                        output.accept(ModBlocks.TECH_ORE.get().asItem());

                        // Items
                        output.accept(ModItems.TECH_DUST.get());
                        output.accept(ModItems.TECH_INGOT.get());
                        output.accept(ModItems.TECH_PLATE.get());
                        output.accept(ModItems.CIRCUIT.get());
                        output.accept(ModItems.ADVANCED_CIRCUIT.get());
                        output.accept(ModItems.ENERGY_CRYSTAL.get());
                        output.accept(ModItems.ENERGY_CELL.get());
                        output.accept(ModItems.TECH_PICKAXE.get());
                        output.accept(ModItems.TECH_DRILL.get());
                        output.accept(ModItems.WRENCH.get());
                        output.accept(ModItems.SPEED_UPGRADE.get());
                        output.accept(ModItems.EFFICIENCY_UPGRADE.get());
                        output.accept(ModItems.POWER_UPGRADE.get());
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_TABS.register(modEventBus);
    }
}
