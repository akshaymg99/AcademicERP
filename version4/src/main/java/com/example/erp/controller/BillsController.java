package com.example.erp.controller;

import com.example.erp.bean.Bills;
import com.example.erp.service.BillService;
import com.example.erp.service.StudentService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
@Path("bills")
public class BillsController {
    BillService billService = new BillService();

    @GET
    @Path("/getdue")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBills() {
        List<Bills> bills = billService.getBills();
        return Response.ok().entity(bills).build();
    }

}
