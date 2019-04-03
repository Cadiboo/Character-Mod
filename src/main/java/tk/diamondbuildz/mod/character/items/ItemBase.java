package tk.diamondbuildz.mod.character.items;

import net.minecraft.item.Item;
import tk.diamondbuildz.mod.character.util.ModUtil;

import javax.annotation.Nonnull;

public class ItemBase extends Item {

    public ItemBase(@Nonnull String name) {
        ModUtil.setRegistryNames(this, name);
        ModUtil.setCreativeTab(this);
    }
}
