package cnb.testmod.entity;

import cnb.testmod.TestMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TestEntities {

    public static final EntityType<SnailEntity> SNAIL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TestMod.MOD_ID, "snail"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SnailEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0F, 1.0F)).build());

}