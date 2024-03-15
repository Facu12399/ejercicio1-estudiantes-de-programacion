package com.example.Ejercicio1EstudianteDeProgramacion.service;

import com.example.Ejercicio1EstudianteDeProgramacion.dto.CursoTemaDto;
import com.example.Ejercicio1EstudianteDeProgramacion.model.Curso;
import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;
import com.example.Ejercicio1EstudianteDeProgramacion.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    ICursoRepository cursoRepo;

    @Override
    public void crearCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> obtenerCursos() {
        List<Curso> listaCursos = cursoRepo.findAll();
        return listaCursos;
    }

    @Override
    public Curso encontrarCurso(Long id) {
        Curso curso = cursoRepo.findById(id).orElse(null);
        return curso;
    }

    @Override
    public void modificarCurso(Curso curso) {
        this.crearCurso(curso);
    }

    @Override
    public List<Tema> obtenerTemasCurso(Long id) {
        List<Tema> listaTemas = new ArrayList<Tema>();

        for (int i = 0; i < obtenerCursos().size(); i++) {
            if (id == cursoRepo.findAll().get(i).getId_curso()){
                listaTemas = cursoRepo.findAll().get(i).getListaDeTemas();
            }
        }
        return listaTemas;
    }

    @Override
    public List<Curso> obtenerCursoXNombre(String nombre) {
        List<Curso> busquedaCursos = new ArrayList<>();

        for (Curso cursoEncontrado:cursoRepo.findAll()) {
            if (cursoEncontrado.getNombre().contains(nombre)){
                busquedaCursos.add(cursoEncontrado);
            }
        }

        return busquedaCursos;
    }

    @Override
    public CursoTemaDto obtenerCursoTemaDto(Long id) {
        Curso curso = cursoRepo.findById(id).orElse(null);

        CursoTemaDto c = new CursoTemaDto();
        c.setNombre_curso(curso.getNombre());
        c.setListaDeTemas(curso.getListaDeTemas());
        return c;
    }
}
