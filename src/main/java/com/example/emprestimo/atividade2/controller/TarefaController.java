package com.example.emprestimo.atividade2.controller;

import com.example.emprestimo.atividade2.model.Tarefa;
import com.example.emprestimo.atividade2.repository.TarefaRepository;
import com.example.emprestimo.atividade2.service.TarefaService;
import com.example.emprestimo.explicacao1.controller.EquipamentoController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listarTarefas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa cadastrarTarefa(@RequestBody Tarefa tarefa) {
        return service.cadastrarTarefa(tarefa);
    }
}
