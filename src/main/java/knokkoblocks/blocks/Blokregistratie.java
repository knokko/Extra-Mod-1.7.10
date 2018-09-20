package knokkoblocks.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import knokkoblocks.libraries.Ref;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class Blokregistratie {
	
	public static Block cobblebrownstone;
	public static Block cobbleorangestone;
	public static Block cobbleredstone;
	public static Block redstone;
	public static Block brownstone;
	public static Block orangestone;
	public static Block redstonebricks;
	public static Block brownstonebricks;
	public static Block orangestonebricks;
	public static Block cobblebluestone;
	public static Block cobblegreenstone;
	public static Block cobblepurplestone;
	public static Block bluestone;
	public static Block greenstone;
	public static Block purplestone;
	public static Block bluestonebricks;
	public static Block greenstonebricks;
	public static Block purplestonebricks;
	public static Block yellowstone;
	public static Block cobbleyellowstone;
	public static Block yellowstonebricks;
	public static Block whitestone;
	public static Block whitestonebricks;
	public static Block cobblewhitestone;
	public static Block blackstone;
	public static Block blackstonebricks;
	public static Block cobbleblackstone;
	public static Block cobblelimestone;
	public static Block limestone;
	public static Block limestonebricks;
	public static Block cyanstone;
	public static Block cobblecyanstone;
	public static Block cyanstonebricks;
	public static Block barrier;
	public static Block house1;
	public static Block lightoakplanks;
	public static Block lightspruceplanks;
	public static Block lightbirchplanks;
	public static Block lightjungleplanks;
	public static Block lightacaciaplanks;
	public static Block lightdarkplanks;
	
	public static void Registeritems() {
		GameRegistry.registerBlock(cobblebrownstone, "cobblebrownstone");
		GameRegistry.registerBlock(brownstone, "brownstone");
		GameRegistry.registerBlock(brownstonebricks, "brownstonebricks");
		GameRegistry.registerBlock(cobbleredstone, "cobbleredstone");
		GameRegistry.registerBlock(redstone, "redstone");
		GameRegistry.registerBlock(redstonebricks, "redstonebricks");
		GameRegistry.registerBlock(cobbleorangestone, "cobbleorangestone");
		GameRegistry.registerBlock(orangestonebricks, "orangestonebricks");
		GameRegistry.registerBlock(orangestone, "orangestone");
		GameRegistry.registerBlock(cobblebluestone, "cobblebluestone");
		GameRegistry.registerBlock(bluestone, "bluestone");
		GameRegistry.registerBlock(bluestonebricks, "bluestonebricks");
		GameRegistry.registerBlock(cobblegreenstone, "cobblegreenstone");
		GameRegistry.registerBlock(greenstone, "greenstone");
		GameRegistry.registerBlock(greenstonebricks, "greenstonebricks");
		GameRegistry.registerBlock(cobblepurplestone, "cobblepurplestone");
		GameRegistry.registerBlock(purplestonebricks, "purplestonebricks");
		GameRegistry.registerBlock(purplestone, "purplestone");
		GameRegistry.registerBlock(cobbleyellowstone, "cobbleyellowstone");
		GameRegistry.registerBlock(yellowstonebricks, "yellowstonebricks");
		GameRegistry.registerBlock(yellowstone, "yellowstone");
		GameRegistry.registerBlock(cobblewhitestone, "cobblewhitestone");
		GameRegistry.registerBlock(whitestonebricks, "whitestonebricks");
		GameRegistry.registerBlock(whitestone, "whitestone");
		GameRegistry.registerBlock(cobbleblackstone, "cobbleblackstone");
		GameRegistry.registerBlock(blackstonebricks, "blackstonebricks");
		GameRegistry.registerBlock(blackstone, "blackstone");
		GameRegistry.registerBlock(cobblelimestone, "cobblelimestone");
		GameRegistry.registerBlock(limestonebricks, "limestonebricks");
		GameRegistry.registerBlock(limestone, "limestone");
		GameRegistry.registerBlock(cobblecyanstone, "cobblecyanstone");
		GameRegistry.registerBlock(cyanstonebricks, "cyanstonebricks");
		GameRegistry.registerBlock(cyanstone, "cyanstone");
		
		GameRegistry.registerBlock(lightoakplanks, "lightoakplanks");
		GameRegistry.registerBlock(lightspruceplanks, "lightspruceplanks");
		GameRegistry.registerBlock(lightbirchplanks, "lightbirchplanks");
		GameRegistry.registerBlock(lightjungleplanks, "lightjungleplanks");
		GameRegistry.registerBlock(lightacaciaplanks, "lightacaciaplanks");
		GameRegistry.registerBlock(lightdarkplanks, "lightdarkplanks");
		
		GameRegistry.registerBlock(barrier, "barrier");
		GameRegistry.registerBlock(house1, "house1");
		
	}

	public static void load() {
		orangestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "orangestone").setBlockName("orangestone");
		brownstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "brownstone").setBlockName("brownstone");
		redstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "redstone").setBlockName("redstone");
		cobbleorangestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobbleorangestone").setBlockName("cobbleorangestone");
		cobblebrownstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblebrownstone").setBlockName("cobblebrownstone");
		cobbleredstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobbleredstone").setBlockName("cobbleredstone");
		orangestonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "orangestonebricks").setBlockName("orangestonebricks");
		brownstonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "brownstonebricks").setBlockName("brownstonebricks");
		redstonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "redstonebricks").setBlockName("redstonebricks");
		purplestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "purplestone").setBlockName("purplestone");
		bluestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "bluestone").setBlockName("bluestone");
		greenstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "greenstone").setBlockName("greenstone");
		cobblepurplestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblepurplestone").setBlockName("cobblepurplestone");
		cobblebluestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblebluestone").setBlockName("cobblebluestone");
		cobblegreenstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblegreenstone").setBlockName("cobblegreenstone");
		purplestonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "purplestonebricks").setBlockName("purplestonebricks");
		bluestonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "bluestonebricks").setBlockName("bluestonebricks");
		greenstonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "greenstonebricks").setBlockName("greenstonebricks");
		yellowstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "yellowstone").setBlockName("yellowstone");
		cobbleyellowstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobbleyellowstone").setBlockName("cobbleyellowstone");
		yellowstonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "yellowstonebricks").setBlockName("yellowstonebricks");
		whitestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "whitestone").setBlockName("whitestone");
		cobblewhitestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblewhitestone").setBlockName("cobblewhitestone");
		whitestonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "whitestonebricks").setBlockName("whitestonebricks");
		blackstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "blackstone").setBlockName("blackstone");
		cobbleblackstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobbleblackstone").setBlockName("cobbleblackstone");
		blackstonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "blackstonebricks").setBlockName("blackstonebricks");
		limestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "limestone").setBlockName("limestone");
		cobblelimestone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblelimestone").setBlockName("cobblelimestone");
		limestonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "limestonebricks").setBlockName("limestonebricks");
		cyanstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cyanstone").setBlockName("cyanstone");
		cobblecyanstone = new ColoredStone().setBlockTextureName(Ref.texture_path + "cobblecyanstone").setBlockName("cobblecyanstone");
		cyanstonebricks = new ColoredStone().setBlockTextureName(Ref.texture_path + "cyanstonebricks").setBlockName("cyanstonebricks");
		barrier = new Barrier().setBlockTextureName(Ref.texture_path + "barrier").setBlockName("barrier");
		house1 = new House1().setBlockTextureName(Ref.texture_path + "house1").setBlockName("house1");
		lightoakplanks = new LightWood().setBlockTextureName("minecraft:planks_oak").setBlockName("lightoakplanks");
		lightspruceplanks = new LightWood().setBlockTextureName("minecraft:planks_spruce").setBlockName("lightspruceplanks");
		lightbirchplanks = new LightWood().setBlockTextureName("minecraft:planks_birch").setBlockName("lightbirchplanks");
		lightjungleplanks = new LightWood().setBlockTextureName("minecraft:planks_jungle").setBlockName("lightjungleplanks");
		lightacaciaplanks = new LightWood().setBlockTextureName("minecraft:planks_acacia").setBlockName("lightacaciaplanks");
		lightdarkplanks = new LightWood().setBlockTextureName("minecraft:planks_big_oak").setBlockName("lightdarkplanks");
	
		
	}



}
