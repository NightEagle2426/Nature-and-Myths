
package net.mcreator.natureandmyths.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class MacuahuitlCianItem extends NatureandmythsModElements.ModElement {
	@ObjectHolder("natureandmyths:macuahuitl_cian")
	public static final Item block = null;
	public MacuahuitlCianItem(NatureandmythsModElements instance) {
		super(instance, 442);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ObsidianShatterItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("macuahuitl_cian"));
	}
}
