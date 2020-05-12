
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemNikel1Ingot;
import net.mcreator.natureandmyths.block.BlockNikel1Ore;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeNikel1OreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeNikel1OreSmelting(ElementsNatureandMyths instance) {
		super(instance, 646);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNikel1Ore.block, (int) (1)), new ItemStack(ItemNikel1Ingot.block, (int) (1)), 0.7F);
	}
}
