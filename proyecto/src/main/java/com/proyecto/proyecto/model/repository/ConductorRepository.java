package com.proyecto.proyecto.model.repository;

import com.proyecto.proyecto.model.entity.Conductor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, Long> {
    Optional<Conductor> findFirstBy();

}
