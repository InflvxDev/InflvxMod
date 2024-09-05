package inflvx.mod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {

    public static Item register(Item item, String id) {

        Identifier itemID = Identifier.of("inflvxmod", id);
        return Registry.register(Registries.ITEM, itemID, item);

    }

}
