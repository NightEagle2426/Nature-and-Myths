
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemScandiumIngot;
import net.mcreator.natureandmyths.block.BlockScandiumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeScandiumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeScandiumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 625);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockScandiumOre.block, (int) (1)), new ItemStack(ItemScandiumIngot.block, (int) (1)), 0.7F);
	}
}
