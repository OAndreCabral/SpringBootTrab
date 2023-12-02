package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.Disciplina;
import com.Trabalho.demo.Repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public Disciplina saveDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public Optional<Disciplina> findDisciplinaByID(Long id) {
        return disciplinaRepository.findById(id);
    }

    public List<Disciplina> findAllDisciplina() {
        return disciplinaRepository.findAll();
    }

    public void delete(Long id) {
        disciplinaRepository.deleteById(id);
    }
}
