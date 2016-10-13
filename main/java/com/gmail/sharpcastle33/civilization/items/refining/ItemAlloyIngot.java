package com.gmail.sharpcastle33.civilization.items.refining;

import com.gmail.sharpcastle33.civilization.creativetabs.CivilizationTabs;
import com.gmail.sharpcastle33.civilization.items.MetaItem;

public class ItemAlloyIngot extends MetaItem {

	public final static int subtypes = 4;
	public final static String[] names = {"bronze","brass","mithril","admantine"};
	
	public ItemAlloyIngot(String name) {
		super(name, subtypes, names);
		this.setCreativeTab(CivilizationTabs.tabCivilizationRefining);
		// TODO Auto-generated constructor stub
	}
	
}
