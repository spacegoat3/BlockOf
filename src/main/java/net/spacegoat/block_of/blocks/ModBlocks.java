package net.spacegoat.block_of.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.block_of.ModMain;
import net.spacegoat.block_of.blocks.material.AmethystShardBlock;
import net.spacegoat.block_of.blocks.meat.InksacBlock;
import net.spacegoat.block_of.blocks.meat.MeatBlock;
import net.spacegoat.block_of.blocks.meat.CookableBlock;
import net.spacegoat.block_of.config.ModConfig;

//This is where the real stuff begins :)

public class ModBlocks {
    public static BlockState state(Block block){
        return block.getDefaultState();
    }

    public static void register(String name, Block block){
        Registry.register(Registry.BLOCK, new Identifier(ModMain.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(ModMain.MOD_ID, name), new BlockItem(
                block, new FabricItemSettings().group(ItemGroup.DECORATIONS)
        ));
    }

    public static class MeatBlocks {

        public static final Block LEATHER_BLOCK = createLeatherBlock(MapColor.BROWN);
        public static final Block RABBIT_HIDE_BLOCK = createLeatherBlock(MapColor.PALE_YELLOW);
        public static final Block RAW_BEEF_BLOCK = createRawMeatBlock(MapColor.BRIGHT_RED);
        public static final Block COOKED_BEEF_BLOCK = createMeatBlock(MapColor.DIRT_BROWN);
        public static final Block RAW_CHICKEN_BLOCK = createRawMeatBlock(MapColor.TERRACOTTA_WHITE);
        public static final Block COOKED_CHICKEN_BLOCK = createMeatBlock(MapColor.TERRACOTTA_RED);
        public static final Block RAW_RABBIT_BLOCK = createRawMeatBlock(MapColor.TERRACOTTA_WHITE);
        public static final Block COOKED_RABBIT_BLOCK = createMeatBlock(MapColor.TERRACOTTA_RED);
        public static final Block RABBIT_FOOT_BLOCK = createLeatherBlock(MapColor.PALE_YELLOW);
        public static final Block RAW_MUTTON_BLOCK = createRawMeatBlock(MapColor.BRIGHT_RED);
        public static final Block COOKED_MUTTON_BLOCK = createMeatBlock(MapColor.DIRT_BROWN);
        public static final Block RAW_COD_BLOCK = createRawMeatBlock(MapColor.TERRACOTTA_WHITE);
        public static final Block COOKED_COD_BLOCK = createMeatBlock(MapColor.TERRACOTTA_RED);
        public static final Block RAW_SALMON_BLOCK = createRawMeatBlock(MapColor.DULL_RED);
        public static final Block COOKED_SALMON_BLOCK = createMeatBlock(MapColor.TERRACOTTA_ORANGE);
        public static final Block RAW_PORKCHOP_BLOCK = createRawMeatBlock(MapColor.DULL_PINK);
        public static final Block COOKED_PORKCHOP_BLOCK = createMeatBlock(MapColor.PALE_YELLOW);
        public static final Block TROPICAL_FISH_BLOCK = createMeatBlock(MapColor.ORANGE);
        public static final Block INKSAC_BLOCK = createInksacBlock(MapColor.BLACK, 0);
        public static final Block GLOW_INKSAC_BLOCK = createInksacBlock(MapColor.TERRACOTTA_BLUE, ModConfig.getConfig().BlocksConfig.glowingInksacBlockLightLevel);

        private static Block createRawMeatBlock(MapColor mapColor) {
            return new CookableBlock(FabricBlockSettings.of(Material.SPONGE)
                    .breakByHand(true).strength(1.4f).sounds(BlockSoundGroup.SLIME)
                    .jumpVelocityMultiplier(1.5f).mapColor(mapColor));
        }

        private static Block createMeatBlock(MapColor mapColor) {
            return new MeatBlock(FabricBlockSettings.of(Material.SPONGE)
                    .strength(1.4f).sounds(BlockSoundGroup.SLIME).breakByHand(true)
                    .jumpVelocityMultiplier(1.5f).mapColor(mapColor));
        }

        private static Block createLeatherBlock(MapColor mapColor) {
            return new MeatBlock(FabricBlockSettings.of(Material.SPONGE)
                    .strength(1.4f).sounds(BlockSoundGroup.SLIME).breakByHand(true)
                    .jumpVelocityMultiplier(1.5f).mapColor(mapColor));
        }

        private static Block createInksacBlock(MapColor mapColor, int lightLevel) {
            return new InksacBlock(FabricBlockSettings.of(Material.SPONGE)
                    .strength(1.1f).mapColor(mapColor).sounds(BlockSoundGroup.SLIME)
                    .breakByHand(true).luminance(lightLevel).ticksRandomly());
        }

        public static void registerMeatBlocks(){
            register("leather_block", LEATHER_BLOCK);
            register("rabbit_hide_block", RABBIT_HIDE_BLOCK);
            register("raw_beef_block", RAW_BEEF_BLOCK);
            register("cooked_beef_block", COOKED_BEEF_BLOCK);
            register("raw_chicken_block", RAW_CHICKEN_BLOCK);
            register("cooked_chicken_block", COOKED_CHICKEN_BLOCK);
            register("raw_rabbit_block", RAW_RABBIT_BLOCK);
            register("cooked_rabbit_block", COOKED_RABBIT_BLOCK);
            register("rabbit_foot_block", RABBIT_FOOT_BLOCK);
            register("raw_mutton_block", RAW_MUTTON_BLOCK);
            register("cooked_mutton_block", COOKED_MUTTON_BLOCK);
            register("raw_cod_block", RAW_COD_BLOCK);
            register("cooked_cod_block", COOKED_COD_BLOCK);
            register("raw_salmon_block", RAW_SALMON_BLOCK);
            register("cooked_salmon_block", COOKED_SALMON_BLOCK);
            register("raw_porkchop_block", RAW_PORKCHOP_BLOCK);
            register("cooked_porkchop_block", COOKED_PORKCHOP_BLOCK);
            register("tropical_fish_block", TROPICAL_FISH_BLOCK);
            register("inksac_block", INKSAC_BLOCK);
            register("glow_inksac_block", GLOW_INKSAC_BLOCK);
        }
    }

    public static class PlantBlocks {
        public static float plantHardness = 0.9f;
        public static final Block APPLE_BLOCK = createPlantBlock(MapColor.RED, BlockSoundGroup.FUNGUS, plantHardness);
        public static final Block POTATO_BLOCK = new CookableBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
                .strength(plantHardness).breakByHand(true).mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.CROP));
        public static final Block BAKED_POTATO_BLOCK = createPlantBlock(MapColor.PALE_YELLOW, BlockSoundGroup.GRASS, plantHardness);
        public static final Block BAMBOO_BLOCK = createPlantBlock(MapColor.EMERALD_GREEN, BlockSoundGroup.BAMBOO, 1.7f);
        public static final Block CARROT_BLOCK = createPlantBlock(MapColor.ORANGE, BlockSoundGroup.FUNGUS, plantHardness);
        public static final Block KELP_BLOCK = createPlantBlock(MapColor.TERRACOTTA_GREEN, BlockSoundGroup.WET_GRASS, Blocks.DRIED_KELP_BLOCK.getHardness() - 0.5f);
        public static final Block SUGAR_CANE_BLOCK = createPlantBlock(MapColor.EMERALD_GREEN, Blocks.SUGAR_CANE.getSoundGroup(state(Blocks.SUGAR_CANE)), plantHardness);
        public static final Block SWEET_BERRIE_BLOCK = createPlantBlock(MapColor.DULL_RED, BlockSoundGroup.CROP, plantHardness);
        public static final Block GLOW_BERRIE_BLOCK = new BlockOfBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
                .strength(1).sounds(BlockSoundGroup.FUNGUS).mapColor(MapColor.YELLOW)
                .breakByHand(true).strength(plantHardness).luminance(ModConfig.getConfig().BlocksConfig.glowBerrieBlockLightLevel));
        public static final Block BEETROOT_BLOCK = createPlantBlock(MapColor.RED, BlockSoundGroup.FUNGUS, plantHardness);
        public static final Block CHORUS_FRUIT_BLOCK = createPlantBlock(MapColor.PURPLE, Blocks.CHORUS_PLANT.getSoundGroup(state(Blocks.CHORUS_PLANT)), Blocks.CHORUS_PLANT.getHardness() + 1);

        public static Block createPlantBlock(MapColor mapColor, BlockSoundGroup sounds, float plantHardness) {
            return new BlockOfBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
                    .strength(1).sounds(sounds).mapColor(mapColor).breakByHand(true).strength(plantHardness));
        }

        public static void registerPlantBlocks(){
            register("apple_block", APPLE_BLOCK);
            register("potato_block", POTATO_BLOCK);
            register("baked_potato_block", BAKED_POTATO_BLOCK);
            register("bamboo_block", BAMBOO_BLOCK);
            register("carrot_block", CARROT_BLOCK);
            register("kelp_block", KELP_BLOCK);
            register("sugar_cane_block", SUGAR_CANE_BLOCK);
            register("sweet_berrie_block", SWEET_BERRIE_BLOCK);
            register("glow_berrie_block", GLOW_BERRIE_BLOCK);
            register("beetroot_block", BEETROOT_BLOCK);
            register("chorus_fruit_block", CHORUS_FRUIT_BLOCK);
        }
    }

    public static class MaterialBlocks{
        public static float boneHardness = Blocks.BONE_BLOCK.getHardness() + 2;

        public static final Block AMETHYST_SHARD_BLOCK = new AmethystShardBlock(FabricBlockSettings.of(Material.AMETHYST)
                .strength(2).requiresTool().mapColor(Blocks.AMETHYST_BLOCK.getDefaultMapColor())
                .sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(ModConfig.getConfig().BlocksConfig.amethystShardBlockLightLevel));
        public static final Block FLINT_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.STONE)
                .strength(1.8f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool().mapColor(MapColor.BLACK));
        public static final Block SUGAR_BLOCK = createSandBlock(MapColor.WHITE, Blocks.SAND.getHardness());
        public static final Block GUNPOWDER_BLOCK = createSandBlock(MapColor.TERRACOTTA_BLACK, Blocks.SAND.getHardness() + 0.2f);
        public static final Block PAPER_BLOCK = new BlockOfBlock(FabricBlockSettings.of(Material.SOIL)
                .strength(0.6F).sounds(BlockSoundGroup.WET_GRASS).mapColor(DyeColor.WHITE));
        public static final Block BLOCK_OF_BONE = createBoneBlock(boneHardness, MapColor.WHITE);
        public static final Block ROTTEN_FLESH_BLOCK = MeatBlocks.createMeatBlock(MapColor.RED);
        public static final Block SPIDER_EYE_BLOCK = MeatBlocks.createMeatBlock(MapColor.DARK_RED);
        public static final Block FERMENTED_SPIDER_EYE_BLOCK = MeatBlocks.createMeatBlock(MapColor.DARK_RED);
        public static final Block SCUTE_BLOCK = createBoneBlock(boneHardness, MapColor.DARK_GREEN);

        public static Block createSandBlock(MapColor mapColor, float hardness){
            return new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(hardness).breakByHand(true).mapColor(mapColor).sounds(BlockSoundGroup.SAND));
        }

        public static Block createBoneBlock(float hardness, MapColor mapColor){
            return new BlockOfBlock(FabricBlockSettings.of(Material.STONE).strength(hardness).sounds(BlockSoundGroup.BONE).breakByHand(true).mapColor(mapColor));
        }

        public void registerMaterialBlocks(){
            register("amethyst_shard_block", AMETHYST_SHARD_BLOCK);
            register("flint_block", FLINT_BLOCK);
            register("sugar_block", SUGAR_BLOCK);
            register("gunpowder_block", GUNPOWDER_BLOCK);
            register("paper_block", PAPER_BLOCK);
            register("block_of_bone", BLOCK_OF_BONE);
            register("rotten_flesh_block", ROTTEN_FLESH_BLOCK);
            register("spider_eye_block", SPIDER_EYE_BLOCK);
            register("fermented_spider_eye_block", FERMENTED_SPIDER_EYE_BLOCK);
            register("scute_block", SCUTE_BLOCK);
        }
    }
}
