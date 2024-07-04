package cnb.test;

import cnb.test.entity.SnailEntity;
import cnb.test.entity.TestEntities;
import cnb.test.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "test-mod";

	@Override
	public void onInitialize() {

		ModItems.registerItems();

		FabricDefaultAttributeRegistry.register(TestEntities.SNAIL, SnailEntity.createSnailAttributes());

	}
}