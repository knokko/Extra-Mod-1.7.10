package towerdefence.entities;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityGunBullet extends Entity{
	public double targetX;
	public double targetY;
	public double targetZ;
	
	public double distanceX;
	public double distanceY;
	public double distanceZ;
	
	public int ticksExisted;

	public EntityGunBullet(World world, double posX, double posY, double posZ, double targetX, double targetY, double targetZ) {
		super(world);
		setPosition(posX, posY, posZ);
		this.targetX = targetX;
		this.targetY = targetY;
		this.targetZ = targetZ;
		
		this.distanceX = targetX - posX;
		this.distanceY = targetY - posY;
		this.distanceZ = targetZ - posZ;
		
		this.motionX = distanceX * 0.2;
		this.motionY = distanceY * 0.2;
		this.motionZ = distanceZ * 0.2;
		
		this.setInvisible(false);
		
		
	}
	@SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double par1)
    {
        double d1 = this.boundingBox.getAverageEdgeLength() * 4.0D;
        d1 *= 64.0D;
        return par1 < d1 * d1;
    }
	
	public void onUpdate(){
		
		posX += motionX;
		posY += motionY;
		posZ += motionZ;
		
		ticksExisted += 1;
		
		if(this.ticksExisted >= 11){
			setDead();
		}
		
		if(posX == targetX && posY == targetY && posZ == targetZ){
			setDead();
		}
		
		Vec3 vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        Vec3 vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec3, vec31);
        vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (movingobjectposition != null)
        {
            vec31 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
        }

        if (!this.worldObj.isRemote)
        {
            Entity entity = null;
            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, AxisAlignedBB.getBoundingBox(posX - 1, posY - 1, posZ - 1, posX + 1, posY + 1, posZ + 1));

            
            double d0 = 0.0D;

            for (int j = 0; j < list.size(); ++j)
            {
                Entity entity1 = (Entity)list.get(j);

                if (entity1.canBeCollidedWith())
                {
                    float f = 0.3F;
                    AxisAlignedBB axisalignedbb = entity1.boundingBox.expand((double)f, (double)f, (double)f);
                    MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

                    if (movingobjectposition1 != null)
                    {
                        double d1 = vec3.distanceTo(movingobjectposition1.hitVec);

                        if (d1 < d0 || d0 == 0.0D)
                        {
                            entity = entity1;
                            d0 = d1;
                        }
                    }
                }
            }

            if (entity != null)
            {
                movingobjectposition = new MovingObjectPosition(entity);
            }
        }

        if (movingobjectposition != null)
        {
            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.portal)
            {
                this.setInPortal();
            }
            else
            {
                this.onImpact(movingobjectposition);
            }
        }
	}

	public void onImpact(MovingObjectPosition mop) {
		if(mop.entityHit != null){
			mop.entityHit.attackEntityFrom(DamageSource.generic, 5.0F);
		}
		this.setDead();
	}
	@Override
	protected void entityInit() {	
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1) {
		super.readFromNBT(var1);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1) {
		super.writeToNBT(var1);
	}
	@SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 1.0F;
    }

}
