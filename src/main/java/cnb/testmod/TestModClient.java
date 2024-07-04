package cnb.test;

import cnb.test.entity.TestEntities;
import cnb.test.entity.client.SnailModel;
import cnb.test.entity.client.SnailRenderer;
import cnb.test.entity.client.TestModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(TestEntities.SNAIL, SnailRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(TestModelLayers.SNAIL, SnailModel::getTexturedModelData);

    }
}
