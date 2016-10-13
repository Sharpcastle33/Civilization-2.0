package com.gmail.sharpcastle33.civilization.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMetalOre extends ItemBlock{

	public ItemBlockMetalOre(Block block) {
        super(block);
        if (!(block instanceof IMetaBlockName)) {
            throw new IllegalArgumentException(String.format("The given Block %s is not an instance of ISpecialBlockName!", block.getUnlocalizedName()));
        }
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }
	
	public int getMetadata (int damageValue) {
		return damageValue;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	  String s = "";
		switch(stack.getItemDamage()){
		case 0: s = "iron";
		break;
		case 1: s = "copper";
		break;
		case 2: s = "tin";
		break;
		case 3: s = "lead";
		break;
		case 4: s = "silver";
		break;
		case 5: s = "gold";
		break;
		case 6: s = "platinum";
		break;
		case 7: s = "zinc";
		break;
		case 8: s = "mithrine";
		break;
		case 9: s = "adamantium";
		break;
		default: s = "error";
		break;
	   }
	return super.getUnlocalizedName() + "." + s;
	}
	
}
