package com.gmail.sharpcastle33.civilization.items;

import java.util.List;

import com.gmail.sharpcastle33.civilization.main.Civilization;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseMetaItem extends BaseItem{

	protected final int subtypes;
	protected final String[] names;
	
	public BaseMetaItem(String name, String[]names) {
		super(name);
		subtypes = names.length;
		this.names = names;
		this.setHasSubtypes(true);
	}
	//This makes sure that the creative tab has all variants of the item, rather than just the one with meta = 0.
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List list) {
	    for(int meta = 0; meta < subtypes; meta++){
	    	list.add(new ItemStack(itemIn, 1, meta));
	    }
	}
	//this gets you the base name (eg: "item_metal_ingot" as opposed to "item_metal_ingot.tin")
	public String getBaseName(){
		return super.getUnlocalizedName();
	}
	//this gets you the meta name (eg: "tin")
	public String getMetaName(int meta){
		return names[meta];
	}
	//gets unlocalized name (eg: "item_metal_ingot.tin"
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + getMetaName(stack.getItemDamage());
	}
	
	@Override
	public void registerItemModel(){	
		for(int meta = 0; meta < this.subtypes; meta++){
			Civilization.proxy.registerItemRenderer(this, meta, this.name + "_" + this.getMetaName(meta));
		}
	}
	
	@Override
	public BaseMetaItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
