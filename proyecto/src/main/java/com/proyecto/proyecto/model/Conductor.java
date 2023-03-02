package com.proyecto.proyecto.model;

import java.util.ArrayList;
import java.util.Collection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
public class Conductor {
    private String nombre;
    private int cedula;
    private int telefono;
    private String direccion;
    private Collection<Transmilenio> listadoBuses = new ArrayList<>(); 

    public Conductor(){};

    public Conductor(String nombre1, int cedula1, int telefono1, String direccion1){
        this.nombre = nombre1;
        this.cedula = cedula1;
        this.telefono = telefono1;
        this.direccion = direccion1;
    }
}
