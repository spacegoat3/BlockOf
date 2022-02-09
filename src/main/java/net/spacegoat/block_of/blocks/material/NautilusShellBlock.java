package net.spacegoat.block_of.blocks.material;

import net.minecraft.block.BlockState;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegoat.block_of.blocks.BlockOfBlock;
import net.spacegoat.block_of.sounds.ModSoundEvents;

import java.util.Random;

public class NautilusShellBlock extends BlockOfBlock {
    public NautilusShellBlock(Settings settings){
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0){
            world.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, ModSoundEvents.NAUTILUS_SHELL_SOUNDS, SoundCategory.BLOCKS, 0.2f + random.nextFloat(), random.nextFloat() * 0.4F + 0.5F, false);
        }
    }
}
