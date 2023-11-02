package com.example.obezuana.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Employee")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Employee", nullable = false)
    private int idEmployee;
    @Basic
    @Column(name = "First_Name", nullable = false, length = 50)
    private String first_name;
    @Basic
    @Column(name = "Last_Name", nullable = false, length = 50)
    private String last_name;
    @Basic
    @Column(name = "Middle_Name", nullable = false, length = 50)
    private String middle_name;
    @Basic
    @Column(name = "Education", nullable = false, length = 150)
    private String education;
    @Basic
    @Column(name = "Salary", nullable = false, length = 50)
    private String salary;
    @ManyToOne
    @JoinColumn(name="Post")
    private Post post;
    @ManyToOne
    @JoinColumn(name="Bron")
    private Bron bron;
    public Employee() {
    }

    public Employee(int idEmployee, String first_name, String last_name, String middle_name, String education, String salary, Post post) {
        this.idEmployee = idEmployee;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.education = education;
        this.salary = salary;
        this.post = post;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
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

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
