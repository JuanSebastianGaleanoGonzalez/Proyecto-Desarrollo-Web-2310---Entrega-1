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
@Table(name = "transmilenio")
@Getter @Setter @ToString @EqualsAndHashCode
public class Transmilenio {
    @Id @GeneratedValue
    Long id;
    @Column(name = "placa")
    private String placa;
    @Column(name = "modelo")
    private String modelo;

    @OneToMany
    private List<Ruta> rutasAsignadas = new ArrayList<>();

    @ManyToMany
    private List<Conductor> conductoresAsignados = new ArrayList<>();
    public Transmilenio(){};

    public Transmilenio(String placa1, String modelo1){
        this.placa = placa1;
        this.modelo = modelo1;
    }
}
