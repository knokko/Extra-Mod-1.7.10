package knokkoblocks.food;

import knokkoblocks.libraries.Ref;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class VoedselRegistratie {
	
	public static Item sheepflesh;
	public static Item cookedsheepflesh;
	
	public static void RegisterItems(){
		
		GameRegistry.registerItem(sheepflesh, "sheepflesh");
		GameRegistry.registerItem(cookedsheepflesh, "cookedsheepflesh");
	}
		public static void load(){
			sheepflesh = new Food(9638, 3, true).setUnlocalizedName("sheepflesh").setTextureName(Ref.texture_path + "sheepflesh");
			cookedsheepflesh = new Food(9639, 8, true).setUnlocalizedName("cookedsheepflesh").setTextureName(Ref.texture_path + "cookedsheepflesh");
		}
		
	}


