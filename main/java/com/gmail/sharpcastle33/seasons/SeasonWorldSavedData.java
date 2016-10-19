package com.gmail.sharpcastle33.seasons;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldSavedData;

public class SeasonWorldSavedData extends WorldSavedData{
	
	public String currentSeason;
	public int currentDay;
	
	public SeasonWorldSavedData(String name){
		super(name);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		return null;
	}

}
