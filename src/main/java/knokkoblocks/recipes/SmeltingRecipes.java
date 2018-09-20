package knokkoblocks.recipes;

import net.minecraft.item.ItemStack;
import knokkoblocks.blocks.Blokregistratie;
import knokkoblocks.food.VoedselRegistratie;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void load(){
		GameRegistry.addSmelting(Blokregistratie.cobblebluestone, new ItemStack(Blokregistratie.bluestone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobblegreenstone, new ItemStack(Blokregistratie.greenstone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobblepurplestone, new ItemStack(Blokregistratie.purplestone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobblebrownstone, new ItemStack(Blokregistratie.brownstone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobbleredstone, new ItemStack(Blokregistratie.redstone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobbleorangestone, new ItemStack(Blokregistratie.orangestone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobblewhitestone, new ItemStack(Blokregistratie.whitestone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobbleblackstone, new ItemStack(Blokregistratie.blackstone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobblecyanstone, new ItemStack(Blokregistratie.cyanstone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobblelimestone, new ItemStack(Blokregistratie.limestone), 0.4F);
		GameRegistry.addSmelting(Blokregistratie.cobbleyellowstone, new ItemStack(Blokregistratie.yellowstone), 0.4F);
		GameRegistry.addSmelting(VoedselRegistratie.sheepflesh, new ItemStack(VoedselRegistratie.cookedsheepflesh), 0.4F);
	}

}
