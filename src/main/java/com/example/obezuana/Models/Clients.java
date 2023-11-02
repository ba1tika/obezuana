package com.example.obezuana.Models;
import jakarta.persistence.*;

@Entity
@Table(name="Clients")
public class Clients {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Clients", nullable = false)
    private int idClients;
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
    @Column(name = "Sex", nullable = false, length = 1)
    private String sex;
    @Basic
    @Column(name = "Passport", nullable = false, length = 10)
    private String passport;

    public Clients() {
    }

    public Clients(int idClients, String first_name, String last_name, String middle_name, String sex, String passport) {
        this.idClients = idClients;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.sex = sex;
        this.passport = passport;
    }

    public int getIdClients() {
        return idClients;
    }

    public void setIdClients(int idClients) {
        this.idClients = idClients;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
