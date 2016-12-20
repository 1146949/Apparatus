package net.sniperlegacy.apparatus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.sniperlegacy.apparatus.util.Utils;
import net.sniperlegacy.apparatus.init.ApparatusBlocks;
import net.sniperlegacy.apparatus.proxy.CommonProxy;

import java.lang.reflect.Field;

/**
 * Created by Mike on 2016-12-20.
 */
@Mod(modid = Document.MOD_ID, name = Document.NAME, version = Document.VERSION)
public class Apparatus {

    @Instance(Document.MOD_ID)
    public static Apparatus m_instance;

    @SidedProxy(serverSide = Document.SERVER_PROXY, clientSide = Document.CLIENT_PROXY)
    public static CommonProxy proxy;

    public static ApparatusCreativeTab m_apparatusCreativeTab = new ApparatusCreativeTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent p_event) {
        Utils.getLogger().info("Pre initialization of " + Document.NAME);
        ApparatusBlocks.init();
        ApparatusBlocks.register();

        proxy.registerRenders();
    }

    @EventHandler
    public void init(FMLInitializationEvent p_event) {
        Utils.getLogger().info("Initialization of " + Document.NAME);

        proxy.registerWorldGenerators();
        OreDictionaryHandler.registerOreDictionary();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent p_event) {
        Utils.getLogger().info("Post initialization of " + Document.NAME);
    }
}
