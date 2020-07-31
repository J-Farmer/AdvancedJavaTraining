package dev.jakefarmer.calc;

import java.util.List;

public class Calc {
	public static void main(String[] args)
	{
		String name = "Name: Tom Cruise"; 
		String dob = "Born: July 3, 1962 in Syracuse, New York, USA";

		System.out.println(cleanBirthday(dob));

		String temp = name.substring(name.indexOf(':') + 2);

		System.out.println(temp);
	}

	public static String cleanName(String name)
	{
		String tempName = name.substring(name.indexOf(':') + 2);

		return tempName;
	}

	public static String cleanBirthday(String dob)
	{
		int start = dob.indexOf(":") + 2;
		int end = dob.indexOf(" in");

		String temp = dob.substring(start, end);

		String city = dob.substring(end + 4); 
		return temp;
	}

	public static String cleanBirthplace(String dob)
	{
		int start = dob.indexOf(":") + 2;
		int end = dob.indexOf(" in");

		String temp = dob.substring(start, end);

		String city = dob.substring(end + 4); 
		return city;
	}

	public static String cleanHeight(String height)
	{
		int start = height.indexOf(":") + 2;
		int end = height.indexOf("(") - 1;
		String temp = height.substring(start, end);

		return temp;
	}

	public static String cleanHeightMetric(String height)
	{
		int start = height.indexOf("(") + 1;
		int end = height.indexOf(")") - 1;
		String temp = height.substring(start, end);

		return temp;
	}

	public static String cleanSpouses(String spouse)
	{
		int i = spouse.indexOf(",");
		if(i != -1)
		{
			spouse = spouse.substring(0,i);
		}

		return spouse;
	}

	public static String cleanMovies(String movie)
	{
		return movie.substring(0, movie.indexOf("Date:")).trim(); 
	}

	public static String cleanSalary(String salary)
	{	
		int startMoney = salary.indexOf("$");
		System.out.println(startMoney);
		int endMoney = salary.lastIndexOf("0") + 1;
		System.out.println(endMoney);
		String money = salary.substring(startMoney,  endMoney);
		System.out.println(money); 
		return salary.substring(0, salary.indexOf("$")) + money;
	}
}
