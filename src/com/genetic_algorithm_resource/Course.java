package com.genetic_algorithm_resource;

import java.util.ArrayList;

public class Course {
	
	private String number = null;
	private String name = null;
	private int maxNumberOfStudents;
	private ArrayList<Instructor> instructors;
	
	
	public Course(String number, String name, ArrayList<Instructor> instructors, int maxNumberOfStudents)
	{
		this.number = number;
		this.name = name;
		this.instructors = instructors;
		this.maxNumberOfStudents = maxNumberOfStudents;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Instructor> getInstructors()
	{
		return instructors;
	}
	
	public int getMaxNumberOfStudents()
	{
		return maxNumberOfStudents;
	}
	
	public String toString()
	{
		return name;
	}
	
}
