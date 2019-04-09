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

import javax.annotation.Nonnull;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;
import static tk.diamondbuildz.mod.character.init.ModBlocks.*;
import static tk.diamondbuildz.mod.character.init.ModItems.*;
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

        registerItemBlockModel(A_CONCRETE_BLACK);
        registerItemBlockModel(A_CONCRETE_BLUE);
        registerItemBlockModel(A_CONCRETE_BROWN);
        registerItemBlockModel(A_CONCRETE_CYAN);
        registerItemBlockModel(A_CONCRETE_GRAY);
        registerItemBlockModel(A_CONCRETE_GREEN);
        registerItemBlockModel(A_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(A_CONCRETE_LIME);
        registerItemBlockModel(A_CONCRETE_MAGENTA);
        registerItemBlockModel(A_CONCRETE_ORANGE);
        registerItemBlockModel(A_CONCRETE_PINK);
        registerItemBlockModel(A_CONCRETE_PURPLE);
        registerItemBlockModel(A_CONCRETE_RED);
        registerItemBlockModel(A_CONCRETE_SILVER);
        registerItemBlockModel(A_CONCRETE_WHITE);
        registerItemBlockModel(A_CONCRETE_YELLOW);

        registerItemBlockModel(B_CONCRETE_BLACK);
        registerItemBlockModel(B_CONCRETE_BLUE);
        registerItemBlockModel(B_CONCRETE_BROWN);
        registerItemBlockModel(B_CONCRETE_CYAN);
        registerItemBlockModel(B_CONCRETE_GRAY);
        registerItemBlockModel(B_CONCRETE_GREEN);
        registerItemBlockModel(B_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(B_CONCRETE_LIME);
        registerItemBlockModel(B_CONCRETE_MAGENTA);
        registerItemBlockModel(B_CONCRETE_ORANGE);
        registerItemBlockModel(B_CONCRETE_PINK);
        registerItemBlockModel(B_CONCRETE_PURPLE);
        registerItemBlockModel(B_CONCRETE_RED);
        registerItemBlockModel(B_CONCRETE_SILVER);
        registerItemBlockModel(B_CONCRETE_WHITE);
        registerItemBlockModel(B_CONCRETE_YELLOW);

        registerItemBlockModel(C_CONCRETE_BLACK);
        registerItemBlockModel(C_CONCRETE_BLUE);
        registerItemBlockModel(C_CONCRETE_BROWN);
        registerItemBlockModel(C_CONCRETE_CYAN);
        registerItemBlockModel(C_CONCRETE_GRAY);
        registerItemBlockModel(C_CONCRETE_GREEN);
        registerItemBlockModel(C_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(C_CONCRETE_LIME);
        registerItemBlockModel(C_CONCRETE_MAGENTA);
        registerItemBlockModel(C_CONCRETE_ORANGE);
        registerItemBlockModel(C_CONCRETE_PINK);
        registerItemBlockModel(C_CONCRETE_PURPLE);
        registerItemBlockModel(C_CONCRETE_RED);
        registerItemBlockModel(C_CONCRETE_SILVER);
        registerItemBlockModel(C_CONCRETE_WHITE);
        registerItemBlockModel(C_CONCRETE_YELLOW);

        registerItemBlockModel(D_CONCRETE_BLACK);
        registerItemBlockModel(D_CONCRETE_BLUE);
        registerItemBlockModel(D_CONCRETE_BROWN);
        registerItemBlockModel(D_CONCRETE_CYAN);
        registerItemBlockModel(D_CONCRETE_GRAY);
        registerItemBlockModel(D_CONCRETE_GREEN);
        registerItemBlockModel(D_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(D_CONCRETE_LIME);
        registerItemBlockModel(D_CONCRETE_MAGENTA);
        registerItemBlockModel(D_CONCRETE_ORANGE);
        registerItemBlockModel(D_CONCRETE_PINK);
        registerItemBlockModel(D_CONCRETE_PURPLE);
        registerItemBlockModel(D_CONCRETE_RED);
        registerItemBlockModel(D_CONCRETE_SILVER);
        registerItemBlockModel(D_CONCRETE_WHITE);
        registerItemBlockModel(D_CONCRETE_YELLOW);

        registerItemBlockModel(E_CONCRETE_BLACK);
        registerItemBlockModel(E_CONCRETE_BLUE);
        registerItemBlockModel(E_CONCRETE_BROWN);
        registerItemBlockModel(E_CONCRETE_CYAN);
        registerItemBlockModel(E_CONCRETE_GRAY);
        registerItemBlockModel(E_CONCRETE_GREEN);
        registerItemBlockModel(E_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(E_CONCRETE_LIME);
        registerItemBlockModel(E_CONCRETE_MAGENTA);
        registerItemBlockModel(E_CONCRETE_ORANGE);
        registerItemBlockModel(E_CONCRETE_PINK);
        registerItemBlockModel(E_CONCRETE_PURPLE);
        registerItemBlockModel(E_CONCRETE_RED);
        registerItemBlockModel(E_CONCRETE_SILVER);
        registerItemBlockModel(E_CONCRETE_WHITE);
        registerItemBlockModel(E_CONCRETE_YELLOW);

        registerItemBlockModel(F_CONCRETE_BLACK);
        registerItemBlockModel(F_CONCRETE_BLUE);
        registerItemBlockModel(F_CONCRETE_BROWN);
        registerItemBlockModel(F_CONCRETE_CYAN);
        registerItemBlockModel(F_CONCRETE_GRAY);
        registerItemBlockModel(F_CONCRETE_GREEN);
        registerItemBlockModel(F_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(F_CONCRETE_LIME);
        registerItemBlockModel(F_CONCRETE_MAGENTA);
        registerItemBlockModel(F_CONCRETE_ORANGE);
        registerItemBlockModel(F_CONCRETE_PINK);
        registerItemBlockModel(F_CONCRETE_PURPLE);
        registerItemBlockModel(F_CONCRETE_RED);
        registerItemBlockModel(F_CONCRETE_SILVER);
        registerItemBlockModel(F_CONCRETE_WHITE);
        registerItemBlockModel(F_CONCRETE_YELLOW);

        registerItemBlockModel(G_CONCRETE_BLACK);
        registerItemBlockModel(G_CONCRETE_BLUE);
        registerItemBlockModel(G_CONCRETE_BROWN);
        registerItemBlockModel(G_CONCRETE_CYAN);
        registerItemBlockModel(G_CONCRETE_GRAY);
        registerItemBlockModel(G_CONCRETE_GREEN);
        registerItemBlockModel(G_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(G_CONCRETE_LIME);
        registerItemBlockModel(G_CONCRETE_MAGENTA);
        registerItemBlockModel(G_CONCRETE_ORANGE);
        registerItemBlockModel(G_CONCRETE_PINK);
        registerItemBlockModel(G_CONCRETE_PURPLE);
        registerItemBlockModel(G_CONCRETE_RED);
        registerItemBlockModel(G_CONCRETE_SILVER);
        registerItemBlockModel(G_CONCRETE_WHITE);
        registerItemBlockModel(G_CONCRETE_YELLOW);

        registerItemBlockModel(H_CONCRETE_BLACK);
        registerItemBlockModel(H_CONCRETE_BLUE);
        registerItemBlockModel(H_CONCRETE_BROWN);
        registerItemBlockModel(H_CONCRETE_CYAN);
        registerItemBlockModel(H_CONCRETE_GRAY);
        registerItemBlockModel(H_CONCRETE_GREEN);
        registerItemBlockModel(H_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(H_CONCRETE_LIME);
        registerItemBlockModel(H_CONCRETE_MAGENTA);
        registerItemBlockModel(H_CONCRETE_ORANGE);
        registerItemBlockModel(H_CONCRETE_PINK);
        registerItemBlockModel(H_CONCRETE_PURPLE);
        registerItemBlockModel(H_CONCRETE_RED);
        registerItemBlockModel(H_CONCRETE_SILVER);
        registerItemBlockModel(H_CONCRETE_WHITE);
        registerItemBlockModel(H_CONCRETE_YELLOW);

        registerItemBlockModel(I_CONCRETE_BLACK);
        registerItemBlockModel(I_CONCRETE_BLUE);
        registerItemBlockModel(I_CONCRETE_BROWN);
        registerItemBlockModel(I_CONCRETE_CYAN);
        registerItemBlockModel(I_CONCRETE_GRAY);
        registerItemBlockModel(I_CONCRETE_GREEN);
        registerItemBlockModel(I_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(I_CONCRETE_LIME);
        registerItemBlockModel(I_CONCRETE_MAGENTA);
        registerItemBlockModel(I_CONCRETE_ORANGE);
        registerItemBlockModel(I_CONCRETE_PINK);
        registerItemBlockModel(I_CONCRETE_PURPLE);
        registerItemBlockModel(I_CONCRETE_RED);
        registerItemBlockModel(I_CONCRETE_SILVER);
        registerItemBlockModel(I_CONCRETE_WHITE);
        registerItemBlockModel(I_CONCRETE_YELLOW);

        registerItemBlockModel(J_CONCRETE_BLACK);
        registerItemBlockModel(J_CONCRETE_BLUE);
        registerItemBlockModel(J_CONCRETE_BROWN);
        registerItemBlockModel(J_CONCRETE_CYAN);
        registerItemBlockModel(J_CONCRETE_GRAY);
        registerItemBlockModel(J_CONCRETE_GREEN);
        registerItemBlockModel(J_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(J_CONCRETE_LIME);
        registerItemBlockModel(J_CONCRETE_MAGENTA);
        registerItemBlockModel(J_CONCRETE_ORANGE);
        registerItemBlockModel(J_CONCRETE_PINK);
        registerItemBlockModel(J_CONCRETE_PURPLE);
        registerItemBlockModel(J_CONCRETE_RED);
        registerItemBlockModel(J_CONCRETE_SILVER);
        registerItemBlockModel(J_CONCRETE_WHITE);
        registerItemBlockModel(J_CONCRETE_YELLOW);

        registerItemBlockModel(K_CONCRETE_BLACK);
        registerItemBlockModel(K_CONCRETE_BLUE);
        registerItemBlockModel(K_CONCRETE_BROWN);
        registerItemBlockModel(K_CONCRETE_CYAN);
        registerItemBlockModel(K_CONCRETE_GRAY);
        registerItemBlockModel(K_CONCRETE_GREEN);
        registerItemBlockModel(K_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(K_CONCRETE_LIME);
        registerItemBlockModel(K_CONCRETE_MAGENTA);
        registerItemBlockModel(K_CONCRETE_ORANGE);
        registerItemBlockModel(K_CONCRETE_PINK);
        registerItemBlockModel(K_CONCRETE_PURPLE);
        registerItemBlockModel(K_CONCRETE_RED);
        registerItemBlockModel(K_CONCRETE_SILVER);
        registerItemBlockModel(K_CONCRETE_WHITE);
        registerItemBlockModel(K_CONCRETE_YELLOW);

        registerItemBlockModel(L_CONCRETE_BLACK);
        registerItemBlockModel(L_CONCRETE_BLUE);
        registerItemBlockModel(L_CONCRETE_BROWN);
        registerItemBlockModel(L_CONCRETE_CYAN);
        registerItemBlockModel(L_CONCRETE_GRAY);
        registerItemBlockModel(L_CONCRETE_GREEN);
        registerItemBlockModel(L_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(L_CONCRETE_LIME);
        registerItemBlockModel(L_CONCRETE_MAGENTA);
        registerItemBlockModel(L_CONCRETE_ORANGE);
        registerItemBlockModel(L_CONCRETE_PINK);
        registerItemBlockModel(L_CONCRETE_PURPLE);
        registerItemBlockModel(L_CONCRETE_RED);
        registerItemBlockModel(L_CONCRETE_SILVER);
        registerItemBlockModel(L_CONCRETE_WHITE);
        registerItemBlockModel(L_CONCRETE_YELLOW);

        registerItemBlockModel(M_CONCRETE_BLACK);
        registerItemBlockModel(M_CONCRETE_BLUE);
        registerItemBlockModel(M_CONCRETE_BROWN);
        registerItemBlockModel(M_CONCRETE_CYAN);
        registerItemBlockModel(M_CONCRETE_GRAY);
        registerItemBlockModel(M_CONCRETE_GREEN);
        registerItemBlockModel(M_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(M_CONCRETE_LIME);
        registerItemBlockModel(M_CONCRETE_MAGENTA);
        registerItemBlockModel(M_CONCRETE_ORANGE);
        registerItemBlockModel(M_CONCRETE_PINK);
        registerItemBlockModel(M_CONCRETE_PURPLE);
        registerItemBlockModel(M_CONCRETE_RED);
        registerItemBlockModel(M_CONCRETE_SILVER);
        registerItemBlockModel(M_CONCRETE_WHITE);
        registerItemBlockModel(M_CONCRETE_YELLOW);

        registerItemBlockModel(N_CONCRETE_BLACK);
        registerItemBlockModel(N_CONCRETE_BLUE);
        registerItemBlockModel(N_CONCRETE_BROWN);
        registerItemBlockModel(N_CONCRETE_CYAN);
        registerItemBlockModel(N_CONCRETE_GRAY);
        registerItemBlockModel(N_CONCRETE_GREEN);
        registerItemBlockModel(N_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(N_CONCRETE_LIME);
        registerItemBlockModel(N_CONCRETE_MAGENTA);
        registerItemBlockModel(N_CONCRETE_ORANGE);
        registerItemBlockModel(N_CONCRETE_PINK);
        registerItemBlockModel(N_CONCRETE_PURPLE);
        registerItemBlockModel(N_CONCRETE_RED);
        registerItemBlockModel(N_CONCRETE_SILVER);
        registerItemBlockModel(N_CONCRETE_WHITE);
        registerItemBlockModel(N_CONCRETE_YELLOW);

        registerItemBlockModel(O_CONCRETE_BLACK);
        registerItemBlockModel(O_CONCRETE_BLUE);
        registerItemBlockModel(O_CONCRETE_BROWN);
        registerItemBlockModel(O_CONCRETE_CYAN);
        registerItemBlockModel(O_CONCRETE_GRAY);
        registerItemBlockModel(O_CONCRETE_GREEN);
        registerItemBlockModel(O_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(O_CONCRETE_LIME);
        registerItemBlockModel(O_CONCRETE_MAGENTA);
        registerItemBlockModel(O_CONCRETE_ORANGE);
        registerItemBlockModel(O_CONCRETE_PINK);
        registerItemBlockModel(O_CONCRETE_PURPLE);
        registerItemBlockModel(O_CONCRETE_RED);
        registerItemBlockModel(O_CONCRETE_SILVER);
        registerItemBlockModel(O_CONCRETE_WHITE);
        registerItemBlockModel(O_CONCRETE_YELLOW);

        registerItemBlockModel(P_CONCRETE_BLACK);
        registerItemBlockModel(P_CONCRETE_BLUE);
        registerItemBlockModel(P_CONCRETE_BROWN);
        registerItemBlockModel(P_CONCRETE_CYAN);
        registerItemBlockModel(P_CONCRETE_GRAY);
        registerItemBlockModel(P_CONCRETE_GREEN);
        registerItemBlockModel(P_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(P_CONCRETE_LIME);
        registerItemBlockModel(P_CONCRETE_MAGENTA);
        registerItemBlockModel(P_CONCRETE_ORANGE);
        registerItemBlockModel(P_CONCRETE_PINK);
        registerItemBlockModel(P_CONCRETE_PURPLE);
        registerItemBlockModel(P_CONCRETE_RED);
        registerItemBlockModel(P_CONCRETE_SILVER);
        registerItemBlockModel(P_CONCRETE_WHITE);
        registerItemBlockModel(P_CONCRETE_YELLOW);

        registerItemBlockModel(Q_CONCRETE_BLACK);
        registerItemBlockModel(Q_CONCRETE_BLUE);
        registerItemBlockModel(Q_CONCRETE_BROWN);
        registerItemBlockModel(Q_CONCRETE_CYAN);
        registerItemBlockModel(Q_CONCRETE_GRAY);
        registerItemBlockModel(Q_CONCRETE_GREEN);
        registerItemBlockModel(Q_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(Q_CONCRETE_LIME);
        registerItemBlockModel(Q_CONCRETE_MAGENTA);
        registerItemBlockModel(Q_CONCRETE_ORANGE);
        registerItemBlockModel(Q_CONCRETE_PINK);
        registerItemBlockModel(Q_CONCRETE_PURPLE);
        registerItemBlockModel(Q_CONCRETE_RED);
        registerItemBlockModel(Q_CONCRETE_SILVER);
        registerItemBlockModel(Q_CONCRETE_WHITE);
        registerItemBlockModel(Q_CONCRETE_YELLOW);

        registerItemBlockModel(R_CONCRETE_BLACK);
        registerItemBlockModel(R_CONCRETE_BLUE);
        registerItemBlockModel(R_CONCRETE_BROWN);
        registerItemBlockModel(R_CONCRETE_CYAN);
        registerItemBlockModel(R_CONCRETE_GRAY);
        registerItemBlockModel(R_CONCRETE_GREEN);
        registerItemBlockModel(R_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(R_CONCRETE_LIME);
        registerItemBlockModel(R_CONCRETE_MAGENTA);
        registerItemBlockModel(R_CONCRETE_ORANGE);
        registerItemBlockModel(R_CONCRETE_PINK);
        registerItemBlockModel(R_CONCRETE_PURPLE);
        registerItemBlockModel(R_CONCRETE_RED);
        registerItemBlockModel(R_CONCRETE_SILVER);
        registerItemBlockModel(R_CONCRETE_WHITE);
        registerItemBlockModel(R_CONCRETE_YELLOW);

        registerItemBlockModel(S_CONCRETE_BLACK);
        registerItemBlockModel(S_CONCRETE_BLUE);
        registerItemBlockModel(S_CONCRETE_BROWN);
        registerItemBlockModel(S_CONCRETE_CYAN);
        registerItemBlockModel(S_CONCRETE_GRAY);
        registerItemBlockModel(S_CONCRETE_GREEN);
        registerItemBlockModel(S_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(S_CONCRETE_LIME);
        registerItemBlockModel(S_CONCRETE_MAGENTA);
        registerItemBlockModel(S_CONCRETE_ORANGE);
        registerItemBlockModel(S_CONCRETE_PINK);
        registerItemBlockModel(S_CONCRETE_PURPLE);
        registerItemBlockModel(S_CONCRETE_RED);
        registerItemBlockModel(S_CONCRETE_SILVER);
        registerItemBlockModel(S_CONCRETE_WHITE);
        registerItemBlockModel(S_CONCRETE_YELLOW);

        registerItemBlockModel(T_CONCRETE_BLACK);
        registerItemBlockModel(T_CONCRETE_BLUE);
        registerItemBlockModel(T_CONCRETE_BROWN);
        registerItemBlockModel(T_CONCRETE_CYAN);
        registerItemBlockModel(T_CONCRETE_GRAY);
        registerItemBlockModel(T_CONCRETE_GREEN);
        registerItemBlockModel(T_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(T_CONCRETE_LIME);
        registerItemBlockModel(T_CONCRETE_MAGENTA);
        registerItemBlockModel(T_CONCRETE_ORANGE);
        registerItemBlockModel(T_CONCRETE_PINK);
        registerItemBlockModel(T_CONCRETE_PURPLE);
        registerItemBlockModel(T_CONCRETE_RED);
        registerItemBlockModel(T_CONCRETE_SILVER);
        registerItemBlockModel(T_CONCRETE_WHITE);
        registerItemBlockModel(T_CONCRETE_YELLOW);

        registerItemBlockModel(U_CONCRETE_BLACK);
        registerItemBlockModel(U_CONCRETE_BLUE);
        registerItemBlockModel(U_CONCRETE_BROWN);
        registerItemBlockModel(U_CONCRETE_CYAN);
        registerItemBlockModel(U_CONCRETE_GRAY);
        registerItemBlockModel(U_CONCRETE_GREEN);
        registerItemBlockModel(U_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(U_CONCRETE_LIME);
        registerItemBlockModel(U_CONCRETE_MAGENTA);
        registerItemBlockModel(U_CONCRETE_ORANGE);
        registerItemBlockModel(U_CONCRETE_PINK);
        registerItemBlockModel(U_CONCRETE_PURPLE);
        registerItemBlockModel(U_CONCRETE_RED);
        registerItemBlockModel(U_CONCRETE_SILVER);
        registerItemBlockModel(U_CONCRETE_WHITE);
        registerItemBlockModel(U_CONCRETE_YELLOW);

        registerItemBlockModel(V_CONCRETE_BLACK);
        registerItemBlockModel(V_CONCRETE_BLUE);
        registerItemBlockModel(V_CONCRETE_BROWN);
        registerItemBlockModel(V_CONCRETE_CYAN);
        registerItemBlockModel(V_CONCRETE_GRAY);
        registerItemBlockModel(V_CONCRETE_GREEN);
        registerItemBlockModel(V_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(V_CONCRETE_LIME);
        registerItemBlockModel(V_CONCRETE_MAGENTA);
        registerItemBlockModel(V_CONCRETE_ORANGE);
        registerItemBlockModel(V_CONCRETE_PINK);
        registerItemBlockModel(V_CONCRETE_PURPLE);
        registerItemBlockModel(V_CONCRETE_RED);
        registerItemBlockModel(V_CONCRETE_SILVER);
        registerItemBlockModel(V_CONCRETE_WHITE);
        registerItemBlockModel(V_CONCRETE_YELLOW);

        registerItemBlockModel(W_CONCRETE_BLACK);
        registerItemBlockModel(W_CONCRETE_BLUE);
        registerItemBlockModel(W_CONCRETE_BROWN);
        registerItemBlockModel(W_CONCRETE_CYAN);
        registerItemBlockModel(W_CONCRETE_GRAY);
        registerItemBlockModel(W_CONCRETE_GREEN);
        registerItemBlockModel(W_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(W_CONCRETE_LIME);
        registerItemBlockModel(W_CONCRETE_MAGENTA);
        registerItemBlockModel(W_CONCRETE_ORANGE);
        registerItemBlockModel(W_CONCRETE_PINK);
        registerItemBlockModel(W_CONCRETE_PURPLE);
        registerItemBlockModel(W_CONCRETE_RED);
        registerItemBlockModel(W_CONCRETE_SILVER);
        registerItemBlockModel(W_CONCRETE_WHITE);
        registerItemBlockModel(W_CONCRETE_YELLOW);

        registerItemBlockModel(X_CONCRETE_BLACK);
        registerItemBlockModel(X_CONCRETE_BLUE);
        registerItemBlockModel(X_CONCRETE_BROWN);
        registerItemBlockModel(X_CONCRETE_CYAN);
        registerItemBlockModel(X_CONCRETE_GRAY);
        registerItemBlockModel(X_CONCRETE_GREEN);
        registerItemBlockModel(X_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(X_CONCRETE_LIME);
        registerItemBlockModel(X_CONCRETE_MAGENTA);
        registerItemBlockModel(X_CONCRETE_ORANGE);
        registerItemBlockModel(X_CONCRETE_PINK);
        registerItemBlockModel(X_CONCRETE_PURPLE);
        registerItemBlockModel(X_CONCRETE_RED);
        registerItemBlockModel(X_CONCRETE_SILVER);
        registerItemBlockModel(X_CONCRETE_WHITE);
        registerItemBlockModel(X_CONCRETE_YELLOW);

        registerItemBlockModel(Y_CONCRETE_BLACK);
        registerItemBlockModel(Y_CONCRETE_BLUE);
        registerItemBlockModel(Y_CONCRETE_BROWN);
        registerItemBlockModel(Y_CONCRETE_CYAN);
        registerItemBlockModel(Y_CONCRETE_GRAY);
        registerItemBlockModel(Y_CONCRETE_GREEN);
        registerItemBlockModel(Y_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(Y_CONCRETE_LIME);
        registerItemBlockModel(Y_CONCRETE_MAGENTA);
        registerItemBlockModel(Y_CONCRETE_ORANGE);
        registerItemBlockModel(Y_CONCRETE_PINK);
        registerItemBlockModel(Y_CONCRETE_PURPLE);
        registerItemBlockModel(Y_CONCRETE_RED);
        registerItemBlockModel(Y_CONCRETE_SILVER);
        registerItemBlockModel(Y_CONCRETE_WHITE);
        registerItemBlockModel(Y_CONCRETE_YELLOW);

        registerItemBlockModel(Z_CONCRETE_BLACK);
        registerItemBlockModel(Z_CONCRETE_BLUE);
        registerItemBlockModel(Z_CONCRETE_BROWN);
        registerItemBlockModel(Z_CONCRETE_CYAN);
        registerItemBlockModel(Z_CONCRETE_GRAY);
        registerItemBlockModel(Z_CONCRETE_GREEN);
        registerItemBlockModel(Z_CONCRETE_LIGHT_BLUE);
        registerItemBlockModel(Z_CONCRETE_LIME);
        registerItemBlockModel(Z_CONCRETE_MAGENTA);
        registerItemBlockModel(Z_CONCRETE_ORANGE);
        registerItemBlockModel(Z_CONCRETE_PINK);
        registerItemBlockModel(Z_CONCRETE_PURPLE);
        registerItemBlockModel(Z_CONCRETE_RED);
        registerItemBlockModel(Z_CONCRETE_SILVER);
        registerItemBlockModel(Z_CONCRETE_WHITE);
        registerItemBlockModel(Z_CONCRETE_YELLOW);

        // GLASS
        registerItemBlockModel(A_GLASS_BLACK);
        registerItemBlockModel(A_GLASS_BLUE);
        registerItemBlockModel(A_GLASS_BROWN);
        registerItemBlockModel(A_GLASS_CLEAR);
        registerItemBlockModel(A_GLASS_CYAN);
        registerItemBlockModel(A_GLASS_GRAY);
        registerItemBlockModel(A_GLASS_GREEN);
        registerItemBlockModel(A_GLASS_LIGHT_BLUE);
        registerItemBlockModel(A_GLASS_LIME);
        registerItemBlockModel(A_GLASS_MAGENTA);
        registerItemBlockModel(A_GLASS_ORANGE);
        registerItemBlockModel(A_GLASS_PINK);
        registerItemBlockModel(A_GLASS_PURPLE);
        registerItemBlockModel(A_GLASS_RED);
        registerItemBlockModel(A_GLASS_SILVER);
        registerItemBlockModel(A_GLASS_WHITE);
        registerItemBlockModel(A_GLASS_YELLOW);

        // Items
        registerItemModel(GLASS_SHARD_BLACK);
        registerItemModel(GLASS_SHARD_BLUE);
        registerItemModel(GLASS_SHARD_BROWN);
        registerItemModel(GLASS_SHARD_CLEAR);
        registerItemModel(GLASS_SHARD_CYAN);
        registerItemModel(GLASS_SHARD_GRAY);
        registerItemModel(GLASS_SHARD_GREEN);
        registerItemModel(GLASS_SHARD_LIGHT_BLUE);
        registerItemModel(GLASS_SHARD_LIME);
        registerItemModel(GLASS_SHARD_MAGENTA);
        registerItemModel(GLASS_SHARD_ORANGE);
        registerItemModel(GLASS_SHARD_PINK);
        registerItemModel(GLASS_SHARD_PURPLE);
        registerItemModel(GLASS_SHARD_RED);
        registerItemModel(GLASS_SHARD_SILVER);
        registerItemModel(GLASS_SHARD_WHITE);
        registerItemModel(GLASS_SHARD_YELLOW);

        // Item Tools
        //registerItemModel(CUTTER_GLASS_DIAMOND);
        //registerItemModel(CUTTER_GLASS_IRON);

        LOGGER.debug("Registered models");
    }

    private static void registerItemModel(final Item item) {
        Preconditions.checkNotNull(item, "Item cannot be null!");
        final ResourceLocation registryName = item.getRegistryName();
        Preconditions.checkNotNull(registryName, "Item Registry Name cannot be null!");
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), DEFAULT_VARIANT));
    }

    private static void registerItemBlockModel(final Block block) {
        Preconditions.checkNotNull(block, "Block cannot be null!");
        final ResourceLocation registryName = block.getRegistryName();
        Preconditions.checkNotNull(registryName, "Block Registry Name cannot be null!");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), DEFAULT_VARIANT));
    }
}