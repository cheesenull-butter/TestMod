package cnb.testmod;

import cnb.testmod.entity.TestEntities;
import cnb.testmod.entity.client.SnailModel;
import cnb.testmod.entity.client.SnailRenderer;
import cnb.testmod.entity.client.TestModelLayers;
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
