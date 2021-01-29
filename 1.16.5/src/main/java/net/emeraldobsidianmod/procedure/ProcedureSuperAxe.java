package net.emeraldobsidianmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;

import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

import java.util.Random;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ProcedureSuperAxe extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	public ProcedureSuperAxe(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 56);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SuperAxe!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SuperAxe!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double num = 0;
		num = (double) 0;
		while ((((((((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.LOG.getStateFromMeta(0).getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.LOG.getStateFromMeta(1).getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.LOG2.getStateFromMeta(1)
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.LOG2.getStateFromMeta(0)
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.LOG.getStateFromMeta(3).getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z))).getBlock() == Blocks.LOG.getStateFromMeta(2)
						.getBlock()))) {
			world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) (y + (num)), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + (num)), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y + (num)), (int) z));
			world.playSound((EntityPlayer) null, x, (y + (num)), z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.break")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			num = (double) ((num) + 1);
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			if (((num) >= 10)) {
				break;
			}
		}
	}
}
