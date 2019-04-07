package tk.diamondbuildz.mod.character.client;

import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tk.diamondbuildz.mod.character.init.ModBlocks;
import tk.diamondbuildz.mod.character.init.ModItems;

import javax.annotation.Nonnull;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;
import static tk.diamondbuildz.mod.character.util.Reference.MOD_ID;

/**
 * Subscribe to events that should be handled on the PHYSICAL CLIENT in this class
 *
 * Edited by Diamond made by Cadiboo
 *
 * @author Diamond
 * @author Cadiboo
 */
@EventBusSubscriber(modid = MOD_ID, value = CLIENT)
public final class ClientEventSubscriber {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String DEFAULT_VARIANT = "normal";

    @SubscribeEvent
    public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {

        /*
        registerTileEntitySpecialRenderers();
        LOGGER.debug("Registered tile entity special renderers");

        registerEntityRenderers();
        LOGGER.debug("Registered entity renderers");
        */

        // Registration can be automated like this
        // But when you're learning its better to manually register your objects
        /*
		ForgeRegistries.BLOCKS.getValuesCollection().stream()
				.filter(block -> block.getRegistryName().getNamespace().equals(MOD_ID))
				.forEach(ClientEventSubscriber::registerItemBlockModel);
		*/
        registerItemBlockModel(ModBlocks.A_CONCRETE_BLACK);
        registerItemBlockModel(ModBlocks.A_CONCRETE_WHITE);

        /*
        registerItemBlockModel(ModBlocks.A_GLASS_BLACK);
        registerItemBlockModel(ModBlocks.A_GLASS_BLUE);
        registerItemBlockModel(ModBlocks.A_GLASS_BROWN);
        registerItemBlockModel(ModBlocks.A_GLASS_CLEAR);
        registerItemBlockModel(ModBlocks.A_GLASS_CYAN);
        registerItemBlockModel(ModBlocks.A_GLASS_GRAY);
        registerItemBlockModel(ModBlocks.A_GLASS_GREEN);
        registerItemBlockModel(ModBlocks.A_GLASS_LIGHT_BLUE);
        registerItemBlockModel(ModBlocks.A_GLASS_LIME);
        registerItemBlockModel(ModBlocks.A_GLASS_MAGENTA);
        registerItemBlockModel(ModBlocks.A_GLASS_ORANGE);
        registerItemBlockModel(ModBlocks.A_GLASS_PINK);
        registerItemBlockModel(ModBlocks.A_GLASS_PURPLE);
        registerItemBlockModel(ModBlocks.A_GLASS_RED);
        registerItemBlockModel(ModBlocks.A_GLASS_SILVER);
        registerItemBlockModel(ModBlocks.A_GLASS_WHITE);
        registerItemBlockModel(ModBlocks.A_GLASS_YELLOW);
        /*
        registerItemBlockModel(ModBlocks.B_CONCRETE_BLACK);
        registerItemBlockModel(ModBlocks.B_CONCRETE_BLUE);
        registerItemBlockModel(ModBlocks.B_CONCRETE_BROWN);
        registerItemBlockModel(ModBlocks.B_CONCRETE_CYAN);
        registerItemBlockModel(ModBlocks.B_CONCRETE_GRAY);
        registerItemBlockModel(ModBlocks.B_CONCRETE_GREEN);
        registerItemBlockModel(ModBlocks.B_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(ModBlocks.B_CONCRETE_LIME);
        registerItemBlockModel(ModBlocks.B_CONCRETE_MAGENTA);
        registerItemBlockModel(ModBlocks.B_CONCRETE_ORANGE);
        registerItemBlockModel(ModBlocks.B_CONCRETE_PINK);
        */

        registerItemModel(ModItems.GLASS_SHARD_BLACK);
        registerItemModel(ModItems.GLASS_SHARD_BLUE);
        registerItemModel(ModItems.GLASS_SHARD_BROWN);
        registerItemModel(ModItems.GLASS_SHARD_CLEAR);
        registerItemModel(ModItems.GLASS_SHARD_CYAN);
        registerItemModel(ModItems.GLASS_SHARD_GRAY);
        registerItemModel(ModItems.GLASS_SHARD_GREEN);
        registerItemModel(ModItems.GLASS_SHARD_LIGHT_BLUE);
        registerItemModel(ModItems.GLASS_SHARD_LIME);
        registerItemModel(ModItems.GLASS_SHARD_MAGENTA);
        registerItemModel(ModItems.GLASS_SHARD_ORANGE);
        registerItemModel(ModItems.GLASS_SHARD_PINK);
        registerItemModel(ModItems.GLASS_SHARD_PURPLE);
        registerItemModel(ModItems.GLASS_SHARD_RED);
        registerItemModel(ModItems.GLASS_SHARD_SILVER);
        registerItemModel(ModItems.GLASS_SHARD_WHITE);
        registerItemModel(ModItems.GLASS_SHARD_YELLOW);

        registerItemModel(ModItems.DIAMOND_GLASS_CUTTER);
        registerItemModel(ModItems.IRON_GLASS_CUTTER);

        LOGGER.debug("Registered models");

    }

    /*
    private static void registerTileEntitySpecialRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExampleTileEntity.class, new RenderExampleTileEntity());
    }

    private static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(Entity___.class, renderManager -> new Entity___Renderer(renderManager));
    }
    */

    private static void registerItemModel(@Nonnull final Item item) {
        Preconditions.checkNotNull(item, "Item cannot be null!");
        final ResourceLocation registryName = item.getRegistryName();
        Preconditions.checkNotNull(registryName, "Item Registry Name cannot be null!");
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), DEFAULT_VARIANT));
    }

    private static void registerItemBlockModel(@Nonnull final Block block) {
        Preconditions.checkNotNull(block, "Block cannot be null!");
        final ResourceLocation registryName = block.getRegistryName();
        Preconditions.checkNotNull(registryName, "Block Registry Name cannot be null!");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), DEFAULT_VARIANT));
    }

    /*
    @SubscribeEvent
    public static void onTextureStitchEvent(@Nonnull final TextureStitchEvent event) {
        // register texture for example tile entity
        final ResourceLocation registryName = ModBlocks.EXAMPLE_TILE_ENTITY.getRegistryName();
        event.getMap().registerSprite(new ResourceLocation(registryName.getNamespace(), "block/" + registryName.getPath()));
    }
    */

}