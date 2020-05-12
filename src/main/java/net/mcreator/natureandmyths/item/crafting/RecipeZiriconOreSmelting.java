
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemZiriconGem;
import net.mcreator.natureandmyths.block.BlockZiriconOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeZiriconOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeZiriconOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 831);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockZiriconOre.block, (int) (1)), new ItemStack(ItemZiriconGem.block, (int) (1)), 1.4F);
	}
}
