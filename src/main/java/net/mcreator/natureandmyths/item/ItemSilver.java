
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
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.natureandmyths.creativetab.TabNEArmors;
import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class ItemSilver extends ElementsNatureandMyths.ModElement {
	@GameRegistry.ObjectHolder("natureandmyths:silverhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("natureandmyths:silverbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("natureandmyths:silverlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("natureandmyths:silverboots")
	public static final Item boots = null;
	public ItemSilver(ElementsNatureandMyths instance) {
		super(instance, 227);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SILVER", "natureandmyths:silver", 25, new int[]{2, 5, 6, 2}, 12,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("silverhelmet").setRegistryName("silverhelmet")
				.setCreativeTab(TabNEArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("silverbody").setRegistryName("silverbody")
				.setCreativeTab(TabNEArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("silverlegs").setRegistryName("silverlegs")
				.setCreativeTab(TabNEArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("silverboots").setRegistryName("silverboots")
				.setCreativeTab(TabNEArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("natureandmyths:silverhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("natureandmyths:silverbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("natureandmyths:silverlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("natureandmyths:silverboots", "inventory"));
	}
}
