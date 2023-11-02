package com.example.obezuana.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="NumberSos")
public class NumberSos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_NumberSos", nullable = false)
    private int idNumberSos;
    @Basic
    @Column(name = "Bron", nullable = false, length = 100)
    private String bron;
    @Basic
    @Column(name = "Zaezd", nullable = false)
    private Date zaezd;
    @Basic
    @Column(name = "Vuezd", nullable = false)
    private Date vuezd;
    @Basic
    @Column(name = "Summa", nullable = false, length = 50)
    private String summa;
    @JsonIgnore
    @OneToMany(mappedBy = "bron")
    private List<Clients> client = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "bron")
    private List<Employee> employee = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "bron")
    private List<Number> number = new ArrayList<>();

    public NumberSos() {
    }
    public NumberSos(String Bron){this.bron= bron;}
    public NumberSos(int idNumberSos, String bron, Date zaezd, Date vuezd, String summa) {
        this.idNumberSos = idNumberSos;
        this.bron = bron;
        this.zaezd = zaezd;
        this.vuezd = vuezd;
        this.summa = summa;

    }

    public int getIdNumberSos() {
        return idNumberSos;
    }

    public void setIdNumberSos(int idNumberSos) {
        this.idNumberSos = idNumberSos;
    }

    public String getBron() {
        return bron;
    }

    public void setBron(String bron) {
        this.bron = bron;
    }

    public Date getZaezd() {
        return zaezd;
    }

    public void setZaezd(Date zaezd) {
        this.zaezd = zaezd;
    }

    public Date getVuezd() {
        return vuezd;
    }

    public void setVuezd(Date vuezd) {
        this.vuezd = vuezd;
    }

    public String getSumma() {
        return summa;
    }

    public void setSumma(String summa) {
        this.summa = summa;
    }
}