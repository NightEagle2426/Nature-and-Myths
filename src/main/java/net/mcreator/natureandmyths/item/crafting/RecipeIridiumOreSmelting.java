
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemIridiumIngot;
import net.mcreator.natureandmyths.block.BlockIridiumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeIridiumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeIridiumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 776);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockIridiumOre.block, (int) (1)), new ItemStack(ItemIridiumIngot.block, (int) (1)), 1.4F);
	}
}
