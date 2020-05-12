
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemManganesiumGem;
import net.mcreator.natureandmyths.block.BlockManganesiumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeManganesiumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeManganesiumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 583);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockManganesiumOre.block, (int) (1)), new ItemStack(ItemManganesiumGem.block, (int) (1)), 1.4F);
	}
}
