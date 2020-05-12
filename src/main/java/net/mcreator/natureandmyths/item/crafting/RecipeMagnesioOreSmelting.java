
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemMagnesioIngot;
import net.mcreator.natureandmyths.block.BlockMagnesioOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeMagnesioOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeMagnesioOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 426);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMagnesioOre.block, (int) (1)), new ItemStack(ItemMagnesioIngot.block, (int) (1)), 0F);
	}
}
