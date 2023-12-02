package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.Aluno;
import com.Trabalho.demo.Model.Boletim;
import com.Trabalho.demo.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Optional<Aluno> findAlunoById(Long id) {
        return alunoRepository.findById(id);
    }

    public List<Aluno> findAllALunos() {
        return alunoRepository.findAll();
    }

    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    public Boletim getInfoBoletim(Long alunoId) {
        Optional<Aluno> alunoOpt = findAlunoById(alunoId);
        if (!alunoOpt.isPresent()) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inexistente");
            return null;
        }

        Aluno aluno = alunoOpt.get();

        Boletim boletim = new Boletim();
        boletim.setAluno(alunoOpt);
        boletim.setCursos(alunoOpt.get().getCursos());

        return boletim;
    }
}
