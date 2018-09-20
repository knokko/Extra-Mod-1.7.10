package knokkoblocks.items;

import java.util.Random;

import knokkoblocks.food.VoedselRegistratie;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDrops {
	public static double rand;
	 public Random r = new Random();
	 @SubscribeEvent
	    public void onEntityDrop(LivingDropsEvent event) {
		 
		 if(event.entityLiving instanceof EntitySheep){
			 event.entityLiving.dropItem(VoedselRegistratie.sheepflesh, r.nextInt(3));
			 
		 }
	 }

}
