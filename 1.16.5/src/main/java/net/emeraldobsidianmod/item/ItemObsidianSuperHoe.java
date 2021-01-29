
package net.emeraldobsidianmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.emeraldobsidianmod.procedure.ProcedureSuperHoeTile;
import net.emeraldobsidianmod.ElementsDerecsEmeraldObsidianModMod;

import java.util.Set;
import java.util.HashMap;

@ElementsDerecsEmeraldObsidianModMod.ModElement.Tag
public class ItemObsidianSuperHoe extends ElementsDerecsEmeraldObsidianModMod.ModElement {
	@GameRegistry.ObjectHolder("derecs_emerald__obsidian_mod:obsidian_super_hoe")
	public static final Item block = null;
	public ItemObsidianSuperHoe(ElementsDerecsEmeraldObsidianModMod instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("OBSIDIAN_SUPER_HOE", 5, 1951, 9f, 0f, 11)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 5);
				return ret.keySet();
			}

			@Override
			public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing direction, float hitX,
					float hitY, float hitZ) {
				EnumActionResult retval = super.onItemUse(entity, world, pos, hand, direction, hitX, hitY, hitZ);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = entity.getHeldItem(hand);
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureSuperHoeTile.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setUnlocalizedName("obsidian_super_hoe").setRegistryName("obsidian_super_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("derecs_emerald__obsidian_mod:obsidian_super_hoe", "inventory"));
	}
}
