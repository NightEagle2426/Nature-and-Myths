
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemNeptunium;
import net.mcreator.natureandmyths.block.BlockNeptuniumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeNeptuniumF extends ElementsNatureandMyths.ModElement {
	public RecipeNeptuniumF(ElementsNatureandMyths instance) {
		super(instance, 565);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNeptuniumOre.block, (int) (1)), new ItemStack(ItemNeptunium.block, (int) (0)), 0F);
	}
}
