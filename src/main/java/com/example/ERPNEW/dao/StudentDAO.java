package com.example.ERPNEW.dao;

import com.example.ERPNEW.beans.Student;

import java.util.ArrayList;

public interface StudentDAO {
    public abstract  void fetchStudent();
    public abstract void addStudent(Student student);
    public abstract ArrayList<Student> fetchTT(Student student);
}
