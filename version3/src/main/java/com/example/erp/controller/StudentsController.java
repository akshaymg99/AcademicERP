package com.example.erp.controller;

import com.example.erp.bean.Courses;
import com.example.erp.bean.Students;
import com.example.erp.service.CourseService;
import com.example.erp.service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("students")
public class StudentsController {
    StudentService studentService = new StudentService();
    CourseService courseService =  new CourseService();

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginStudent(Students student) throws URISyntaxException {
        Students result = studentService.verifyEmail(student);
        if(result == null){
            return Response.noContent().build();
        }

        return Response.ok().entity(result).build();
    }


    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents() {
        List<Students> students = studentService.getStudents();
        return Response.ok().entity(students).build();
    }
}
