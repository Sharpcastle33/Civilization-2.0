package com.gmail.sharpcastle33.seasons;

import java.util.Map;

import net.minecraft.world.World;

public class SeasonRegisterer {
	
	public Map<String,Season[]> seasonsMap;
	
;
	private Season spring = new Season(90);
	private Season summer = new Season(90);
	private Season fall = new Season(90);
	private Season winter = new Season(90);
	
	private Season[] worldSeasons = new Season[]{spring,summer,fall,winter};
	
	public SeasonRegisterer(){
		registerSeasons("world",worldSeasons);
	}
	
	public void registerSeasonsForDimension(World w, Season[] s){
		seasonsMap.put(w.getWorldInfo().getWorldName(), s);
	}
	
	public void registerSeasons(String s, Season[] array){
		seasonsMap.put(s, array);
	}
	
	public Season[] getSeasons(World w){
		return seasonsMap.get(w.getWorldInfo().getWorldName());
	}
	
	public Season[] getSeasons(String w){
		return seasonsMap.get(w);
	}
	
	

}
