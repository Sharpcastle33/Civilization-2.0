
package com.gmail.sharpcastle33.civilization.main;

import com.gmail.sharpcastle33.civilization.blocks.BlockRenderRegister;
import com.gmail.sharpcastle33.civilization.items.ItemRenderRegister;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientOnlyProxy extends CommonProxy{
 public void preInit(){
	 super.preInit();
	 BlockRenderRegister.preInit();
	 ItemRenderRegister.preInit();
 }
 
 public void init(){
	 super.init();
	 BlockRenderRegister.registerBlockRenderer();
	 ItemRenderRegister.registerItemRenderer();
 }
 
 public void postInit(){
	 super.postInit();
 }
//test for baseitem.class
public void registerItemRenderer(Item item, int meta, String id){
	 ModelLoader.setCustomModelResourceLocation(item,  meta,  new ModelResourceLocation(Civilization.MODID + ":" + id, "inventory"));
}

 
}
