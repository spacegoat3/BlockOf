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

public class GlowingBlocks {
    public static final Block GLOW_INKSAC_BLOCK = registerBlock("glow_inksac_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(1).breakByHand(true).breakByTool(
                            FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SLIME).luminance(11)
                    .mapColor(MapColor.CYAN)));
    public static final Block GLOW_B_BLOCK = registerBlock("glow_b_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(1).breakByHand(true)
                    .breakByTool(FabricToolTags.HOES, 0).sounds(BlockSoundGroup.FUNGUS)
                    .luminance(14).mapColor(MapColor.TERRACOTTA_YELLOW)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(BlockOf.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(BlockOf.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
    public static void registerGlowingBlocks(){
        System.out.println("registering mod blocks for"+BlockOf.MOD_ID);
    }
}
