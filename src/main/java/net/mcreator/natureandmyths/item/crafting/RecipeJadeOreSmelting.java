
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemJadeGem;
import net.mcreator.natureandmyths.block.BlockJadeOre;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeJadeOreSmelting extends ElementsNatureandMyths.ModElement {
	public RecipeJadeOreSmelting(ElementsNatureandMyths instance) {
		super(instance, 873);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockJadeOre.block, (int) (1)), new ItemStack(ItemJadeGem.block, (int) (1)), 1.4F);
	}
}
