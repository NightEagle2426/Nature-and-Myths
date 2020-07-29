
package net.mcreator.natureandmyths.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.natureandmyths.block.ZaphibBlock;
import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class NEBlocksItemGroup extends NatureandmythsModElements.ModElement {
	public NEBlocksItemGroup(NatureandmythsModElements instance) {
		super(instance, 488);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabneblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ZaphibBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
