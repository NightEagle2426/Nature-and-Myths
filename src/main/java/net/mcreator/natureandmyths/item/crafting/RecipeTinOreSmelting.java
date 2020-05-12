
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemTinIngot;
import net.mcreator.natureandmyths.block.BlockTinOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeTinOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeTinOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 449);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTinOre.block, (int) (1)), new ItemStack(ItemTinIngot.block, (int) (1)), 0F);
	}
}
