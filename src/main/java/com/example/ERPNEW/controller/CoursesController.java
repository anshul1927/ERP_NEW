package com.example.ERPNEW.controller;

import com.example.ERPNEW.beans.Courses;
import com.example.ERPNEW.services.CoursesService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


@Path("courses")
public class CoursesController {


    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourses() {
        List<String> Term = new ArrayList<>();
        Term.add("1");
        Term.add("2");
        Term.add("3");
        Term.add("4");
        return Response.ok().entity(Term).build();
    }


    @POST
    @Path("/register")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerCourses(Courses course) throws URISyntaxException {
        System.out.println("Hello Anshul");
        System.out.println(course.getCourse_code());
        System.out.println(course.getName());
        System.out.println(course.getDescription());
        System.out.println(course.getYear());
        System.out.println(course.getTerm());
        System.out.println(course.getCredits());
        System.out.println(course.getCapacity());
        System.out.println(course.getFaculty());
        CoursesService coursesService = new CoursesService();
        System.out.println("a1");
        coursesService.addStudent(course);
        System.out.println("a2");
        return Response.ok().build();
    }
}