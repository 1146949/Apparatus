package net.sniperlegacy.apparatus.blocks;

import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.sniperlegacy.apparatus.util.OreTypes;

/**
 * Created by Mike on 2016-12-23.
 */
public class BlockStateOre extends BlockStateContainer {

    public static final PropertyEnum<OreTypes> typeProperty = PropertyEnum.create("type", OreTypes.class);

    public BlockStateOre(BlockOre block)
    {
        super(block, typeProperty);
    }
}
