package com.proyecto.proyecto.model;

import java.util.ArrayList;
import java.util.Collection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
public class Transmilenio {
    private String placa;
    private String modelo;
    private Collection<Ruta> rutasAsignadas = new ArrayList<>();    

    public Transmilenio(){};

    public Transmilenio(String placa1, String modelo1){
        this.placa = placa1;
        this.modelo = modelo1;
    }
}
