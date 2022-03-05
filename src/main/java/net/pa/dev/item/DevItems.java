package net.pa.dev.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pa.dev.Dev;

public class DevItems {
/**
 * Creating Items
 */
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

/**
 * Registering Items
 */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, name), item);
    }

    public static void registerDevItems() {
        Dev.LOGGER.info("Registering Mod Items " + Dev.MOD_ID);
    }
}
