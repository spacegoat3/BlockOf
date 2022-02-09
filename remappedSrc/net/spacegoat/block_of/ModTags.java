package net.spacegoat.block_of;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {

    public static Tag.Identified<Item> createItemTag(String id){
        return TagFactory.ITEM.create(new Identifier(ModMain.MOD_ID, id));
    }

    //MEAT BLOCK
    public static final Tag.Identified<Item> MEAT_BLOCK_CUTTING_TOOLS = createItemTag("meat_block_cutting_tools");
}
