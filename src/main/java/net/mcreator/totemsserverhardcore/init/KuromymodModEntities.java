/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EntityType$Builder
 *  net.minecraft.world.entity.MobCategory
 *  net.minecraftforge.event.entity.EntityAttributeCreationEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.entity.AldeanoEntity;
import net.mcreator.totemsserverhardcore.entity.AldeanocactusEntity;
import net.mcreator.totemsserverhardcore.entity.AldeanocalabazaEntity;
import net.mcreator.totemsserverhardcore.entity.AldeanohongomaloEntity;
import net.mcreator.totemsserverhardcore.entity.AldeanopinaEntity;
// import net.mcreator.totemsserverhardcore.entity.AldeanozombieEntity;
import net.mcreator.totemsserverhardcore.entity.GolemCalabazaEntity;
import net.mcreator.totemsserverhardcore.entity.GolemEntity;
import net.mcreator.totemsserverhardcore.entity.GolemHongoEntity;
import net.mcreator.totemsserverhardcore.entity.GolemcactusEntity;
import net.mcreator.totemsserverhardcore.entity.GolemtomateEntity;
import net.mcreator.totemsserverhardcore.entity.GolemuvaEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class KuromymodModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ENTITY_TYPES, (String)"kuromymod");
    public static final RegistryObject<EntityType<AldeanoEntity>> ALDEANO = KuromymodModEntities.register("aldeano", 
        EntityType.Builder.<AldeanoEntity>of(AldeanoEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(AldeanoEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<AldeanopinaEntity>> ALDEANOPINA = KuromymodModEntities.register("aldeanopina", 
        EntityType.Builder.<AldeanopinaEntity>of(AldeanopinaEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(AldeanopinaEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<AldeanocactusEntity>> ALDEANOCACTUS = KuromymodModEntities.register("aldeanocactus", 
        EntityType.Builder.<AldeanocactusEntity>of(AldeanocactusEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(AldeanocactusEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<AldeanocalabazaEntity>> ALDEANOCALABAZA = KuromymodModEntities.register("aldeanocalabaza", 
        EntityType.Builder.<AldeanocalabazaEntity>of(AldeanocalabazaEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(AldeanocalabazaEntity::new).sized(0.6f, 1.95f));
    // public static final RegistryObject<EntityType<AldeanozombieEntity>> ALDEANOZOMBIE = KuromymodModEntities.register("aldeanozombie", EntityType.Builder.of(AldeanozombieEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AldeanozombieEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<AldeanohongomaloEntity>> ALDEANOHONGOMALO = KuromymodModEntities.register("aldeanohongomalo", 
        EntityType.Builder.<AldeanohongomaloEntity>of(AldeanohongomaloEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(AldeanohongomaloEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<GolemEntity>> GOLEM = KuromymodModEntities.register("golem", 
        EntityType.Builder.<GolemEntity>of(GolemEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(GolemEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<GolemuvaEntity>> GOLEMUVA = KuromymodModEntities.register("golemuva", 
        EntityType.Builder.<GolemuvaEntity>of(GolemuvaEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(GolemuvaEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<GolemtomateEntity>> GOLEMTOMATE = KuromymodModEntities.register("golemtomate", 
        EntityType.Builder.<GolemtomateEntity>of(GolemtomateEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(GolemtomateEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<GolemcactusEntity>> GOLEMCACTUS = KuromymodModEntities.register("golemcactus", 
        EntityType.Builder.<GolemcactusEntity>of(GolemcactusEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(GolemcactusEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<GolemCalabazaEntity>> GOLEM_CALABAZA = KuromymodModEntities.register("golem_calabaza", 
        EntityType.Builder.<GolemCalabazaEntity>of(GolemCalabazaEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(GolemCalabazaEntity::new).sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<GolemHongoEntity>> GOLEM_HONGO = KuromymodModEntities.register("golem_hongo", 
        EntityType.Builder.<GolemHongoEntity>of(GolemHongoEntity::new, MobCategory.MONSTER)
            .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
            .setCustomClientFactory(GolemHongoEntity::new).sized(0.6f, 1.95f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AldeanoEntity.init();
            AldeanopinaEntity.init();
            AldeanocactusEntity.init();
            AldeanocalabazaEntity.init();
            // AldeanozombieEntity.init();
            AldeanohongomaloEntity.init();
            GolemEntity.init();
            GolemuvaEntity.init();
            GolemtomateEntity.init();
            GolemcactusEntity.init();
            GolemCalabazaEntity.init();
            GolemHongoEntity.init();
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put((EntityType)ALDEANO.get(), AldeanoEntity.createAttributes().build());
        event.put((EntityType)ALDEANOPINA.get(), AldeanopinaEntity.createAttributes().build());
        event.put((EntityType)ALDEANOCACTUS.get(), AldeanocactusEntity.createAttributes().build());
        event.put((EntityType)ALDEANOCALABAZA.get(), AldeanocalabazaEntity.createAttributes().build());
        // event.put((EntityType)ALDEANOZOMBIE.get(), AldeanozombieEntity.createAttributes().build());
        event.put((EntityType)ALDEANOHONGOMALO.get(), AldeanohongomaloEntity.createAttributes().build());
        event.put((EntityType)GOLEM.get(), GolemEntity.createAttributes().build());
        event.put((EntityType)GOLEMUVA.get(), GolemuvaEntity.createAttributes().build());
        event.put((EntityType)GOLEMTOMATE.get(), GolemtomateEntity.createAttributes().build());
        event.put((EntityType)GOLEMCACTUS.get(), GolemcactusEntity.createAttributes().build());
        event.put((EntityType)GOLEM_CALABAZA.get(), GolemCalabazaEntity.createAttributes().build());
        event.put((EntityType)GOLEM_HONGO.get(), GolemHongoEntity.createAttributes().build());
    }
}

