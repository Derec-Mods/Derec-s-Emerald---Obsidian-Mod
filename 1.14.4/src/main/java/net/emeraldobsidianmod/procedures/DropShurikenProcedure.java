package net.emeraldobsidianmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.emeraldobsidianmod.item.EmeraldShurikenItem;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Map;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class DropShurikenProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public DropShurikenProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency x for procedure DropShuriken!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency y for procedure DropShuriken!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency z for procedure DropShuriken!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency world for procedure DropShuriken!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world)
					.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("derecs_emerald__obsidian_mod:shurikenhit")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
							.getValue(new ResourceLocation("derecs_emerald__obsidian_mod:shurikenhit")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (((Math.random() * 100) <= 70)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(EmeraldShurikenItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
