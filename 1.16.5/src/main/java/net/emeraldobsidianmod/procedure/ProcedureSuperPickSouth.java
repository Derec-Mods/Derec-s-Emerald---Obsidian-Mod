package net.emeraldobsidianmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;

import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

import java.util.Random;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ProcedureSuperPickSouth extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	public ProcedureSuperPickSouth(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 57);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SuperPickSouth!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SuperPickSouth!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SuperPickSouth!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SuperPickSouth!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SuperPickSouth!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SuperPickSouth!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) y, (int) (z - 2)), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2))),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) (z - 2)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2))),
						1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
		}
		if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2))), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y - 1), (int) (z - 2)), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
		}
		if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2)),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2))), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) (z - 2)), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
			if (((!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.OBSIDIAN.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK
							.getDefaultState().getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2)),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2)));
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setItemDamage(0);
				}
			}
		}
	}
}
