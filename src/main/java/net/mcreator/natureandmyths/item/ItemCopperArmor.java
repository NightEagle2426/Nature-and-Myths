
package net.mcreator.natureandmyths.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class ItemCopperArmor extends ElementsNatureandMyths.ModElement {
	@GameRegistry.ObjectHolder("natureandmyths:copperarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("natureandmyths:copperarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("natureandmyths:copperarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("natureandmyths:copperarmorboots")
	public static final Item boots = null;
	public ItemCopperArmor(ElementsNatureandMyths instance) {
		super(instance, 734);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COPPERARMOR", "natureandmyths:copper", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copperarmorhelmet")
				.setRegistryName("copperarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copperarmorbody")
				.setRegistryName("copperarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copperarmorlegs")
				.setRegistryName("copperarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copperarmorboots")
				.setRegistryName("copperarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("natureandmyths:copperarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("natureandmyths:copperarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("natureandmyths:copperarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("natureandmyths:copperarmorboots", "inventory"));
	}
}
