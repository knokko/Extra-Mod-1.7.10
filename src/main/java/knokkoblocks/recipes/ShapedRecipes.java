package knokkoblocks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import knokkoblocks.blocks.Blokregistratie;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapedRecipes {
	public static void load(){
		
		//recepten met vanilla blokken
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 4, 1), "   ", " ss", "vss", 's', Blocks.stonebrick, 'v', Blocks.vine);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 4, 2), "   ", " ss", " ss", 's', new ItemStack(Blocks.stonebrick));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 4, 3), "   ", " ss", " ss", 's', new ItemStack(Blocks.stonebrick, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 4), "   ", " ss", " ss", 's', new ItemStack(Blocks.stonebrick, 1, 3));
		
		
		//recepten met modded blokken
		
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.brownstonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.brownstone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.brownstone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobblebrownstone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 3), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.brownstonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.redstonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.redstone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.redstone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobbleredstone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 1), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.redstonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.orangestonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.orangestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.orangestone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobbleorangestone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 14), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.orangestonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.bluestonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.bluestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.bluestone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobblebluestone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 4), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.bluestonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.greenstonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.greenstone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.greenstone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobblegreenstone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 2), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.greenstonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.purplestonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.purplestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.purplestone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobblepurplestone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 5), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.purplestonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cyanstonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.cyanstone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cyanstone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobblecyanstone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 6), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cyanstonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.limestonebricks, 4), "   ", " bb", " bb", 'b', Blokregistratie.limestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.limestone, 8), "sss", "sbs", "sss", 's', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 10));
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.cobblelimestone, 8), "ccc", "cbc", "ccc", 'b', new ItemStack(Items.dye, 1, 10), 'c', Blocks.cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(Blokregistratie.limestonebricks, 8), "sss", "sbs", "sss", 's', Blocks.stonebrick, 'b', new ItemStack(Items.dye, 1, 10));
		
	}

}
