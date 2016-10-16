package com.gmail.sharpcastle33.civilization.items;

import com.gmail.sharpcastle33.civilization.main.Civilization;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item{

	protected String name;
	
	public BaseItem(String name){
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(){
		Civilization.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public BaseItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
