
package net.mcreator.natureandmyths.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.natureandmyths.item.ItemPlutonium;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class TabNEArmors extends ElementsNatureandMyths.ModElement {
	public TabNEArmors(ElementsNatureandMyths instance) {
		super(instance, 283);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnearmors") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemPlutonium.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
