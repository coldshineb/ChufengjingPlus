
package world.stomt.dream.chufengjingplus.block;

import world.stomt.dream.chufengjingplus.creativetab.TabChufengjingMetroLines;
import world.stomt.dream.chufengjingplus.ElementsChufengjingPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsChufengjingPlusMod.ModElement.Tag
public class BlockChufengLine1 extends ElementsChufengjingPlusMod.ModElement {
	@GameRegistry.ObjectHolder("chufengjingplus:chufengline1")
	public static final Block block = null;
	public BlockChufengLine1(ElementsChufengjingPlusMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("chufengline1"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("chufengjingplus:chufengline1", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("chufengline1");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabChufengjingMetroLines.tab);
		}
	}
}
