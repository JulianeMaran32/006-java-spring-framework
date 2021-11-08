package com.jvm.project.forumalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.project.forumalura.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}