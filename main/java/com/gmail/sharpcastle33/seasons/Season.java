package com.gmail.sharpcastle33.seasons;

public class Season {
	private int length; //length in days
	private double globalTemp = 0; //global temp modifier (additive)
	private double globalPrecipitation = 0; //^ for precipitation
	private double globalTempMod = 1; //global temp modifier (multiplicative)
	private double globalPrecipitationMod = 1; //^ for precipitation
	private double globalFertility = 0;
	private double globalFertilityMod = 1;
	
	public Season(int length){
		this.length = length;
	}

}
