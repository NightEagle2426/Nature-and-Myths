
package net.mcreator.natureandmyths.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.natureandmyths.item.ItemRubySword;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class TabNEWeaponsandTools extends ElementsNatureandMyths.ModElement {
	public TabNEWeaponsandTools(ElementsNatureandMyths instance) {
		super(instance, 282);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabneweaponsandtools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRubySword.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
