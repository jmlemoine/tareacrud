package com.example.demo.Controller;

import com.example.demo.Entity.Estudiante;
import com.example.demo.Repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
