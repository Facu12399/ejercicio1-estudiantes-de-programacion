package com.example.Ejercicio1EstudianteDeProgramacion.dto;

import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CursoTemaDto {
    private String nombre_curso;
    private List<Tema> listaDeTemas;

    public CursoTemaDto(){}

    public CursoTemaDto(String nombre_curso, List<Tema> listaDeTemas){
        this.nombre_curso = nombre_curso;
        this.listaDeTemas = listaDeTemas;
    }

}
