package com.proyecto.proyecto.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "estacion")
@Getter @Setter @ ToString @EqualsAndHashCode
public class Estacion {

    @Id @GeneratedValue
    Long id;
    @Column(name = "nombre")
    private String nombre;

    public Estacion(){};

    public Estacion(String name){
        this.nombre = name;
    }
}
