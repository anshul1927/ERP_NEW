package com.example.ERPNEW.dao;

import com.example.ERPNEW.beans.Student;

public interface StudentDAO {
    public abstract  void fetchStudent();
    public abstract void addStudent(Student student);
}
