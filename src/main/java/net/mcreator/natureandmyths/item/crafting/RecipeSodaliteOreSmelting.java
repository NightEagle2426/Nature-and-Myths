
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemSodaliteIngot;
import net.mcreator.natureandmyths.block.BlockSodaliteOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeSodaliteOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeSodaliteOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 852);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSodaliteOre.block, (int) (1)), new ItemStack(ItemSodaliteIngot.block, (int) (1)), 0.7F);
	}
}
