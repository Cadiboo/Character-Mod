package tk.diamondbuildz.mod.character.blocks.a.glass;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tk.diamondbuildz.mod.character.blockbases.glass.BlockBaseGlassA;
import tk.diamondbuildz.mod.character.init.ModBlocks;
import tk.diamondbuildz.mod.character.init.ModItems;

import java.util.Random;

public class AGlassPurple extends BlockBaseGlassA {
    public Item item;
    public EntityPlayer entityPlayer;
    public AGlassPurple() {

    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (harvesters.get() != null) {
            entityPlayer = harvesters.get();
            Item MainHandHeldItem = entityPlayer.getHeldItemMainhand().getItem();
            if (MainHandHeldItem.equals(ModItems.CUTTER_GLASS_DIAMOND) || MainHandHeldItem.equals(ModItems.CUTTER_GLASS_IRON)) {
                this.item = Item.getItemFromBlock(ModBlocks.A_GLASS_PURPLE);
            }
            else {
                this.item = ModItems.GLASS_SHARD_PURPLE;
            }
        }
        return this.item;
    }
    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(ModBlocks.A_GLASS_PURPLE);
    }

}