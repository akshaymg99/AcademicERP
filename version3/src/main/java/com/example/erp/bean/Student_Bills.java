package com.example.erp.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student_Bills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer student_id;

    private Integer bill_id;

    @ManyToOne
    private Students student;

    @ManyToOne
    private Bills bill;

    public Student_Bills() {
    }

    public Student_Bills(Integer student_id, Integer bill_id, Students student, Bills bill) {
        this.student_id = student_id;
        this.bill_id = bill_id;
        this.student = student;
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getBill_id() {
        return bill_id;
    }

    public void setBill_id(Integer bill_id) {
        this.bill_id = bill_id;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Bills getBill() {
        return bill;
    }

    public void setBill(Bills bill) {
        this.bill = bill;
    }
}
