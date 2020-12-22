package com.example.erp.bean;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Students")
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    private String first_name;
    private String last_name;
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private Integer roll_no;
    private Integer cgpa;
    private Integer total_credits;
    private Integer graduation_year;

    @OneToMany(mappedBy = "student")
    private List<Student_Bills> student_bills;

    @OneToMany(mappedBy = "student")
    private List<Student_Payment> student_payments;

    @ManyToMany
    @JoinTable(name = "Student_Courses", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private List<Courses> courses;

    public Students() {
    }

    public Students(String first_name, String last_name, String email, Integer roll_no, Integer cgpa, Integer total_credits, Integer graduation_year, List<Student_Bills> student_bills, List<Student_Payment> student_payments, List<Courses> courses) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.roll_no = roll_no;
        this.cgpa = cgpa;
        this.total_credits = total_credits;
        this.graduation_year = graduation_year;
        this.student_bills = student_bills;
        this.student_payments = student_payments;
        this.courses = courses;
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

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
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

    @JsonbTransient
    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @JsonbTransient
    public List<Student_Bills> getStudent_bills() {
        return student_bills;
    }

    public void setStudent_bills(List<Student_Bills> student_bills) {
        this.student_bills = student_bills;
    }

    @JsonbTransient
    public List<Student_Payment> getStudent_payments() {
        return student_payments;
    }

    public void setStudent_payments(List<Student_Payment> student_payments) {
        this.student_payments = student_payments;
    }
}
