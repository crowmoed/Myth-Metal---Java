package net.pinto.mythandmetal.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.entity.ModEntites;
import net.pinto.mythandmetal.entity.client.ModModelLayers;
import net.pinto.mythandmetal.entity.mobs.AshenWolf.AshenWolf;
import net.pinto.mythandmetal.entity.mobs.AshenWolf.AshenWolfModel;
import net.pinto.mythandmetal.entity.mobs.Magmaraakh.MagmaraakhEntity;
import net.pinto.mythandmetal.entity.mobs.Magmaraakh.MagmaraakhModel;
import net.pinto.mythandmetal.entity.mobs.arbinator.ArborinatorEntity;
import net.pinto.mythandmetal.entity.mobs.arbinator.ArborinatorModel;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonSkeleton;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonSpider;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonWiitherSkeleton;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonZombie;

@Mod.EventBusSubscriber(modid = MythandMetal.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntites.ASHENWOLF.get(), AshenWolf.createAttributes().build());
        event.put(ModEntites.DUNGEON_SKELETON.get(), DungeonSkeleton.createAttributes().build());
        event.put(ModEntites.MAGMARAAKH.get(), MagmaraakhEntity.createAttributes().build());
        event.put(ModEntites.ARBINATOR.get(), ArborinatorEntity.createAttributes().build());
        event.put(ModEntites.DUNGEON_WITHER_SKELETON.get(), DungeonWiitherSkeleton.createAttributes().build());
        event.put(ModEntites.DUNGEON_ZOMBIE.get(), DungeonSpider.createAttributes().build());
        event.put(ModEntites.DUNGEON_SPIDER.get(), DungeonZombie.createAttributes().build());
    }
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ASHENWOLF_LAYER, AshenWolfModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MAGMARAAKH_LAYER, MagmaraakhModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ARBINATOR_LAYER, ArborinatorModel::createBodyLayer);
    }


}
