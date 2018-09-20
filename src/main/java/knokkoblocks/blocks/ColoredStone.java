package knokkoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ColoredStone extends Block {
	
	

	protected ColoredStone() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.5F);
		setStepSound(Block.soundTypeStone);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
		
	
	}
	

	

}
