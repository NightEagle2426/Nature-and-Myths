
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemChrysoliteGem;
import net.mcreator.natureandmyths.block.BlockChrysoliteOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeChrysoliteOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeChrysoliteOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 604);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockChrysoliteOre.block, (int) (1)), new ItemStack(ItemChrysoliteGem.block, (int) (1)), 0.7F);
	}
}
