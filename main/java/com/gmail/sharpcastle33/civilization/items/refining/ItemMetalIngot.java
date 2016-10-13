package com.gmail.sharpcastle33.civilization.items.refining;

import com.gmail.sharpcastle33.civilization.creativetabs.CivilizationTabs;
import com.gmail.sharpcastle33.civilization.items.MetaItem;

import net.minecraft.creativetab.CreativeTabs;

public class ItemMetalIngot extends MetaItem {

	public final static int subtypes = 10;
	public final static String[] names = {"iron","copper","tin","lead","silver","gold","platinum","zinc","mithrine","adamantium"};
	
	public ItemMetalIngot(String name) {
		super(name, subtypes, names);
		this.setCreativeTab(CivilizationTabs.tabCivilizationRefining);
		// TODO Auto-generated constructor stub
	}

}
