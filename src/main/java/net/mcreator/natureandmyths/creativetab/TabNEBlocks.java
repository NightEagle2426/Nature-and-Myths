
package net.mcreator.natureandmyths.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.natureandmyths.block.BlockZaphib;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class TabNEBlocks extends ElementsNatureandMyths.ModElement {
	public TabNEBlocks(ElementsNatureandMyths instance) {
		super(instance, 281);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabneblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockZaphib.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
