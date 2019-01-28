package com.timetable;

import com.data_structure.Association;
import com.data_structure.DBConnect;
import com.data_structure.DBConnect1;
import com.data_structure.Iterator;
import com.data_structure.MySearchableContainer;
import com.data_structure.PrintingVisitor;
import java.util.ArrayList;
import java.util.Arrays;

import com.genetic_algorithm_resource.Course;
import com.genetic_algorithm_resource.Department;
import com.genetic_algorithm_resource.Instructor;
import com.genetic_algorithm_resource.MeetingTime;
import com.genetic_algorithm_resource.Room;
import java.sql.PreparedStatement;

public class Data {
	
	private ArrayList<Room> rooms;
	private ArrayList<Instructor> instructors;
	private ArrayList<Course> courses;
	private ArrayList<Department> depts;
	private ArrayList<MeetingTime> meetingTimes;
	
        private Instructor[] i = new Instructor[1000];
        private Course[] c = new Course[1000];

	private int numberOfClasses = 0;
	
	public Data() throws Exception
	{
		initialize();
	}
	
	private Data initialize() throws Exception
	{
            PreparedStatement st;
            String sql = "select * from class_room";
            st = DBConnect.con.prepareStatement(sql);
            DBConnect.rs = st.executeQuery();
            Room room;
            ArrayList r = new ArrayList();
            while(DBConnect.rs.next()){
                room = new Room(DBConnect.rs.getString("class_room_name"), DBConnect.rs.getInt("space_capacity"));
                r.add(room);
            }

            rooms = new ArrayList<Room>(r);

            sql = "select * from meeting_time";
            st = DBConnect.con.prepareStatement(sql);
            DBConnect.rs = st.executeQuery();
            MeetingTime meetingTime;
            ArrayList time = new ArrayList();
            while(DBConnect.rs.next()){
                meetingTime = new MeetingTime(DBConnect.rs.getString("time_id"), DBConnect.rs.getString("time_title"));
                time.add(meetingTime);
            }

            meetingTimes = new ArrayList<MeetingTime>(time);

            sql = "select * from instructor";
            st = DBConnect.con.prepareStatement(sql);
            DBConnect.rs = st.executeQuery();
            Instructor instructor;
            ArrayList instr = new ArrayList();
            while(DBConnect.rs.next()){
                instructor = new Instructor(DBConnect.rs.getString("instructor_id"), DBConnect.rs.getString("instructor_name"));
                i[DBConnect.rs.getInt("instructor_id")] = instructor;
                instr.add(instructor);
            }

            instructors = new ArrayList<Instructor>(instr);

            sql = "select * from course";
            st = DBConnect.con.prepareStatement(sql);
            DBConnect.rs = st.executeQuery();
            Course course;
            ArrayList cour = new ArrayList();
            while(DBConnect.rs.next()){
                PreparedStatement st1;
                sql = "select * from instructor, course_instructor where course_instructor.course_id = ? AND course_instructor.instructor_id = instructor.instructor_id";
                st1 = DBConnect1.con.prepareStatement(sql);
                st1.setInt(1, DBConnect.rs.getInt("course_id"));
                DBConnect1.rs = st1.executeQuery();
                instr = new ArrayList();

                while(DBConnect1.rs.next()){
                    instructor = i[DBConnect1.rs.getInt("instructor_id")];
                    instr.add(instructor);
                }
                course = new Course(DBConnect.rs.getString("course_id"), DBConnect.rs.getString("course_name"), instr, DBConnect.rs.getInt("maximum_number_of_student"));
                cour.add(course);
                c[DBConnect.rs.getInt("course_id")] = course;
            }
            courses = new ArrayList<Course>(cour);

            MySearchableContainer all_courses = new MySearchableContainer();
            Association assoc;

            /*sql = "select * from course, class_courses where course.course_id = class_courses.course_id";
            st = DBConnect.con.prepareStatement(sql);
            DBConnect.rs = st.executeQuery();
            while(DBConnect.rs.next()){
                PreparedStatement st1;
                sql = "select * from instructor, course_instructor where course_instructor.course_id = ? AND course_instructor.instructor_id = instructor.instructor_id";
                st1 = DBConnect1.con.prepareStatement(sql);
                st1.setInt(1, DBConnect.rs.getInt("course_id"));
                DBConnect1.rs = st1.executeQuery();
                instr = new ArrayList();

                while(DBConnect1.rs.next()){
                    instructor = new Instructor(DBConnect1.rs.getString("instructor_id"), DBConnect1.rs.getString("instructor_name"));
                    instr.add(instructor);
                }
                course = new Course(DBConnect.rs.getString("course_id"), DBConnect.rs.getString("course_name"), instr, DBConnect.rs.getInt("maximum_number_of_student"));
                cour.add(course);

                assoc =(Association)all_courses.find(new Association(DBConnect.rs.getString("class_id")));
                if(assoc != null){
                    ArrayList class_cour = (ArrayList)assoc.getValue();
                    class_cour.add(course);
                    assoc.setValue(class_cour);
                }else{
                    ArrayList class_cour = new ArrayList();
                    class_cour.add(course);
                    assoc = new Association(DBConnect.rs.getString("class_id"), class_cour);
                    all_courses.insert(assoc);
                }
            }*/

            sql = "select * from class";
            st = DBConnect.con.prepareStatement(sql);
            DBConnect.rs = st.executeQuery();
            Department department;
            ArrayList dept = new ArrayList();
            while(DBConnect.rs.next()){
                PreparedStatement st1;
                sql = "select * from course, class_courses where class_courses.class_id = ? AND class_courses.course_id = course.course_id";
                st1 = DBConnect1.con.prepareStatement(sql);
                st1.setInt(1, DBConnect.rs.getInt("class_id"));
                DBConnect1.rs = st1.executeQuery();
                instr = new ArrayList();
                ArrayList class_cour = new ArrayList();
                while(DBConnect1.rs.next()){
                    course = c[DBConnect1.rs.getInt("course_id")];
                    class_cour.add(course);
                }
                department = new Department(DBConnect.rs.getString("class_name"), new ArrayList<Course>(class_cour));
                dept.add(department);
            }

            depts = new ArrayList<Department>(dept);
            depts.forEach(x -> numberOfClasses += x.getCourses().size());

            return this;
	}
	
	public ArrayList<Room> getRooms()
	{
		return rooms;
	}
	
	public ArrayList<Instructor> getInstructors()
	{
		return instructors;
	}
	
	public ArrayList<Course> getCourses()
	{
		return courses;
	}
	
	public ArrayList<Department> getDepts()
	{
		return depts;
	}
	
	public ArrayList<MeetingTime> getMeetingTimes()
	{
		return meetingTimes;
	}
	
	public int getNumberOfClasses()
	{
		return this.numberOfClasses;
	}

}
