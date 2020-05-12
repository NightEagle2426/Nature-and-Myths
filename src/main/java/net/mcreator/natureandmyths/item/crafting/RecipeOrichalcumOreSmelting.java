
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemOrichalcumIngot;
import net.mcreator.natureandmyths.block.BlockOrichalcumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeOrichalcumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeOrichalcumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 703);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockOrichalcumOre.block, (int) (1)), new ItemStack(ItemOrichalcumIngot.block, (int) (1)), 1.4F);
	}
}
