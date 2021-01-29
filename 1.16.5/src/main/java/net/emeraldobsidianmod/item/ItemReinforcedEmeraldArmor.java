
package net.emeraldobsidianmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ItemReinforcedEmeraldArmor extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:reinforced_emerald_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:reinforced_emerald_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:reinforced_emerald_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:reinforced_emerald_armorboots")
	public static final Item boots = null;
	public ItemReinforcedEmeraldArmor(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("REINFORCED_EMERALD_ARMOR", "derecs_emerald__obsidian_mod:armormodel_", 30,
				new int[]{3, 6, 8, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				1.7f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("reinforced_emerald_armorhelmet")
				.setRegistryName("reinforced_emerald_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("reinforced_emerald_armorbody")
				.setRegistryName("reinforced_emerald_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("reinforced_emerald_armorlegs")
				.setRegistryName("reinforced_emerald_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("reinforced_emerald_armorboots")
				.setRegistryName("reinforced_emerald_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:reinforced_emerald_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:reinforced_emerald_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:reinforced_emerald_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:reinforced_emerald_armorboots", "inventory"));
	}
}
