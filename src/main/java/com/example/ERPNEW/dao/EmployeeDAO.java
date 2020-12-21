package com.example.ERPNEW.dao;

import com.example.ERPNEW.beans.Employee;

import java.util.ArrayList;

public interface EmployeeDAO {

    public abstract void addEmployee(Employee employee);
    public abstract ArrayList<Employee> checkEmp(Employee employee);
}
