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

    @ConfigEntry.Gui.TransitiveObject
    public Categories Categories = new Categories();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("blocks")
    public Blocks Blocks = new Blocks();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("gameplay")
    public Gameplay Gameplay = new Gameplay();

    @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;
    public static synchronized ModConfig getConfig() {
        if (!registered) {
            AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
    public static class Categories {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableAnimalBasedBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enablePlantBasedBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableMaterialBasedBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableOtherBasedBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableDyeBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enableSeedBlocks = true;
    }
    public static class Blocks {
        public boolean enableMeatBlocks = true;
    }
    public static class Gameplay {
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Requires 'enableBambooBlock'")
        public boolean enableBambooBlockFuel = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Requires 'enableCharcoalBlock'")
        public boolean enableCharcoalBlockFuel = true;
    }
}
