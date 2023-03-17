package net.sghettius.legaltendermod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sghettius.legaltendermod.LegalTenderMod;

public class ModItems {
    public static final Item GOLD_COIN = registerItem("gold_coin",
        new Item(new FabricItemSettings()));
    public static final Item IRON_COIN = registerItem("iron_coin",
        new Item(new FabricItemSettings()));
    public static final Item COPPER_COIN = registerItem("copper_coin",
        new Item(new FabricItemSettings()));
    public static final Item RAW_GARNIERITE = registerItem("raw_garnierite",
            new Item(new FabricItemSettings()));
    public static final Item ANHYDROUS_NICKEL = registerItem("anhydrous_nickel",
            new Item(new FabricItemSettings()));
    public static final Item NICKEL_PELLET = registerItem("nickel_pellet",
            new Item(new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LegalTenderMod.MOD_ID, name), item);
    }

    public static void  addItemsToItemGroups() {

        addToItemGroup(ModItemGroup.LEGAlTENDER, GOLD_COIN);
        addToItemGroup(ModItemGroup.LEGAlTENDER, IRON_COIN);
        addToItemGroup(ModItemGroup.LEGAlTENDER, COPPER_COIN);
        addToItemGroup(ModItemGroup.LEGAlTENDER, RAW_GARNIERITE);
        addToItemGroup(ModItemGroup.LEGAlTENDER, ANHYDROUS_NICKEL);
        addToItemGroup(ModItemGroup.LEGAlTENDER, NICKEL_PELLET);
        addToItemGroup(ModItemGroup.LEGAlTENDER, NICKEL_INGOT);



    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        LegalTenderMod.LOGGER.info("Registering Mod Items for " + LegalTenderMod.MOD_ID);

        addItemsToItemGroups();
    }
}
