package com.example.aulaprojeto.service;

import com.example.aulaprojeto.entity.Estado;
import com.example.aulaprojeto.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;
    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

}
