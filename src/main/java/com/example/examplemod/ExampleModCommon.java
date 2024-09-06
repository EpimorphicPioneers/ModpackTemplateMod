package com.example.examplemod;

import com.epimorphismmc.monomorphism.integration.registrate.providers.MOProviderTypes;
import com.example.examplemod.config.ExampleConfigHolder;
import com.example.examplemod.data.ExampleLangHandler;

public class ExampleModCommon implements ExampleMod {

    public static ExampleModCommon instance;

    public ExampleModCommon() {
        super();
        instance = this;
        ExampleConfigHolder.init();
        REGISTRATE.addDataGenerator(MOProviderTypes.MO_LANG, ExampleLangHandler::init);

        LOGGER.info("ExampleMod's Initialization Completed!");
    }
}
