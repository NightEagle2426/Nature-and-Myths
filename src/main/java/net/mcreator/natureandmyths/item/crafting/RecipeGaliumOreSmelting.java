
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemGaliumIngot;
import net.mcreator.natureandmyths.block.BlockGaliumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeGaliumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeGaliumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 678);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockGaliumOre.block, (int) (1)), new ItemStack(ItemGaliumIngot.block, (int) (1)), 0.7F);
	}
}
