package cnb.test.item;

import cnb.test.TestMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String string, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, string), item);
    }

    public static void registerItems() {}

}
