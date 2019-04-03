package tk.diamondbuildz.mod.character.tabs;

import tk.diamondbuildz.mod.character.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabCharacterMod {
    public static final CreativeTabs TAB_CHARACTER_MOD = new CreativeTabs("tabCharacterMod") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.GLASS_SHARD_CLEAR);
        }
    };
}
