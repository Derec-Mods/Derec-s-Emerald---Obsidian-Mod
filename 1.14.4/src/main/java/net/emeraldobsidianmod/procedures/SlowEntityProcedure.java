package net.emeraldobsidianmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Map;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class SlowEntityProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public SlowEntityProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 46);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency entity for procedure SlowEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 3, (int) 2));
	}
}
