package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tEstudiante")
public class Estudiante {
    @Id
    @Column(name = "usuarioID")
    private Long id;
    private int matricula;
    private String nombre;
    private String telefono;

}