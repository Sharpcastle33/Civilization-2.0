package com.gmail.sharpcastle33.civilization.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Deprecated
public abstract class MetaItem extends Item{

	public final int subtypes;
	public final String[] names;
	
	public MetaItem(String name, int subs, String[]n){
		super();
		this.setHasSubtypes(true);
		this.setUnlocalizedName(name);
		subtypes = subs;
		names = n;
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List list) {
	    for(int meta = 0; meta < subtypes; meta++){
	    	list.add(new ItemStack(itemIn, 1, meta));
	    }
	}
	
	public String getBaseName(){
		return super.getUnlocalizedName();
	}
	
	public String getMetaName(int meta){
		return names[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + getMetaName(stack.getItemDamage());
	}
	
	
	
}
//depreciated
