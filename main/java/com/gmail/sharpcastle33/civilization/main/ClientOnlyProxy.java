
package com.gmail.sharpcastle33.civilization.main;

import com.gmail.sharpcastle33.civilization.blocks.BlockRenderRegister;
import com.gmail.sharpcastle33.civilization.items.ItemRenderRegister;

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
 
 
}
