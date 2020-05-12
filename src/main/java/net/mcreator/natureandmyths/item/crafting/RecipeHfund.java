
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemPlutonium;
import net.mcreator.natureandmyths.block.BlockHades;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeHfund extends ElementsNatureandMyths.ModElement {
	public RecipeHfund(ElementsNatureandMyths instance) {
		super(instance, 236);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockHades.block, (int) (1)), new ItemStack(ItemPlutonium.block, (int) (0)), 0F);
	}
}
