package com.gmail.sharpcastle33.seasons;

import java.util.Map;

import net.minecraft.world.World;

public class SeasonHandler {
	
	Map<String,Season> currentSeason;
	Map<String,Integer> currentDay;
	
	public SeasonHandler(){
		loadData();
	}
	
	public String getFormattedDate(World w){
		return getFormattedDate(w.getWorldInfo().getWorldName());
	}
	
	public String getFormattedDate(String w){
		return currentDay.get(w) + " of " + currentSeason.get(w);
	}
	
	public void announceSeasonsChange(String w){
		
	}
	
	public void saveData(){
		
	}
	
	public void loadData(){
		
	}
	
	public void tickDay(){
	
	}
	
	public void tickSeason(){
		
	}
	
	
	/*
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
		
	}*/

}
