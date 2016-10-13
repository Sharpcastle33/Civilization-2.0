package com.gmail.sharpcastle33.civilization.items.gems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSmallGem extends Item {

	public ItemSmallGem(String name){
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
	
	/*
	 * DIAMOND(0, "diamond"),
		    RUBY(1, "ruby"),
		    EMERALD(2, "emerald"),
		    SAPPHIRE(3, "sapphire"),
		    AMBER(4, "amber"),
		    ONYX(5, "onyx"),
		    MOONSTONE(6, "moonstone"),
		    AMETHYST(7, "amethyst");
	 */
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	  String s = "";
		switch(stack.getItemDamage()){
		case 0: s = "diamond";
		break;
		case 1: s = "ruby";
		break;
		case 2: s = "emerald";
		break;
		case 3: s = "sapphire";
		break;
		case 4: s = "amber";
		break;
		case 5: s = "onyx";
		break;
		case 6: s = "moonstone";
		break;
		case 7: s = "amethyst";
		break;
		default: s = "error";
		break;
	   }
	return super.getUnlocalizedName() + "." + s;
	}
}
