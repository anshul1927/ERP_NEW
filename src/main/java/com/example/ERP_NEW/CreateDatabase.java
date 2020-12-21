package com.example.ERP_NEW;

import com.example.ERP_NEW.beans.Course_Schedule;
import com.example.ERP_NEW.beans.Courses;
import com.example.ERP_NEW.dao.CourseScheduleDAO;
import com.example.ERP_NEW.dao.CoursesDAO;
import com.example.ERP_NEW.dao.impl.CourseScheduleDAOImpl;
import com.example.ERP_NEW.dao.impl.CoursesDAOImpl;

import java.util.ArrayList;

public class CreateDatabase {
    public static void main(String[] args){


//        Courses course1 = new Courses("CS511","Algorithms","Algorithms",2020,1,4,150,"MVN");
//        Courses course2 = new Courses("CS513","Software Systems","Software Systems",2020,1,4,150,"BT");
//        Courses course3 = new Courses("GEN511","Machine Learning","Machine Learning",2020,1,4,150,"GSR");
//        Courses course4 = new Courses("GEN512","MML","MML",2020,1,4,150,"RAM");
//        Courses course5 = new Courses("CS816","SPE","SPE",2020,2,4,150,"BT");
//        Courses course6 = new Courses("DS603","Data Modeling","Data Modeling",2020,2,4,150,"RC");
//        Courses course7 = new Courses("CS812","ASR","ASR",2020,2,4,150,"RAM");
//        Courses course8 = new Courses("CS818","Advanced Algorithms","Advanced Algorithms",2020,2,4,150,"MVN");
//
//
//        CoursesDAO courseDAO = new CoursesDAOImpl();
//
//        courseDAO.addCourses(course1);
//        courseDAO.addCourses(course2);
//        courseDAO.addCourses(course3);
//        courseDAO.addCourses(course4);
//        courseDAO.addCourses(course5);
//        courseDAO.addCourses(course6);
//        courseDAO.addCourses(course7);
//        courseDAO.addCourses(course8);

//        Courses course1 = new Courses("CS511","Algorithms","Algorithms",2020,1,4,150,"MVN");
//        Courses course2 = new Courses("CS513","Software Systems","Software Systems",2020,1,4,150,"BT");


        Course_Schedule courseSchedule1 = new Course_Schedule("9.30","Monday","C101","B1");
        Course_Schedule courseSchedule2 = new Course_Schedule("11.30","Tuesday","C101","B1");
        ArrayList<Course_Schedule> list2 = new ArrayList<Course_Schedule>();

        list2.add(courseSchedule2);
        list2.add(courseSchedule1);

        Courses course1 = new Courses("CS511","Algorithms","Algorithms",2020,1,4,150,"MVN");
        course1.setCourse_schedules(list2);

//        CourseScheduleDAO courseScheduleDAO = new CourseScheduleDAOImpl();
//        courseScheduleDAO.addCourseSchedule(courseSchedule1);
//        courseScheduleDAO.addCourseSchedule(courseSchedule2);


        CoursesDAO courseDAO = new CoursesDAOImpl();
        courseDAO.addCourses(course1);






    }
}
