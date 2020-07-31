package dev.jakefarmer.studentRecords;


public class Student {
	
	String name = "";
	String classification = "";
	int year = -1;
	int classPeriod = -1;
	int[] testGrade = null;
	double testAverage = -1;
	double[] homeworkGrades = null;
	double homeworkAverage = -1; 
	
	public Student()
	{
		 
	}
	
	public double computeTestAverage()
	{
		if(this.testGrade == null)
		{
			System.out.println("There are no test grades!");
		}
		
		double sum = 0;
		for(int i=0;i<this.testGrade.length;i++)
		{
			sum+=this.testGrade[i];
		}
		
		this.testAverage = sum / this.testGrade.length;
		return this.testAverage; 
	}
	
	public double computeHomeworkAverage()
	{
		if(this.homeworkGrades == null)
		{
			System.out.println("There are no homework grades!");
		}
		
		double sum = 0;
		for(int i=0;i<this.homeworkGrades.length;i++)
		{
			sum+=this.homeworkGrades[i];
		}
		
		this.homeworkAverage = sum / this.homeworkGrades.length;
		return this.homeworkAverage; 
	}

	public double getTestAverage() {
		return testAverage;
	}

	public void setTestAverage(double testAverage) {
		this.testAverage = testAverage;
	}

	public double getHomeworkAverage() {
		return homeworkAverage;
	}

	public void setHomeworkAverage(double homeworkAverage) {
		this.homeworkAverage = homeworkAverage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getClassPeriod() {
		return classPeriod;
	}

	public void setClassPeriod(int classPeriod) {
		this.classPeriod = classPeriod;
	}

	public int[] getTestGrade() {
		return testGrade;
	}

	public void setTestGrade(int[] testGrade) {
		this.testGrade = testGrade;
	}

	public double[] getHomeworkGrades() {
		return homeworkGrades;
	}

	public void setHomeworkGrades(double[] homeworkGrades) {
		this.homeworkGrades = homeworkGrades;
	}
}
