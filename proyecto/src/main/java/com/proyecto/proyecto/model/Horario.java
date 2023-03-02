package com.proyecto.proyecto.model;

import com.proyecto.proyecto.model.utils.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
public class Horario {
    private int horaInicio;
    private int HoraFinal;
    private DiaSemana diaSemana; 
}
