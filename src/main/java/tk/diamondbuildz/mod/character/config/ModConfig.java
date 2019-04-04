package tk.diamondbuildz.mod.character.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static tk.diamondbuildz.mod.character.util.Reference.MOD_ID;

/**
 * Our Mod's configuration
 *
 * Edited by Diamond made by Cadiboo
 *
 * @author Diamond
 * @author Cadiboo -- https://github.com/Cadiboo/Example-Mod
 */
@SuppressWarnings("WeakerAccess")
@Config(modid = MOD_ID)
@Config.LangKey(MOD_ID + ".config.title")
public final class ModConfig {

    @Config.Comment("Boolean")
    public static boolean exampleBoolean = false;

    //sub category

    @Config.Comment("Numbers")
    public static Numbers numbers = new Numbers(1, 2.5f, 3.1d);

    public static class Numbers {

        @Config.Comment("An Integer (int) type number")
        public int int_;
        @Config.Comment("A Float (floating point) type number")
        public float float_;
        @Config.Comment("A Double (double length floating point) type number")
        public double double_;

        public Numbers(final int int_, final float float_, final double double_) {
            this.int_ = int_;
            this.float_ = float_;
            this.double_ = double_;
        }

    }

    @Mod.EventBusSubscriber(modid = MOD_ID)
    private static class EventHandler {

        /**
         * Inject the new values and save to the config file when the config has been changed from the GUI.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(MOD_ID)) {
                ConfigManager.sync(MOD_ID, Config.Type.INSTANCE);
            }
        }

    }

}