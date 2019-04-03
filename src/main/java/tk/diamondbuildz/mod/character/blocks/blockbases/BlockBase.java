package tk.diamondbuildz.mod.character.blocks.blockbases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tk.diamondbuildz.mod.character.util.ModUtil;

import javax.annotation.Nonnull;

public class BlockBase extends Block {
    public BlockBase(@Nonnull String name, @Nonnull Material material) {
        super(material);
        ModUtil.setRegistryNames(this, name);
        ModUtil.setCreativeTab(this);
    }
}