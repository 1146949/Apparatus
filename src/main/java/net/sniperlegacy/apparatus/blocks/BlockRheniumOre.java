package net.sniperlegacy.apparatus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.sniperlegacy.apparatus.Document;

import java.util.Random;

/**
 * Created by Mike on 2016-12-20.
 */
public class BlockRheniumOre extends Block {

    public BlockRheniumOre(String p_unlocalizedName, String p_registryName) {
        super(Material.ROCK);
        this.setUnlocalizedName(p_unlocalizedName);
        this.setRegistryName(new ResourceLocation(Document.MOD_ID, p_registryName));
        this.setHardness(3F);
        this.setResistance(5F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState p_state, Random p_rand, int p_fortune) {
        return Item.getItemFromBlock(this);
    }
}
