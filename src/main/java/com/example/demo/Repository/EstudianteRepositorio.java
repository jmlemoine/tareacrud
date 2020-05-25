package com.example.demo.Repository;

//import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepositorio extends CrudRepository<Estudiante, Long> {
}
