package net.spacegoat.block_of;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.util.registry.Registry;
import net.spacegoat.block_of.block.FireproofBlocks;
import net.spacegoat.block_of.block.ModBlocks;
import net.spacegoat.block_of.easter_egg.EasterEgg;
import net.spacegoat.block_of.easter_egg.RickrollEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockOf implements ModInitializer {
	public static final String MOD_ID = "block_of";
	public static final Logger LOGGER = LogManager.getLogger("block_of");

	@Override
	public void onInitialize() {

		//CLASS REGISTRIES
		ModBlocks.registerModBlocks();
		FireproofBlocks.registerFireproofBlock();

		//FUEL REGISTRIES
		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_BLOCK, 450);
		FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
	}
}
