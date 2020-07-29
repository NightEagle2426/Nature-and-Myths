
package net.mcreator.natureandmyths.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class SpawnEggsItemGroup extends NatureandmythsModElements.ModElement {
	public SpawnEggsItemGroup(NatureandmythsModElements instance) {
		super(instance, 902);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabspawn_eggs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
