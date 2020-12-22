package com.example.erp.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student_Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer student_id;

    private String description;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private Integer payment;

    private Integer bill_id;

    @ManyToOne
    private Bills bill;

    @ManyToOne
    private Students student;

    public Student_Payment() {
    }

    public Student_Payment(Integer student_id, String description, Integer amount, Integer payment, Integer bill_id, Bills bill, Students student) {
        this.student_id = student_id;
        this.description = description;
        this.amount = amount;
        this.payment = payment;
        this.bill_id = bill_id;
        this.bill = bill;
        this.student = student;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getBill_id() {
        return bill_id;
    }

    public void setBill_id(Integer bill_id) {
        this.bill_id = bill_id;
    }

    public Bills getBill() {
        return bill;
    }

    public void setBill(Bills bill) {
        this.bill = bill;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}
