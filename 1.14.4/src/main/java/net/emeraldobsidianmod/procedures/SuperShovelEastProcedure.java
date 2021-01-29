package net.emeraldobsidianmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Random;
import java.util.Map;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class SuperShovelEastProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public SuperShovelEastProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 97);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency entity for procedure SuperShovelEast!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SuperShovelEast!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency x for procedure SuperShovelEast!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency y for procedure SuperShovelEast!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency z for procedure SuperShovelEast!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency world for procedure SuperShovelEast!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState().getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.PODZOL
													.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.SAND
															.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState().getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.PODZOL
													.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.SAND
															.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.DIRT.getDefaultState().getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.PODZOL
													.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.SAND
															.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) (x + 2), (int) y, (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.DIRT.getDefaultState().getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.PODZOL
													.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.SAND
															.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)), (World) world,
							new BlockPos((int) (x + 2), (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) (x + 2), (int) y, (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
		}
		if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.DIRT.getDefaultState().getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.PODZOL
													.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.SAND
															.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z)))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z)))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) (x + 2), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y - 1), (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRAVEL
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1))))
													.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1))))
															.getBlock() == Blocks.SAND.getDefaultState().getBlock()))))))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
		}
		if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) (x + 2), (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y + 1), (int) z), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1)), false);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
		}
	}
}
