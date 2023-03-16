package net.sghettius.legaltendermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.sghettius.legaltendermod.LegalTenderMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup LEGAlTENDER;

    public static void registerItemGroups() {
       LEGAlTENDER = FabricItemGroup.builder(new Identifier(LegalTenderMod.MOD_ID, "legaltender"))
               .displayName(Text.translatable("itemgroup.legaltender"))
               .icon(() -> new ItemStack(ModItems.GOLD_COIN)).build();
    }

}


