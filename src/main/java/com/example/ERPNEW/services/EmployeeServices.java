package com.example.ERPNEW.services;

import com.example.ERPNEW.beans.Employee;
import com.example.ERPNEW.beans.Student;
import com.example.ERPNEW.dao.impl.EmployeeDAOImpl;

import java.util.ArrayList;

public class EmployeeServices {

    public ArrayList<Employee> checkemp(Employee employee) {
        return new EmployeeDAOImpl().checkEmp(employee);

    }
    public void addEmployee(Employee employee){
        System.out.println("a4");
        new EmployeeDAOImpl().addEmployee(employee);
    }

}
