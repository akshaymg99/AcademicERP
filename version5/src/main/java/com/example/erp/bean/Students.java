package com.example.erp.bean;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Students")
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    @Column(nullable = false, unique = true)
    private String roll_no;

    private String first_name;
    private String last_name;
    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(fetch = FetchType.LAZY , cascade = {CascadeType.ALL})
    private List<Student_Payment> payment_id ;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "Student_Bills", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "bill_id")} )
    private List<Bills> bills;

    public Students() {
    }

    public Students(Integer student_id, String roll_no, String first_name, String last_name, String email, List<Student_Payment> payment_id, List<Bills> bills) {
        this.student_id = student_id;
        this.roll_no = roll_no;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.payment_id = payment_id;
        this.bills = bills;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonbTransient
    public List<Student_Payment> getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(List<Student_Payment> payment_id) {
        this.payment_id = payment_id;
    }
    @JsonbTransient
    public List<Bills> getBills() {
        return bills;
    }

    public void setBills(List<Bills> bills) {
        this.bills = bills;
    }
}
