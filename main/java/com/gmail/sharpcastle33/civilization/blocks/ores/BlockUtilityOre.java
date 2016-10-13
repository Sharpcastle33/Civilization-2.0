package com.gmail.sharpcastle33.civilization.blocks.ores;

import com.gmail.sharpcastle33.civilization.blocks.ores.BlockMetalOre.EnumType;

import net.minecraft.creativetab.CreativeTabs;

public class BlockUtilityOre extends BlockOre implements IMetaBlockName {

	public BlockUtilityOre(String s) {
		super(s);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(2.5f);
		this.setResistance(12.5f);
		//this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.IRON));
	}
	
}
