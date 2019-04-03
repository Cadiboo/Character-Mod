package tk.diamondbuildz.mod.character.items;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import tk.diamondbuildz.mod.character.init.ModBlocks;
import tk.diamondbuildz.mod.character.tabs.TabCharacterMod;

import java.util.Set;

public class ItemGlassCutter extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(
            ModBlocks.A_GLASS_CLEAR, ModBlocks.A_GLASS_BLACK, ModBlocks.A_GLASS_BLUE, ModBlocks.A_GLASS_BROWN, ModBlocks.A_GLASS_CYAN, ModBlocks.A_GLASS_GREEN, ModBlocks.A_GLASS_GRAY, ModBlocks.A_GLASS_LIGHT_BLUE, ModBlocks.A_GLASS_LIME, ModBlocks.A_GLASS_MAGENTA, ModBlocks.A_GLASS_ORANGE, ModBlocks.A_GLASS_PINK, ModBlocks.A_GLASS_PURPLE, ModBlocks.A_GLASS_RED, ModBlocks.A_GLASS_SILVER, ModBlocks.A_GLASS_SILVER, ModBlocks.A_GLASS_WHITE, ModBlocks.A_GLASS_YELLOW,
            Blocks.GLASS, Blocks.STAINED_GLASS, Blocks.STAINED_GLASS_PANE, Blocks.GLASS_PANE);
    public ItemGlassCutter(Item.ToolMaterial material) {
        super(6.0F, -2.0F, material, EFFECTIVE_ON);
        setCreativeTab(TabCharacterMod.TAB_CHARACTER_MOD);
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn) {
        boolean TF = false;
        Material material = blockIn.getMaterial();
        if (material == Material.GLASS) {
            TF = true;
        }
        return TF;
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.GLASS ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}