package com.proyecto.proyecto.model;

import java.util.ArrayList;
import java.util.Collection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
public class Ruta {
    private String codigo;
    private Collection<Estacion> estaciones = new ArrayList<>();
}
