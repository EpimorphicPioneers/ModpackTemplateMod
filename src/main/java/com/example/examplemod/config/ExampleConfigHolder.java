package com.example.examplemod.config;

import com.example.examplemod.ExampleModCommon;

import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = ExampleModCommon.MODID)
public class ExampleConfigHolder {
    public static ExampleConfigHolder INSTANCE;

    public static void init() {
        if (INSTANCE == null) {
            INSTANCE = Configuration.registerConfig(ExampleConfigHolder.class, ConfigFormats.yaml())
                    .getConfigInstance();
        }
    }
}
