
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemRodiumIngot;
import net.mcreator.natureandmyths.block.BlockRodiumOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeRodiumOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeRodiumOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 405);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRodiumOre.block, (int) (1)), new ItemStack(ItemRodiumIngot.block, (int) (1)), 0F);
	}
}
