package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tEstudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuarioID")
    private Long id;

    //@Column(name = "usuarioMatricula")
    private int matricula;

    //@Column(name = "usuarioNombre")
    private String nombre;

    //@Column(name = "usuarioTelefono")
    private String telefono;

    public Estudiante() {
    }

    public Estudiante(Long id, int matricula, String nombre, String telefono) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
