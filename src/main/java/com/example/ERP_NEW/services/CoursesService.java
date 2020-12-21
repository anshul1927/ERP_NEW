package com.example.ERP_NEW.services;
import com.example.ERP_NEW.beans.Courses;
import com.example.ERP_NEW.dao.impl.CoursesDAOImpl;


public class CoursesService {

        public void addCourses(Courses course){
            System.out.println("a4");
            new CoursesDAOImpl().addCourses(course);
        }
}
