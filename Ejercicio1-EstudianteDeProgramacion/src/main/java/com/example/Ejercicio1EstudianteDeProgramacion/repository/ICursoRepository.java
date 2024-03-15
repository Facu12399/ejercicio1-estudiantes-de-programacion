package com.example.Ejercicio1EstudianteDeProgramacion.repository;

import com.example.Ejercicio1EstudianteDeProgramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
