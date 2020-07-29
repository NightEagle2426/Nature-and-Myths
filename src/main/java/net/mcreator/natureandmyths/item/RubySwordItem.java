
package net.mcreator.natureandmyths.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class RubySwordItem extends NatureandmythsModElements.ModElement {
	@ObjectHolder("natureandmyths:rubysword")
	public static final Item block = null;
	public RubySwordItem(NatureandmythsModElements instance) {
		super(instance, 180);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1480;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 2.800000000000001f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.5f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("rubysword"));
	}
}
