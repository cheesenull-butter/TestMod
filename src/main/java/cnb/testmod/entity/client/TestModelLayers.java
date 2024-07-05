package cnb.testmod.entity.client;

import cnb.testmod.TestMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class TestModelLayers {
    public static final EntityModelLayer SNAIL =
            new EntityModelLayer(new Identifier(TestMod.MOD_ID, "snail"), "main");
}
