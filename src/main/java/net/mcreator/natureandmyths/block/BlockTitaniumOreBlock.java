
package net.mcreator.natureandmyths.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.natureandmyths.creativetab.TabNEMinerals;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class BlockTitaniumOreBlock extends ElementsNatureandMyths.ModElement {
	@GameRegistry.ObjectHolder("natureandmyths:titaniumoreblock")
	public static final Block block = null;
	public BlockTitaniumOreBlock(ElementsNatureandMyths instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("titaniumoreblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("natureandmyths:titaniumoreblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("titaniumoreblock");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 4);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabNEMinerals.tab);
		}
	}
}
