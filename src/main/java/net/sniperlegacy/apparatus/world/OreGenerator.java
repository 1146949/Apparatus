package net.sniperlegacy.apparatus.world;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.sniperlegacy.apparatus.Apparatus;
import net.sniperlegacy.apparatus.init.ApparatusBlocks;

import java.util.Random;

/**
 * Created by Mike on 2016-12-20.
 */
public class OreGenerator implements IWorldGenerator {

    private WorldGenerator rhenium;

    public OreGenerator() {
        rhenium = new WorldGenMinable(ApparatusBlocks.m_rheniumOre.getDefaultState(), 10);
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ,
                              int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight > 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal height arguments for OreGenerator");

        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(maxHeight);
            int z = chunkZ * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            runGenerator(rhenium, world, random, chunkX, chunkZ, 20, 0, 24);
        }
    }
}
