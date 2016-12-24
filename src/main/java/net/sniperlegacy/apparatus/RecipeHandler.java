package net.sniperlegacy.apparatus;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.sniperlegacy.apparatus.init.ApparatusBlocks;
import net.sniperlegacy.apparatus.init.ApparatusItems;
import net.sniperlegacy.apparatus.items.ItemRheniumIngot;

/**
 * Created by Mike on 2016-12-21.
 */
public class RecipeHandler {

    public static void registerAllRecipes() {
        registerCraftingRecipe();
        registerSmeltingRecipe();
    }

    public static void registerCraftingRecipe() {

    }

    public static void registerSmeltingRecipe() {
        GameRegistry.addSmelting(ApparatusBlocks.m_rheniumOre, new ItemStack(ApparatusItems.m_rheniumIngot), 1.0F);
        // TODO : Change ItemStack output to proper Item from State.
        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ApparatusBlocks.m_oreBlock, 1, 0), new ItemStack(ApparatusItems.m_rheniumIngot), 1.0F);
        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ApparatusBlocks.m_oreBlock, 1, 1), new ItemStack(ApparatusItems.m_rheniumIngot), 1.0F);
    }
}
