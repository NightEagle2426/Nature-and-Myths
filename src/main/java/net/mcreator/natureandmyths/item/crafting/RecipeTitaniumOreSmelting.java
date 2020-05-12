
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemTitaniumIngot;
import net.mcreator.natureandmyths.block.BlockTitaniumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeTitaniumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeTitaniumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 356);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaniumOre.block, (int) (1)), new ItemStack(ItemTitaniumIngot.block, (int) (1)), 0F);
	}
}
