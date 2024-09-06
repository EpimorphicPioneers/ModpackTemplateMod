package com.example.examplemod;

import com.epimorphismmc.monomorphism.integration.registrate.MORegistrate;
import com.epimorphismmc.monomorphism.utility.DistLogger;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public interface ExampleMod {
    // Define mod id in a common place for everything to reference
    String MODID = "examplemod";

    String NAME = "Example Mod";

    Logger LOGGER = new DistLogger(NAME);

    MORegistrate REGISTRATE = MORegistrate.create(MODID);

    static ExampleMod instance() {
        return ExampleModCommon.instance;
    }

    static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, FormattingUtil.toLowerCaseUnder(path));
    }
}
