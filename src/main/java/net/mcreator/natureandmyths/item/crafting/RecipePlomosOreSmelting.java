
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemPlomo;
import net.mcreator.natureandmyths.block.BlockPlomosOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipePlomosOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipePlomosOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 564);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPlomosOre.block, (int) (1)), new ItemStack(ItemPlomo.block, (int) (0)), 0F);
	}
}
