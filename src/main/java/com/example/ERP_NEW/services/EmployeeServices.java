package com.example.ERP_NEW.services;

import com.example.ERP_NEW.beans.Employee;
import com.example.ERP_NEW.dao.impl.EmployeeDAOImpl;

public class EmployeeServices {

//    public ArrayList<Employee> checkemp(Employee employee) {
//        return new EmployeeDAOImpl().checkEmp(employee);
//
//    }
    public void addEmployee(Employee employee){
        System.out.println("a4");
        new EmployeeDAOImpl().addEmployee(employee);
    }

}
