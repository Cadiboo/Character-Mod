package tk.diamondbuildz.mod.character.items;

import tk.diamondbuildz.mod.character.util.ModUtil;

import javax.annotation.Nonnull;

public class ToolGlassCutter extends ItemGlassCutter {
    public ToolGlassCutter(@Nonnull ToolMaterial material) {
        super(material);
        ModUtil.setCreativeTab(this);
    }
}
