package com.proyecto.proyecto.model.repository;

import com.proyecto.proyecto.model.entity.Transmilenio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmilenioRepository extends CrudRepository<Transmilenio, Long> {
}
