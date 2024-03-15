package com.example.Ejercicio1EstudianteDeProgramacion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tema;
    private String nombre;
    private String descripcion;

    public Tema(){}

    public Tema(Long id_tema, String nombre, String descripcion){
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
