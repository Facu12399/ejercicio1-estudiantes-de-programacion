package com.example.Ejercicio1EstudianteDeProgramacion.service;

import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;
import com.example.Ejercicio1EstudianteDeProgramacion.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    ITemaRepository temaRepo;

    @Override
    public void crearTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public List<Tema> obtenerTema() {
        List<Tema> listaTema = temaRepo.findAll();
        return listaTema;
    }

    @Override
    public Tema encontrarTema(Long id) {
        Tema tema = temaRepo.findById(id).orElse(null);
        return tema;
    }

    @Override
    public void modificarTema(Tema tema) {
        this.crearTema(tema);
    }
}
