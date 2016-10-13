package com.gmail.sharpcastle33.civilization.blocks.ores;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gmail.sharpcastle33.civilization.creativetabs.CivilizationTabs;
import com.gmail.sharpcastle33.civilization.items.CivilizationItems;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGemOre extends BlockOre implements IMetaBlockName{
	public enum EnumType implements IStringSerializable {
		    
		/*"diamond", "ruby",  "emerald", "sapphire", "amber", "onyx",
		"moonstone", "amethyst"
	};
//clear, red, green, blue, yellow, black, white, purple*/
		
			DIAMOND(0, "diamond"),
		    RUBY(1, "ruby"),
		    EMERALD(2, "emerald"),
		    SAPPHIRE(3, "sapphire"),
		    AMBER(4, "amber"),
		    ONYX(5, "onyx"),
		    MOONSTONE(6, "moonstone"),
		    AMETHYST(7, "amethyst");

		    private int ID;
		    private String name;
		    
		    private EnumType(int ID, String name) {
		        this.ID = ID;
		        this.name = name;
		    }
		    
		    @Override
		    public String getName() {
		        return name;
		    }

		    public int getID() {
		        return ID;
		    }
		    
		    @Override
		    public String toString() {
		        return getName();
		    }

	}
//http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/blockstates-and-metadata/
	//http://www.minecraftforge.net/wiki/Metadata_Based_Subblocks
	public BlockGemOre(String s) {
		super(s);
		this.setCreativeTab(CivilizationTabs.tabCivilizationOres);
		this.setHardness(2.5f);
		this.setResistance(12.5f);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.DIAMOND));
	}
	
	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockGemOre.EnumType.class);
	
	@Override
	protected BlockStateContainer createBlockState() {
	    return new BlockStateContainer(this, new IProperty[] { TYPE });
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumType t = EnumType.AMETHYST;
		switch(meta){
			case 0: t = EnumType.DIAMOND;
			break;
			case 1: t = EnumType.RUBY;
			break;
			case 2: t = EnumType.EMERALD;
			break;
			case 3: t = EnumType.SAPPHIRE;
			break;
			case 4: t = EnumType.AMBER;
			break;
			case 5: t = EnumType.ONYX;
			break;
			case 6: t = EnumType.MOONSTONE;
			break;
			case 7: t = EnumType.AMETHYST;
			break;
			default: t = EnumType.DIAMOND;
			break;
		}
		  return getDefaultState().withProperty(TYPE, t);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
	    EnumType type = (EnumType) state.getValue(TYPE);
	    return type.getID();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
	    return getMetaFromState(state);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
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
	public String getSpecialName(ItemStack stack) {
		EnumType t = null;
		switch(stack.getItemDamage()){
		case 0: t = EnumType.DIAMOND;
		break;
		case 1: t = EnumType.RUBY;
		break;
		case 2: t = EnumType.EMERALD;
		break;
		case 3: t = EnumType.SAPPHIRE;
		break;
		case 4: t = EnumType.AMBER;
		break;
		case 5: t = EnumType.ONYX;
		break;
		case 6: t = EnumType.MOONSTONE;
		break;
		case 7: t = EnumType.AMETHYST;
		break;
		default: t = EnumType.DIAMOND;
		break;
	 }
		return t.getName();
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
			Random rand = new Random();    
			ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		    drops.add(new ItemStack(CivilizationItems.smallGem,rand.nextInt(3)+1,damageDropped(state)));
		    
		    if(rand.nextInt(10) == 0){
		    	drops.add(new ItemStack(CivilizationItems.largeGem,1,damageDropped(state))); 
		    }
		    
		    return drops;
	}
		
}
