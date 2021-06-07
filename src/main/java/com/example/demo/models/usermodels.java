package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="users")

public class usermodels {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="name",nullable = false,length = 30)
    private String name;
    @Column(name = "password", nullable=false,length = 300)
    private String Passworf;
    @Column(name = "Apellido", nullable = false,length = 100)
    private String Apellido;
    @Column(name = "Nrotelefono",length = 20)
    private int Nrotelefono;
    @Column(name = "email",length = 100)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getNrotelefono() {
        return Nrotelefono;
    }

    public void setNrotelefono(int nrotelefono) {
        Nrotelefono = nrotelefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworf() {
        return Passworf;
    }

    public void setPassworf(String passworf) {
        Passworf = passworf;
    }
}

