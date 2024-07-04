package cnb.test.entity.client;

import cnb.test.TestMod;
import cnb.test.entity.SnailEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SnailRenderer extends MobEntityRenderer<SnailEntity, SnailModel<SnailEntity>> {
    private static final Identifier TEXTURE = new Identifier(TestMod.MOD_ID, "textures/entity/snail/snail_garden.png");

    public SnailRenderer(EntityRendererFactory.Context context) {
        super(context, new SnailModel<>(context.getPart(TestModelLayers.SNAIL)), 0.6F);
    }

    @Override
    public Identifier getTexture(SnailEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SnailEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}