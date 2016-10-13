package com.gmail.sharpcastle33.civilization.blocks.ores;

import java.util.ArrayList;
import java.util.Random;

import com.gmail.sharpcastle33.civilization.items.CivilizationItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockScarceGemOre extends BlockGemOre{

	public BlockScarceGemOre(String s) {
		super(s);
		this.setHardness(1.5f);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
			Random rand = new Random();    
			ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		    drops.add(new ItemStack(CivilizationItems.smallGem,rand.nextInt(1)+1,damageDropped(state)));
		    return drops;
	}

}
