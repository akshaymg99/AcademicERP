package com.example.erp.dao;

import com.example.erp.bean.Student_Payment;

import java.util.List;

public interface Student_PaymentDao {
    boolean registerpayment(Student_Payment payment);
    List<Student_Payment> getdueBills();

}
