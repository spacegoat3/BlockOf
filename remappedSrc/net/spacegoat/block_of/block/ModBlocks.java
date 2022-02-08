package net.spacegoat.block_of.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.block_of.BlockOf;
import org.lwjgl.system.CallbackI;

public class ModBlocks {
    public static final Block LATHER_BLOCK = registerBlock("leather_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).sounds(BlockSoundGroup.SLIME)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).strength(1)
                    .mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block R_HIDE_BLOCK = registerBlock("r_hide_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).
                    sounds(BlockSoundGroup.SLIME).mapColor(MapColor.PALE_YELLOW)));
    public static final Block BEEF_BLOCK = registerBlock("beef_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).
                    sounds(BlockSoundGroup.SLIME).mapColor(MapColor.BRIGHT_RED)));
    public static final Block C_BEEF_BLOCK = registerBlock("c_beef_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.BROWN)));
    public static final Block CHICKEN_BLOCK = registerBlock("chicken_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block C_CHICKEN_BLOCK = registerBlock("c_chicken_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.ORANGE)));
    public static final Block COD_BLOCK = registerBlock("cod_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.WHITE)));
    public static final Block C_COD_BLOCK = registerBlock("c_cod_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block MUTTON_BLOCK = registerBlock("mutton_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_RED)));
    public static final Block C_MUTTON_BLOCK = registerBlock("c_mutton_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.BRIGHT_RED)));
    public static final Block PORKCHOP_BLOCK = registerBlock("porkchop_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_PINK)));
    public static final Block C_PORKCHOP_BLOCK = registerBlock("c_porkchop_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block RABBIT_BLOCK = registerBlock("rabbit_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block C_RABBIT_BLOCK = registerBlock("c_rabbit_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block R_FOOT_BLOCK = registerBlock("r_foot_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block SALMON_BLOCK = registerBlock("salmon_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.RED)));
    public static final Block C_SALMON_BLOCK = registerBlock("c_salmon_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_PINK)));
    public static final Block T_FISH_BLOCK = registerBlock("t_fish_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.ORANGE)));
    public static final Block INKSAC_BLOCK = registerBlock("inksac_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).breakByTool(
                    FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME).mapColor(DyeColor.GRAY)));
    public static final Block GLOW_INKSAC_BLOCK = registerBlock("glow_inksac_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).breakByTool(
                    FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME).luminance(11)
                    .mapColor(MapColor.CYAN)));
    public static final Block EGG_BLOCK = registerBlock("egg_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(3).breakByHand(true).sounds
                    (BlockSoundGroup.CORAL).breakByTool(FabricToolTags.PICKAXES).hardness(2)
                    .mapColor(DyeColor.WHITE)));
    public static final Block SCUTE_BLOCK = registerBlock("scute_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5).breakByHand(false)
                    .breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.BONE)));

    //PLANT BASED
    public static final Block APPLE_BLOCK = registerBlock("apple_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.RED)));
    public static final Block POTATO_BLOCK = registerBlock("potato_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.WET_GRASS).mapColor(MapColor.PALE_YELLOW)));
    public static final Block BAMBOO_BLOCK = registerBlock("bamboo_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1.1f)
                    .breakByHand(true).breakByTool(FabricToolTags.AXES, 0)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .mapColor(MapColor.GREEN)));
    public static final Block CARROT_BLOCK = registerBlock("carrot_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.ORANGE)));
    public static final Block KELP_BLOCK = registerBlock("kelp_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.WET_GRASS)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SUGAR_C_BLOCK = registerBlock("sugar_c_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .mapColor(MapColor.LIME)));
    public static final Block SWEET_B_BLOCK = registerBlock("sweet_b_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS).mapColor(DyeColor.RED)));
    public static final Block B_POTATO_BLOCK = registerBlock("b_potato_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.MOSS_BLOCK).mapColor(MapColor.PALE_YELLOW)));
    public static final Block BEETROOT_BLOCK = registerBlock("beetroot_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.RED)));
    public static final Block CHORUS_F_BLOCK = registerBlock("chorus_f_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.AXES, 0).
                    sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.PURPLE)));
    public static final Block GLOW_B_BLOCK = registerBlock("glow_b_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES, 0).sounds(BlockSoundGroup.FUNGUS)
                    .luminance(14).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final FallingBlock SUGAR_BLOCK = registerFallingBlock("sugar_block",
            new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND)
                    .mapColor(DyeColor.WHITE)));

    //MATERIAL BASED
    public static final Block AMETHYST_S_BLOCK = registerBlock("amethyst_s_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1.6f)
                    .breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.DARK_DULL_PINK)));
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4)
                    .breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 0)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.BLACK)));
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5).breakByHand(false)
                    .requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)
                    .sounds(BlockSoundGroup.STONE).mapColor(MapColor.SPRUCE_BROWN)));

    //OTHERS
    public static final FallingBlock GUNPOWDER_BLOCK = registerFallingBlock("gunpowder_block",
            new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.GRASS).mapColor(MapColor.GRAY)));
    public static final Block PAPER_BLOCK = registerBlock("paper_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(0.15f).breakByHand(true).sounds(
                    BlockSoundGroup.BIG_DRIPLEAF).mapColor(MapColor.WHITE)));
    public static final Block BLOCK_OF_BONE = registerBlock("block_of_bone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3)
                    .breakByHand(false).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)
                    .sounds(BlockSoundGroup.BONE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block ROTTEN_F_BLOCK = registerBlock("rotten_f_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME).mapColor(MapColor.DULL_RED)));
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).sounds(
                    BlockSoundGroup.SLIME).breakByTool(FabricToolTags.SHOVELS, 0)
                    .mapColor(MapColor.DARK_RED)));
    public static final Block NAUTILUS_SHELL_BLOCK = registerBlock("nautilus_shell_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(7).breakByHand(true).sounds(
                    BlockSoundGroup.BONE).breakByTool(FabricToolTags.PICKAXES).hardness(4)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block FERMENTED_SPIDER_EYE_BLOCK = registerBlock("fermented_spider_eye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).sounds(
                    BlockSoundGroup.SLIME).breakByTool(FabricToolTags.SHOVELS)
                    .mapColor(MapColor.DARK_RED)));

    //DYES
    public static final Block BLACK_DYE_BLOCK = registerBlock("black_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.BLACK)));
    public static final Block BLUE_DYE_BLOCK = registerBlock("blue_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true)
                    .sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BLUE)));
    public static final Block BROWN_DYE_BLOCK = registerBlock("brown_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.BROWN)));
    public static final Block CYAN_DYE_BLOCK = registerBlock("cyan_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.CYAN)));
    public static final Block GRAY_DYE_BLOCK = registerBlock("gray_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true)
                    .sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.GRAY)));
    public static final Block GREEN_DYE_BLOCK = registerBlock("green_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.GREEN)));
    public static final Block LIGHT_BLUE_DYE_BLOCK = registerBlock("light_blue_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block LIGHT_GRAY_DYE_BLOCK = registerBlock("light_gray_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block LIME_DYE_BLOCK = registerBlock("lime_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.LIME)));
    public static final Block MAGENTA_DYE_BLOCK = registerBlock("magenta_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.MAGENTA)));
    public static final Block ORANGE_DYE_BLOCK = registerBlock("orange_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.ORANGE)));
    public static final Block PINK_DYE_BLOCK = registerBlock("pink_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.PINK)));
    public static final Block PURPLE_DYE_BLOCK = registerBlock("purple_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.PURPLE)));
    public static final Block RED_DYE_BLOCK = registerBlock("red_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.RED)));
    public static final Block WHITE_DYE_BLOCK = registerBlock("white_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.WHITE)));
    public static final Block YELLOW_DYE_BLOCK = registerBlock("yellow_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.99f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE).mapColor(DyeColor.YELLOW)));

    //SEEDS
    public static final Block WHEAT_SEEDS_BLOCK = registerBlock("wheat_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.GREEN).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block MELON_SEEDS_BLOCK = registerBlock("melon_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.BROWN).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block PUMPKIN_SEEDS_BLOCK = registerBlock("pumpkin_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.YELLOW).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block BEETROOT_SEEDS_BLOCK = registerBlock("beetroot_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block COCOA_BEANS_BLOCK = registerBlock("cocoa_beans_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.9f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.BROWN).sounds
                            (BlockSoundGroup.GRAVEL)));

    //REGISTRIES
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(BlockOf.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(BlockOf.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
    private static FallingBlock registerFallingBlock(String name, FallingBlock fallingBlock){
        registerBlockItem(name, fallingBlock);
     return Registry.register(Registry.BLOCK, new Identifier(BlockOf.MOD_ID, name), fallingBlock);
    }
    public static void registerModBlocks(){
        System.out.println("registering mod blocks for"+BlockOf.MOD_ID);
    }
}
