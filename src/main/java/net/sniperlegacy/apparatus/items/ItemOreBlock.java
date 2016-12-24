package net.sniperlegacy.apparatus.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Mike on 2016-12-23.
 */
public class ItemOreBlock extends ItemBlock {

    public ItemOreBlock(Block block)
    {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int i)
    {
        return i;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name = "";

        switch(itemstack.getItemDamage())
        {
            case 0:
                name = "CopperOre";
                break;
            case 1:
                name = "TinOre";
                break;
            default:
                name = "Unknown";
                break;
        }

        return getUnlocalizedName() + "." + name;
    }
}
