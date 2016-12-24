package net.sniperlegacy.apparatus;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.sniperlegacy.apparatus.init.ApparatusBlocks;
import net.sniperlegacy.apparatus.init.ApparatusItems;

/**
 * Created by Mike on 2016-12-20.
 */
public class OreDictionaryHandler {
    public static void registerOreDictionary() {
        OreDictionary.registerOre("oreRhenium", ApparatusBlocks.m_rheniumOre);
        OreDictionary.registerOre("oreCopper", new ItemStack(Item.getItemFromBlock(ApparatusBlocks.m_oreBlock), 1, 1));
        OreDictionary.registerOre("oreTin", new ItemStack(Item.getItemFromBlock(ApparatusBlocks.m_oreBlock), 1, 1));
        OreDictionary.registerOre("ingotRhenium", ApparatusItems.m_rheniumIngot);
    }
}
