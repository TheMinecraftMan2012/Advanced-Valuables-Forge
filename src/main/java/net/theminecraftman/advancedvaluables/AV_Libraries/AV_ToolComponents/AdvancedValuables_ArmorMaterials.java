package net.theminecraftman.advancedvaluables.AV_Libraries.AV_ToolComponents;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class AdvancedValuables_ArmorMaterials
{
    public static final Holder<ArmorMaterial> BLUE_SAPPHIRE = register("blue_sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get());

    public static final Holder<ArmorMaterial> RED_SAPPHIRE = register("red_sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.RED_SAPPHIRE.get());

    public static final Holder<ArmorMaterial> GREEN_SAPPHIRE = register("green_sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get());

    public static final Holder<ArmorMaterial> RED_GARNET = register("red_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.RED_GARNET.get());

    public static final Holder<ArmorMaterial> BLUE_GARNET = register("blue_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.BLUE_GARNET.get());

    public static final Holder<ArmorMaterial> PINK_GARNET = register("pink_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.PINK_GARNET.get());

    public static final Holder<ArmorMaterial> YELLOW_GARNET = register("yellow_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.YELLOW_GARNET.get());

    public static final Holder<ArmorMaterial> FUSION_GEM = register("fusion_gem", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 10);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 10);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.FUSION_GEM.get());

    public static final Holder<ArmorMaterial> RUBY = register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 4);
            }), 20, 0f, 0f, () -> AdvancedValuables_ItemClass.RUBY.get());

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem)
    {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}
