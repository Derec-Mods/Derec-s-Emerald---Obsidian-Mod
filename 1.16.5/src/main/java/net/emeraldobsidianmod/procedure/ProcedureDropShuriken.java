package net.emeraldobsidianmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;

import net.emeraldobsidianmod.item.ItemEmeraldShuriken;
import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ProcedureDropShuriken extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	public ProcedureDropShuriken(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 49);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DropShuriken!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DropShuriken!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DropShuriken!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DropShuriken!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("derecs_emerald__obsidian_mod:shurikenhit")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		if (((Math.random() * 100) <= 70)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemEmeraldShuriken.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
