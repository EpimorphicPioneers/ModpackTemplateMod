package com.example.examplemod.common;

import com.epimorphismmc.monomorphism.proxy.base.ICommonProxyBase;
import com.example.examplemod.ExampleMod;

public class CommonProxy implements ICommonProxyBase {

    public CommonProxy() {
        ExampleMod.logger().info("ExampleMod's Initialization Completed!");
    }

    @Override
    public void registerEventHandlers() {

    }

    @Override
    public void registerCapabilities() {

    }
}
