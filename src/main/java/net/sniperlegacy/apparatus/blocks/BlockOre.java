package net.sniperlegacy.apparatus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.sniperlegacy.apparatus.Document;
import net.sniperlegacy.apparatus.util.OreTypes;
import net.sniperlegacy.apparatus.util.Utils;

import java.util.List;

/**
 * Created by Mike on 2016-12-23.
 */
public class BlockOre extends Block {

    public BlockOre(String p_unlocalizedName, String p_registryName)
    {
        super(Material.ROCK);
        setUnlocalizedName(p_unlocalizedName);
        setRegistryName(new ResourceLocation(Document.MOD_ID, p_registryName));
        setHardness(3F);
        setResistance(5F);
        Utils.getLogger().info("Created oreBlock with registry name : " + getRegistryName());
        Utils.getLogger().info("Created oreBlock with unlocalized name : " + getUnlocalizedName());
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateOre(this);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(BlockStateOre.typeProperty, OreTypes.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(BlockStateOre.typeProperty).ordinal();
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return getMetaFromState(state);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativetabs, List<ItemStack> list)
    {
        for(OreTypes ore : OreTypes.values())
        {
            list.add(new ItemStack(item, 1, ore.ordinal()));
        }
    }
}
