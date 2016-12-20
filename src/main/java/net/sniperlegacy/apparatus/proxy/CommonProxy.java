package net.sniperlegacy.apparatus.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.sniperlegacy.apparatus.world.OreGenerator;

/**
 * Created by Mike on 2016-12-20.
 */
public class CommonProxy {

    public void registerWorldGenerators() {
        GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
    }

    public void registerRenders() {

    }
}
