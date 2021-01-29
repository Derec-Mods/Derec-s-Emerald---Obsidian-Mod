
package net.emeraldobsidianmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.init.Blocks;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.emeraldobsidianmod.procedure.ProcedureSuperShovelMain;
import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

import com.google.common.collect.Multimap;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ItemObsidianSuperShovel extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_super_shovel")
	public static final Item block = null;
	public ItemObsidianSuperShovel(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureSuperShovelMain.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setUnlocalizedName("obsidian_super_shovel").setRegistryName("obsidian_super_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_super_shovel", "inventory"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			setMaxDamage(1951);
			setMaxStackSize(1);
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 1f, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, 0));
			}
			return multimap;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			IBlockState require;
			require = Blocks.CLAY.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 9f;
			require = Blocks.DIRT.getStateFromMeta(0);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 9f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 9f;
			}
			require = Blocks.DIRT.getStateFromMeta(1);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 9f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 9f;
			}
			require = Blocks.DIRT.getStateFromMeta(2);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 9f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 9f;
			}
			require = Blocks.SAND.getStateFromMeta(0);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 9f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 9f;
			}
			require = Blocks.SAND.getStateFromMeta(1);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 9f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 9f;
			}
			require = Blocks.MYCELIUM.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 9f;
			require = Blocks.GRASS.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 9f;
			require = Blocks.GRASS_PATH.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 9f;
			require = Blocks.SNOW_LAYER.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 9f;
			require = Blocks.SNOW.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 9f;
			return 0;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
			stack.damageItem(1, entityLiving);
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
			stack.damageItem(2, attacker);
			return true;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 11;
		}
	}
}
