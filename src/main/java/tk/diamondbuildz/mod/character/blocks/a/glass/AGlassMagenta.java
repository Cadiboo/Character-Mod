package tk.diamondbuildz.mod.character.blocks.a.glass;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tk.diamondbuildz.mod.character.blocks.blockbases.a.BlockBaseGlassA;
import tk.diamondbuildz.mod.character.init.ModBlocks;
import tk.diamondbuildz.mod.character.init.ModItems;

import javax.annotation.Nonnull;
import java.util.Random;

public class AGlassMagenta extends BlockBaseGlassA {
    public Item item;
    public EntityPlayer entityPlayer;
    public AGlassMagenta() {

    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (harvesters.get() != null) {
            entityPlayer = harvesters.get();
            Item MainHandHeldItem = entityPlayer.getHeldItemMainhand().getItem();
            if (MainHandHeldItem.equals(ModItems.DIAMOND_GLASS_CUTTER) || MainHandHeldItem.equals(ModItems.IRON_GLASS_CUTTER)) {
                this.item = Item.getItemFromBlock(ModBlocks.A_GLASS_MAGENTA);
            }
            else {
                this.item = ModItems.GLASS_SHARD_MAGENTA;
            }
        }
        return this.item;
    }
    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(ModBlocks.A_GLASS_MAGENTA);
    }

}