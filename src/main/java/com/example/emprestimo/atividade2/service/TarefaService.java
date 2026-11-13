package com.example.emprestimo.atividade2.service;

import com.example.emprestimo.atividade2.model.Tarefa;
import com.example.emprestimo.atividade2.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository  = repository;
    }

    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    public Tarefa cadastrarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }
}
