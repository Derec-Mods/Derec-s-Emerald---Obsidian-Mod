package net.emeraldobsidianmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

import java.util.Random;
import java.util.Map;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ProcedureSuperHoeTile extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	public ProcedureSuperHoeTile(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 59);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SuperHoeTile!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SuperHoeTile!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 1));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 0));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 0));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z + 1));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.GRASS.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.DIRT.getStateFromMeta(0)
						.getBlock()))) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z + 1));
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
