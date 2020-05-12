
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
public class ItemAluminium0Hoe extends ElementsNatureandMyths.ModElement {
	@GameRegistry.ObjectHolder("natureandmyths:aluminium0hoe")
	public static final Item block = null;
	public ItemAluminium0Hoe(ElementsNatureandMyths instance) {
		super(instance, 492);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("ALUMINIUM0HOE", 1, 30, 8f, 0f, 15)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("aluminium0hoe").setRegistryName("aluminium0hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("natureandmyths:aluminium0hoe", "inventory"));
	}
}