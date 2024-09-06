package com.example.examplemod;

import com.example.examplemod.client.ExampleModClient;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleModCommon.MODID)
public class ExampleModBootstrap {
    public ExampleModBootstrap() {
        DistExecutor.unsafeRunForDist(() -> ExampleModClient::new, () -> ExampleModServer::new);
    }
}
