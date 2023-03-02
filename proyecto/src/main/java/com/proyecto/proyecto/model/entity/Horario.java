package com.proyecto.proyecto.model.entity;

import com.proyecto.proyecto.model.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter @ToString @EqualsAndHashCode
public class Horario {
    @Id @GeneratedValue
    Long id;
    @Column(name = "horaInicio")
    private int horaInicio;
    @Column(name = "horaFinal")
    private int horaFinal;
    @Column (name = "diaSemana")
    private String diaSemana;
    
    public Horario(){};

    public Horario(int horaInit, int horaEnd, String dia){
        this.horaInicio = horaInit;
        this.horaFinal = horaEnd;
        this.diaSemana = dia; 
    };

}
