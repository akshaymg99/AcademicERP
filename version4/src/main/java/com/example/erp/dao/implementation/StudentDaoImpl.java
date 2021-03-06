package com.example.erp.dao.implementation;

import com.example.erp.bean.Bills;
import com.example.erp.bean.Students;
import com.example.erp.dao.StudentDao;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public Students emailVerify(Students student) {
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from Students where email=:email");
            query.setParameter("email", student.getEmail());
            for (final Object fetch : query.list()) {
                return (Students) fetch;
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
        return null;
    }

    @Override
    public boolean registerStudent(Students student) {
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public List<Students> getStudents() {
        Session session = SessionUtil.getSession();
        List<Students> students = new ArrayList<>();
        try {
            for (final Object student : session.createQuery("from Students ").list()) {
                students.add((Students) student);
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
        return students;
    }


}
