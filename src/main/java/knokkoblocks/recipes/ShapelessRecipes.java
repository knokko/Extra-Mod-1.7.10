package knokkoblocks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import knokkoblocks.blocks.Blokregistratie;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapelessRecipes {
	public static void load(){
		
		//recepten met vanilla blokken
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone), Blocks.stonebrick);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.snowball, 4), Blocks.snow);
		
		//recepten met modded blokken
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.cobblebrownstone), Blokregistratie.brownstone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.brownstone), Blokregistratie.brownstonebricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.cobbleredstone), Blokregistratie.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.redstone), Blokregistratie.redstonebricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.cobbleorangestone), Blokregistratie.orangestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.orangestone), Blokregistratie.orangestonebricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.cobblebluestone), Blokregistratie.bluestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.bluestone), Blokregistratie.bluestonebricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.cobblegreenstone), Blokregistratie.greenstone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.greenstone), Blokregistratie.greenstonebricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.cobblepurplestone), Blokregistratie.purplestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.purplestone), Blokregistratie.purplestonebricks);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.lightoakplanks), new ItemStack(Blocks.planks, 1, 0), Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.lightspruceplanks), new ItemStack(Blocks.planks, 1, 1), Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.lightbirchplanks), new ItemStack(Blocks.planks, 1, 2), Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.lightjungleplanks), new ItemStack(Blocks.planks, 1, 3), Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.lightacaciaplanks), new ItemStack(Blocks.planks, 1, 4), Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(Blokregistratie.lightdarkplanks), new ItemStack(Blocks.planks, 1, 5), Blocks.torch);
	}

}
