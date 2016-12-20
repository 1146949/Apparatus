package net.sniperlegacy.apparatus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.sniperlegacy.apparatus.init.ApparatusBlocks;

/**
 * Created by Mike on 2016-12-20.
 */
public class ApparatusCreativeTab extends CreativeTabs {

    public ApparatusCreativeTab() {
        super(Document.CREATIVE_TAB);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ApparatusBlocks.m_rheniumOre);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ApparatusBlocks.m_rheniumOre);
    }
}
