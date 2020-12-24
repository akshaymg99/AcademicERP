package com.example.erp.dao;

import com.example.erp.bean.Bills;
import com.example.erp.bean.Students;

import java.util.List;

public interface BillsDao {


    boolean registerBill(Bills bill);

    List<Bills> getBills();


}
