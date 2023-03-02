package com.proyecto.proyecto.model.service;

import com.proyecto.proyecto.model.entity.Conductor;
import com.proyecto.proyecto.model.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorService {
    @Autowired
    private ConductorRepository conductorRepository;

    public List<Conductor> listarConductores(){
        return (List<Conductor>) conductorRepository.findAll();
    }

    public Conductor buscarConductor(long id){
        Conductor aux = conductorRepository.findById(id).orElseThrow();
        return aux;
    }
}
