package net.emeraldobsidianmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.emeraldobsidianmod.item.ReinforcedObsidianArmorItem;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModModElements;
import net.emeraldobsidianmod.DerecsEmeraldObsidianModMod;

import java.util.Map;
import java.util.HashMap;

@DerecsEmeraldObsidianModModElements.ModElement.Tag
public class CheckObsidianArmorProcedure extends DerecsEmeraldObsidianModModElements.ModElement {
	public CheckObsidianArmorProcedure(DerecsEmeraldObsidianModModElements instance) {
		super(instance, 47);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DerecsEmeraldObsidianModMod.LOGGER.warn("Failed to load dependency entity for procedure CheckObsidianArmor!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
				: ItemStack.EMPTY).getItem() == new ItemStack(ReinforcedObsidianArmorItem.boots, (int) (1)).getItem())) {
			if ((((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
					: ItemStack.EMPTY).getItem() == new ItemStack(ReinforcedObsidianArmorItem.legs, (int) (1)).getItem())) {
				if ((((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
						: ItemStack.EMPTY).getItem() == new ItemStack(ReinforcedObsidianArmorItem.body, (int) (1)).getItem())) {
					if ((((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
							: ItemStack.EMPTY).getItem() == new ItemStack(ReinforcedObsidianArmorItem.helmet, (int) (1)).getItem())) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 5, (int) 3, (false), (false)));
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
