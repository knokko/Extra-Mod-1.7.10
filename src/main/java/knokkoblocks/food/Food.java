package knokkoblocks.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Food extends ItemFood{

	public Food(int i, int j, boolean b) {
		super(j, b);
		this.setCreativeTab(CreativeTabs.tabFood);
		
	}

}
