package towerdefence.entities;

import java.util.List;

import knokkoblocks.blocks.Blokregistratie;
import knokkoblocks.blocks.ColoredStone;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityTowerGun extends Entity{

	private int side;
	private boolean invulnerable;
	
	
	/**
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param side 0 = north
	 * 1 = east
	 * 2 = south
	 * 3 = west
	 */
	public EntityTowerGun(World world, double x, double y, double z, int side) {
		super(world);
		setSize(1.0F, 1.0F);
		posX = x;
		posY = y;
		posZ = z;
		this.side = side;
	}
	public void onUpdate(){
		super.onUpdate();
		targetMobs();
	}
	public EntityTowerGun(World world){
		super(world);
	}

	
	@Override
	protected void entityInit() {
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt) {
		side = nbt.getInteger("side");
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt) {
		nbt.setInteger("side", side);
	}
	public void targetMobs(){
		Entity entity = null;
		if(side == 0){
        List list = this.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(posX - 3, posY - 10, posZ - 4, posX + 4, posY + 0, posZ - 1));
		
        for (int j = 0; j < list.size(); ++j)
        {
            Entity entity1 = (Entity)list.get(j);
            this.worldObj.spawnEntityInWorld(new EntityGunBullet(this.worldObj, posX, posY, posZ, entity1.posX, entity1.posY, entity1.posZ));
        	}
		}
		if(side == 3){
	        List list = this.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(posX - 4, posY - 10, posZ - 3, posX - 1, posY + 0, posZ + 4));
			
	        for (int j = 0; j < list.size(); ++j)
	        {
	            Entity entity1 = (Entity)list.get(j);
	            this.worldObj.spawnEntityInWorld(new EntityGunBullet(this.worldObj, posX, posY, posZ, entity1.posX, entity1.posY, entity1.posZ));
	        }
		}
		if(side == 1){
	        List list = this.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(posX + 2, posY - 10, posZ - 3, posX + 5, posY + 0, posZ + 4));
			
	        for (int j = 0; j < list.size(); ++j)
	        {
	            Entity entity1 = (Entity)list.get(j);
	            this.worldObj.spawnEntityInWorld(new EntityGunBullet(this.worldObj, posX + 1, posY, posZ, entity1.posX, entity1.posY, entity1.posZ));
	        }
		}
		if(side == 2){
	        List list = this.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(posX - 3, posY - 10, posZ + 2, posX + 4, posY + 0, posZ + 5));
			
	        for (int j = 0; j < list.size(); ++j)
	        {
	            Entity entity1 = (Entity)list.get(j);
	            this.worldObj.spawnEntityInWorld(new EntityGunBullet(this.worldObj, posX, posY, posZ + 1, entity1.posX, entity1.posY, entity1.posZ));
	        }
		}
        
	}
	
	

}
