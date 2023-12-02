package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.Curso;
import com.Trabalho.demo.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Optional<Curso> findCursoByID(Long id) {
        return cursoRepository.findById(id);
    }

    public List<Curso> findAllCursos() {
        return cursoRepository.findAll();
    }

    public void deleteCurso(Long id){
        cursoRepository.deleteById(id);
    }
}
