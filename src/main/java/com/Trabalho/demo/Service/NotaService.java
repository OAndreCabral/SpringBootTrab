package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.Nota;
import com.Trabalho.demo.Repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;

    public Nota saveNota(Nota nota) {
        return notaRepository.save(nota);
    }

    public Optional<Nota> findNotaByID(Long id) {
        return notaRepository.findById(id);
    }

    public List<Nota> findAllNotas() {
        return notaRepository.findAll();
    }

    public void delete(Long id) {
        notaRepository.deleteById(id);
    }
}
