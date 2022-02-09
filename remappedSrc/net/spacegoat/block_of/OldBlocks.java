package net.spacegoat.block_of;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class OldBlocks {
    public static final Block LEATHER_BLOCK =
            new Block(FabricBlockSettings.of(Material.SPONGE).sounds(BlockSoundGroup.SLIME)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).strength(1)
                    .mapColor(MapColor.TERRACOTTA_RED));
    public static final Block R_HIDE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).
                    sounds(BlockSoundGroup.SLIME).mapColor(MapColor.PALE_YELLOW));
    public static final Block BEEF_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).
                    sounds(BlockSoundGroup.SLIME).mapColor(MapColor.BRIGHT_RED));
    public static final Block C_BEEF_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.BROWN));
    public static final Block CHICKEN_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block C_CHICKEN_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.ORANGE));
    public static final Block COD_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.WHITE));
    public static final Block C_COD_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block MUTTON_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_RED));
    public static final Block C_MUTTON_BLOCK =
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.BRIGHT_RED));
    public static final Block PORKCHOP_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_PINK));
    public static final Block C_PORKCHOP_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block RABBIT_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block C_RABBIT_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final Block R_FOOT_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block SALMON_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.RED));
    public static final Block C_SALMON_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_PINK));
    public static final Block T_FISH_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.ORANGE));
    public static final Block INKSAC_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).breakByTool(
                    FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME).mapColor(DyeColor.GRAY));
    public static final Block EGG_BLOCK = 
            new Block(FabricBlockSettings.of(Material.WOOL).strength(3).breakByHand(true).sounds
                    (BlockSoundGroup.CORAL).breakByTool(FabricToolTags.PICKAXES).hardness(2)
                    .mapColor(DyeColor.WHITE));
    public static final Block SCUTE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.STONE).strength(7.5f)
                    .breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.BONE)
                    .hardness(7.5f).requiresTool().mapColor(MapColor.EMERALD_GREEN));

    //PLANT BASED
    public static final Block APPLE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.RED));
    public static final Block POTATO_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.WET_GRASS).mapColor(MapColor.PALE_YELLOW));
    public static final Block BAMBOO_BLOCK = 
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1.1f)
                    .breakByHand(true).breakByTool(FabricToolTags.AXES, 0)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .mapColor(MapColor.GREEN));
    public static final Block CARROT_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.ORANGE));
    public static final Block KELP_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.WET_GRASS)
                    .mapColor(MapColor.PALE_GREEN));
    public static final Block SUGAR_C_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .mapColor(MapColor.LIME));
    public static final Block SWEET_B_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS).mapColor(DyeColor.RED));
    public static final Block B_POTATO_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.MOSS_BLOCK).mapColor(MapColor.PALE_YELLOW));
    public static final Block BEETROOT_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.RED));
    public static final Block CHORUS_F_BLOCK = 
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.AXES, 0).
                    sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.PURPLE));
    public static final FallingBlock SUGAR_BLOCK =
            new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND)
                    .mapColor(DyeColor.WHITE));

    //MATERIAL BASED
    public static final Block AMETHYST_S_BLOCK = 
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1.6f)
                    .breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.DARK_DULL_PINK));
    public static final Block FLINT_BLOCK = 
            new Block(FabricBlockSettings.of(Material.STONE).strength(4)
                    .breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 0)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.BLACK));
    public static final Block CHARCOAL_BLOCK = 
            new Block(FabricBlockSettings.of(Material.STONE).strength(5).breakByHand(false)
                    .requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)
                    .sounds(BlockSoundGroup.STONE).mapColor(MapColor.SPRUCE_BROWN));

    //OTHERS
    public static final FallingBlock GUNPOWDER_BLOCK =
            new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.GRASS).mapColor(MapColor.GRAY));
    public static final Block PAPER_BLOCK = 
            new Block(FabricBlockSettings.of(Material.WOOL).strength(0.15f).breakByHand(true).sounds(
                    BlockSoundGroup.BIG_DRIPLEAF).mapColor(MapColor.WHITE));
    public static final Block BLOCK_OF_BONE = 
            new Block(FabricBlockSettings.of(Material.STONE).strength(3)
                    .breakByHand(false).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)
                    .sounds(BlockSoundGroup.BONE).mapColor(MapColor.WHITE_GRAY));
    public static final Block ROTTEN_F_BLOCK = 
            new Block(FabricBlockSettings.of(Material.STONE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_RED));
    public static final Block SPIDER_EYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).sounds(
                    BlockSoundGroup.SLIME).breakByTool(FabricToolTags.SHOVELS, 0)
                    .mapColor(MapColor.DARK_RED));
    public static final Block NAUTILUS_SHELL_BLOCK = 
            new Block(FabricBlockSettings.of(Material.STONE).strength(8).requiresTool().sounds(
                    BlockSoundGroup.BONE).breakByTool(FabricToolTags.PICKAXES)
                    .mapColor(MapColor.PALE_YELLOW).hardness(8));
    public static final Block FERMENTED_SPIDER_EYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).sounds(
                    BlockSoundGroup.SLIME).breakByTool(FabricToolTags.SHOVELS)
                    .mapColor(MapColor.DARK_RED));

    //DYES
    public static final Block BLACK_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.BLACK));
    public static final Block BLUE_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true)
                    .sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BLUE));
    public static final Block BROWN_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.BROWN));
    public static final Block CYAN_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.CYAN));
    public static final Block GRAY_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true)
                    .sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.GRAY));
    public static final Block GREEN_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.GREEN));
    public static final Block LIGHT_BLUE_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block LIGHT_GRAY_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_GRAY));
    public static final Block LIME_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.LIME));
    public static final Block MAGENTA_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.MAGENTA));
    public static final Block ORANGE_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.ORANGE));
    public static final Block PINK_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.PINK));
    public static final Block PURPLE_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.PURPLE));
    public static final Block RED_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.RED));
    public static final Block WHITE_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.WHITE));
    public static final Block YELLOW_DYE_BLOCK = 
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.YELLOW));

    //SEEDS
    public static final Block WHEAT_SEEDS_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.GREEN).sounds(BlockSoundGroup.GRAVEL));
    public static final Block MELON_SEEDS_BLOCK =
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.BROWN).sounds(BlockSoundGroup.GRAVEL));
    public static final Block PUMPKIN_SEEDS_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.YELLOW).sounds(BlockSoundGroup.GRAVEL));
    public static final Block BEETROOT_SEEDS_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COCOA_BEANS_BLOCK = 
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.BROWN).sounds
                            (BlockSoundGroup.GRAVEL));
}
