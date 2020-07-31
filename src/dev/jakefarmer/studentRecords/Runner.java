package dev.jakefarmer.studentRecords;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) 
	{
		List<Student> studentList = new ArrayList<Student>();
		
		studentList = GetStudentInfo.GetInfo(); 
		
		studentList.get(0).computeHomeworkAverage();
		studentList.get(0).computeTestAverage();
		
		System.out.println(studentList.get(0).getHomeworkAverage());
		System.out.println(studentList.get(0).getTestAverage());
	}

}
