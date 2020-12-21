package com.example.ERPNEW.controller;

import com.example.ERPNEW.beans.Employee;
import com.example.ERPNEW.services.EmployeeServices;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("/Employee")
public class EmployeeController {

    @POST
    @Path("/registerEmp")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)

    public Response registerEmployee(Employee employee) throws URISyntaxException
    {
        System.out.println(employee.getFirst_name());
        System.out.println(employee.getLast_name());
        System.out.println(employee.getEmail());
        System.out.println(employee.getPassword());
        System.out.println(employee.getDepartment());
        EmployeeServices employeeServices = new EmployeeServices();
        System.out.println("a1");
        employeeServices.addEmployee(employee);
        System.out.println("Employee Added to DB");
        return Response.ok().build();
    }


    @POST
    @Path("/loginEmp")
    // @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginEmp(Employee employee) throws URISyntaxException {
        EmployeeServices employeeServices= new EmployeeServices();
        List<Employee> employees = new ArrayList<Employee>();
        employees  = employeeServices.checkemp(employee);
        if(employees == null){
            return Response.noContent().build();
        }

        return Response.ok(employees).build();
    }
}
