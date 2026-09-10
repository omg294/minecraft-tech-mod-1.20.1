package com.techmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TechModConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.IntValue COAL_GENERATOR_POWER;
    public static final ForgeConfigSpec.IntValue ENERGY_CABLE_CAPACITY;
    public static final ForgeConfigSpec.IntValue ENERGY_STORAGE_CAPACITY;
    public static final ForgeConfigSpec.DoubleValue FURNACE_SPEED;
    public static final ForgeConfigSpec.DoubleValue COMPRESSOR_SPEED;
    public static final ForgeConfigSpec.DoubleValue CRUSHER_SPEED;

    static {
        BUILDER.push("energy");
        COAL_GENERATOR_POWER = BUILDER
                .comment("Power output of coal generator per tick")
                .defineInRange("coalGeneratorPower", 32, 1, 10000);
        ENERGY_CABLE_CAPACITY = BUILDER
                .comment("Energy cable transfer capacity per tick")
                .defineInRange("energyCableCapacity", 256, 1, 100000);
        ENERGY_STORAGE_CAPACITY = BUILDER
                .comment("Energy storage max capacity")
                .defineInRange("energyStorageCapacity", 100000, 1, 10000000);
        BUILDER.pop();

        BUILDER.push("machines");
        FURNACE_SPEED = BUILDER
                .comment("Electric furnace speed multiplier")
                .defineInRange("furnaceSpeed", 2.0, 0.5, 10.0);
        COMPRESSOR_SPEED = BUILDER
                .comment("Compressor speed multiplier")
                .defineInRange("compressorSpeed", 1.5, 0.5, 10.0);
        CRUSHER_SPEED = BUILDER
                .comment("Crusher speed multiplier")
                .defineInRange("crusherSpeed", 1.5, 0.5, 10.0);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
