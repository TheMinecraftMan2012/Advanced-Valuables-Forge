package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.theminecraftman.advancedvaluables.AV_WorldGen.AdvancedValuables_BiomeModifiers;
import net.theminecraftman.advancedvaluables.AV_WorldGen.AdvancedValuables_ConfiguredFeatures;
import net.theminecraftman.advancedvaluables.AV_WorldGen.AdvancedValuables_PlacedFeatures;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_WorldGenProviders extends DatapackBuiltinEntriesProvider
{
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, AdvancedValuables_ConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, AdvancedValuables_PlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, AdvancedValuables_BiomeModifiers::bootstrap);

    public AdvancedValuables_WorldGenProviders(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(AdvancedValuables.MOD_ID));
    }
}
