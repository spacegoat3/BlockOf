package net.spacegoat.block_of;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = BlockOf.MOD_ID)
@Config.Gui.Background("block_of:textures/block/leather_block.png")
public class BlockOfConfig implements ConfigData {

    @ConfigEntry.Gui.TransitiveObject
    public General general = new General();

    @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;
    public static synchronized BlockOfConfig getConfig() {
        if (!registered) {
            AutoConfig.register(BlockOfConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(BlockOfConfig.class).getConfig();
    }
    public static class General{
        @ConfigEntry.Gui.RequiresRestart
        @Comment("default = true")
        public boolean enableBambooBlockFuel = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("default = true")
        public boolean enableCharcoalBlockFuel = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("default = true")
        public boolean enableFireproofBlocks = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("default = true")
        public boolean enableGlowingBlocks = true;
    }
}
