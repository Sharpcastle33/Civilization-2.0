package com.gmail.sharpcastle33.civilization.items.mobs.animals;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAnimalMeat extends Item {

	public ItemAnimalMeat(String name){
		super();
		this.setHasSubtypes(true);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List list) {
	    list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
	    list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
	    list.add(new ItemStack(itemIn, 1, 2));
	    list.add(new ItemStack(itemIn, 1, 3));
	    list.add(new ItemStack(itemIn, 1, 4));
	    list.add(new ItemStack(itemIn, 1, 5));
	    list.add(new ItemStack(itemIn, 1, 6));
	    list.add(new ItemStack(itemIn, 1, 7));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	  String s = "";
		switch(stack.getItemDamage()){
		case 0: s = "0";
		break;
		case 1: s = "wolf";
		break;
		case 2: s = "bear";
		break;
		case 3: s = "deer";
		break;
		case 4: s = "4";
		break;
		case 5: s = "5";
		break;
		case 6: s = "6";
		break;
		case 7: s = "7";
		break;
		default: s = "8";
		break;
	   }
	return super.getUnlocalizedName() + "." + s;
	}
	
}
