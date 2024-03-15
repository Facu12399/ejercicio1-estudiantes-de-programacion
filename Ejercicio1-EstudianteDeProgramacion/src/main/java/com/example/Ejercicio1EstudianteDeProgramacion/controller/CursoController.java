package com.example.Ejercicio1EstudianteDeProgramacion.controller;

import com.example.Ejercicio1EstudianteDeProgramacion.dto.CursoTemaDto;
import com.example.Ejercicio1EstudianteDeProgramacion.model.Curso;
import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;
import com.example.Ejercicio1EstudianteDeProgramacion.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class CursoController {

    @Autowired
    ICursoService cursoServ;

    @PostMapping("/curso/crear")
    public String crearCurso(@RequestBody Curso curso){
        cursoServ.crearCurso(curso);

        return "El curso se ha creado con exito";
    }

    @GetMapping("/curso/obtener")
    public List<Curso> obtenerCursos(){return cursoServ.obtenerCursos(); }

    @GetMapping("/curso/busqueda")
    public List<Curso> encontrarCurso(@RequestParam String nombre){
       return cursoServ.obtenerCursoXNombre(nombre);
    }

    @GetMapping("/curso/obtenerTemas/{id}")
    public List<Tema> obtenerTemas(@PathVariable Long id){
        return cursoServ.obtenerTemasCurso(id);
    }


    @PutMapping("/curso/modificar")
    public Curso modificarCurso(@RequestBody Curso curso){
        cursoServ.modificarCurso(curso);

        return cursoServ.encontrarCurso(curso.getId_curso());
    }

    @GetMapping("/curso/obtenerCursoTema/{id}")
    public CursoTemaDto obtenerCursoTemaDto(@PathVariable Long id){
        return cursoServ.obtenerCursoTemaDto(id);
    }

}
