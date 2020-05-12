
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemLithiumIngot;
import net.mcreator.natureandmyths.block.BlockLithiumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeLithiumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeLithiumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 825);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLithiumOre.block, (int) (1)), new ItemStack(ItemLithiumIngot.block, (int) (1)), 0.7F);
	}
}
