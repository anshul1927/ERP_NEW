package com.example.ERP_NEW.services;
import com.example.ERP_NEW.beans.Student;
import com.example.ERP_NEW.dao.impl.StudentDAOImpl;

import java.util.ArrayList;


public class StudentServices {

    public ArrayList<Student> fetchTT(Student student) {
        return new StudentDAOImpl().fetchTT(student);

    }

    public void addStudent(Student student){
        System.out.println("a4");
        new StudentDAOImpl().addStudent(student);
    }
    public void fetchStudent(){
        System.out.println("b1");
        new StudentDAOImpl().fetchStudent();
    }


}
