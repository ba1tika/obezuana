package com.example.obezuana.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Number")
public class Number {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Number", nullable = false)
    private int idNumber;
    @Basic
    @Column(name = "Category", nullable = false, length = 50)
    private String category;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<NumberCategory> numbers = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name="Bron")
    private Bron bron;

    public Number() {
    }

    public Number(String category){this.category = category;}
    public Number(int idNumber, String category) {
        this.idNumber = idNumber;
        this.category = category;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<NumberCategory> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberCategory> numbers) {
        this.numbers = numbers;
    }

    public Bron getBron() {
        return bron;
    }

    public void setBron(Bron bron) {
        this.bron = bron;
    }
}
