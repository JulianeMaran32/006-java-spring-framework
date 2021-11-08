package com.jvm.project.forumalura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.project.forumalura.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

}