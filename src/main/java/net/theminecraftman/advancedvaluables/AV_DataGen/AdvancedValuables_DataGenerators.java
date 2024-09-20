package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AdvancedValuables.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdvancedValuables_DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        BlockTagsProvider blockTagsProvider = new AdvancedValuables_BlockTagsProvider(output, lookupProvider, existingFileHelper);

        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new AdvancedValuables_ItemTagProvider(output, lookupProvider,
                blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), AdvancedValuables_LootTableProvider.create(output, lookupProvider));
        generator.addProvider(event.includeServer(), new AdvancedValuables_WorldGenProviders(output, lookupProvider));
        generator.addProvider(event.includeServer(), new AdvancedValuables_RecipeProvider(output, lookupProvider));

        generator.addProvider(event.includeClient(), new AdvancedValuables_ItemModelProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new AdvancedValuables_BlockStateProvider(output, existingFileHelper));
    }
}
