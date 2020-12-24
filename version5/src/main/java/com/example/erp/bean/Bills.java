package com.example.erp.bean;
import java.util.*;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;

@Entity
public class Bills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bill_id;
    private String description;
    private int amount;
    private Date bill_date;
    private Date deadline;

    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    private List<Student_Payment> payment_id ;


    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "bills",cascade = {CascadeType.ALL})
    private List<Students> students;


    public Bills() {
    }

    public Bills(Integer bill_id, String description, int amount, Date bill_date, Date deadline, List<Student_Payment> payment_id, List<Students> students) {
        this.bill_id = bill_id;
        this.description = description;
        this.amount = amount;
        this.bill_date = bill_date;
        this.deadline = deadline;
        this.payment_id = payment_id;
        this.students = students;
    }

    public Integer getBill_id() {
        return bill_id;
    }

    public void setBill_id(Integer bill_id) {
        this.bill_id = bill_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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
    public List<Student_Payment> getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(List<Student_Payment> payment_id) {
        this.payment_id = payment_id;
    }
    @JsonbTransient
    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}

