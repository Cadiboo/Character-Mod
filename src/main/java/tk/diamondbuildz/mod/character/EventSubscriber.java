package tk.diamondbuildz.mod.character;

import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import tk.diamondbuildz.mod.character.blocks.a.glass.*;
import tk.diamondbuildz.mod.character.blocks.blockbases.a.BlockBaseConcreteA;
import tk.diamondbuildz.mod.character.init.ModBlocks;
import tk.diamondbuildz.mod.character.items.ItemBase;
import tk.diamondbuildz.mod.character.items.ToolGlassCutter;
import tk.diamondbuildz.mod.character.util.ModUtil;
import tk.diamondbuildz.mod.character.util.Reference;

import javax.annotation.Nonnull;
import java.util.Arrays;

import static tk.diamondbuildz.mod.character.util.Reference.MOD_ID;

/**
 * Subscribe to events that should be handled on both PHYSICAL sides in this class
 *
 * Edited by Diamond; original author Cadiboo
 *
 * @author Diamond
 * @author Cadiboo -- https://github.com/Cadiboo/Example-Mod
 */
@Mod.EventBusSubscriber(modid = MOD_ID)
public final class EventSubscriber {

    // For Entities
    private static int entityId = 0;

    // Register Blocks
    @SubscribeEvent
    public static void onRegisterBlocksEvent(@Nonnull final RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        setup(new BlockBaseConcreteA(), "a_concrete_black");
        setup(new BlockBaseConcreteA(), "a_concrete_white");

        /*
        registry.register(new BlockBaseConcreteA("a_concrete_black"));
        registry.register(new BlockBaseConcreteA("a_concrete_white"));

        registry.register(new AGlassBlack("a_glass_black"));
        registry.register(new AGlassBlue("a_glass_blue"));
        registry.register(new AGlassBrown("a_glass_brown"));
        registry.register(new AGlassClear("a_glass_clear"));
        registry.register(new AGlassCyan("a_glass_cyan"));
        registry.register(new AGlassGray("a_glass_gray"));
        registry.register(new AGlassGreen("a_glass_green"));
        registry.register(new AGlassLightBlue("a_glass_blue"));
        registry.register(new AGlassLime("a_glass_lime"));
        registry.register(new AGlassOrange("a_glass_orange"));
        registry.register(new AGlassMagenta("a_glass_magenta"));
        registry.register(new AGlassPink("a_glass_orange"));
        registry.register(new AGlassPurple("a_glass_pink"));
        registry.register(new AGlassRed("a_glass_purple"));
        registry.register(new AGlassSilver("a_glass_red"));
        registry.register(new AGlassWhite("a_glass_silver"));
        registry.register(new AGlassYellow("a_glass_yellow"));
        */
        /*
        registry.register(new BlockBaseConcreteB("b_concrete_black"));
        registry.register(new BlockBaseConcreteB("b_concrete_blue"));
        registry.register(new BlockBaseConcreteB("b_concrete_brown"));
        registry.register(new BlockBaseConcreteB("b_concrete_cyan"));
        registry.register(new BlockBaseConcreteB("b_concrete_gray"));
        registry.register(new BlockBaseConcreteB("b_concrete_green"));
        registry.register(new BlockBaseConcreteB("b_concrete_light_blue"));
        registry.register(new BlockBaseConcreteB("b_concrete_lime"));
        registry.register(new BlockBaseConcreteB("b_concrete_magenta"));
        registry.register(new BlockBaseConcreteB("b_concrete_orange"));
        registry.register(new BlockBaseConcreteB("b_concrete_pink"));
        */

        Main.CHARACTER_MOD_LOG.debug("Registered blocks");

        //registerTileEntities();

        //Main.CHARACTER_MOD_LOG.debug("Registered tile entities");

    }

    /*
    private static void registerTileEntities() {
        registerTileEntity(TileEntityExampleTileEntity.class, "example_tile_entity");
    }

    private static void registerTileEntity(@Nonnull final Class<? extends TileEntity> clazz, String name) {
        try {
            GameRegistry.registerTileEntity(clazz, new ResourceLocation(Reference.MOD_ID, name));
        } catch (final Exception exception) {
            CrashReport crashReport = new CrashReport("Error registering Tile Entity " + clazz.getSimpleName(), exception);
            crashReport.makeCategory("Registering Tile Entity");
            throw new ReportedException(crashReport);
        }
    }
    */

    // Register Item Blocks/Items
    @SubscribeEvent
    public static void onRegisterItemsEvent(@Nonnull final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        // Item Blocks
        Arrays.stream(new Block[]{

                ModBlocks.A_CONCRETE_BLACK,
                ModBlocks.A_CONCRETE_WHITE,

                /*
                ModBlocks.A_GLASS_BLACK,
                ModBlocks.A_GLASS_BLUE,
                ModBlocks.A_GLASS_BROWN,
                ModBlocks.A_GLASS_CLEAR,
                ModBlocks.A_GLASS_CYAN,
                ModBlocks.A_GLASS_GRAY,
                ModBlocks.A_GLASS_GREEN,
                ModBlocks.A_GLASS_LIGHT_BLUE,
                ModBlocks.A_GLASS_LIME,
                ModBlocks.A_GLASS_MAGENTA,
                ModBlocks.A_GLASS_ORANGE,
                ModBlocks.A_GLASS_PINK,
                ModBlocks.A_GLASS_PURPLE,
                ModBlocks.A_GLASS_RED,
                ModBlocks.A_GLASS_SILVER,
                ModBlocks.A_GLASS_WHITE,
                ModBlocks.A_GLASS_YELLOW,
                */
                /*
                ModBlocks.B_CONCRETE_BLACK,
                ModBlocks.B_CONCRETE_BLUE,
                ModBlocks.B_CONCRETE_BROWN,
                ModBlocks.B_CONCRETE_CYAN,
                ModBlocks.B_CONCRETE_GRAY,
                ModBlocks.B_CONCRETE_GREEN,
                ModBlocks.B_CONCRETE_LIGHT_BLUE,
                ModBlocks.B_CONCRETE_LIME,
                ModBlocks.B_CONCRETE_MAGENTA,
                ModBlocks.B_CONCRETE_ORANGE,
                ModBlocks.B_CONCRETE_PINK,
                */

        }).forEach(block -> {
            Preconditions.checkNotNull(block.getRegistryName(), "Registry name cannot be null!");
            registry.register(
                    ModUtil.setCreativeTab(
                            ModUtil.setRegistryNames(
                                    new ItemBlock(block),
                                    block.getRegistryName())
                    )
            );
        });

        // Items
        setup(new ItemBase(), "glass_shard_black");
        setup(new ItemBase(), "glass_shard_blue");
        setup(new ItemBase(), "glass_shard_brown");
        setup(new ItemBase(), "glass_shard_clear");
        setup(new ItemBase(), "glass_shard_cyan");
        setup(new ItemBase(), "glass_shard_gray");
        setup(new ItemBase(), "glass_shard_green");
        setup(new ItemBase(), "glass_shard_light_blue");
        setup(new ItemBase(), "glass_shard_lime");
        setup(new ItemBase(), "glass_shard_magenta");
        setup(new ItemBase(), "glass_shard_orange");
        setup(new ItemBase(), "glass_shard_pink");
        setup(new ItemBase(), "glass_shard_purple");
        setup(new ItemBase(), "glass_shard_red");
        setup(new ItemBase(), "glass_shard_silver");
        setup(new ItemBase(), "glass_shard_white");
        setup(new ItemBase(), "glass_shard_yellow");
        /*
        registry.register(new ItemBase("glass_shard_black"));
        registry.register(new ItemBase("glass_shard_blue"));
        registry.register(new ItemBase("glass_shard_brown"));
        registry.register(new ItemBase("glass_shard_clear"));
        registry.register(new ItemBase("glass_shard_cyan"));
        registry.register(new ItemBase("glass_shard_gray"));
        registry.register(new ItemBase("glass_shard_green"));
        registry.register(new ItemBase("glass_shard_light_blue"));
        registry.register(new ItemBase("glass_shard_lime"));
        registry.register(new ItemBase("glass_shard_magenta"));
        registry.register(new ItemBase("glass_shard_orange"));
        registry.register(new ItemBase("glass_shard_pink"));
        registry.register(new ItemBase("glass_shard_purple"));
        registry.register(new ItemBase("glass_shard_red"));
        registry.register(new ItemBase("glass_shard_silver"));
        registry.register(new ItemBase("glass_shard_white"));
        registry.register(new ItemBase("glass_shard_yellow"));

        registry.register(new ToolGlassCutter("diamond_glass_cutter", Item.ToolMaterial.DIAMOND));
        registry.register(new ToolGlassCutter("iron_glass_cutter", Item.ToolMaterial.IRON));
        */

        Main.CHARACTER_MOD_LOG.debug("Registered items");
    }
    //setup method
    @Nonnull
    public static <T extends IForgeRegistryEntry> T setup(@Nonnull final T entry, @Nonnull final String name) {
        return setup(entry, new ResourceLocation(MOD_ID, name));
    }

    @Nonnull
    public static <T extends IForgeRegistryEntry> T setup(@Nonnull final T entry, @Nonnull final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        if (entry instanceof Block) {
            ((Block) entry).setTranslationKey(MOD_ID + "." + registryName.getPath());
        }
        if (entry instanceof Item) {
            ((Item) entry).setTranslationKey(MOD_ID + "." + registryName.getPath());
        }
        return entry;
    }

    /*
    // Register Entities
    @SubscribeEvent
    public static void onRegisterEntitiesEvent(@Nonnull final RegistryEvent.Register<EntityEntry> event) {
        final IForgeRegistry<EntityEntry> registry = event.getRegistry();

        {
			final Class clazz = Entity____.class;
			final ResourceLocation registryName = new ResourceLocation(MOD_ID, ModUtil.getRegistryNameForClass(clazz, "Entity"));
			registry.register(
					EntityEntryBuilder.create()
							.entity(clazz)
							.id(registryName, entityId++)
							.name(registryName.getPath())
							.tracker(range, updateFrequency, sendVelocityUpdates)
							.egg(primaryColor, secondaryColor)
							.build()
			);
        }

        Main.CHARACTER_MOD_LOG.debug("Registered entities");

    }
    */

}
