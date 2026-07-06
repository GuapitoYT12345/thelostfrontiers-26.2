package com.opaqueyardinfinity.thelostfrontiers.item;

import com.google.common.collect.Maps;
import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> SILVER_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(TheLostFrontiers.MOD_ID, "silver"));

    public static final ArmorMaterial SILVER_ARMOR_MATERIAL = new ArmorMaterial(24,
            makeDefense(), 9, SoundEvents.ARMOR_EQUIP_IRON,
            1.0F, 0.0F, ModTags.Items.SILVER_REPAIRABLE, SILVER_KEY);

    private static Map<ArmorType, Integer> makeDefense() {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 7, ArmorType.HELMET, 2, ArmorType.BODY, 8)
        );
    }
}

