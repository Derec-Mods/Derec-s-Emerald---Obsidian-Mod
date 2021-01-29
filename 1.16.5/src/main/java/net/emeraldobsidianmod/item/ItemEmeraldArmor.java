
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
public class ItemEmeraldArmor extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:emerald_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:emerald_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:emerald_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:emerald_armorboots")
	public static final Item boots = null;
	public ItemEmeraldArmor(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALD_ARMOR", "derecs_emerald__obsidian_mod:emerald_", 23,
				new int[]{2, 5, 7, 3}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				1.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emerald_armorhelmet")
				.setRegistryName("emerald_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emerald_armorbody")
				.setRegistryName("emerald_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emerald_armorlegs")
				.setRegistryName("emerald_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emerald_armorboots")
				.setRegistryName("emerald_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:emerald_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("derecs_emerald__obsidian_mod:emerald_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("derecs_emerald__obsidian_mod:emerald_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:emerald_armorboots", "inventory"));
	}
}
