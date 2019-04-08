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
import tk.diamondbuildz.mod.character.blockbases.concrete.BlockBaseConcreteB;
import tk.diamondbuildz.mod.character.blocks.a.glass.*;
import tk.diamondbuildz.mod.character.blockbases.concrete.BlockBaseConcreteA;
import tk.diamondbuildz.mod.character.init.ModBlocks;
import tk.diamondbuildz.mod.character.items.ItemBase;
import tk.diamondbuildz.mod.character.items.ItemGlassCutter;
import tk.diamondbuildz.mod.character.util.ModUtil;

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

    // Register Blocks
    @SubscribeEvent
    public static void onRegisterBlocksEvent(@Nonnull final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new BlockBaseConcreteA(), "a_concrete_black"),
                setup(new BlockBaseConcreteA(), "a_concrete_blue"),
                setup(new BlockBaseConcreteA(), "a_concrete_brown"),
                setup(new BlockBaseConcreteA(), "a_concrete_cyan"),
                setup(new BlockBaseConcreteA(), "a_concrete_gray"),
                setup(new BlockBaseConcreteA(), "a_concrete_green"),
                setup(new BlockBaseConcreteA(), "a_concrete_light_blue"),
                setup(new BlockBaseConcreteA(), "a_concrete_lime"),
                setup(new BlockBaseConcreteA(), "a_concrete_magenta"),
                setup(new BlockBaseConcreteA(), "a_concrete_orange"),
                setup(new BlockBaseConcreteA(), "a_concrete_pink"),
                setup(new BlockBaseConcreteA(), "a_concrete_purple"),
                setup(new BlockBaseConcreteA(), "a_concrete_red"),
                setup(new BlockBaseConcreteA(), "a_concrete_silver"),
                setup(new BlockBaseConcreteA(), "a_concrete_white"),
                setup(new BlockBaseConcreteA(), "a_concrete_yellow"),

                setup(new AGlassBlack(), "a_glass_black"),
                setup(new AGlassBlue(), "a_glass_blue"),
                setup(new AGlassBrown(), "a_glass_brown"),
                setup(new AGlassClear(), "a_glass_clear"),
                setup(new AGlassCyan(), "a_glass_cyan"),
                setup(new AGlassGray(), "a_glass_gray"),
                setup(new AGlassGreen(), "a_glass_green"),
                setup(new AGlassLightBlue(), "a_glass_light_blue"),
                setup(new AGlassLime(), "a_glass_lime"),
                setup(new AGlassMagenta(), "a_glass_magenta"),
                setup(new AGlassOrange(), "a_glass_orange"),
                setup(new AGlassPink(), "a_glass_pink"),
                setup(new AGlassPurple(), "a_glass_purple"),
                setup(new AGlassRed(), "a_glass_red"),
                setup(new AGlassSilver(), "a_glass_silver"),
                setup(new AGlassWhite(), "a_glass_white"),
                setup(new AGlassYellow(), "a_glass_yellow"),

                setup(new BlockBaseConcreteB(), "b_concrete_black"),
                setup(new BlockBaseConcreteB(), "b_concrete_blue"),
                setup(new BlockBaseConcreteB(), "b_concrete_brown"),
                setup(new BlockBaseConcreteB(), "b_concrete_cyan"),
                setup(new BlockBaseConcreteB(), "b_concrete_gray"),
                setup(new BlockBaseConcreteB(), "b_concrete_green"),
                setup(new BlockBaseConcreteB(), "b_concrete_light_blue"),
                setup(new BlockBaseConcreteB(), "b_concrete_lime"),
                setup(new BlockBaseConcreteB(), "b_concrete_magenta"),
                setup(new BlockBaseConcreteB(), "b_concrete_orange"),
                setup(new BlockBaseConcreteB(), "b_concrete_pink"),
                setup(new BlockBaseConcreteB(), "b_concrete_purple"),
                setup(new BlockBaseConcreteB(), "b_concrete_red"),
                setup(new BlockBaseConcreteB(), "b_concrete_silver"),
                setup(new BlockBaseConcreteB(), "b_concrete_white"),
                setup(new BlockBaseConcreteB(), "b_concrete_yellow")
        );
        Main.CHARACTER_MOD_LOG.debug("Registered blocks");
    }

    // Register Item Blocks/Items
    @SubscribeEvent
    public static void onRegisterItemsEvent(@Nonnull final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        // Item Blocks
        Arrays.stream(new Block[]{

                ModBlocks.A_CONCRETE_BLACK,
                ModBlocks.A_CONCRETE_BLUE,
                ModBlocks.A_CONCRETE_BROWN,
                ModBlocks.A_CONCRETE_CYAN,
                ModBlocks.A_CONCRETE_GRAY,
                ModBlocks.A_CONCRETE_GREEN,
                ModBlocks.A_CONCRETE_LIGHT_BLUE,
                ModBlocks.A_CONCRETE_LIME,
                ModBlocks.A_CONCRETE_MAGENTA,
                ModBlocks.A_CONCRETE_ORANGE,
                ModBlocks.A_CONCRETE_PINK,
                ModBlocks.A_CONCRETE_PURPLE,
                ModBlocks.A_CONCRETE_RED,
                ModBlocks.A_CONCRETE_SILVER,
                ModBlocks.A_CONCRETE_WHITE,
                ModBlocks.A_CONCRETE_YELLOW,

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
                ModBlocks.B_CONCRETE_PURPLE,
                ModBlocks.B_CONCRETE_RED,
                ModBlocks.B_CONCRETE_SILVER,
                ModBlocks.B_CONCRETE_WHITE,
                ModBlocks.B_CONCRETE_YELLOW,

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
        event.getRegistry().registerAll(
                setup(new ItemBase(), "glass_shard_black"),
                setup(new ItemBase(), "glass_shard_blue"),
                setup(new ItemBase(), "glass_shard_brown"),
                setup(new ItemBase(), "glass_shard_clear"),
                setup(new ItemBase(), "glass_shard_cyan"),
                setup(new ItemBase(), "glass_shard_gray"),
                setup(new ItemBase(), "glass_shard_green"),
                setup(new ItemBase(), "glass_shard_light_blue"),
                setup(new ItemBase(), "glass_shard_lime"),
                setup(new ItemBase(), "glass_shard_magenta"),
                setup(new ItemBase(), "glass_shard_orange"),
                setup(new ItemBase(), "glass_shard_pink"),
                setup(new ItemBase(), "glass_shard_purple"),
                setup(new ItemBase(), "glass_shard_red"),
                setup(new ItemBase(), "glass_shard_silver"),
                setup(new ItemBase(), "glass_shard_white"),
                setup(new ItemBase(), "glass_shard_yellow"),

                setup(new ItemGlassCutter(Item.ToolMaterial.DIAMOND), "cutter_glass_diamond"),
                setup(new ItemGlassCutter(Item.ToolMaterial.IRON), "cutter_glass_iron")
        );
        Main.CHARACTER_MOD_LOG.debug("Registered items");
    }
    // Setup Method
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
}
