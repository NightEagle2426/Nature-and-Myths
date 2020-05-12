
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemCasariteGem;
import net.mcreator.natureandmyths.block.BlockCasariteOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeCasariteOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeCasariteOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 798);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCasariteOre.block, (int) (1)), new ItemStack(ItemCasariteGem.block, (int) (1)),
				2.0999999999999996F);
	}
}
