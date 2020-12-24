package com.example.erp.dao.implementation;
import com.example.erp.bean.Student_Payment;
import com.example.erp.dao.Student_PaymentDao;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Student_PaymentDaoimpl implements Student_PaymentDao {

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
    }

    @Override
    public List<Student_Payment> getdueBills() {
        Session session = SessionUtil.getSession();
        List<Student_Payment> student_payments = new ArrayList<>();
        try {
            for (final Object student_payment : session.createQuery("from Student_Payment").list())
            {
                student_payments.add((Student_Payment) student_payment);
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
        return student_payments;
    }
}
