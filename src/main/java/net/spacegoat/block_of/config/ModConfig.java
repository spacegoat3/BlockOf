package net.spacegoat.block_of.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.spacegoat.block_of.ModMain;

@Config(name = ModMain.MOD_ID)
@Config.Gui.Background("block_of:textures/block/leather_block.png")
public class ModConfig implements ConfigData {

    @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;
    public static synchronized ModConfig getConfig() {
        if (!registered) {
            AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    @ConfigEntry.Gui.TransitiveObject
    public Categories Categories = new Categories();
    public static class Categories {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableMeatBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enablePlantBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableMaterialBasedBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableOtherBasedBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableDyeBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableSeedBlocks = true;
    }
    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("gameplay")
    public Gameplay Gameplay = new Gameplay();
    public static class Gameplay {
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Requires 'enableBambooBlock'")
        public boolean enableBambooBlockFuel = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Requires 'enableCharcoalBlock'")
        public boolean enableCharcoalBlockFuel = true;
    }
    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("blocks")
    public BlocksConfig BlocksConfig = new BlocksConfig();
    public static class BlocksConfig {
        @Comment("The amount of light Glowing Inksac Block emits. Min: 0 - Max: 20")
        @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
        public int glowingInksacBlockLightLevel = 2;
        public int glowBerrieBlockLightLevel = 2;
        public int amethystShardBlockLightLevel = 1;
    }
}
