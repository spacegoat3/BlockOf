package net.spacegoat.block_of.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.block_of.BlockOf;

public class NonFireproofBlocks {

    private static final Block MAGMA_C_BLOCK = registerBlock("magma_c_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).breakByHand(true).breakByTool(
                            FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME).hardness(3).strength(0.9f)
                    .mapColor(MapColor.ORANGE).mapColor(MapColor.ORANGE)
                    .jumpVelocityMultiplier(1)));
    public static final Block GOLDEN_APPLE_BLOCK = registerBlock("golden_apple_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(3).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES, 0).sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.YELLOW)));
    public static final Block GOLDEN_CARROT_BLOCK = registerBlock("golden_carrot_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(3).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES, 0).sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.YELLOW)));
    public static final Block GLISTERING_MELON_BLOCK = registerBlock("glistering_melon_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(3).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES, 0).sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(BlockOf.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(BlockOf.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }

    public static void registerNonFireproofBlocks() {
        System.out.println("registering fireproof blocks for" + BlockOf.MOD_ID);
    }
}
