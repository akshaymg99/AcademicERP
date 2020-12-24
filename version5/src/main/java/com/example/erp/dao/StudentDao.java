package com.example.erp.dao;

import com.example.erp.bean.Bills;
import com.example.erp.bean.Students;

import java.util.List;

public interface StudentDao {

    Students emailVerify(Students student);
    List<Students> getStudents();
    boolean registerStudent(Students student);

}
