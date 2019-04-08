package tk.diamondbuildz.mod.character.util;

import net.minecraft.util.math.AxisAlignedBB;
import tk.diamondbuildz.mod.character.Main;

public class Reference {
    public static final String MOD_NAME = "Diamond's Character Mod";

    public static final String MOD_ID = "character_mod";

    /**
     * The fully qualified name of the version of IProxy that gets injected into {@link Main#proxy} on a PHYSICAL CLIENT
     */
    public static final String CLIENT_PROXY_CLASS = "tk.diamondbuildz.mod.character.client.ClientProxy";

    /**
     * The fully qualified name of the version of IProxy that gets injected into {@link Main#proxy} on a PHYSICAL/DEDICATED SERVER
     */
    public static final String SERVER_PROXY_CLASS = "tk.diamondbuildz.mod.character.server.ServerProxy";

    /**
     * @see "https://maven.apache.org/enforcer/enforcer-rules/versionRanges.html"
     */
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";

    /**
     * @see "https://maven.apache.org/enforcer/enforcer-rules/versionRanges.html"
     */
    public static final String DEPENDENCIES =
            "required-after:minecraft;" +
            "required-after:forge@[14.23.5.2768,);";

    /**
     * "@VERSION@" is replaced by build.gradle with the actual version
     * @see <a href= "https://mcforge.readthedocs.io/en/latest/conventions/versioning/">Forge Versioning Docs</a>
     */
    public static final String VERSION = "@VERSION@";

    /**
     * "@FINGERPRINT@" is replaced by build.gradle with the actual fingerprint
     * @see "https://tutorials.darkhax.net/tutorials/jar_signing/"
     */
    public static final String CERTIFICATE_FINGERPRINT = "@FINGERPRINT@";

    /**
     * Bounding Boxes for blocks
     */
    // A
    public static final AxisAlignedBB A_NS = new AxisAlignedBB(0.0625 * 3, 0 , 0.0625 * 7, 0.0625 * 13, 0.0625 * 13, 0.0625 * 9);
    public static final AxisAlignedBB A_EW = new AxisAlignedBB(0.0625 * 7, 0 , 0.0625 * 3, 0.0625 * 9, 0.0625 * 13, 0.0625 * 13);
    // B
    public static final AxisAlignedBB B_NS = new AxisAlignedBB(0.0625 * 3, 0 , 0.0625 * 7, 0.0625 * 12, 0.0625 * 12, 0.0625 * 9);
    public static final AxisAlignedBB B_EW = new AxisAlignedBB(0.0625 * 7, 0 , 0.0625 * 3, 0.0625 * 9, 0.0625 * 12, 0.0625 * 12);
}
