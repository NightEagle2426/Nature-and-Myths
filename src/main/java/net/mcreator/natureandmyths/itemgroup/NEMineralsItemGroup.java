
package net.mcreator.natureandmyths.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.natureandmyths.item.RubyItem;
import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class NEMineralsItemGroup extends NatureandmythsModElements.ModElement {
	public NEMineralsItemGroup(NatureandmythsModElements instance) {
		super(instance, 487);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabneminerals") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
