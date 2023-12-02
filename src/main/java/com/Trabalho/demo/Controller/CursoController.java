package com.Trabalho.demo.Controller;

import com.Trabalho.demo.Model.Boletim;
import com.Trabalho.demo.Model.Curso;
import com.Trabalho.demo.Repository.CursoRepository;
import com.Trabalho.demo.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @GetMapping("/{id}")
    public Optional<Curso> getCursoByID(@PathVariable Long id) {
        return cursoService.findCursoByID(id);
    }

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.findAllCursos();
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Long id, @RequestBody Curso curso) {
        curso.setId(id);
        return cursoService.saveCurso(curso);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        cursoService.deleteCurso(id);
    }
}
