package com.example.Ejercicio1EstudianteDeProgramacion.service;

import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;

import java.util.List;

public interface ITemaService {

    //Crear temas
    public void crearTema(Tema tema);

    //Obtener todos los temas de determinado curso
    public List<Tema> obtenerTema();

    //Encontrar determinado tema
    public Tema encontrarTema(Long id);

    //Modificar los datos de un tema
    public void modificarTema(Tema tema);
}
