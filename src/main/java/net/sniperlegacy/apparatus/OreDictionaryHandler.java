package net.sniperlegacy.apparatus;

import net.minecraftforge.oredict.OreDictionary;
import net.sniperlegacy.apparatus.init.ApparatusBlocks;
import net.sniperlegacy.apparatus.init.ApparatusItems;

/**
 * Created by Mike on 2016-12-20.
 */
public class OreDictionaryHandler {
    public static void registerOreDictionary() {
        OreDictionary.registerOre("oreRhenium", ApparatusBlocks.m_rheniumOre);
        OreDictionary.registerOre("ingotRhenium", ApparatusItems.m_rheniumIngot);
    }
}
