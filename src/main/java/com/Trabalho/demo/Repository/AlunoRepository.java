package com.Trabalho.demo.Repository;

import com.Trabalho.demo.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
