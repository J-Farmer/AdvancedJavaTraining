package dev.jakefarmer.studentRecords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetStudentInfo 
{
	public static String cleanName(String name)
	{
		String tempName = name.substring(name.indexOf(':') + 2);

		return tempName;
	}

	public static String cleanClass(String classification)
	{
		String tempClass = classification.substring(classification.indexOf(':') + 2);

		return tempClass;
	}

	public static String cleanYear(String year)
	{
		String tempYear = year.substring(year.indexOf(':') + 2);

		return tempYear;
	}

	public static String cleanPeriod(String period)
	{
		String tempPeriod = period.substring(period.indexOf(':') + 2);

		return tempPeriod;
	}

	public static int[] cleanTestScores(String testScores)
	{
		String tempScores = testScores.substring(testScores.indexOf(':') + 2);
		String[] splitScores = tempScores.split(",");
		int[] scores = new int[splitScores.length]; 

		for(int i=0; i<splitScores.length;i++)
		{
			scores[i] = Integer.parseInt(splitScores[i].trim());
		}

		return scores; 
	}

	public static double[] cleanHomeworkScores(String hwScores)
	{
		String tempScores = hwScores.substring(hwScores.indexOf(':') + 2);
		String[] splitScores = tempScores.split(",");
		double[] scores = new double[splitScores.length]; 

		for(int i=0; i<splitScores.length;i++)
		{
			scores[i] = Double.parseDouble(splitScores[i].trim());
		}

		return scores; 
	}

	public static List<Student> GetInfo()
	{
		List<Student> studentList = new ArrayList<Student>();
		File f = new File("StudentInfo"); 
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
		while(s.hasNext())
		{
			Student tempStudent = new Student();
			String currentLine = null;

			currentLine = s.nextLine();
			String tempName = cleanName(currentLine);
			tempStudent.setName(tempName);

			currentLine = s.nextLine();
			String tempClass = cleanClass(currentLine);
			tempStudent.setClassification(tempClass);

			currentLine = s.nextLine();
			String tempYear = cleanYear(currentLine);
			tempStudent.setYear(Integer.parseInt(tempYear));

			currentLine = s.nextLine();
			String tempPeriod = cleanPeriod(currentLine);
			tempStudent.setClassPeriod(Integer.parseInt(tempPeriod));

			currentLine = s.nextLine();
			tempStudent.setTestGrade(cleanTestScores(currentLine));

			currentLine = s.nextLine();			
			tempStudent.setHomeworkGrades(cleanHomeworkScores(currentLine));
			
			studentList.add(tempStudent);
			
			boolean hasNextLine = s.hasNext();
			if(hasNextLine)
			{
				currentLine = s.nextLine();
			}
			else
				break; 
		}

		return studentList; 
	}
}
