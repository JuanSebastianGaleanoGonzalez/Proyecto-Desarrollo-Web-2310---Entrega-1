package com.proyecto.proyecto.model.repository;

import com.proyecto.proyecto.model.entity.Estacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionRepository extends CrudRepository<Estacion, Long> {

}
