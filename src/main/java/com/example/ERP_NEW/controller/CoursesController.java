package com.example.ERP_NEW.controller;

import com.example.ERP_NEW.beans.Courses;
import com.example.ERP_NEW.beans.Student;
import com.example.ERP_NEW.services.CoursesService;
import com.example.ERP_NEW.services.StudentServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


@Path("courses")
public class

CoursesController {


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
        coursesService.addCourses(course);
        System.out.println("a2");
        return Response.ok().build();
    }

    @POST
    @Path("/disp")
    // @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginStudent(Courses course) throws URISyntaxException {
        CoursesService coursesService= new CoursesService();
        List<Courses> courses = new ArrayList<Courses>();
        courses  = coursesService.fetchTT(course);
        if(courses == null){
            return Response.noContent().build();
        }

        return Response.ok(courses).build();
    }

}