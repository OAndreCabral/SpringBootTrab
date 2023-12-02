package com.Trabalho.demo.Repository;

import com.Trabalho.demo.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
