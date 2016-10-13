package com.gmail.sharpcastle33.civilization.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public abstract class BlockOre extends Block {
	
	public BlockOre(String unlocalized_name) {
		super(Material.IRON);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(3.0f);
		this.setResistance(15.0f);
		this.setUnlocalizedName(unlocalized_name);

	}

}

