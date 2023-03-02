package com.proyecto.proyecto.model.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ruta")
@Getter @Setter @ToString @EqualsAndHashCode
public class Ruta {
    @Id @GeneratedValue
    Long id;

    @Column(name = "codigo")
    private String codigo;

    @OneToMany
    private List<Estacion> estaciones = new ArrayList<>();

    public Ruta(){};
}
