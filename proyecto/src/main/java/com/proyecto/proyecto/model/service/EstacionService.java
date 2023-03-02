package com.proyecto.proyecto.model.service;

import com.proyecto.proyecto.model.repository.EstacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstacionService {
    @Autowired
    private EstacionRepository estacionRepository;
}
