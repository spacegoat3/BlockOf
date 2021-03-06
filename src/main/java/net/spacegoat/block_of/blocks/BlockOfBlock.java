package net.spacegoat.block_of.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOfBlock extends Block {
    public BlockOfBlock(Settings settings){
        super(settings);
    }

    public static void setBlocks(World world, BlockPos pos, Block block, Block newState){
        replace(block.getDefaultState(), newState.getDefaultState(), world, pos, NOTIFY_ALL);
    }

    //Spawns particles similar to Campfire Block.
    public static void addCampfireParticle(World world, BlockPos pos, ParticleEffect particle){
        Random random = world.random;
        world.addParticle(particle,  pos.getX(), pos.getY(), pos.getZ(), random.nextFloat() / 2.0F, 5.0E-5, random.nextFloat() / 2.0F);
    }

    public static void playerPlaySoundWhenClicked(SoundEvent soundEvent, int volume, PlayerEntity player){
        player.playSound(soundEvent, volume, volume);
    }
}
