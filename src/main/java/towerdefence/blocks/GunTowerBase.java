package towerdefence.blocks;

import towerdefence.entities.EntityTowerGun;
import knokkoblocks.blocks.Blokregistratie;
import knokkoblocks.main.KnokkoBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class GunTowerBase extends Block {

	public GunTowerBase() {
		super(Material.rock);
		setBlockUnbreakable();
		setResistance(6000000.0F);
		setCreativeTab(KnokkoBlocks.towerdefenceTab);
		
	}
	public void onBlockAdded(World world, int x, int y, int z){
		world.setBlock(x + 0, y + 0, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 0, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 0, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 0, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 0, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 0, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 0, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 0, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 0, z - 1, Blokregistratie.brownstonebricks);
		
		world.setBlock(x + 0, y + 1, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 1, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 1, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 1, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 1, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 1, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 1, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 1, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 1, z - 1, Blokregistratie.brownstonebricks);
		
		world.setBlock(x + 0, y + 2, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 2, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 2, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 2, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 2, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 2, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 2, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 2, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 2, z - 1, Blokregistratie.brownstonebricks);
		
		world.setBlock(x + 0, y + 3, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 3, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 3, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 3, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 3, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 3, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 3, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 3, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 3, z - 1, Blokregistratie.brownstonebricks);
		
		world.setBlock(x + 0, y + 4, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 4, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 4, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 1, y + 4, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 4, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x + 0, y + 4, z - 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 4, z + 1, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 4, z + 0, Blokregistratie.brownstonebricks);
		world.setBlock(x - 1, y + 4, z - 1, Blokregistratie.brownstonebricks);
		
		world.setBlock(x + 0, y + 4, z + 2, Blokregistratie.blackstonebricks);
		world.setBlock(x + 0, y + 4, z - 2, Blokregistratie.blackstonebricks);
		world.setBlock(x + 2, y + 4, z + 0, Blokregistratie.blackstonebricks);
		world.setBlock(x - 2, y + 4, z + 0, Blokregistratie.blackstonebricks);
		
		world.spawnEntityInWorld(new EntityTowerGun(world, x + 0, y + 4, z + 2, 2));
		world.spawnEntityInWorld(new EntityTowerGun(world, x - 0, y + 4, z - 2, 0));
		world.spawnEntityInWorld(new EntityTowerGun(world, x + 2, y + 4, z + 0, 1));
		world.spawnEntityInWorld(new EntityTowerGun(world, x - 2, y + 4, z - 0, 3));
		
	}

}
