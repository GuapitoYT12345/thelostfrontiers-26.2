package com.opaqueyardinfinity.thelostfrontiers.item;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheLostFrontiers.MOD_ID);

    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.registerSimpleItem("raw_silver");

    public static final DeferredItem<Item> SILVER_SWORD = ITEMS.registerItem("silver_sword",
            properties -> new Item(properties.sword(ModToolTiers.SILVER, 3f, -2.4f)));
    public static final DeferredItem<Item> SILVER_PICKAXE = ITEMS.registerItem("silver_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.SILVER, 1f, -2.8f)));
    public static final DeferredItem<Item> SILVER_SHOVEL = ITEMS.registerItem("silver_shovel",
            properties -> new ShovelItem(ModToolTiers.SILVER, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> SILVER_AXE = ITEMS.registerItem("silver_axe",
            properties -> new AxeItem(ModToolTiers.SILVER, 5.5f, -3.2f, properties));
    public static final DeferredItem<Item> SILVER_HOE = ITEMS.registerItem("silver_hoe",
            properties -> new HoeItem(ModToolTiers.SILVER, -2.5f, -3.0f, properties));
    public static final DeferredItem<Item> SILVER_SPEAR = ITEMS.registerItem("silver_spear",
            properties -> new Item(properties.spear(ModToolTiers.SILVER, 1, 1.0125f, 0.55f,
                    2.52f, 10.5f, 6.625f, 5.1f, 10.625f, 4.6f)));

    public static final DeferredItem<Item> SILVER_HELMET = ITEMS.registerItem("silver_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> SILVER_CHESTPLATE = ITEMS.registerItem("silver_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> SILVER_LEGGINGS = ITEMS.registerItem("silver_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> SILVER_BOOTS = ITEMS.registerItem("silver_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorType.BOOTS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
