package com.codigo.msrenzocueva.domain.impl;

import com.codigo.msrenzocueva.domain.aggregates.dto.PersonaDTO;
import com.codigo.msrenzocueva.domain.aggregates.request.RequestPersona;
import com.codigo.msrenzocueva.domain.ports.in.PersonaServiceIn;
import com.codigo.msrenzocueva.domain.ports.out.PersonaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaServiceIn {
    private final PersonaServiceOut personaServiceOut;
    @Override
    public PersonaDTO crearPersonaIn(RequestPersona requestPersona) {
        return personaServiceOut.crearPersonaOut(requestPersona);
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaIn(Long id) {
        return personaServiceOut.obtenerPersonaOut(id);
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaNumDocIn(String numDoc) {
        return personaServiceOut.obtenerPersonaNumDocOut(numDoc);
    }

    @Override
    public List<PersonaDTO> obtenerTodosIn() {
        return personaServiceOut.obtenerTodosOut();
    }

    @Override
    public PersonaDTO actualizarIn(Long id, RequestPersona requestPersona) {
        return personaServiceOut.actualizarOut(id,requestPersona);
    }

    @Override
    public PersonaDTO deleteIn(String numDoc) {
        return personaServiceOut.deleteOut(numDoc);
    }
}
