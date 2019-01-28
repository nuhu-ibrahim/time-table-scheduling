package com.genetic_algorithm_resource;

public class Class {
	
	private int id;
	private Department dept;
	private Course course;
	private Instructor instructor;
	private MeetingTime meetingTime;
	private Room room;
	
	public Class(int id, Department dept, Course course)
	{
		this.id = id;
		this.dept = dept;
		this.course = course;
	}
	
	public void setInstructor(Instructor instructor)
	{
		this.instructor = instructor;
	}
	
	public void setMeetingTime(MeetingTime meetingTime)
	{
		this.meetingTime = meetingTime;
	}
	
	public void setRoom(Room room)
	{
		this.room = room;
	}
	
	public int getId()
	{
		return id;
	}
	
	public Department getDept()
	{
		return dept;
	}
	
	public Course getCourse()
	{
		return course;
	}
	
	public Instructor getInstructor()
	{
		return instructor;
	}
	
	public MeetingTime getMeetingTime()
	{
		return meetingTime;
	}
	
	public Room getRoom()
	{
		return room;
	}
	
	public String toString()
	{
		return "{" + dept.getName() + "," + course.getName() + "," + instructor.getName() + "," + meetingTime.getTime()+ "}";
	}

}
