package com.example.erp.bean;

import javax.persistence.*;

@Entity
public class Students {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer student_id;
    @Column(nullable = false)
    private String fname;
    @Column(nullable = false)
    private String lname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private Integer cgpa;
    @Column(nullable = false)
    private Integer total_credits;
    private Integer graduation_year;

    public Students(String fname, String lname, String email, Integer cgpa, Integer total_credits, Integer graduation_year) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.cgpa = cgpa;
        this.total_credits = total_credits;
        this.graduation_year = graduation_year;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public void setCgpa(Integer cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getTotal_credits() {
        return total_credits;
    }

    public void setTotal_credits(Integer total_credits) {
        this.total_credits = total_credits;
    }

    public Integer getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(Integer graduation_year) {
        this.graduation_year = graduation_year;
    }
}
