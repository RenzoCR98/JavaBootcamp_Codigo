package com.codigo.msrenzocueva.infraestructure.repository;

import com.codigo.msrenzocueva.domain.aggregates.dto.PersonaDTO;
import com.codigo.msrenzocueva.infraestructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    Optional<PersonaEntity> findByNumDocu(String numDoc);

    boolean existsByNumDocu(String numDoc);
}