package dev.jakefarmer.playground;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
	
	public static void main(String[] args)
	{
		List<String> filmography = new ArrayList<String>();
		filmography.add("Mission Impossible 7");
		filmography.add("Luna Park");
		filmography.add("Untitled Tom Cruise/SpaceX Project");
		filmography.add("Mission: Impossible 8");
		filmography.add("Live Die Repeat and Repeat");
		filmography.add("Top Gun: Maverick");
		filmography.add("Mission: Impossible - Fallout");
		filmography.add("American Made");
		
		String searchString = "Top Gun: Maverick";
		
		System.out.println(filmography.indexOf(searchString)); 
	}
}
