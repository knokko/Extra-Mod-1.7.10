package knokkoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LightWood extends Block{

	protected LightWood() {
		super(Material.wood);
		this.setLightLevel(1.0F);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
