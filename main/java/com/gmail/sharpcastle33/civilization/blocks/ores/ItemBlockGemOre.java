package com.gmail.sharpcastle33.civilization.blocks.ores;

import com.gmail.sharpcastle33.civilization.blocks.ores.BlockGemOre.EnumType;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockGemOre extends ItemBlock{
	/*private final static String[] subNames = {
			"diamond", "ruby",  "emerald", "sapphire", "amber", "onyx",
			"moonstone", "amethyst"
		};
	//clear, red, green, blue, yellow, black, white, purple

	
	public ItemBlockGemOre(Block b){
		super(b);
	}
	
	public int getMetadata (int damageValue) {
		return damageValue;
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
	}
	*/
	public ItemBlockGemOre(Block block) {
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
