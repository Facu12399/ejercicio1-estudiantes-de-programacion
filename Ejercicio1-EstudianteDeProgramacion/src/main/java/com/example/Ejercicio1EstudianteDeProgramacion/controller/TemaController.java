package com.example.Ejercicio1EstudianteDeProgramacion.controller;

import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;
import com.example.Ejercicio1EstudianteDeProgramacion.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class TemaController {

    @Autowired
    ITemaService temaServ;

    @GetMapping ("/tema/obtener")
    public List<Tema> obtenerTema(){
        return temaServ.obtenerTema();
    }

    @PostMapping ("/tema/crear")
    public String crearTema(@RequestBody Tema tema){
        temaServ.crearTema(tema);
        return "Se creo el tema correctamente";
    }

    @PutMapping("/tema/modificar")
    public Tema modificarTema(@RequestBody Tema tema){
        temaServ.modificarTema(tema);

        return temaServ.encontrarTema(tema.getId_tema());
    }
}
