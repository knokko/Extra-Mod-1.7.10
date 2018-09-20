package knokkoblocks.main;

import towerdefence.blocks.TowerBlocks;
import towerdefence.entities.EntityTowerGun;
import towerdefence.main.TowerDefenceTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import knokkoblocks.blocks.Blokregistratie;
import knokkoblocks.entities.EntityHandler;
import knokkoblocks.food.VoedselRegistratie;
import knokkoblocks.items.MobDrops;
import knokkoblocks.libraries.Ref;
import knokkoblocks.recipes.ShapedRecipes;
import knokkoblocks.recipes.ShapelessRecipes;
import knokkoblocks.recipes.SmeltingRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MODID, name = Ref.MODNAME, version = Ref.VERSION)
public class KnokkoBlocks {
	public void registerRenderThings() {
	}
		@Instance(Ref.MODID)
		public static KnokkoBlocks instance;
		public static Object modInstance;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event){
			Blokregistratie.load();
			Blokregistratie.Registeritems();
			VoedselRegistratie.load();
			VoedselRegistratie.RegisterItems();
			ShapedRecipes.load();
			SmeltingRecipes.load();
			ShapelessRecipes.load();
			TowerBlocks.load();
			TowerBlocks.RegisterBlocks();
			MinecraftForge.EVENT_BUS.register(new MobDrops());
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event){
			EntityHandler.registerShooter(EntityTowerGun.class, "guntower");
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event) {
			
		}
		public static CreativeTabs towerdefenceTab = new TowerDefenceTab(CreativeTabs.getNextID(), "towerdefencetab");

}
