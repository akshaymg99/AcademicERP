package com.example.erp.service;

import com.example.erp.bean.Student_Payment;
import com.example.erp.dao.Student_PaymentDao;
import com.example.erp.dao.implementation.Student_PaymentDaoimpl;

import java.util.List;

public class Student_PaymentService {
    Student_PaymentDao student_paymentDao = new Student_PaymentDaoimpl();

    public List<Student_Payment> getdueBills (){
        return student_paymentDao.getdueBills();
    }

}
