package com.example.erp.bean;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Student_Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payment_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "student_id")
    private Students student;
    //private Integer student_id;

    private String description;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private Date payment_date;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "bill_id")
    private Bills bills;

    public Student_Payment(){}

    public Student_Payment(Integer payment_id, Students student, String description, Integer amount, Date payment_date, Bills bills) {
        this.payment_id = payment_id;
        this.student = student;
        this.description = description;
        this.amount = amount;
        this.payment_date = payment_date;
        this.bills = bills;

    }

    public Integer getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    @JsonbTransient
    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
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

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    @JsonbTransient
    public Bills getBills() {
        return bills;
    }

    public void setBills(Bills bills) {
        this.bills = bills;
    }
}
