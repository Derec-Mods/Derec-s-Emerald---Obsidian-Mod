
package net.emeraldobsidianmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import net.emeraldobsidianmod.procedures.SlowEntityProcedure;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;

import java.util.Map;
import java.util.HashMap;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class ObsidianCrusherItem extends DerecsEmeraldObsidianModModElements.ModElement {
	@ObjectHolder("derecs_emerald__obsidian_mod:obsidian_crusher")
	public static final Item block = null;
	public ObsidianCrusherItem(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1951;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.EMERALD, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					SlowEntityProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("obsidian_crusher"));
	}
}
