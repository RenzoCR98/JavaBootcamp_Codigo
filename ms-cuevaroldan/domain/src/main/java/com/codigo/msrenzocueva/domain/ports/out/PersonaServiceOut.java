package com.codigo.msrenzocueva.domain.ports.out;

import com.codigo.msrenzocueva.domain.aggregates.dto.PersonaDTO;
import com.codigo.msrenzocueva.domain.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDTO crearPersonaOut(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaOut(Long id);
    Optional<PersonaDTO> obtenerPersonaNumDocOut(String numDoc);
    List<PersonaDTO> obtenerTodosOut();
    PersonaDTO actualizarOut(Long id, RequestPersona requestPersona);
    PersonaDTO deleteOut(String numDoc);
}
