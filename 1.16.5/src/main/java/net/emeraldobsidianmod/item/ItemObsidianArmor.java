
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
public class ItemObsidianArmor extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_armorboots")
	public static final Item boots = null;
	public ItemObsidianArmor(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("OBSIDIAN_ARMOR", "derecs_emerald__obsidian_mod:obsidian_", 30,
				new int[]{4, 8, 10, 5}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.stone.break")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("obsidian_armorhelmet")
				.setRegistryName("obsidian_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("obsidian_armorbody")
				.setRegistryName("obsidian_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("obsidian_armorlegs")
				.setRegistryName("obsidian_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("obsidian_armorboots")
				.setRegistryName("obsidian_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_armorboots", "inventory"));
	}
}
