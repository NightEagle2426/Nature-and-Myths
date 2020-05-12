
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemMercury;
import net.mcreator.natureandmyths.block.BlockMercuryore;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeMercuryf extends ElementsNatureandMyths.ModElement {
	public RecipeMercuryf(ElementsNatureandMyths instance) {
		super(instance, 533);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMercuryore.block, (int) (1)), new ItemStack(ItemMercury.block, (int) (0)), 0F);
	}
}
