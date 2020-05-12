
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemUraniumIngot;
import net.mcreator.natureandmyths.block.BlockUraniumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeUraniumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeUraniumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 819);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockUraniumOre.block, (int) (1)), new ItemStack(ItemUraniumIngot.block, (int) (1)), 0.7F);
	}
}
