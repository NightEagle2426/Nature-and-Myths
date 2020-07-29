package net.mcreator.natureandmyths.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.natureandmyths.NatureandmythsModElements;

@NatureandmythsModElements.ModElement.Tag
public class HadespHelmetTickEventProcedure extends NatureandmythsModElements.ModElement {
	public HadespHelmetTickEventProcedure(NatureandmythsModElements instance) {
		super(instance, 458);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HadespHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 1e+35, (int) 10, (false), (false)));
		for (int index0 = 0; index0 < (int) (1e+47); index0++) {
			continue;
		}
	}
}
