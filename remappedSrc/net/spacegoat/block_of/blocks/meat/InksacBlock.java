package net.spacegoat.block_of.blocks.meat;

import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class InksacBlock extends MeatBlock {
    public InksacBlock(Settings settings){
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random){
        if (random.nextInt(5) == 0){
            for (int i = 0; i < random.nextInt(1) + 1; i++){
                if (state.isOf(MeatBlocks.INKSAC_BLOCK)){
                    addCampfireParticle(world, pos, ParticleTypes.SQUID_INK);
                }
            }
        }
    }
}
