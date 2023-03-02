package com.proyecto.proyecto.model.service;

import com.proyecto.proyecto.model.repository.TransmilenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrasmilenioService {

    @Autowired
    private TransmilenioRepository transmilenioRepository;
}
