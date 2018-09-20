package towerdefence.main;

import towerdefence.blocks.TowerBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TowerDefenceTab extends CreativeTabs {

	public TowerDefenceTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(TowerBlocks.guntower);
	}

}
