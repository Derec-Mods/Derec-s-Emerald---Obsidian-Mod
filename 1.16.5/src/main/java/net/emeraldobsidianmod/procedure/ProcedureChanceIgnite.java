package net.emeraldobsidianmod.procedure;

import net.minecraft.entity.Entity;

import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ProcedureChanceIgnite extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	public ProcedureChanceIgnite(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 45);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChanceIgnite!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((Math.random() * 100) <= 30)) {
			entity.setFire((int) 2);
		}
	}
}
