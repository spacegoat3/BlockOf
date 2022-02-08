package net.spacegoat.block_of.blocks.meat;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.spacegoat.block_of.blocks.BlockOfBlock;

public class MeatBlocks {
    private static Block createMeatBlock(MapColor mapColor){
        return new MeatBlock(MEAT_SETTINGS.mapColor(mapColor));
    }
    private static Block createCookedMeatBlock(MapColor mapColor){
        return new MeatBlock(MEAT_SETTINGS.mapColor(mapColor));
    }
    private static final FabricBlockSettings MEAT_SETTINGS = FabricBlockSettings.of(Material.SPONGE)
            .strength(1.2f)
            .sounds(BlockSoundGroup.SLIME)
            .breakByHand(true)
            .jumpVelocityMultiplier(1.5f);

    private static Block createLeatherBlock(MapColor mapColor){
        return new RawMeatBlock(LEATHER_SETTINGS.mapColor(mapColor));
    }
    private static final FabricBlockSettings LEATHER_SETTINGS = FabricBlockSettings.of(Material.SPONGE)
            .strength(1.2f)
            .sounds(BlockSoundGroup.SLIME)
            .breakByHand(true)
            .jumpVelocityMultiplier(1.5f);

    private static Block createBoneBlock(MapColor mapColor){
        return new BlockOfBlock(BONE_BLOCKS.mapColor(mapColor));
    }
    public static final FabricBlockSettings BONE_BLOCKS = FabricBlockSettings.of(Material.STONE)
            .strength(Blocks.BONE_BLOCK.getHardness() + 1)
            .sounds(BlockSoundGroup.BONE)
            .breakByHand(false);


    public static final Block LEATHER_BLOCK = createLeatherBlock(MapColor.BROWN);
    public static final Block RABBIT_HIDE_BLOCK = createLeatherBlock(MapColor.PALE_YELLOW);

    public static final Block RAW_BEEF_BLOCK = createMeatBlock(MapColor.BRIGHT_RED);
    public static final Block COOKED_BEEF_BLOCK = createCookedMeatBlock(MapColor.DIRT_BROWN);

    public static final Block RAW_CHICKEN_BLOCK = createMeatBlock(MapColor.TERRACOTTA_WHITE);
    public static final Block COOKED_CHICKEN_BLOCK = createCookedMeatBlock(MapColor.TERRACOTTA_RED);

    public static final Block RAW_RABBIT_BLOCK = createMeatBlock(MapColor.TERRACOTTA_WHITE);
    public static final Block COOKED_RABBIT_BLOCK = createCookedMeatBlock(MapColor.TERRACOTTA_RED);
    public static final Block RABBIT_FOOT_BLOCK = createLeatherBlock(MapColor.PALE_YELLOW);

    public static final Block RAW_MUTTON_BLOCK = createMeatBlock(MapColor.RED);
    public static final Block COOKED_MUTTON_BLOCK = createCookedMeatBlock(MapColor.DIRT_BROWN);

    public static final Block RAW_COD_BLOCK = createMeatBlock(MapColor.TERRACOTTA_WHITE);
    public static final Block COOKED_COD_BLOCK = createCookedMeatBlock(MapColor.TERRACOTTA_RED);

    public static final Block RAW_SALMON_BLOCK = createMeatBlock(MapColor.DULL_RED);
    public static final Block COOKED_SALMON_BLOCK = createCookedMeatBlock(MapColor.TERRACOTTA_ORANGE);

    public static final Block RAW_PORKCHOP_BLOCK = createMeatBlock(MapColor.DULL_PINK);
    public static final Block COOKED_PORKCHOP_BLOCK = createCookedMeatBlock(MapColor.PALE_YELLOW);

    public static final Block TROPICAL_FISH_BLOCK = createCookedMeatBlock(MapColor.ORANGE);

    public static final Block INKSAC_BLOCK = createCookedMeatBlock(MapColor.BLACK);
    public static final Block GLOWING_INKSAC_BLOCK = createCookedMeatBlock(MapColor.TERRACOTTA_BLUE);

    public static final Block EGG_BLOCK = createBoneBlock(MapColor.WHITE);

    public static final Block SCUTE_BLOCK = createBoneBlock(MapColor.EMERALD_GREEN);
    public static void register(){
    }
}
