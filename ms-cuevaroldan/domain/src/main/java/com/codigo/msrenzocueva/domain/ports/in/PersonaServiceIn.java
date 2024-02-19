package com.codigo.msrenzocueva.domain.ports.in;

import com.codigo.msrenzocueva.domain.aggregates.dto.PersonaDTO;
import com.codigo.msrenzocueva.domain.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {
    PersonaDTO crearPersonaIn(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaIn(Long id);
    Optional<PersonaDTO> obtenerPersonaNumDocIn(String numDoc);
    List<PersonaDTO> obtenerTodosIn();
    PersonaDTO actualizarIn(Long id, RequestPersona requestPersona);
    PersonaDTO deleteIn(String numDoc);
}
