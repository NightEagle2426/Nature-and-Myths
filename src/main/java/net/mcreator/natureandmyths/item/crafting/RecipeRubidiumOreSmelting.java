
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemRubidiumIngot;
import net.mcreator.natureandmyths.block.BlockRubidiumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeRubidiumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeRubidiumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 770);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRubidiumOre.block, (int) (1)), new ItemStack(ItemRubidiumIngot.block, (int) (1)), 0.7F);
	}
}
