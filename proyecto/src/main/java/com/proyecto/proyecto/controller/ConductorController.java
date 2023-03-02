package com.proyecto.proyecto.controller;

import com.proyecto.proyecto.model.entity.Conductor;
import com.proyecto.proyecto.model.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conductor")
public class ConductorController {

    @Autowired
    ConductorService conductorService;

    @GetMapping("/list")
    public String listarConductores(Model model){
        model.addAttribute("conductores", conductorService.listarConductores());
        return "Coordinador_List_Cond";
    }

    @GetMapping("search/{idConductor}")
    public String buscarConductor(Model model, @PathVariable ("idConductor") long id){
        model.addAttribute("conductor", conductorService.buscarConductor(id));
        return "Coordinador_Cons_Cond";
    }

}
