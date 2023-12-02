package com.Trabalho.demo.Controller;

import com.Trabalho.demo.Model.Aluno;
import com.Trabalho.demo.Model.Boletim;
import com.Trabalho.demo.Repository.AlunoRepository;
import com.Trabalho.demo.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }

    @GetMapping("/{id}")
    public Optional<Aluno> getAluno(@PathVariable Long id) {
        return alunoService.findAlunoById(id);
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.findAllALunos();
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        aluno.setId(id);
        return alunoService.saveAluno(aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoService.deleteAluno(id);
    }

    @GetMapping("/{id}/boletim")
    public Boletim getBoletim(@PathVariable Long id) {
        return alunoService.getInfoBoletim(id);
    }
}

