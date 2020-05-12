
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemTungstenIngot;
import net.mcreator.natureandmyths.block.BlockTungstenOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeTungstenOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeTungstenOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 393);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTungstenOre.block, (int) (1)), new ItemStack(ItemTungstenIngot.block, (int) (1)), 0F);
	}
}
