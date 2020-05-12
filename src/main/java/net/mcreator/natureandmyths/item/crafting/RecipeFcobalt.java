
package net.mcreator.natureandmyths.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.natureandmyths.item.ItemCobalto;
import net.mcreator.natureandmyths.block.BlockCobaltore;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class RecipeFcobalt extends ElementsNatureandMyths.ModElement {
	public RecipeFcobalt(ElementsNatureandMyths instance) {
		super(instance, 240);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCobaltore.block, (int) (1)), new ItemStack(ItemCobalto.block, (int) (0)), 0F);
	}
}
