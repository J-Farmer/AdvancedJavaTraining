package dev.jakefarmer.start;

import java.util.ArrayList;
import java.util.List;

import dev.jakefarmer.model.Stars;

public class Start {
	
	public static void main(String args[])
	{
		List<Stars> stars = new ArrayList<Stars>(); 
		
		stars = GetInfo.getInfo();
	}

}
