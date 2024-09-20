package net.theminecraftman.advancedvaluables.AV_Templates;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.function.Supplier;

public class AdvancedValuables_BlockClass
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedValuables.MOD_ID);

    public static final RegistryObject<Block> BLUE_SAPPHIRE_BLOCK = registerSimpleBlock("blue_sapphire_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> RED_SAPPHIRE_BLOCK = registerSimpleBlock("red_sapphire_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> GREEN_SAPPHIRE_BLOCK = registerSimpleBlock("green_sapphire_block", SoundType.AMETHYST);

    public static final RegistryObject<Block> RED_GARNET_BLOCK = registerSimpleBlock("red_garnet_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> BLUE_GARNET_BLOCK = registerSimpleBlock("blue_garnet_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> PINK_GARNET_BLOCK = registerSimpleBlock("pink_garnet_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> YELLOW_GARNET_BLOCK = registerSimpleBlock("yellow_garnet_block", SoundType.AMETHYST);

    public static final RegistryObject<Block> FUSION_BLOCK = registerSimpleFireResistantBlock("fusion_block", SoundType.NETHERITE_BLOCK);

    public static final RegistryObject<Block> RUBY_BLOCK = registerSimpleBlock("ruby_block", SoundType.AMETHYST);

    public static final RegistryObject<Block> BLUE_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("blue_raw_sapphire_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> RED_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("red_raw_sapphire_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> GREEN_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("green_raw_sapphire_block", SoundType.AMETHYST);

    public static final RegistryObject<Block> RED_RAW_GARNET_BLOCK = registerSimpleBlock("red_raw_garnet_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> BLUE_RAW_GARNET_BLOCK = registerSimpleBlock("blue_raw_garnet_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> PINK_RAW_GARNET_BLOCK = registerSimpleBlock("pink_raw_garnet_block", SoundType.AMETHYST);
    public static final RegistryObject<Block> YELLOW_RAW_GARNET_BLOCK = registerSimpleBlock("yellow_raw_garnet_block", SoundType.AMETHYST);

    public static final RegistryObject<Block> RAW_FUSION_BLOCK = registerSimpleFireResistantBlock("raw_fusion_block", SoundType.NETHERITE_BLOCK);

    public static final RegistryObject<Block> RAW_RUBY_BLOCK = registerSimpleBlock("raw_ruby_block", SoundType.AMETHYST);

    // -- Ores -- // -- Stone -- //
    public static final RegistryObject<Block> RED_SAPPHIRE_ORE = registerStoneOreBlock("red_sapphire_ore", 2, 4);
    public static final RegistryObject<Block> BLUE_SAPPHIRE_ORE = registerStoneOreBlock("blue_sapphire_ore", 2, 4);
    public static final RegistryObject<Block> GREEN_SAPPHIRE_ORE = registerStoneOreBlock("green_sapphire_ore", 2, 4);

    public static final RegistryObject<Block> RED_GARNET_ORE = registerStoneOreBlock("red_garnet_ore", 2, 5);
    public static final RegistryObject<Block> BLUE_GARNET_ORE = registerStoneOreBlock("blue_garnet_ore", 2, 5);
    public static final RegistryObject<Block> PINK_GARNET_ORE = registerStoneOreBlock("pink_garnet_ore", 2, 5);
    public static final RegistryObject<Block> YELLOW_GARNET_ORE = registerStoneOreBlock("yellow_garnet_ore", 2, 5);

    public static final RegistryObject<Block> FUSION_ORE = registerStoneOreBlock("fusion_ore", 5, 10);

    public static final RegistryObject<Block> RUBY_ORE = registerStoneOreBlock("ruby_ore", 2, 6);

    // -- Ores -- // -- Deepslate -- //
    public static final RegistryObject<Block> DEEPSLATE_RED_SAPPHIRE_ORE = registerDeepSlateOreBlock("red_sapphire_deepslate_ore", 2, 5);
    public static final RegistryObject<Block> DEEPSLATE_BLUE_SAPPHIRE_ORE = registerDeepSlateOreBlock("blue_sapphire_deepslate_ore", 2, 5);
    public static final RegistryObject<Block> DEEPSLATE_GREEN_SAPPHIRE_ORE = registerDeepSlateOreBlock("green_sapphire_deepslate_ore", 2, 5);

    public static final RegistryObject<Block> DEEPSLATE_RED_GARNET_ORE = registerDeepSlateOreBlock("red_garnet_deepslate_ore", 2, 6);
    public static final RegistryObject<Block> DEEPSLATE_BLUE_GARNET_ORE = registerDeepSlateOreBlock("blue_garnet_deepslate_ore", 2, 6);
    public static final RegistryObject<Block> DEEPSLATE_PINK_GARNET_ORE = registerDeepSlateOreBlock("pink_garnet_deepslate_ore", 2, 6);
    public static final RegistryObject<Block> DEEPSLATE_YELLOW_GARNET_ORE = registerDeepSlateOreBlock("yellow_garnet_deepslate_ore", 2, 6);

    public static final RegistryObject<Block> DEEPSLATE_FUSION_ORE = registerDeepSlateOreBlock("fusion_deepslate_ore", 6, 12);

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerDeepSlateOreBlock("ruby_deepslate_ore", 2, 7);

    private static RegistryObject<Block> registerStoneOreBlock(String name, int minValue, int maxValue)
    {
        return registerBlock(name, () -> new DropExperienceBlock(UniformInt.of(minValue, maxValue), BlockBehaviour.Properties.of().strength(4f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerDeepSlateOreBlock(String name, int minValue, int maxValue)
    {
        return registerBlock(name, () -> new DropExperienceBlock(UniformInt.of(minValue, maxValue), BlockBehaviour.Properties.of().strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerSimpleBlock(String name, SoundType soundType)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .sound(soundType)
                .requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerSimpleFireResistantBlock(String name, SoundType soundType)
    {
        return registerFireResistantBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .sound(soundType)
                .requiresCorrectToolForDrops()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        AdvancedValuables_ItemClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerFireResistantBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFireResistantBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerFireResistantBlockItem(String name, RegistryObject<T> block)
    {
        AdvancedValuables_ItemClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}