package net.spacegoat.block_of.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.block_of.ModMain;

public class ModSoundEvents {
    public static final SoundEvent NAUTILUS_SHELL_SOUNDS = registerSoundEvent("block.nautilus_shell.random");

    public static SoundEvent registerSoundEvent(String name){
        return Registry.register(Registry.SOUND_EVENT, new Identifier(ModMain.MOD_ID, name), new SoundEvent(new Identifier(ModMain.MOD_ID, name)));
    }
}
