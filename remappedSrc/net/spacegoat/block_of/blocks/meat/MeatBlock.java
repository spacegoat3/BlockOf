package net.spacegoat.block_of.blocks.meat;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegoat.block_of.ModTags;
import net.spacegoat.block_of.blocks.BlockOfBlock;

public class MeatBlock extends BlockOfBlock {
    public MeatBlock(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        Block block = state.getBlock();
        ItemStack playerItem = player.getStackInHand(hand);
        if (player.getAbilities().allowModifyWorld){
            if (playerItem.isIn(ModTags.MEAT_BLOCK_CUTTING_TOOLS)){
                player.getInventory().insertStack(new ItemStack(block.asItem()));
                playerItem.damage(1, player, p -> p.sendToolBreakStatus(hand));
            }
        }
        return ActionResult.SUCCESS;
    }
}
