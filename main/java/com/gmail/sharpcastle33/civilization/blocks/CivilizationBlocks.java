package com.gmail.sharpcastle33.civilization.blocks;

import com.gmail.sharpcastle33.civilization.blocks.ores.BlockDenseGemOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.BlockDenseMetalOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.BlockGemOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.BlockMetalOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.BlockScarceGemOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.BlockScarceMetalOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.ItemBlockGemOre;
import com.gmail.sharpcastle33.civilization.blocks.ores.ItemBlockMetalOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CivilizationBlocks {
	
	public static BlockGemOre gemOre;
	public static BlockScarceGemOre scarceGemOre;
	public static BlockDenseGemOre denseGemOre;
	
	public static BlockMetalOre metalOre;
	public static BlockScarceMetalOre scarceMetalOre;
	public static BlockDenseMetalOre denseMetalOre;
	//public static final Block gemOre = new BlockGemOre();
	//public static BlockGemOre blockGemOre;
	public static void load(){
		
		/*blockGemOre = (BlockGemOre)(new BlockGemOre().setUnlocalizedName("block_gem_ore"));
		GameRegistry.registerBlock(blockGemOre, "block_gem_ore");*/
	
		GameRegistry.registerBlock(gemOre = new BlockGemOre("block_gem_ore"), ItemBlockGemOre.class, "block_gem_ore");
		GameRegistry.registerBlock(scarceGemOre = new BlockScarceGemOre("block_scarce_gem_ore"), ItemBlockGemOre.class, "block_scarce_gem_ore");
		GameRegistry.registerBlock(denseGemOre = new BlockDenseGemOre("block_dense_gem_ore"), ItemBlockGemOre.class, "block_dense_gem_ore");
		
		GameRegistry.registerBlock(metalOre = new BlockMetalOre("block_metal_ore"), ItemBlockMetalOre.class, "block_metal_ore");
		GameRegistry.registerBlock(scarceMetalOre = new BlockScarceMetalOre("block_scarce_metal_ore"), ItemBlockMetalOre.class, "block_scarce_metal_ore");
		GameRegistry.registerBlock(denseMetalOre = new BlockDenseMetalOre("block_dense_metal_ore"), ItemBlockMetalOre.class, "block_dense_metal_ore");

	}
}
