package com.example.obezuana.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Post")
public class Post {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Post", nullable = false)
    private int idPost;
    @Basic
    @Column(name = "Post", nullable = false, length = 50)
    private String post;
    @JsonIgnore
    @OneToMany(mappedBy = "post")
    private List<Employee> employees = new ArrayList<>();

    public Post() {
    }
    public Post(String post){this.post = post;}
    public Post(int idPost, String post) {
        this.idPost = idPost;
        this.post = post;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
