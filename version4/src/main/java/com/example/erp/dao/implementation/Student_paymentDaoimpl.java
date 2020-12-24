package com.example.erp.dao.implementation;

import com.example.erp.bean.Student_Payment;
import com.example.erp.dao.Student_paymentDao;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Student_paymentDaoimpl implements Student_paymentDao {

    @Override
    public boolean registerpayment(Student_Payment payment) {
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(payment);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
}}
