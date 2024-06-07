package com.example.examplemod.client;

import com.epimorphismmc.monomorphism.proxy.base.IClientProxyBase;
import com.example.examplemod.common.CommonProxy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends CommonProxy implements IClientProxyBase {
    public ClientProxy() {
        super();
    }

}
