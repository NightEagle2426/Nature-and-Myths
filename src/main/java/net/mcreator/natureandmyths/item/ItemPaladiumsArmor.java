
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
public class ItemPaladiumsArmor extends ElementsNatureandMyths.ModElement {
	@GameRegistry.ObjectHolder("natureandmyths:paladiumsarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("natureandmyths:paladiumsarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("natureandmyths:paladiumsarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("natureandmyths:paladiumsarmorboots")
	public static final Item boots = null;
	public ItemPaladiumsArmor(ElementsNatureandMyths instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PALADIUMSARMOR", "natureandmyths:paladiums", 30, new int[]{4, 12, 10, 4}, 18,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("paladiumsarmorhelmet")
				.setRegistryName("paladiumsarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("paladiumsarmorbody")
				.setRegistryName("paladiumsarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("paladiumsarmorlegs")
				.setRegistryName("paladiumsarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("paladiumsarmorboots")
				.setRegistryName("paladiumsarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("natureandmyths:paladiumsarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("natureandmyths:paladiumsarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("natureandmyths:paladiumsarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("natureandmyths:paladiumsarmorboots", "inventory"));
	}
}
