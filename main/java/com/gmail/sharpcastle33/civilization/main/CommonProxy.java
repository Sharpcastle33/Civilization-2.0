package com.gmail.sharpcastle33.civilization.main;

import com.gmail.sharpcastle33.civilization.blocks.CivilizationBlocks;
import com.gmail.sharpcastle33.civilization.items.CivilizationItems;

import net.minecraft.item.Item;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {
	 /**
	   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	   */
	public void preInit(){
	 CivilizationBlocks.load();
	 CivilizationItems.load();
	}
	/**
	   * Do your mod setup. Build whatever data structures you care about. Register recipes,
	   * send FMLInterModComms messages to other mods.
	   */
	public void init(){
		
	}

	  /**
	   * Handle interaction with other mods, complete your setup based on this.
	   */
	public void postInit(){
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id){}
}
