package net.spacegoat.block_of;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.spacegoat.block_of.blocks.ModBlocks;
import net.spacegoat.block_of.config.ModConfig;

public class ModMain implements ModInitializer {
	public static final String MOD_ID = "block_of";

	@Override
	public void onInitialize() {
		if (ModConfig.getConfig().Categories.enableMeatBlocks){
			ModBlocks.MeatBlocks.registerMeatBlocks();
		}
		if (ModConfig.getConfig().Categories.enablePlantBlocks){
			ModBlocks.PlantBlocks.registerPlantBlocks();
		}

		//FUEL REGISTRIES
		if (ModConfig.getConfig().Gameplay.enableBambooBlockFuel){
			FuelRegistry.INSTANCE.add(OldBlocks.BAMBOO_BLOCK, 450);
		}
		if (ModConfig.getConfig().Gameplay.enableCharcoalBlockFuel){
			FuelRegistry.INSTANCE.add(OldBlocks.CHARCOAL_BLOCK, 16000);
		}
	}
}
