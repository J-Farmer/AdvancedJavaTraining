package dev.jakefarmer.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dev.jakefarmer.calc.Calc;
import dev.jakefarmer.model.Stars;

public class GetInfo {

	public static List<Stars> getInfo() {
		//Read from file.
		File f = new File("Star Info");
		Scanner s = null; 
		try
		{
			s = new Scanner(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Ya done goofed up!");
			e.printStackTrace();
		}
		
		//New list of Stars objects.
		List<Stars> starList = new ArrayList<Stars>();
		
		//Iterate through the file.
		while(s.hasNext())
		{
			Stars star = new Stars(); 
			String header = s.nextLine();
			
			//Set the name of the star
			String name = s.nextLine();
			name = Calc.cleanName(name);
			star.setName(name);
			
			//Set the DOB of the star.
			String dob = s.nextLine();
			dob = Calc.cleanBirthday(dob);
			star.setDob(dob);
			
			//Set the height of the star.
			String height = s.nextLine();
			height = Calc.cleanHeight(height);
			star.setHeight(height);
			
			//Set spouses.
			String spousesHeader = s.nextLine();
			int count = 0;
			List<String> spouses = new ArrayList<String>();
			
			while(count == 0) 
			{
				String temp = s.nextLine();
				if(temp.contains("List of Movies"))
				{
					count++; 
				}
				else
				{ 
					spouses.add(Calc.cleanSpouses(temp));
				}
			}
			star.setSpouses(spouses);
			
			//Set Movies
			count = 0;
			List<String> movies = new ArrayList<String>();
			
			while(count == 0) 
			{
				String temp = s.nextLine();
				if(temp.contains("Reported Salary"))
				{
					count++; 
				}
				else
				{
					temp = Calc.cleanMovies(temp);
					movies.add(temp);
				}
			}
			star.setFilmography(movies);
			
			//Set Salaries
			count = 0;
			List<String> salary = new ArrayList<String>();
			
			while(count == 0) 
			{
				String temp = s.nextLine();
				if(temp.contains("End Record"))
				{
					count++; 
				}
				else
				{
					temp = Calc.cleanSalary(temp);
					salary.add(temp);
				}
			}
			star.setSalary(salary);
			
			System.out.println(star.getCounter());
			System.out.println(star.getName());
			System.out.println(star.getDob());
			System.out.println(star.getHeight());
			System.out.println(star.getSpouses());
			System.out.println(star.getFilmography());
			System.out.println(star.getSalary());
			System.out.println(); 
			starList.add(star);
		}
		
		/*for(Stars st : starList)
		{
			System.out.println(st.getCounter());
			System.out.println(st.getName());
			System.out.println(st.getDob());
			System.out.println(st.getHeight());
			System.out.println(st.getSpouses());
			System.out.println(st.getFilmography());
			System.out.println(st.getSalary());
			System.out.println(); 
		}*/
		
		System.out.println("Done");
		
		return starList;
	}

}
