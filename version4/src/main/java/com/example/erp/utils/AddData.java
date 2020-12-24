package com.example.erp.utils;
import com.example.erp.bean.Bills;
import com.example.erp.bean.Student_Payment;
import com.example.erp.dao.BillsDao;
import com.example.erp.dao.Student_paymentDao;
import com.example.erp.dao.implementation.BillsDaoimpl;
import com.example.erp.dao.implementation.Student_paymentDaoimpl;
import org.hibernate.* ;
import com.example.erp.bean.Students;
import com.example.erp.bean.Bills;
import com.example.erp.bean.Student_Payment;
import com.example.erp.dao.StudentDao;
import com.example.erp.dao.implementation.StudentDaoImpl;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.Date;

public class AddData {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        BillsDao billsDao = new BillsDaoimpl();
        Student_paymentDao student_paymentDao = new Student_paymentDaoimpl();

        Students student1 = new Students();
        Bills bill1 = new Bills();
        Student_Payment payment1 = new Student_Payment();

        student1.setStudent_id(2);
        student1.setEmail("galavanshuman@gmail.com");
        student1.setFirst_name("anshu");
        student1.setLast_name("galav");
        student1.setRoll_no("MT2020101");
        student1.setBills(Collections.singletonList(bill1));
        student1.setPayment_id(Collections.singletonList(payment1));

        studentDao.registerStudent(student1);

        bill1.setBill_id(1);
        bill1.setAmount(2000);
        bill1.setDescription("paisa do");
        bill1.setBill_date(new Date(2020 / 11 / 11));
        bill1.setDeadline(new Date(2020 / 12 / 12));
        bill1.setStudents(Collections.singletonList(student1));

        billsDao.registerBill(bill1);

        payment1.setAmount(2000);
        payment1.setDescription("jkhjj");
        payment1.setBills(bill1);
        payment1.setPayment_date(new Date(2020 / 11 / 12));
        payment1.setPayment_id(1);
        payment1.setStudent(student1);

        student_paymentDao.registerpayment(payment1);
    }
}
