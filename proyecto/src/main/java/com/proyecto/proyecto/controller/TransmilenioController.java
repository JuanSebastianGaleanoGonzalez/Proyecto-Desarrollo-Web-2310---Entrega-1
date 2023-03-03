package com.proyecto.proyecto.controller;

import com.proyecto.proyecto.model.entity.Conductor;
import com.proyecto.proyecto.model.entity.Transmilenio;
import com.proyecto.proyecto.model.service.TrasmilenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transmilenio")
public class TransmilenioController {

    @Autowired
    TrasmilenioService trasmilenioService;

    @GetMapping("/delete/{idTransmilenio}")
    public String eliminarTransmilenio(Model model, @PathVariable Long id){
        Transmilenio transmilenioEliminar = trasmilenioService.buscarTransmilenio(id);
        trasmilenioService.eliminarTransmilenio(transmilenioEliminar);
        return "redirect:";
    }
}
