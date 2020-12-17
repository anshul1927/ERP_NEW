package com.example.ERPNEW.services;
import com.example.ERPNEW.beans.Student;
import com.example.ERPNEW.dao.impl.StudentDAOImpl;


public class StudentServices {

    public void addStudent(Student student){
        System.out.println("a4");
        new StudentDAOImpl().addStudent(student);
    }
    public void fetchStudent(Student student){
        System.out.println("b1");
        new StudentDAOImpl().fetchStudent();
    }


}
