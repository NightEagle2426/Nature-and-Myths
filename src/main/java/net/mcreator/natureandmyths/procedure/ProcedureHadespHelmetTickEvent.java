package net.mcreator.natureandmyths.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.natureandmyths.ElementsNatureandMyths;

@ElementsNatureandMyths.ModElement.Tag
public class ProcedureHadespHelmetTickEvent extends ElementsNatureandMyths.ModElement {
	public ProcedureHadespHelmetTickEvent(ElementsNatureandMyths instance) {
		super(instance, 242);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HadespHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 1e+35, (int) 10, (false), (false)));
		for (int index0 = 0; index0 < (int) (1e+47); index0++) {
			continue;
		}
	}
}
