
package net.mcreator.natureandmyths.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.natureandmyths.ElementsNatureandMyths;

import java.util.Set;
import java.util.HashMap;

@ElementsNatureandMyths.ModElement.Tag
public class ItemRodiumHoe extends ElementsNatureandMyths.ModElement {
	@GameRegistry.ObjectHolder("natureandmyths:rodiumhoe")
	public static final Item block = null;
	public ItemRodiumHoe(ElementsNatureandMyths instance) {
		super(instance, 206);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("RODIUMHOE", 4, 660, 9f, 0f, 28)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("rodiumhoe").setRegistryName("rodiumhoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("natureandmyths:rodiumhoe", "inventory"));
	}
}