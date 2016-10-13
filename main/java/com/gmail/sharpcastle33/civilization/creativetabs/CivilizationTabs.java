package com.gmail.sharpcastle33.civilization.creativetabs;

import com.gmail.sharpcastle33.civilization.blocks.CivilizationBlocks;
import com.gmail.sharpcastle33.civilization.items.CivilizationItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CivilizationTabs {

	public static final CreativeTabs tabCivilizationOres = new CreativeTabs("civilizationOres") {
	    @Override public Item getTabIconItem() {
	        return Item.getItemFromBlock(CivilizationBlocks.denseMetalOre);
	    }
	    public int getItemIconDamage() {
	        return 0;
	    }
	};
	
	public static final CreativeTabs tabCivilizationRefining = new CreativeTabs("civilizationRefining") {
	    @Override public Item getTabIconItem() {
	        return CivilizationItems.metalIngot;
	    }
	    public int getItemIconDamage() {
	        return 0;
	    }
	};
}
