
package world.stomt.dream.chufengjingplus.item;

import world.stomt.dream.chufengjingplus.creativetab.TabChufengjingMetroLines;
import world.stomt.dream.chufengjingplus.ElementsChufengjingPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

@ElementsChufengjingPlusMod.ModElement.Tag
public class ItemChufengjing extends ElementsChufengjingPlusMod.ModElement {
	@GameRegistry.ObjectHolder("chufengjingplus:chufengjing")
	public static final Item block = null;
	public ItemChufengjing(ElementsChufengjingPlusMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chufengjingplus:chufengjing", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("chufengjing");
			setRegistryName("chufengjing");
			setCreativeTab(TabChufengjingMetroLines.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
