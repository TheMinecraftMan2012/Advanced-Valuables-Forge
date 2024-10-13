package net.theminecraftman.advancedvaluables.AV_Registries;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
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

    // -- Decor Blocks -- //
    // -- Red Sapphire -- //
    public static final RegistryObject<StairBlock> RED_SAPPHIRE_STAIRS = registerBlock("red_sapphire_stairs",
            () -> new StairBlock(RED_SAPPHIRE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> RED_SAPPHIRE_SLAB = registerBlock("red_sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> RED_SAPPHIRE_PRESSURE_PLATE = registerBlock("red_sapphire_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> RED_SAPPHIRE_BUTTON = registerBlock("red_sapphire_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> RED_SAPPHIRE_FENCE = registerBlock("red_sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> RED_SAPPHIRE_FENCE_GATE = registerBlock("red_sapphire_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> RED_SAPPHIRE_WALL = registerBlock("red_sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> RED_SAPPHIRE_DOOR = registerBlock("red_sapphire_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> RED_SAPPHIRE_TRAPDOOR = registerBlock("red_sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Blue Sapphire -- //
    public static final RegistryObject<StairBlock> BLUE_SAPPHIRE_STAIRS = registerBlock("blue_sapphire_stairs",
            () -> new StairBlock(BLUE_SAPPHIRE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> BLUE_SAPPHIRE_SLAB = registerBlock("blue_sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> BLUE_SAPPHIRE_PRESSURE_PLATE = registerBlock("blue_sapphire_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> BLUE_SAPPHIRE_BUTTON = registerBlock("blue_sapphire_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> BLUE_SAPPHIRE_FENCE = registerBlock("blue_sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> BLUE_SAPPHIRE_FENCE_GATE = registerBlock("blue_sapphire_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> BLUE_SAPPHIRE_WALL = registerBlock("blue_sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> BLUE_SAPPHIRE_DOOR = registerBlock("blue_sapphire_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> BLUE_SAPPHIRE_TRAPDOOR = registerBlock("blue_sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Green Sapphire -- //
    public static final RegistryObject<StairBlock> GREEN_SAPPHIRE_STAIRS = registerBlock("green_sapphire_stairs",
            () -> new StairBlock(GREEN_SAPPHIRE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> GREEN_SAPPHIRE_SLAB = registerBlock("green_sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> GREEN_SAPPHIRE_PRESSURE_PLATE = registerBlock("green_sapphire_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> GREEN_SAPPHIRE_BUTTON = registerBlock("green_sapphire_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> GREEN_SAPPHIRE_FENCE = registerBlock("green_sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> GREEN_SAPPHIRE_FENCE_GATE = registerBlock("green_sapphire_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<WallBlock> GREEN_SAPPHIRE_WALL = registerBlock("green_sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> GREEN_SAPPHIRE_DOOR = registerBlock("green_sapphire_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> GREEN_SAPPHIRE_TRAPDOOR = registerBlock("green_sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Red Garnet -- //
    public static final RegistryObject<StairBlock> RED_GARNET_STAIRS = registerBlock("red_garnet_stairs",
            () -> new StairBlock(RED_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> RED_GARNET_SLAB = registerBlock("red_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> RED_GARNET_PRESSURE_PLATE = registerBlock("red_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> RED_GARNET_BUTTON = registerBlock("red_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> RED_GARNET_FENCE = registerBlock("red_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> RED_GARNET_FENCE_GATE = registerBlock("red_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> RED_GARNET_WALL = registerBlock("red_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> RED_GARNET_DOOR = registerBlock("red_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> RED_GARNET_TRAPDOOR = registerBlock("red_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Blue Garnet -- //
    public static final RegistryObject<StairBlock> BLUE_GARNET_STAIRS = registerBlock("blue_garnet_stairs",
            () -> new StairBlock(BLUE_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> BLUE_GARNET_SLAB = registerBlock("blue_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> BLUE_GARNET_PRESSURE_PLATE = registerBlock("blue_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> BLUE_GARNET_BUTTON = registerBlock("blue_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> BLUE_GARNET_FENCE = registerBlock("blue_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> BLUE_GARNET_FENCE_GATE = registerBlock("blue_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> BLUE_GARNET_WALL = registerBlock("blue_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> BLUE_GARNET_DOOR = registerBlock("blue_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> BLUE_GARNET_TRAPDOOR = registerBlock("blue_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Pink Garnet -- //
    public static final RegistryObject<StairBlock> PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            () -> new StairBlock(PINK_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Yellow Garnet -- //
    public static final RegistryObject<StairBlock> YELLOW_GARNET_STAIRS = registerBlock("yellow_garnet_stairs",
            () -> new StairBlock(YELLOW_GARNET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> YELLOW_GARNET_SLAB = registerBlock("yellow_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> YELLOW_GARNET_PRESSURE_PLATE = registerBlock("yellow_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> YELLOW_GARNET_BUTTON = registerBlock("yellow_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> YELLOW_GARNET_FENCE = registerBlock("yellow_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> YELLOW_GARNET_FENCE_GATE = registerBlock("yellow_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> YELLOW_GARNET_WALL = registerBlock("yellow_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> YELLOW_GARNET_DOOR = registerBlock("yellow_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> YELLOW_GARNET_TRAPDOOR = registerBlock("yellow_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Fusion Gem -- //
    public static final RegistryObject<StairBlock> FUSION_STAIRS = registerBlock("fusion_stairs",
            () -> new StairBlock(FUSION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> FUSION_SLAB = registerBlock("fusion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> FUSION_PRESSURE_PLATE = registerBlock("fusion_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> FUSION_BUTTON = registerBlock("fusion_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> FUSION_FENCE = registerBlock("fusion_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> FUSION_FENCE_GATE = registerBlock("fusion_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> FUSION_WALL = registerBlock("fusion_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> FUSION_DOOR = registerBlock("fusion_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> FUSION_TRAPDOOR = registerBlock("fusion_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    // -- Ruby -- //
    public static final RegistryObject<StairBlock> RUBY_STAIRS = registerBlock("ruby_stairs",
            () -> new StairBlock(RUBY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> RUBY_SLAB = registerBlock("ruby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> RUBY_BUTTON = registerBlock("ruby_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> RUBY_FENCE = registerBlock("ruby_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> RUBY_WALL = registerBlock("ruby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> RUBY_DOOR = registerBlock("ruby_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));


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