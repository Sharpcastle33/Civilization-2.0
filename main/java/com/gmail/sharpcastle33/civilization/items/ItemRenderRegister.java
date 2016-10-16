package com.gmail.sharpcastle33.civilization.items;

import com.gmail.sharpcastle33.civilization.main.Civilization;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public final class ItemRenderRegister {
	public static String modid = Civilization.MODID;
	
	public static void preInit(){
		//diamond, ruby, emerald, sapphire, amber, onyx, moonstone, amethyst);
		/*ModelResourceLocation diamond = new ModelResourceLocation("civilization:item_gem_diamond", "inventory");
		ModelResourceLocation ruby = new ModelResourceLocation("civilization:item_gem_ruby", "inventory");
		ModelResourceLocation emerald = new ModelResourceLocation("civilization:item_gem_emerald", "inventory");
		ModelResourceLocation sapphire = new ModelResourceLocation("civilization:item_gem_sapphire", "inventory");
		ModelResourceLocation amber = new ModelResourceLocation("civilization:item_gem_amber", "inventory");
		ModelResourceLocation onyx = new ModelResourceLocation("civilization:item_gem_onyx", "inventory");
		ModelResourceLocation moonstone = new ModelResourceLocation("civilization:item_gem_moonstone", "inventory");
		ModelResourceLocation amethyst = new ModelResourceLocation("civilization:item_gem_amethyst", "inventory");
		
		
		ModelBakery.registerItemVariants(CivilizationItems.largeGem, diamond, ruby, emerald, sapphire, amber, onyx, moonstone, amethyst);
		*/
		
		final String gemTypes[] = {"diamond","ruby","emerald","sapphire","amber","onyx","moonstone","amethyst"};
		ResourceLocation[] resLoc = new ResourceLocation[8];
	
		for (int i=0; i < 8; i++)
		resLoc[i] = new ResourceLocation("civilization:item_large_gem_" + gemTypes[i]);
		ModelBakery.registerItemVariants(CivilizationItems.largeGem, resLoc);
		
		for (int i=0; i < 8; i++)
		resLoc[i] = new ResourceLocation("civilization:item_small_gem_" + gemTypes[i]);
		ModelBakery.registerItemVariants(CivilizationItems.smallGem, resLoc);
		
		/*resLoc = new ResourceLocation[CivilizationItems.metalIngot.subtypes];
		final String metalTypes[] = CivilizationItems.metalIngot.names;
		for(int i=0; i<CivilizationItems.metalIngot.subtypes; i++){
			resLoc[i] = new ResourceLocation("civilization:item_metal_ingot_"+metalTypes[i]);
		}
		ModelBakery.registerItemVariants(CivilizationItems.metalIngot, resLoc);*/
		
		System.out.println("registering resource locations");
		//registerResourceLocations(CivilizationItems.metalIngot);
		registerResourceLocations(CivilizationItems.alloyIngot);
	}
	
	public static void registerResourceLocations(MetaItem i){
		ResourceLocation[] resLocs = new ResourceLocation[i.subtypes];
		for(int m=0; m<i.subtypes; m++){
			System.out.println("registering: " + modid + ":" + i.getBaseName().substring(5) + "_" + i.getMetaName(m));
			resLocs[m] = new ResourceLocation(modid + ":" + i.getBaseName().substring(5) + "_" + i.getMetaName(m));
		}
		System.out.println("Registered model locations for: " + resLocs.toString());
		ModelBakery.registerItemVariants(i,resLocs);
	}
	
	public static void registerItemRenderer(){
		
		reg(CivilizationItems.largeGem, 0, "item_large_gem_diamond");
		reg(CivilizationItems.largeGem, 1, "item_large_gem_ruby");
		reg(CivilizationItems.largeGem, 2, "item_large_gem_emerald");
		reg(CivilizationItems.largeGem, 3, "item_large_gem_sapphire");
		reg(CivilizationItems.largeGem, 4, "item_large_gem_amber");
		reg(CivilizationItems.largeGem, 5, "item_large_gem_onyx");
		reg(CivilizationItems.largeGem, 6, "item_large_gem_moonstone");
		reg(CivilizationItems.largeGem, 7, "item_large_gem_amethyst");
		
		reg(CivilizationItems.smallGem, 0, "item_small_gem_diamond");
		reg(CivilizationItems.smallGem, 1, "item_small_gem_ruby");
		reg(CivilizationItems.smallGem, 2, "item_small_gem_emerald");
		reg(CivilizationItems.smallGem, 3, "item_small_gem_sapphire");
		reg(CivilizationItems.smallGem, 4, "item_small_gem_amber");
		reg(CivilizationItems.smallGem, 5, "item_small_gem_onyx");
		reg(CivilizationItems.smallGem, 6, "item_small_gem_moonstone");
		reg(CivilizationItems.smallGem, 7, "item_small_gem_amethyst");
		
		//regMetaItem(CivilizationItems.metalIngot);
		regMetaItem(CivilizationItems.alloyIngot);
	}
	
	public static void reg(Item item, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, meta, new ModelResourceLocation(modid +":"+ file, "inventory"));
	}
	 
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	/*
	 * This method does not work as intended. Outputs look like "item.item_alloy_ingot" when they should look like "item_alloy_ingot_bronze"
	 */
	public static void regMetaItem(MetaItem item){
		for(int meta = 0; meta < item.subtypes; meta++){
			reg(item, meta, modid + ":" + item.getBaseName().substring(5) + "_" + item.getMetaName(meta));
			System.out.println("Registered item with new method, name = " + modid + ":" + item.getBaseName().substring(5) + "_" + item.getMetaName(meta));
		}
	}
}
