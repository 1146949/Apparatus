package net.sniperlegacy.apparatus.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.sniperlegacy.apparatus.Apparatus;
import net.sniperlegacy.apparatus.Document;
import net.sniperlegacy.apparatus.util.Utils;
import net.sniperlegacy.apparatus.blocks.BlockRheniumOre;

/**
 * Created by Mike on 2016-12-20.
 */
public class ApparatusBlocks {

    public static Block m_rheniumOre;

    public static void init() {
        m_rheniumOre = new BlockRheniumOre("rheniumOre", "rheniumOre");
    }

    public static void register() {
        registerBlock(m_rheniumOre);
    }

    public static void registerBlock(Block p_block) {
        p_block.setCreativeTab(Apparatus.m_apparatusCreativeTab);

        GameRegistry.register(p_block);
        GameRegistry.register(new ItemBlock(p_block).setRegistryName(p_block.getRegistryName()));
        Utils.getLogger().info("Registered p_block : " + p_block.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        registerRender(m_rheniumOre);
    }

    public static void registerRender(Block p_block) {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(p_block), 0, new ModelResourceLocation(
                        new ResourceLocation(Document.MOD_ID, p_block.getUnlocalizedName().substring(5)),
                        "inventory"));
        Utils.getLogger().info("Registered render for " + p_block.getUnlocalizedName().substring(5));
    }
}
