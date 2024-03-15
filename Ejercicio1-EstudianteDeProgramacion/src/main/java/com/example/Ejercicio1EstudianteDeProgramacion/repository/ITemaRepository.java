package com.example.Ejercicio1EstudianteDeProgramacion.repository;

import com.example.Ejercicio1EstudianteDeProgramacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
