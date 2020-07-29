
package net.mcreator.natureandmyths.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.natureandmyths.item.PlutoniumItem;
import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class NEArmorsItemGroup extends NatureandmythsModElements.ModElement {
	public NEArmorsItemGroup(NatureandmythsModElements instance) {
		super(instance, 490);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnearmors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PlutoniumItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
