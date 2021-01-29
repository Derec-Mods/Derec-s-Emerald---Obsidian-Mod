
package net.emeraldobsidianmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.emeraldobsidianmod.procedures.SuperShovelMainProcedure;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class EmeraldSuperShovelItem extends DerecsEmeraldObsidianModModElements.ModElement {
	@ObjectHolder("derecs_emerald__obsidian_mod:emerald_super_shovel")
	public static final Item block = null;
	public EmeraldSuperShovelItem(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Time to dig... a lot of blocks"));
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState bl, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					SuperShovelMainProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("emerald_super_shovel"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(1000));
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			if (blockstate.getBlock() == Blocks.CLAY.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.DIRT.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.COARSE_DIRT.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.SAND.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.RED_SAND.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.SNOW.getDefaultState().getBlock())
				return 9f;
			if (blockstate.getBlock() == Blocks.SNOW_BLOCK.getDefaultState().getBlock())
				return 9f;
			return 1;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(2, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 10;
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 3f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}
	}
}
