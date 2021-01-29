
package net.emeraldobsidianmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

import java.util.Set;
import java.util.HashMap;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ItemObsidianPickaxe extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_pickaxe")
	public static final Item block = null;
	public ItemObsidianPickaxe(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("OBSIDIAN_PICKAXE", 5, 1951, 8f, 1f, 10)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("obsidian_pickaxe").setRegistryName("obsidian_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_pickaxe", "inventory"));
	}
}
