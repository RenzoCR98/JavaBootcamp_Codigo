package com.codigo.msrenzocueva.infraestructure.repository;

import com.codigo.msrenzocueva.infraestructure.entity.TipoDocumentoEntity;
import com.codigo.msrenzocueva.infraestructure.entity.TipoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Long> {
    TipoPersonaEntity findByCodTipo(@Param("codTipo") String codTipo);
}
