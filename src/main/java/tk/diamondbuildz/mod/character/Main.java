package tk.diamondbuildz.mod.character;

import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tk.diamondbuildz.mod.character.util.IProxy;
import tk.diamondbuildz.mod.character.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Random;

import static tk.diamondbuildz.mod.character.util.Reference.MOD_ID;

@Mod(
        modid = MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS,
        dependencies = Reference.DEPENDENCIES,
        certificateFingerprint = Reference.CERTIFICATE_FINGERPRINT
)
public class Main {

    public static final Logger CHARACTER_MOD_LOG = LogManager.getLogger(MOD_ID);
    private static final Logger LOGGER = LogManager.getLogger();

    @Mod.Instance(MOD_ID)
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /**
     * Run before anything else. <s>Read your config, create blocks, items, etc, and register them with the GameRegistry</s>
     *
     * @param event the event
     * @see ForgeModContainer#preInit(FMLPreInitializationEvent)
     */
    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        LOGGER.debug("--------------------------------------PRE-INIT--------------------------------------");
        proxy.logPhysicalSide(CHARACTER_MOD_LOG);
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes, send FMLInterModComms messages to other mods.
     *
     * @param event the event
     */
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {
        LOGGER.debug("--------------------------------------INIT--------------------------------------");
    }

    /**
     * Mod compatibility, or anything which depends on other mods’ init phases being finished.
     *
     * @param event the event
     * @see ForgeModContainer#postInit(FMLPostInitializationEvent)
     */
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {
        LOGGER.debug("--------------------------------------POST-INIT--------------------------------------");
    }

    /**
     * Do your invalid fingerprint handling here
     *
     * @param event the event
     * @see "https://tutorials.darkhax.net/tutorials/jar_signing/" and "https://mcforge.readthedocs.io/en/latest/concepts/jarsigning/"
     */
    @Mod.EventHandler
    public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
        CHARACTER_MOD_LOG.warn("Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been tampered with. This version will NOT be supported by the author!");
    }

    /**
     *
     * @param min randomNumber#min
     * @param max randomNumber#max
     * @return
     */
    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}