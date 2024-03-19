package com.example.aulaprojeto.controller;

import com.example.aulaprojeto.entity.Estado;
import com.example.aulaprojeto.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cidade")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Estado>> buscarTodos(){

        List<Estado> response = estadoService.buscarTodos();
        return ResponseEntity.ok(response);
    }
}
