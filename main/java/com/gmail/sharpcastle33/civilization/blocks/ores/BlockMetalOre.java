package com.gmail.sharpcastle33.civilization.blocks.ores;

import java.util.List;

import com.gmail.sharpcastle33.civilization.blocks.ores.BlockGemOre.EnumType;
import com.gmail.sharpcastle33.civilization.creativetabs.CivilizationTabs;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMetalOre extends BlockOre implements IMetaBlockName{
	public enum EnumType implements IStringSerializable {
		IRON(0,"iron"),
		COPPER(1,"copper"),
		TIN(2,"tin"),
		LEAD(3,"lead"),
		SILVER(4,"silver"),
		GOLD(5,"gold"),
		PLATINUM(6,"platinum"),
		ZINC(7,"zinc"),
		MITHRINE(8,"mithrine"),
		ADAMANTIUM(9,"adamantium");
		
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

	public BlockMetalOre(String s) {
		super(s);
		this.setCreativeTab(CivilizationTabs.tabCivilizationOres);
		this.setHardness(2.5f);
		this.setResistance(12.5f);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.IRON));
	}
	
	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockMetalOre.EnumType.class);

	@Override
	protected BlockStateContainer createBlockState() {
	    return new BlockStateContainer(this, new IProperty[] { TYPE });
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumType t = EnumType.IRON;
		switch(meta){
			case 0: t = EnumType.IRON;
			break;
			case 1: t = EnumType.COPPER;
			break;
			case 2: t = EnumType.TIN;
			break;
			case 3: t = EnumType.LEAD;
			break;
			case 4: t = EnumType.SILVER;
			break;
			case 5: t = EnumType.GOLD;
			break;
			case 6: t = EnumType.PLATINUM;
			break;
			case 7: t = EnumType.ZINC;
			break;
			case 8: t = EnumType.MITHRINE;
			break;
			case 9: t = EnumType.ADAMANTIUM;
			break;
			default: t = EnumType.IRON;
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
	    list.add(new ItemStack(itemIn, 1, 8));
	    list.add(new ItemStack(itemIn, 1, 9));
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		EnumType t = null;
		switch(stack.getItemDamage()){
		case 0: t = EnumType.IRON;
		break;
		case 1: t = EnumType.COPPER;
		break;
		case 2: t = EnumType.TIN;
		break;
		case 3: t = EnumType.LEAD;
		break;
		case 4: t = EnumType.SILVER;
		break;
		case 5: t = EnumType.GOLD;
		break;
		case 6: t = EnumType.PLATINUM;
		break;
		case 7: t = EnumType.ZINC;
		break;
		case 8: t = EnumType.MITHRINE;
		break;
		case 9: t = EnumType.ADAMANTIUM;
		break;
		default: t = EnumType.IRON;
		break;
		}
		return t.getName();
	}
}
