package com.example.ERP_NEW.dao;
import com.example.ERP_NEW.beans.Courses;
import com.example.ERP_NEW.beans.Student;

import java.util.ArrayList;

public interface CoursesDAO {
    public abstract void addCourses(Courses course);
    public abstract ArrayList<Courses> fetchTT(Courses courses);
}

