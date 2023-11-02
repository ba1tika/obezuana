package com.example.obezuana.Models;
import jakarta.persistence.*;

@Entity
@Table(name="NumberCategory")
public class NumberCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_NumberCategory", nullable = false)
    private int idNumberCategory;
    @Basic
    @Column(name = "Kolvo", nullable = false)
    private int kolvo;
    @Basic
    @Column(name = "KolvoRoom", nullable = false)
    private int kolvoroom;
    @Basic
    @Column(name = "Info", nullable = false, length = 400)
    private String info;
    @Basic
    @Column(name = "Price", nullable = false, length = 50)
    private String price;


    public NumberCategory() {
    }
    public NumberCategory(int kolvo){this.kolvo= kolvo;}
    public NumberCategory(int idNumberCategory, int kolvo, int kolvoRoom, String info, String price) {
        this.idNumberCategory = idNumberCategory;
        this.kolvo = kolvo;
        this.kolvoroom = kolvoroom;
        this.info = info;
        this.price = price;

    }

    public int getIdNumberCategory() {
        return idNumberCategory;
    }

    public void setIdNumberCategory(int idNumberCategory) {
        this.idNumberCategory = idNumberCategory;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public int getKolvoroom() {
        return kolvoroom;
    }

    public void setKolvoroom(int kolvoroom) {
        this.kolvoroom = kolvoroom;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
