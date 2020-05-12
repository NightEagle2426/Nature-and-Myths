
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemAquamarineGem;
import net.mcreator.natureandmyths.block.BlockAquamarineOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeAquamarineOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeAquamarineOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 381);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAquamarineOre.block, (int) (1)), new ItemStack(ItemAquamarineGem.block, (int) (1)), 0F);
	}
}
