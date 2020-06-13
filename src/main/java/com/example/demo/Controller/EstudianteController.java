package com.example.demo.Controller;

import com.example.demo.Entity.Estudiante;
import com.example.demo.Repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class EstudianteController {

    @Autowired
    EstudianteRepositorio repositorio;

    @GetMapping("/")
    public String index(Model modelo, Estudiante estudiante){
        modelo.addAttribute("estudiante", new Estudiante());
        modelo.addAttribute("estudiantes", repositorio.findAll()); //SELECT * FROM tEstudiante
        return "index";
    }

    @PostMapping("/crearEstudiante")
    public String crearUsuario(Model modelo, Estudiante estudiante){
        repositorio.save(estudiante); //INSERT INTO Estudiante (...) value (...);
        modelo.addAttribute("estudiante", new Estudiante());
        modelo.addAttribute("estudiantes", repositorio.findAll());//SELECT * FROM tEstudiante
        return "index";
    }

    @GetMapping("/editarEstudiante/{matricula}")
    public String editarEstudianteForm(Model modelo, @PathVariable(name = "matricula") int matricula){
        Estudiante estudianteEditar = repositorio.findById(Long.valueOf(matricula)).get();
        modelo.addAttribute("estudiante", estudianteEditar);
        modelo.addAttribute("estudiantes", repositorio.findAll());//SELECT * FROM tEstudiante
        return "index";
    }

}
