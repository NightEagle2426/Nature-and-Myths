
package net.mcreator.natureandmyths.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.natureandmyths.item.ItemRuby;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class TabNEMinerals extends ElementsNatureandMyths.ModElement {
	public TabNEMinerals(ElementsNatureandMyths instance) {
		super(instance, 280);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabneminerals") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRuby.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
