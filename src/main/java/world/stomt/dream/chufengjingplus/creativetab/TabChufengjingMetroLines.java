
package world.stomt.dream.chufengjingplus.creativetab;

import world.stomt.dream.chufengjingplus.item.ItemChufengjing;
import world.stomt.dream.chufengjingplus.ElementsChufengjingPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsChufengjingPlusMod.ModElement.Tag
public class TabChufengjingMetroLines extends ElementsChufengjingPlusMod.ModElement {
	public TabChufengjingMetroLines(ElementsChufengjingPlusMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabchufengjingmetrolines") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemChufengjing.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
