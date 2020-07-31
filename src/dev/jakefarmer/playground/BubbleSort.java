package dev.jakefarmer.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
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

		System.out.println(filmography);
		int count = filmography.size();
		for(int i=0; i<count; count--)
		{
			for(int j=0; j<count-1;j++)
			{
				if(filmography.get(j).compareToIgnoreCase(filmography.get(j+1)) > 0)
				{
					Collections.swap(filmography, j, j+1);
				}
			}
		}
		System.out.println(filmography);
	}
}
