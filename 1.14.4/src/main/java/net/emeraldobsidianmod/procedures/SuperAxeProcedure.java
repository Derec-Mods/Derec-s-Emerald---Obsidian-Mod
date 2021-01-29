package net.emeraldobsidianmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Random;
import java.util.Map;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class SuperAxeProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public SuperAxeProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency x for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency y for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency z for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency world for procedure SuperAxe!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double num = 0;
		num = (double) 0;
		while ((((((((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.OAK_LOG.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.SPRUCE_LOG.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.DARK_OAK_LOG.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.ACACIA_LOG.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.JUNGLE_LOG.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.BIRCH_LOG.getDefaultState()
						.getBlock()))) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z)), (World) world,
						new BlockPos((int) x, (int) (y + (num)), (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + (num)), (int) z), false);
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) (y + (num)), (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, (y + (num)), z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			num = (double) ((num) + 1);
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if (((num) >= 10)) {
				break;
			}
		}
	}
}
