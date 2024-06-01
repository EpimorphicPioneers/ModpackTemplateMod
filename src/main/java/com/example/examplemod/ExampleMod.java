package com.example.examplemod;

import com.epimorphismmc.monomorphism.MOMod;
import com.epimorphismmc.monomorphism.datagen.MOProviderTypes;
import com.epimorphismmc.monomorphism.registry.registrate.MORegistrate;
import com.example.examplemod.client.ClientProxy;
import com.example.examplemod.common.CommonProxy;
import com.example.examplemod.config.ExampleConfigHolder;
import com.example.examplemod.data.ExampleLangHandler;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.lowdragmc.lowdraglib.networking.INetworking;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod extends MOMod<CommonProxy> {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";

    public static ExampleMod instance;

    public ExampleMod() {
        super();
    }

    @Override
    public String getModId() {
        return MODID;
    }

    @Override
    public String getModName() {
        return NAME;
    }

    @Override
    protected void onModConstructed() {
        instance = this;
        ExampleConfigHolder.init();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    protected CommonProxy createClientProxy() {
        return new ClientProxy();
    }

    @Override
    @OnlyIn(Dist.DEDICATED_SERVER)
    protected CommonProxy createServerProxy() {
        return new CommonProxy();
    }

    @Override
    public void addDataGenerator(MORegistrate registrate) {
        registrate.addDataGenerator(MOProviderTypes.MO_LANG, ExampleLangHandler::init);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, FormattingUtil.toLowerCaseUnder(path));
    }

    public static Logger logger() {
        return instance.getLogger();
    }

    public static CommonProxy proxy() {
        return instance.getProxy();
    }

    public static MORegistrate registrate() {
        return instance.getRegistrate();
    }

    public static INetworking network() {
        return instance.getNetwork();
    }

}
