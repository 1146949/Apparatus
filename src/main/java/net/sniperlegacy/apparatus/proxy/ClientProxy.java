package net.sniperlegacy.apparatus.proxy;

import net.sniperlegacy.apparatus.init.ApparatusBlocks;

/**
 * Created by Mike on 2016-12-20.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ApparatusBlocks.registerRenders();
    }
}
