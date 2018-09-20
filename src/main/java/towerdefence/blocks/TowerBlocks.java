package towerdefence.blocks;

import knokkoblocks.libraries.Ref;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class TowerBlocks {
	public static Block guntower;
	
	public static void RegisterBlocks(){
		GameRegistry.registerBlock(guntower, "guntower");
	}
	public static void load(){
		guntower = new GunTowerBase().setBlockName("guntower").setBlockTextureName(Ref.texture_path + "guntower");
	}

}
