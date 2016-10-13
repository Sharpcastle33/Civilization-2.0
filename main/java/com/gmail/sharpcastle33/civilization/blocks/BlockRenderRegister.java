package com.gmail.sharpcastle33.civilization.blocks;

import com.gmail.sharpcastle33.civilization.main.Civilization;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	public static String modid = Civilization.MODID;
	
	/*
	 *  "type=diamond": { "model":"civilization:block_gem_ore_diamond" },
        "type=ruby": { "model":"civilization:block_gem_ore_ruby" },
        "type=emerald": { "model":"civilization:block_gem_ore_emerald" },
        "type=sapphire": { "model":"civilization:block_gem_ore_sapphire" },
        "type=amber": { "model":"civilization:block_gem_ore_amber" },
        "type=onyx": { "model":"civilization:block_gem_ore_onyx" },
        "type=moonstone": { "model":"civilization:block_gem_ore_moonstone" },
        "type=amethyst": { "model":"civilization:block_gem_ore_amethyst" }
	 */
	
	public static void registerBlockRenderer(){
		
		//Gem Ore
		reg(CivilizationBlocks.gemOre, 0, "block_gem_ore_diamond");
		reg(CivilizationBlocks.gemOre, 1, "block_gem_ore_ruby");
		reg(CivilizationBlocks.gemOre, 2, "block_gem_ore_emerald");
		reg(CivilizationBlocks.gemOre, 3, "block_gem_ore_sapphire");
		reg(CivilizationBlocks.gemOre, 4, "block_gem_ore_amber");
		reg(CivilizationBlocks.gemOre, 5, "block_gem_ore_onyx");
		reg(CivilizationBlocks.gemOre, 6, "block_gem_ore_moonstone");
		reg(CivilizationBlocks.gemOre, 7, "block_gem_ore_amethyst");
		
		reg(CivilizationBlocks.scarceGemOre, 0, "block_scarce_gem_ore_diamond");
		reg(CivilizationBlocks.scarceGemOre, 1, "block_scarce_gem_ore_ruby");
		reg(CivilizationBlocks.scarceGemOre, 2, "block_scarce_gem_ore_emerald");
		reg(CivilizationBlocks.scarceGemOre, 3, "block_scarce_gem_ore_sapphire");
		reg(CivilizationBlocks.scarceGemOre, 4, "block_scarce_gem_ore_amber");
		reg(CivilizationBlocks.scarceGemOre, 5, "block_scarce_gem_ore_onyx");
		reg(CivilizationBlocks.scarceGemOre, 6, "block_scarce_gem_ore_moonstone");
		reg(CivilizationBlocks.scarceGemOre, 7, "block_scarce_gem_ore_amethyst");
		
		reg(CivilizationBlocks.denseGemOre, 0, "block_dense_gem_ore_diamond");
		reg(CivilizationBlocks.denseGemOre, 1, "block_dense_gem_ore_ruby");
		reg(CivilizationBlocks.denseGemOre, 2, "block_dense_gem_ore_emerald");
		reg(CivilizationBlocks.denseGemOre, 3, "block_dense_gem_ore_sapphire");
		reg(CivilizationBlocks.denseGemOre, 4, "block_dense_gem_ore_amber");
		reg(CivilizationBlocks.denseGemOre, 5, "block_dense_gem_ore_onyx");
		reg(CivilizationBlocks.denseGemOre, 6, "block_dense_gem_ore_moonstone");
		reg(CivilizationBlocks.denseGemOre, 7, "block_dense_gem_ore_amethyst");
	
		//Metal Ore
		reg(CivilizationBlocks.metalOre, 0, "block_metal_ore_iron");
		reg(CivilizationBlocks.metalOre, 1, "block_metal_ore_copper");
		reg(CivilizationBlocks.metalOre, 2, "block_metal_ore_tin");
		reg(CivilizationBlocks.metalOre, 3, "block_metal_ore_lead");
		reg(CivilizationBlocks.metalOre, 4, "block_metal_ore_silver");
		reg(CivilizationBlocks.metalOre, 5, "block_metal_ore_gold");
		reg(CivilizationBlocks.metalOre, 6, "block_metal_ore_platinum");
		reg(CivilizationBlocks.metalOre, 7, "block_metal_ore_zinc");
		reg(CivilizationBlocks.metalOre, 8, "block_metal_ore_mithrine");
		reg(CivilizationBlocks.metalOre, 9, "block_metal_ore_adamantium");
		
		
	}
	
	public static void reg(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Block block, int meta, String file) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
	
	public static void preInit(){

		//Gem Ore ---------------------------------------------------------------------------------------------------
		ModelResourceLocation diamond = new ModelResourceLocation("civilization:block_gem_ore_diamond", "inventory");
		ModelResourceLocation ruby = new ModelResourceLocation("civilization:block_gem_ore_ruby", "inventory");
		ModelResourceLocation emerald = new ModelResourceLocation("civilization:block_gem_ore_emerald", "inventory");
		ModelResourceLocation sapphire = new ModelResourceLocation("civilization:block_gem_ore_sapphire", "inventory");
		ModelResourceLocation amber = new ModelResourceLocation("civilization:block_gem_ore_amber", "inventory");
		ModelResourceLocation onyx = new ModelResourceLocation("civilization:block_gem_ore_onyx", "inventory");
		ModelResourceLocation moonstone = new ModelResourceLocation("civilization:block_gem_ore_moonstone", "inventory");
		ModelResourceLocation amethyst = new ModelResourceLocation("civilization:block_gem_ore_amethyst", "inventory");
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(CivilizationBlocks.gemOre), diamond, ruby, emerald, sapphire, amber, onyx, moonstone, amethyst);
		
		 diamond = new ModelResourceLocation("civilization:block_scarce_gem_ore_diamond", "inventory");
		 ruby = new ModelResourceLocation("civilization:block_scarce_gem_ore_ruby", "inventory");
		 emerald = new ModelResourceLocation("civilization:block_scarce_gem_ore_emerald", "inventory");
		 sapphire = new ModelResourceLocation("civilization:block_scarce_gem_ore_sapphire", "inventory");
	     amber = new ModelResourceLocation("civilization:block_scarce_gem_ore_amber", "inventory");
		 onyx = new ModelResourceLocation("civilization:block_scarce_gem_ore_onyx", "inventory");
		 moonstone = new ModelResourceLocation("civilization:block_scarce_gem_ore_moonstone", "inventory");
		 amethyst = new ModelResourceLocation("civilization:block_scarce_gem_ore_amethyst", "inventory");
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(CivilizationBlocks.scarceGemOre), diamond, ruby, emerald, sapphire, amber, onyx, moonstone, amethyst);
		
		 diamond = new ModelResourceLocation("civilization:block_dense_gem_ore_diamond", "inventory");
		 ruby = new ModelResourceLocation("civilization:block_dense_gem_ore_ruby", "inventory");
		 emerald = new ModelResourceLocation("civilization:block_dense_gem_ore_emerald", "inventory");
		 sapphire = new ModelResourceLocation("civilization:block_dense_gem_ore_sapphire", "inventory");
	     amber = new ModelResourceLocation("civilization:block_dense_gem_ore_amber", "inventory");
		 onyx = new ModelResourceLocation("civilization:block_dense_gem_ore_onyx", "inventory");
		 moonstone = new ModelResourceLocation("civilization:block_dense_gem_ore_moonstone", "inventory");
		 amethyst = new ModelResourceLocation("civilization:block_dense_gem_ore_amethyst", "inventory");
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(CivilizationBlocks.denseGemOre), diamond, ruby, emerald, sapphire, amber, onyx, moonstone, amethyst);
	
		//Metal Ore ----------------------------------------------------------------------------------------------
		ModelResourceLocation iron = new ModelResourceLocation("civilization:block_metal_ore_iron", "inventory");
		ModelResourceLocation copper = new ModelResourceLocation("civilization:block_metal_ore_copper", "inventory");
		ModelResourceLocation tin = new ModelResourceLocation("civilization:block_metal_ore_tin", "inventory");
		ModelResourceLocation lead = new ModelResourceLocation("civilization:block_metal_ore_lead", "inventory");
		ModelResourceLocation silver = new ModelResourceLocation("civilization:block_metal_ore_silver", "inventory");
		ModelResourceLocation gold = new ModelResourceLocation("civilization:block_metal_ore_gold", "inventory");
		ModelResourceLocation platinum = new ModelResourceLocation("civilization:block_metal_ore_platinum", "inventory");
		ModelResourceLocation zinc = new ModelResourceLocation("civilization:block_metal_ore_zinc", "inventory");
		ModelResourceLocation mithrine = new ModelResourceLocation("civilization:block_metal_ore_mithrine", "inventory");
		ModelResourceLocation adamantium = new ModelResourceLocation("civilization:block_metal_ore_adamantium", "inventory");
	
		ModelBakery.registerItemVariants(Item.getItemFromBlock(CivilizationBlocks.metalOre), iron, copper, tin, lead, silver, gold, platinum, zinc, mithrine, adamantium);

		iron = new ModelResourceLocation("civilization:block_scarce_metal_ore_iron", "inventory");
		copper = new ModelResourceLocation("civilization:block_scarce_metal_ore_copper", "inventory");
		tin = new ModelResourceLocation("civilization:block_scarce_metal_ore_tin", "inventory");
		lead = new ModelResourceLocation("civilization:block_scarce_metal_ore_lead", "inventory");
		silver = new ModelResourceLocation("civilization:block_scarce_metal_ore_silver", "inventory");
		gold = new ModelResourceLocation("civilization:block_scarce_metal_ore_gold", "inventory");
		platinum = new ModelResourceLocation("civilization:block_scarce_metal_ore_platinum", "inventory");
		zinc = new ModelResourceLocation("civilization:block_scarce_metal_ore_zinc", "inventory");
		mithrine = new ModelResourceLocation("civilization:block_scarce_metal_ore_mithrine", "inventory");
		adamantium = new ModelResourceLocation("civilization:block_scarce_metal_ore_adamantium", "inventory");
		 
		ModelBakery.registerItemVariants(Item.getItemFromBlock(CivilizationBlocks.scarceMetalOre), iron, copper, tin, lead, silver, gold, platinum, zinc, mithrine, adamantium);

		iron = new ModelResourceLocation("civilization:block_dense_metal_ore_iron", "inventory");
		copper = new ModelResourceLocation("civilization:block_dense_metal_ore_copper", "inventory");
		tin = new ModelResourceLocation("civilization:block_dense_metal_ore_tin", "inventory");
		lead = new ModelResourceLocation("civilization:block_dense_metal_ore_lead", "inventory");
		silver = new ModelResourceLocation("civilization:block_dense_metal_ore_silver", "inventory");
		gold = new ModelResourceLocation("civilization:block_dense_metal_ore_gold", "inventory");
		platinum = new ModelResourceLocation("civilization:block_dense_metal_ore_platinum", "inventory");
		zinc = new ModelResourceLocation("civilization:block_dense_metal_ore_zinc", "inventory");
		mithrine = new ModelResourceLocation("civilization:block_dense_metal_ore_mithrine", "inventory");
		adamantium = new ModelResourceLocation("civilization:block_dense_metal_ore_adamantium", "inventory");
		 
		ModelBakery.registerItemVariants(Item.getItemFromBlock(CivilizationBlocks.denseMetalOre), iron, copper, tin, lead, silver, gold, platinum, zinc, mithrine, adamantium);

	}
}
