
package net.mcreator.natureandmyths.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class MangoItem extends NatureandmythsModElements.ModElement {
	@ObjectHolder("natureandmyths:mango")
	public static final Item block = null;
	public MangoItem(NatureandmythsModElements instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("mango");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
