package inflvx.mod.item;
import inflvx.mod.event.ItemEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;


public class ModItems {


    //    Mi primer Item

    public static final Item SUSPICIOUS_DUST = ItemRegistry.register(
            new Item(new Item.Settings()),
            "suspicious_dust"
    );

    //    Mi primera comida

    public static final Item WITHER_APPLE = ItemRegistry.register(
            new Item(new Item.Settings().food(FoodItems.WITHER_FOOD_COMPONENT)),
            "wither_apple"
    );

    public static void initialize(){
        ItemEvents.setSuspiciousDust();
        ItemEvents.setWitherApple();
    }
}
