package net.spacegoat.block_of.blocks.material;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegoat.block_of.blocks.BlockOfBlock;

public class AmethystShardBlock extends BlockOfBlock {
    public AmethystShardBlock(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        if (player.getStackInHand(hand).isEmpty()){
            playerPlaySoundWhenClicked(SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, 1, player);
        }
        return ActionResult.SUCCESS;
    }
}
