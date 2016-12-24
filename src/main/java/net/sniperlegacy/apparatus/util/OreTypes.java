package net.sniperlegacy.apparatus.util;

import net.minecraft.util.IStringSerializable;

/**
 * Created by Mike on 2016-12-23.
 */
public enum OreTypes implements IStringSerializable {
    Copper,
    Tin;

    @Override
    public String getName()
    {
        return name().toLowerCase();
    }
}
