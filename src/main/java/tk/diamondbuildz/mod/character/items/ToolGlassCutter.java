package tk.diamondbuildz.mod.character.items;

import tk.diamondbuildz.mod.character.util.ModUtil;

import javax.annotation.Nonnull;

public class ToolGlassCutter extends ItemGlassCutter {
    public ToolGlassCutter(@Nonnull String name, @Nonnull ToolMaterial material) {
        super(material);
        ModUtil.setRegistryNames(this, name);
        ModUtil.setCreativeTab(this);
    }
}
