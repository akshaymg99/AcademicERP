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

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginStudent(Students student) throws URISyntaxException {
        Students result1 = studentService.verifyEmail(student);
        Students result2 = studentService.verifyPassword(student);
        if (result1 != null && result2 != null) {
            return Response.ok().entity(result2).build();
        } else {
            return Response.noContent().build();
        }
    }
}
