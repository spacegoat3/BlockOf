package net.spacegoat.block_of.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.block_of.BlockOf;
import org.lwjgl.system.CallbackI;

public class ModBlocks {
    public static final Block LATHER_BLOCK = registerBlock("leather_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).sounds(BlockSoundGroup.SLIME)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).strength(1)));
    public static final Block R_HIDE_BLOCK = registerBlock("r_hide_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).
                    sounds(BlockSoundGroup.SLIME)));
    public static final Block BEEF_BLOCK = registerBlock("beef_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0).
                    sounds(BlockSoundGroup.SLIME)));
    public static final Block C_BEEF_BLOCK = registerBlock("c_beef_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block CHICKEN_BLOCK = registerBlock("chicken_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block C_CHICKEN_BLOCK = registerBlock("c_chicken_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block COD_BLOCK = registerBlock("cod_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block C_COD_BLOCK = registerBlock("c_cod_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block MUTTON_BLOCK = registerBlock("mutton_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block C_MUTTON_BLOCK = registerBlock("c_mutton_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block PORKCHOP_BLOCK = registerBlock("porkchop_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block C_PORKCHOP_BLOCK = registerBlock("c_porkchop_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block RABBIT_BLOCK = registerBlock("rabbit_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block C_RABBIT_BLOCK = registerBlock("c_rabbit_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block R_FOOT_BLOCK = registerBlock("r_foot_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block SALMON_BLOCK = registerBlock("salmon_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block C_SALMON_BLOCK = registerBlock("c_salmon_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block T_FISH_BLOCK = registerBlock("t_fish_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block INKSAC_BLOCK = registerBlock("inksac_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).breakByTool(
                    FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME)));
    public static final Block GLOW_INKSAC_BLOCK = registerBlock("glow_inksac_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).breakByTool(
                    FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME).luminance(11)));
    public static final Block EGG_BLOCK = registerBlock("egg_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(3).breakByHand(true).sounds
                    (BlockSoundGroup.CORAL).breakByTool(FabricToolTags.PICKAXES).hardness(2)));

    //PLANT BASED
    public static final Block APPLE_BLOCK = registerBlock("apple_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block POTATO_BLOCK = registerBlock("potato_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.WET_GRASS)));
    public static final Block BAMBOO_BLOCK = registerBlock("bamboo_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1.1f)
                    .breakByHand(true).breakByTool(FabricToolTags.AXES, 0)
                    .sounds(BlockSoundGroup.BAMBOO)));
    public static final Block CARROT_BLOCK = registerBlock("carrot_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block KELP_BLOCK = registerBlock("kelp_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.WET_GRASS)));
    public static final Block SUGAR_C_BLOCK = registerBlock("sugar_c_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)));
    public static final Block SWEET_B_BLOCK = registerBlock("sweet_b_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block B_POTATO_BLOCK = registerBlock("b_potato_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)));
    public static final Block BEETROOT_BLOCK = registerBlock("beetroot_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1)
                    .breakByHand(true).breakByHand(true).breakByTool(FabricToolTags.HOES, 0)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block CHORUS_F_BLOCK = registerBlock("chorus_f_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.AXES, 0).
                    sounds(BlockSoundGroup.FUNGUS)));
    public static final Block GLOW_B_BLOCK = registerBlock("glow_b_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES, 0).sounds(BlockSoundGroup.FUNGUS).luminance(14)));
    public static final FallingBlock SUGAR_BLOCK = registerFallingBlock("sugar_block",
            new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND)));
    public static final Block COCOA_BEANS_BLOCK = registerBlock("cocoa_beans_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES).mapColor(MapColor.BROWN).sounds(BlockSoundGroup.WOOD)));

    //MATERIAL BASED
    public static final Block AMETHYST_S_BLOCK = registerBlock("amethyst_s_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1.6f)
                    .breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4)
                    .breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 0)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5).breakByHand(false)
                    .requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)
                    .sounds(BlockSoundGroup.STONE)));

    //OTHERS
    public static final FallingBlock GUNPOWDER_BLOCK = registerFallingBlock("gunpowder_block",
            new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.GRASS)));
    public static final Block PAPER_BLOCK = registerBlock("paper_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(0.15f).breakByHand(true).sounds(
                    BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block BLOCK_OF_BONE = registerBlock("block_of_bone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3)
                    .breakByHand(false).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)
                    .sounds(BlockSoundGroup.BONE)));
    public static final Block ROTTEN_F_BLOCK = registerBlock("rotten_f_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1)
                    .breakByHand(true).breakByTool(FabricToolTags.SHOVELS, 0)
                    .sounds(BlockSoundGroup.SLIME)));
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).sounds(
                    BlockSoundGroup.SLIME).breakByTool(FabricToolTags.SHOVELS, 0)));
    public static final Block NAUTILUS_SHELL_BLOCK = registerBlock("nautilus_shell_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(7).breakByHand(true).sounds(
                    BlockSoundGroup.BONE).breakByTool(FabricToolTags.PICKAXES).hardness(4)));
    public static final Block FERMENTED_SPIDER_EYE_BLOCK = registerBlock("fermented_spider_eye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).sounds(
                    BlockSoundGroup.SLIME).breakByTool(FabricToolTags.SHOVELS)));

    //DYES
    public static final Block BLACK_DYE_BLOCK = registerBlock("black_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block BLUE_DYE_BLOCK = registerBlock("blue_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true)
                    .sounds(BlockSoundGroup.CANDLE)));
    public static final Block BROWN_DYE_BLOCK = registerBlock("brown_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block CYAN_DYE_BLOCK = registerBlock("cyan_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block GRAY_DYE_BLOCK = registerBlock("gray_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true)
                    .sounds(BlockSoundGroup.CANDLE)));
    public static final Block GREEN_DYE_BLOCK = registerBlock("green_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block LIGHT_BLUE_DYE_BLOCK = registerBlock("light_blue_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block LIGHT_GRAY_DYE_BLOCK = registerBlock("light_gray_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block LIME_DYE_BLOCK = registerBlock("lime_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block MAGENTA_DYE_BLOCK = registerBlock("magenta_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block ORANGE_DYE_BLOCK = registerBlock("orange_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block PINK_DYE_BLOCK = registerBlock("pink_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block PURPLE_DYE_BLOCK = registerBlock("purple_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block RED_DYE_BLOCK = registerBlock("red_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block WHITE_DYE_BLOCK = registerBlock("white_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));
    public static final Block YELLOW_DYE_BLOCK = registerBlock("yellow_dye_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.13f).breakByHand(true).sounds(
                    BlockSoundGroup.CANDLE)));

    //SEEDS
    public static final Block WHEAT_SEEDS_BLOCK = registerBlock("wheat_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.89f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.GREEN).sounds(BlockSoundGroup.GRASS)));
    public static final Block MELON_SEEDS_BLOCK = registerBlock("melon_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.89f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.BROWN).sounds(BlockSoundGroup.GRASS)));
    public static final Block PUMPKIN_SEEDS_BLOCK = registerBlock("pumpkin_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.89f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.YELLOW).sounds(BlockSoundGroup.GRASS)));
    public static final Block BEETROOT_SEEDS_BLOCK = registerBlock("beetroot_seeds_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.89f).breakByHand(true)
                    .breakByTool(FabricToolTags.SHEARS).mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.GRASS)));

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
