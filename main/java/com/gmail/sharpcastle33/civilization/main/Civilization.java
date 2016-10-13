package com.gmail.sharpcastle33.civilization.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Civilization.MODID, version = Civilization.VERSION)
public class Civilization {
	
	public final static String MODID = "civilization";
	public static final String VERSION = "1.10.2";

	 @Mod.Instance(Civilization.MODID)
	    public static Civilization instance;
	 
	  @SidedProxy(clientSide="com.gmail.sharpcastle33.civilization.main.ClientOnlyProxy", serverSide="com.gmail.sharpcastle33.civilization.main.DedicatedServerProxy")
	    public static CommonProxy proxy;
	  
	  @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	      proxy.preInit();
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	      proxy.init();
	    }

	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	      proxy.postInit();
	    }
	    
	    public static String prependModID(String name) {return MODID + ":" + name;}

}
