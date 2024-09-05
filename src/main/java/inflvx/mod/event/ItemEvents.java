package inflvx.mod.event;

import inflvx.mod.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.ItemGroups;

public class ItemEvents {

    public static void setSuspiciousDust() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUSPICIOUS_DUST));

        CompostingChanceRegistry.INSTANCE.add(ModItems.SUSPICIOUS_DUST, 0.3f);
    }

    public static void setWitherApple() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.WITHER_APPLE));
    }

}
