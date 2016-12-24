package net.sniperlegacy.apparatus.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.sniperlegacy.apparatus.Apparatus;
import net.sniperlegacy.apparatus.Document;
import net.sniperlegacy.apparatus.items.ItemRheniumIngot;
import net.sniperlegacy.apparatus.util.Utils;

/**
 * Created by Mike on 2016-12-21.
 */
public class ApparatusItems {
    public static Item m_rheniumIngot;

    public static void init() {
        m_rheniumIngot = new ItemRheniumIngot("rheniumIngot", "rheniumIngot");
        register();
    }

    public static Item initOreBlock(Item item, String name) {
        return item.setUnlocalizedName(name).setRegistryName("apparatus:" + name);
    }

    public static void register() {
        registerItem(m_rheniumIngot);
    }

    public static void registerItem(Item p_item) {
        p_item.setCreativeTab(Apparatus.m_apparatusCreativeTab);

        GameRegistry.register(p_item);
        Utils.getLogger().info("Registered p_item : " + p_item.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        registerRender(m_rheniumIngot);
    }

    public static void registerRender(Item p_item) {
        ModelLoader.setCustomModelResourceLocation(
                p_item, 0, new ModelResourceLocation(
                        new ResourceLocation(Document.MOD_ID, p_item.getUnlocalizedName().substring(5)),
                        "inventory"));
        Utils.getLogger().info("Registered render for " + p_item.getUnlocalizedName().substring(5));
    }
}
