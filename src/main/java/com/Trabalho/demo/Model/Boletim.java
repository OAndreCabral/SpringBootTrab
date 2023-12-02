package com.Trabalho.demo.Model;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Boletim {
    private Optional<Aluno> aluno;
    private List<Curso>cursos;
    private Map<Disciplina, Nota> notas;
    private String status;

    public Boletim() {
    }

    public Optional<Aluno> getAluno() {
        return this.aluno;
    }

    public void setAluno(Optional<Aluno> aluno) {
        this.aluno = aluno;
    }
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Map<Disciplina, Nota> getNotas() {
        return notas;
    }

    public void setNotas(Map<Disciplina, Nota> notas) {
        this.notas = notas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
