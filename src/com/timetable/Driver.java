package com.timetable;

import com.data_structure.DBConnect;
import com.data_structure.DBConnect1;
import java.util.ArrayList;

import com.genetic_algorithm_resource.Class;

public class Driver {
	public static final int POPULATION_SIZE = 9;
	public static final double MUTATION_RATE = 0.1;
	public static final double CROSSOVER_RATE = 0.9;
	public static final int TOURNAMENT_SELECTION_SIZE = 3;
	public static final int NUMB_OF_ELITE_SCHEDULES = 1;
	private int scheduleNumb = 0;
	private int classNumb = 1;
	private Data data;

	public static void main(String[] args) {
            DBConnect.connect();
            DBConnect1.connect();
            Driver driver = new Driver();
            //driver.data = new Data();
            int generationNumber = 0;
            driver.printAvailableData();
            //System.out.println("> Generation # " + generationNumber);
            //System.out.print("  Schedule # |                                        ");
            //System.out.print("Classes [dept, class, room, instructor, meeting.time]");
            //System.out.println("                      |Fitness | Conflicts");
            //System.out.print("........................................................................");
            //System.out.println("............................................................................");
            GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(driver.data);
            Population population = new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
            //population.getSchedules().forEach(schedule -> System.out.println("     " + driver.scheduleNumb++ + "    | " + schedule + " | " + String.format("%.5f", schedule.getFitness()) + " | " + schedule.getNumberOfConflicts()));
            //driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);

            driver.classNumb = 1;
            while (population.getSchedules().get(0).getFitness() != 1.0)
            {
                    ++generationNumber;
                    //System.out.println("> Generation # " + ++generationNumber);
                    //System.out.print("     Schedule # |                                   ");
                    //System.out.print("Classes [dept,class,room,instructor,meeting.time]    ");
                    //System.out.println("                              | Fitness | Conflicts");
                    //System.out.print("......................................................................");
                    //System.out.print("...........................................................................");
                    population = geneticAlgorithm.evolve(population).sortByFitness();
                    driver.scheduleNumb = 0;
                    //population.getSchedules().forEach(schedule -> System.out.println("    " + driver.scheduleNumb++ + "    | " + schedule + "  |  " + String.format("%.5f", schedule.getFitness()) + "  |  " + schedule.getNumberOfConflicts()));
                    driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);
                    driver.classNumb = 1;
            }
	}
	
	public void printScheduleAsTable(Schedule schedule, int generation)
	{
		ArrayList<Class> classes = schedule.getClasses();
		System.out.print("\n                      ");
		System.out.println("\nClass # | Dept | Course (number, max # number of students) | Room (Capacity) | Instructor (Id) | Meeting Time");
		//System.out.print("              ");
		System.out.print(".........................................");
		System.out.print("........................................................");
		classes.forEach(x -> {
			int majorIndex = data.getDepts().indexOf(x.getDept());
			int coursesIndex = data.getCourses().indexOf(x.getCourse());
			int roomsIndex = data.getRooms().indexOf(x.getRoom());
			int instructorsIndex = data.getInstructors().indexOf(x.getInstructor());
			int meetingTimeIndex = data.getMeetingTimes().indexOf(x.getMeetingTime());
			//System.out.print("                     ");
			System.out.print(String.format("\n  %1$02d  ", classNumb) + "  |  ");
			System.out.print(String.format("%1$4s", data.getDepts().get(majorIndex).getName()) + "  |  ");
			System.out.print(String.format("%1$21s", data.getCourses().get(coursesIndex).getName() + " (" + data.getCourses().get(coursesIndex).getNumber() + ", " + x.getCourse().getMaxNumberOfStudents()) + ")    | ");
			System.out.print(String.format("%1$10s", data.getRooms().get(roomsIndex).getNumber() + "(" + x.getRoom().getSeatingCapacity()) + ")      |  " );
			System.out.print(String.format("%1$15s", data.getInstructors().get(instructorsIndex).getName() + " (" + data.getInstructors().get(instructorsIndex).getId() + ")") + "  | ");
			System.out.print(data.getMeetingTimes().get(meetingTimeIndex).getTime() + " (" + data.getMeetingTimes().get(meetingTimeIndex).getId() + ")");
			classNumb++;
		});
		
		if (schedule.getFitness() == 1) System.out.print("\n> Solution Found in " + (generation + 1) + "generations\n");
		System.out.print("...................................................................................");
		System.out.print(".......................................................................................");
		
	}
	int i = 0;
	private void printAvailableData()
	{
                System.out.println("\n------ Available Lecturers ------");
                i = 0;
		data.getInstructors().forEach(x -> System.out.println((++i)+": " + x.getName()+"\n"));
            
		System.out.println("\n------ Available Course ------");
		data.getCourses().forEach(x -> System.out.println("Course Title: " + x.getName() + "\nMax # of Students: " + x.getMaxNumberOfStudents() + " \nInstructor(s): " + x.getInstructors()+"\n"));
                
		System.out.println("\n------ Available Lecture Venues ------");
		data.getRooms().forEach(x -> System.out.println("Venue Title: " + x.getNumber() + "\nMax Seating Capacity: " + x.getSeatingCapacity()+"\n"));
		
		System.out.println("\n------ Available Meeting Times ------");
                i = 0;
		data.getMeetingTimes().forEach(x -> System.out.println((++i)+" :" + x.getTime()));
                
                System.out.println("\n\n------ Available Classes ------");
		data.getDepts().forEach(x -> System.out.println("Class Name:  " + x.getName() + "\nCourses Offered:  " + x.getCourses()+"\n"));
		System.out.print("...........................................................................................");
		System.out.println("...........................................................................................");
	}

}
