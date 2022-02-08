package net.spacegoat.block_of.blocks.meat;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegoat.block_of.ModTags;
import net.spacegoat.block_of.blocks.BlockOfBlock;

public class RawMeatBlock extends BlockOfBlock {
    public RawMeatBlock(Settings settings){
        super(settings);
    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile){
        if (projectile.isOnFire()){
            setCookedMeatBlocks(world, projectile);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        ItemStack playerItem = player.getStackInHand(hand);
        if (player.getAbilities().allowModifyWorld){
            if (playerItem.isIn(ModTags.MEAT_BLOCK_CUTTING_TOOLS)){
                player.getInventory().insertStack(new ItemStack(this.asItem()));
                playerItem.damage(1, player, p -> p.sendToolBreakStatus(hand));
            }
        }
        return ActionResult.SUCCESS;
    }

    public static void setCookedMeatBlocks(World world, ProjectileEntity projectile){
        BlockPos pos = projectile.getBlockPos();
        setCookedBlock(world, pos, MeatBlocks.RAW_BEEF_BLOCK, MeatBlocks.COOKED_BEEF_BLOCK);
        setCookedBlock(world, pos, MeatBlocks.RAW_CHICKEN_BLOCK, MeatBlocks.COOKED_CHICKEN_BLOCK);
        setCookedBlock(world, pos, MeatBlocks.RAW_RABBIT_BLOCK, MeatBlocks.COOKED_RABBIT_BLOCK);
        setCookedBlock(world, pos, MeatBlocks.RAW_MUTTON_BLOCK, MeatBlocks.COOKED_MUTTON_BLOCK);
        setCookedBlock(world, pos, MeatBlocks.RAW_PORKCHOP_BLOCK, MeatBlocks.COOKED_PORKCHOP_BLOCK);
        setCookedBlock(world, pos, MeatBlocks.RAW_COD_BLOCK, MeatBlocks.COOKED_COD_BLOCK);
        setCookedBlock(world, pos, MeatBlocks.RAW_SALMON_BLOCK, MeatBlocks.COOKED_SALMON_BLOCK);
    }
}
