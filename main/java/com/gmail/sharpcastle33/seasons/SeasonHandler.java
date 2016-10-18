package com.gmail.sharpcastle33.seasons;

import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;

public class SeasonHandler {
	
	public int currentSeason;
	public int currentDay;
	
	public String getFormattedDate(){
		return "";
	}
	
	public void tickDay(World world){
		MapStorage storage = world.getPerWorldStorage();
		storage.setData("season", currentSeason);
		
		
		
		currentDay++;
		if(currentDay > 90){
			currentDay = 0;
			tickSeason(world);
		}
	}
	
	public void tickSeason(World world){
		
	}
	
	public void announceSeason(World world){
		
	}
	
	public void saveData(World world){
		
	}
	
	public void loadData(World world){
		
	}

}
