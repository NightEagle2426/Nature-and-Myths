
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemSilverIngot;
import net.mcreator.natureandmyths.block.BlockSilverOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipePlata extends ElementsNatureandMyths.ModElement {
	public RecipePlata(ElementsNatureandMyths instance) {
		super(instance, 228);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSilverOre.block, (int) (1)), new ItemStack(ItemSilverIngot.block, (int) (0)), 0F);
	}
}
