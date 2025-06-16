package net.pinto.mythandmetal.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.item.customfun.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MythandMetal.MOD_ID);


    public static final RegistryObject<Item> ARBINITE_HELMET = ITEMS.register("arbinite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ARBINITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ARBINITE_CHESTPLATE = ITEMS.register("arbinite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ARBINITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ARBINITE_LEGGINGS = ITEMS.register("arbinite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ARBINITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ARBINITE_BOOTS = ITEMS.register("arbinite_boots",
            () -> new ArmorItem(ModArmorMaterials.ARBINITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ARBINITE = ITEMS.register("arbinite_ingot",
            () -> new Item(new Item.Properties()));





    public static final RegistryObject<Item> SCORIUM_HELMET = ITEMS.register("scorium_helmet",
            () -> new ArmorItem(ModArmorMaterials.SCORIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SCORIUM_CHESTPLATE = ITEMS.register("scorium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SCORIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SCORIUM_LEGGINGS = ITEMS.register("scorium_leggings",
            () -> new ArmorItem(ModArmorMaterials.SCORIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SCORIUM_BOOTS = ITEMS.register("scorium_boots",
            () -> new ArmorItem(ModArmorMaterials.SCORIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SCORIUM = ITEMS.register("scorium",
            () -> new Item(new Item.Properties()));









    public static final RegistryObject<Item> UPGRADE_INGOTSHARD_1 = ITEMS.register("upgrade_ingotshard_1",
            () -> new UpgradeIngotScrap1(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOTSHARD_2 = ITEMS.register("upgrade_ingotshard_2",
            () -> new UpgradeIngotScrap2(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOTSHARD_3 = ITEMS.register("upgrade_ingotshard_3",
            () -> new UpgradeIngotScrap3(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOTSHARD_4 = ITEMS.register("upgrade_ingotshard_4",
            () -> new UpgradeIngotScrap4(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOTSHARD_5 = ITEMS.register("upgrade_ingotshard_5",
            () -> new UpgradeIngotScrap5(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOTSHARD_6 = ITEMS.register("upgrade_ingotshard_6",
            () -> new UpgradeIngotScrap6(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOT_1 = ITEMS.register("upgrade_ingot_1",
            () -> new UpgradeIngot1(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOT_2 = ITEMS.register("upgrade_ingot_2",
            () -> new UpgradeIngot2(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOT_3 = ITEMS.register("upgrade_ingot_3",
            () -> new UpgradeIngot3(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOT_4 = ITEMS.register("upgrade_ingot_4",
            () -> new UpgradeIngot4(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOT_5 = ITEMS.register("upgrade_ingot_5",
            () -> new UpgradeIngot5(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_INGOT_6 = ITEMS.register("upgrade_ingot_6",
            () -> new UpgradeIngot6(new Item.Properties()));













    public static final RegistryObject<Item> EXPLOSIVESWORD = ITEMS.register("explosive_sword",
            ()-> new ExplosiveSwordItem(Tiers.IRON,0,2,new Item.Properties().durability(4)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}

