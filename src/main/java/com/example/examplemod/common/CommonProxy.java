package com.example.examplemod.common;

import com.example.examplemod.ExampleMod;

import com.epimorphismmc.monomorphism.proxy.base.ICommonProxyBase;

public class CommonProxy implements ICommonProxyBase {

    public CommonProxy() {
        ExampleMod.logger().info("ExampleMod's Initialization Completed!");
    }

    @Override
    public void registerEventHandlers() {}

    @Override
    public void registerCapabilities() {}
}
