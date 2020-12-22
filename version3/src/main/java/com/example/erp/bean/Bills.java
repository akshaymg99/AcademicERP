package com.example.erp.bean;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Bills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Integer amount;
    private Date bill_date;
    private Date deadline;

    @OneToMany(mappedBy = "bill")
    private List<Student_Payment> student_payments;

    @OneToMany(mappedBy = "bill")
    private List<Student_Bills> student_bills;

    public Bills(String description, Integer amount, Date bill_date, Date deadline, List<Student_Payment> student_payments, List<Student_Bills> student_bills) {
        this.description = description;
        this.amount = amount;
        this.bill_date = bill_date;
        this.deadline = deadline;
        this.student_payments = student_payments;
        this.student_bills = student_bills;
    }

    public Bills() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @JsonbTransient
    public List<Student_Payment> getStudent_payments() {
        return student_payments;
    }

    public void setStudent_payments(List<Student_Payment> student_payments) {
        this.student_payments = student_payments;
    }

    @JsonbTransient
    public List<Student_Bills> getStudent_bills() {
        return student_bills;
    }

    public void setStudent_bills(List<Student_Bills> student_bills) {
        this.student_bills = student_bills;
    }
}
