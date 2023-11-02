package com.example.obezuana.Models;
import jakarta.persistence.*;

@Entity
@Table(name="Breakfast")
public class Breakfast {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Breakfast", nullable = false)
    private int idBreakfast;
    @Basic
    @Column(name = "Kolvo", nullable = false)
    private int kolvo;
    @Basic
    @Column(name = "Zakaz", nullable = false, length = 50)
    private String zakaz;
    @Basic
    @Column(name = "Price", nullable = false, length = 50)
    private String price;

    public Breakfast() {
    }

    public Breakfast(int idBreakfast, int kolvo, String zakaz, String price) {
        this.idBreakfast = idBreakfast;
        this.kolvo = kolvo;
        this.zakaz = zakaz;
        this.price = price;
    }

    public int getIdBreakfast() {
        return idBreakfast;
    }

    public void setIdBreakfast(int idBreakfast) {
        this.idBreakfast = idBreakfast;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public String getZakaz() {
        return zakaz;
    }

    public void setZakaz(String zakaz) {
        this.zakaz = zakaz;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}