package net.pa.dev;

import net.fabricmc.api.ModInitializer;
import net.pa.dev.item.DevItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dev implements ModInitializer {
/**
 * Creating Variables For Shortcut in Every Registering Java Class
 */
    public static final String MOD_ID = "dev";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

/**
 * Initializing The Mod
 */
    @Override
    public void onInitialize() {
        DevItems.registerDevItems();
        LOGGER.info("Hi!");
    }
}