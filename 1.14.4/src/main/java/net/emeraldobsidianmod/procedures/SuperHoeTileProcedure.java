package net.emeraldobsidianmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Random;
import java.util.Map;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class SuperHoeTileProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public SuperHoeTileProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 59);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency x for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency y for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency z for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency world for procedure SuperHoeTile!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 1));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 0));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 0));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z + 1));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK
						.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.DIRT.getDefaultState()
						.getBlock()))) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z + 1));
				BlockState _bs = Blocks.FARMLAND.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
