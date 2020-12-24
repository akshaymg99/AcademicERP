package com.example.erp.controller;

import com.example.erp.bean.Bills;
import com.example.erp.bean.Students;
//import com.example.erp.service.BillsService;
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
    //BillsService courseService =  new BillsService();
//    @POST
//    @Path("/register")
//    @Produces(MediaType.TEXT_PLAIN)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response registerStudent(Students student) throws URISyntaxException {
//        System.out.println();
//        List<Courses> courses = new ArrayList<>();
//        Courses course = courseService.getCourseByID(student.getCourses().get(0).getCourse_id());
//        if(course!=null){
//            courses.add(course);
//            student.setCourses(courses);
//            if(studentService.registerStudent(student)){
//                return Response.ok().build();
//            }else{
//                return Response.status(203).build();
//            }
//
//        }
//        return Response.status(203).build();
//
//    }

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
}
