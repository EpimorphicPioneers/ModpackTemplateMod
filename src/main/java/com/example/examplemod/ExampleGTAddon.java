package com.example.examplemod;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

@GTAddon
public class ExampleGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return ExampleMod.REGISTRATE;
    }

    @Override
    public void initializeAddon() {}

    @Override
    public String addonModId() {
        return ExampleMod.MODID;
    }
}
