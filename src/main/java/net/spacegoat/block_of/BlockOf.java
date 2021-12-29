package net.spacegoat.block_of;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.spacegoat.block_of.block.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockOf implements ModInitializer {
	public static final String MOD_ID = "block_of";
	public static final Logger LOGGER = LogManager.getLogger("block_of");

	@Override
	public void onInitialize() {

		//CLASS REGISTRIES
		ModBlocks.registerModBlocks();


		if (BlockOfConfig.getConfig().general.enableFireproofBlocks){
			FireproofBlocks.registerFireproofBlocks();
		}
		if (!BlockOfConfig.getConfig().general.enableFireproofBlocks){
			NonFireproofBlocks.registerNonFireproofBlocks();
		}


		if (BlockOfConfig.getConfig().general.enableGlowingBlocks){
			GlowingBlocks.registerGlowingBlocks();
		}
		if (!BlockOfConfig.getConfig().general.enableGlowingBlocks){
			NonGlowingBlocks.registerNonGlowingBlocks();
		}


		//FUEL REGISTRIES
		if (BlockOfConfig.getConfig().general.enableBambooBlockFuel){
			FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_BLOCK, 450);
		}
		if (BlockOfConfig.getConfig().general.enableCharcoalBlockFuel){
			FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
		}
	}
}
