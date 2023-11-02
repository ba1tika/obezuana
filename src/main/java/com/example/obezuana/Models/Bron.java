package com.example.obezuana.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Bron")
public class Bron {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Bron", nullable = false)
    private int idBron;
    @Basic
    @Column(name = "First_Name", nullable = false, length = 50)
    private int first_name;
    @JsonIgnore
    @OneToMany(mappedBy = "bron")
    private List<NumberSos> numberSos = new ArrayList<>();


    public Bron() {
    }

    public Bron(int idBron, int first_name) {
        this.idBron = idBron;
        this.first_name = first_name;
    }

    public int getIdBron() {
        return idBron;
    }

    public void setIdBron(int idBron) {
        this.idBron = idBron;
    }

    public int getFirst_name() {
        return first_name;
    }

    public void setFirst_name(int first_name) {
        this.first_name = first_name;
    }
}
