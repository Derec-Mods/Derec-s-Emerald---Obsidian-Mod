package net.emeraldobsidianmod.procedures;

import net.minecraft.entity.Entity;

import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Map;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class ChanceIgniteProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public ChanceIgniteProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 45);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency entity for procedure ChanceIgnite!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((Math.random() * 100) <= 30)) {
			entity.setFire((int) 2);
		}
	}
}
