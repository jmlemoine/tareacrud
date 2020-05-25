package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "t_estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int matricula;
    private String nombre;
    private String telefono;

    private boolean ambosNombres;

    public boolean AmbosNombres(){
        return !nombre.isEmpty() && !telefono.isEmpty();
    }

    public Estudiante() {
    }

    public Estudiante(Long id, int matricula, String nombre, String telefono) {
        super();
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Estudiante other = (Estudiante) obj;

        if (id == null){
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
