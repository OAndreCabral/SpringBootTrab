package com.Trabalho.demo.Repository;

import com.Trabalho.demo.Model.Disciplina;
import com.Trabalho.demo.Model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {}
