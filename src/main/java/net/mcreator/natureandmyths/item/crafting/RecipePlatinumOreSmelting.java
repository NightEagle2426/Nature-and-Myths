
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemPlatinumIngot;
import net.mcreator.natureandmyths.block.BlockPlatinumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipePlatinumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipePlatinumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 461);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPlatinumOre.block, (int) (1)), new ItemStack(ItemPlatinumIngot.block, (int) (1)), 0F);
	}
}
