package net.spacegoat.block_of.blocks.meat;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
import net.spacegoat.block_of.blocks.ModBlocks;

import java.util.Random;

public class CookableBlock extends BlockOfBlock {
    public CookableBlock(Settings settings){
        super(settings);
    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile){
        BlockPos pos = projectile.getBlockPos();
        if (projectile.isOnFire()){
            setCookedBlocks(world, pos);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        Block block = state.getBlock();
        ItemStack playerItem = player.getStackInHand(hand);
        if (player.getAbilities().allowModifyWorld){
            if (playerItem.isIn(ModTags.MEAT_BLOCK_CUTTING_TOOLS) && !state.isOf(ModBlocks.PlantBlocks.POTATO_BLOCK)){
                player.getInventory().insertStack(new ItemStack(block.asItem()));
                if (!player.isCreative()) {
                    playerItem.damage(1, player, p -> p.sendToolBreakStatus(hand));
                }
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        BlockState upState = world.getBlockState(pos.up());
        if (upState.isOf(Blocks.FIRE) || upState.isOf(Blocks.SOUL_FIRE)){
            if (world.getBlockTickScheduler().getTickCount() == 1800){
                setCookedBlocks(world, pos);
            }
        }
    }

    public static void setCookedBlocks(World world, BlockPos pos){
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_BEEF_BLOCK, ModBlocks.MeatBlocks.COOKED_BEEF_BLOCK);
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_CHICKEN_BLOCK, ModBlocks.MeatBlocks.COOKED_CHICKEN_BLOCK);
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_RABBIT_BLOCK, ModBlocks.MeatBlocks.COOKED_RABBIT_BLOCK);
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_MUTTON_BLOCK, ModBlocks.MeatBlocks.COOKED_MUTTON_BLOCK);
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_PORKCHOP_BLOCK, ModBlocks.MeatBlocks.COOKED_PORKCHOP_BLOCK);
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_COD_BLOCK, ModBlocks.MeatBlocks.COOKED_COD_BLOCK);
        setBlocks(world, pos, ModBlocks.MeatBlocks.RAW_SALMON_BLOCK, ModBlocks.MeatBlocks.COOKED_SALMON_BLOCK);
        setBlocks(world, pos, ModBlocks.PlantBlocks.POTATO_BLOCK, ModBlocks.PlantBlocks.BAKED_POTATO_BLOCK);
    }
}
