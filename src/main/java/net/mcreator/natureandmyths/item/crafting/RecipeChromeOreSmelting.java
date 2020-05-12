
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemChromeIngot;
import net.mcreator.natureandmyths.block.BlockChromeOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeChromeOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeChromeOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 744);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockChromeOre.block, (int) (1)), new ItemStack(ItemChromeIngot.block, (int) (1)), 0.7F);
	}
}
