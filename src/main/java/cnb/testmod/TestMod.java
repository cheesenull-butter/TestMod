package cnb.testmod;

import cnb.testmod.entity.SnailEntity;
import cnb.testmod.entity.TestEntities;
import cnb.testmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";

	@Override
	public void onInitialize() {

		ModItems.registerItems();

		FabricDefaultAttributeRegistry.register(TestEntities.SNAIL, SnailEntity.createSnailAttributes());

	}
}