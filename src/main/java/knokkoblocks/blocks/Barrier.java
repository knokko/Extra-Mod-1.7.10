package knokkoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Barrier extends Block {

	protected Barrier() {
		super(Material.glass);
		setCreativeTab(CreativeTabs.tabMisc);
		setResistance(6000000);
		this.setBlockUnbreakable();
		this.setLightOpacity(0);
		
		
		
		
	}
	   public boolean isOpaqueCube()
	    {
	        return false;
	    }
	  
	
		
	}

