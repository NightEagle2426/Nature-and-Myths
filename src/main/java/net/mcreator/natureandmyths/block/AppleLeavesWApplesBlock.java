
package net.mcreator.natureandmyths.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.natureandmyths.NatureandmythsModElements;

import java.util.List;
import java.util.Collections;

@NatureandmythsModElements.ModElement.Tag
public class AppleLeavesWApplesBlock extends NatureandmythsModElements.ModElement {
	@ObjectHolder("natureandmyths:appleleaveswapples")
	public static final Block block = null;
	public AppleLeavesWApplesBlock(NatureandmythsModElements instance) {
		super(instance, 833);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.2f, 1f).lightValue(0));
			setRegistryName("appleleaveswapples");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Items.APPLE, (int) (3)));
		}
	}
}
