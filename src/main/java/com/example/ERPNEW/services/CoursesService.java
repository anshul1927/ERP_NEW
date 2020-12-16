package com.example.ERPNEW.services;
import com.example.ERPNEW.beans.Courses;
import com.example.ERPNEW.dao.impl.CoursesDAOImpl;


public class CoursesService {

        public void addStudent(Courses course){
            System.out.println("a4");
            new CoursesDAOImpl().addCourses(course);
        }
}
