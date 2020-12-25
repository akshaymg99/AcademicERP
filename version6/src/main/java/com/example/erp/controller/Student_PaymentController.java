package com.example.erp.controller;
import com.example.erp.bean.Student_Payment;
import com.example.erp.service.Student_PaymentService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("stdpayment")
public class Student_PaymentController {
    Student_PaymentService student_paymentService = new Student_PaymentService();
    @GET
    @Path("/getdue")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getdueBills() {
        List<Student_Payment> student_payments = student_paymentService.getdueBills();
        return Response.ok().entity(student_payments).build();
    }
}
