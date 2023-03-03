package com.proyecto.proyecto.model.service;

import com.proyecto.proyecto.model.entity.Conductor;
import com.proyecto.proyecto.model.entity.Transmilenio;
import com.proyecto.proyecto.model.repository.TransmilenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrasmilenioService {

    @Autowired
    private TransmilenioRepository transmilenioRepository;

    public void eliminarTransmilenio(Transmilenio transmilenio){
        transmilenioRepository.delete(transmilenio);
    }

    public Transmilenio buscarTransmilenio(Long id){
        return transmilenioRepository.findById(id).orElseThrow();
    }

    public List<Transmilenio> listarTransmilenios(){
        return (List<Transmilenio>) transmilenioRepository.findAll();
    }
}
