package com.example.Ejercicio1EstudianteDeProgramacion.service;

import com.example.Ejercicio1EstudianteDeProgramacion.dto.CursoTemaDto;
import com.example.Ejercicio1EstudianteDeProgramacion.model.Curso;
import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;

import java.util.List;

public interface ICursoService {

    //Crear un nuevo curso
    public void crearCurso(Curso curso);

    //Obtener todos los cursos
    public List<Curso> obtenerCursos();

    //Encontrar determinado curso
    public Curso encontrarCurso(Long id);

    //Modificar un curso
    public void modificarCurso(Curso curso);

    //Obtener los temas de un determinado curso
    public List<Tema> obtenerTemasCurso(Long id);

    //Encontrar curso por nombre
    public List<Curso> obtenerCursoXNombre(String nombre);

    //Obtener datos a traves del dto
    public CursoTemaDto obtenerCursoTemaDto(Long id);
}
