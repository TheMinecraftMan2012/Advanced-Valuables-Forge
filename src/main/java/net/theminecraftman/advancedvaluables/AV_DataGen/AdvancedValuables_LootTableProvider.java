package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.theminecraftman.advancedvaluables.AV_DataGen.loot.AdvancedValuables_BlockLootTableProvider;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_LootTableProvider
{
    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> future)
    {
        return new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(AdvancedValuables_BlockLootTableProvider::new, LootContextParamSets.BLOCK)), future);
    }
}
