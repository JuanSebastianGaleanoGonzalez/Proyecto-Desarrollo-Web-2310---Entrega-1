package com.proyecto.proyecto.model.repository;

import com.proyecto.proyecto.model.entity.Horario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends CrudRepository <Horario, Long> {
}
