package net.theminecraftman.advancedvaluables.AV_ToolComponents;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;

public class AdvancedValuables_ToolsTier
{
    public static final Tier RED_SAPPHIRE_TOOL_TIER = new ForgeTier(1900, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_SAPPHIRE_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.RED_SAPPHIRE.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL);
    public static final Tier BLUE_SAPPHIRE_TOOL_TIER = new ForgeTier(1900, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_SAPPHIRE_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL);
    public static final Tier GREEN_SAPPHIRE_TOOL_TIER = new ForgeTier(1900, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_SAPPHIRE_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL);

    public static final Tier RED_GARNET_TOOL_TIER = new ForgeTier(1950, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_GARNET_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.RED_GARNET.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);
    public static final Tier BLUE_GARNET_TOOL_TIER = new ForgeTier(1950, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_GARNET_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.BLUE_GARNET.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);
    public static final Tier PINK_GARNET_TOOL_TIER = new ForgeTier(1950, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_GARNET_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.PINK_GARNET.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);
    public static final Tier YELLOW_GARNET_TOOL_TIER = new ForgeTier(1950, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_ALL_GARNET_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.YELLOW_GARNET.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);

    public static final Tier FUSION_TOOL_TIER = new ForgeTier(2500, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_FUSION_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.FUSION_GEM.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_FUSION_TOOL);
    public static final Tier RUBY_TOOL_TIER = new ForgeTier(2000, 7f, 1.5f, 22, AdvancedValuables_Tags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(AdvancedValuables_ItemClass.RUBY.get()), AdvancedValuables_Tags.Blocks.INCORRECT_FOR_RUBY_TOOL);
}
