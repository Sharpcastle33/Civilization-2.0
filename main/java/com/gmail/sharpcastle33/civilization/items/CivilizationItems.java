package com.gmail.sharpcastle33.civilization.items;

import com.gmail.sharpcastle33.civilization.creativetabs.CivilizationTabs;
import com.gmail.sharpcastle33.civilization.items.gems.ItemLargeGem;
import com.gmail.sharpcastle33.civilization.items.gems.ItemSmallGem;
import com.gmail.sharpcastle33.civilization.main.Civilization;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CivilizationItems {
	public static String modid = Civilization.MODID;
	
	public static ItemLargeGem largeGem;
	public static ItemSmallGem smallGem;
	public static BaseMetaItem metalIngot;
	public static BaseMetaItem alloyIngot;
	public static BaseItem testItem;
	public static BaseMetaItem metalOre;
	
	public static void load(){
		GameRegistry.registerItem(largeGem = new ItemLargeGem("item_large_gem"), "item_large_gem");
		GameRegistry.registerItem(smallGem = new ItemSmallGem("item_small_gem"), "item_small_gem"); 
		//baseitem testing.
		//testItem = regBaseItem(new BaseItem("test_item").setCreativeTab(CreativeTabs.MATERIALS));
		
		
		alloyIngot = regBaseMetaItem(new BaseMetaItem("item_alloy_ingot",new String[]{"bronze","brass","mithril","admantine"}).setCreativeTab(CivilizationTabs.tabCivilizationRefining));
		metalIngot = regBaseMetaItem(new BaseMetaItem("item_metal_ingot",new String[]{"iron","copper","tin","lead","silver","gold","platinum","zinc","mithrine","adamantium"}).setCreativeTab(CivilizationTabs.tabCivilizationRefining));
		metalOre = regBaseMetaItem(new BaseMetaItem("item_metal_ore",new String[]{"iron","copper","tin","lead","silver","gold","platinum","zinc","mithrine","adamantium"}).setCreativeTab(CivilizationTabs.tabCivilizationRefining));

	}
	
	public static BaseItem regBaseItem(BaseItem i){
		GameRegistry.register(i);
		i.registerItemModel();
		return i;
	}
	
	public static BaseMetaItem regBaseMetaItem(BaseMetaItem i){
		GameRegistry.register(i);
		i.registerItemModel();
		return i;
	}
	
}

