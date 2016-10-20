package com.gmail.sharpcastle33.civilization.biomes;

import net.minecraft.world.biome.Biome;

public class BaseBiome extends Biome {
	
	protected double temperature;
	protected double precipitation;
	protected double fertility;

	public BaseBiome(BiomeProperties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	public BaseBiome(BiomeProperties properties, double t, double p, double f) {
		super(properties);
		this.temperature = t;
		this.precipitation = p;
		this.fertility = f;
		// TODO Auto-generated constructor stub
	}

}
