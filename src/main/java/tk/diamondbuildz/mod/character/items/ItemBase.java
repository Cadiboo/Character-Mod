package tk.diamondbuildz.mod.character.items;

import net.minecraft.item.Item;
import tk.diamondbuildz.mod.character.util.ModUtil;

public class ItemBase extends Item {

    public ItemBase() {
        ModUtil.setCreativeTab(this);
    }
}