
package net.mcreator.natureandmyths.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class LapizlasuliHoeItem extends NatureandmythsModElements.ModElement {
	@ObjectHolder("natureandmyths:lapizlasulihoe")
	public static final Item block = null;
	public LapizlasuliHoeItem(NatureandmythsModElements instance) {
		super(instance, 351);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lapizlasulihoe"));
	}
}
