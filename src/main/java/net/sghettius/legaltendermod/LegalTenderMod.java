package net.sghettius.legaltendermod;

import net.fabricmc.api.ModInitializer;

import net.sghettius.legaltendermod.block.ModBlocks;
import net.sghettius.legaltendermod.item.ModItemGroup;
import net.sghettius.legaltendermod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//test comment
public class LegalTenderMod implements ModInitializer {
	public static final  String MOD_ID = "legaltendermod";
	public static final Logger LOGGER = LoggerFactory.getLogger("legal-tender-mod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}