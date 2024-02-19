package com.codigo.mscuevaroldan.application.controller;

import com.codigo.msrenzocueva.domain.aggregates.dto.PersonaDTO;
import com.codigo.msrenzocueva.domain.aggregates.request.RequestPersona;
import com.codigo.msrenzocueva.domain.ports.in.PersonaServiceIn;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@OpenAPIDefinition(
        info = @Info(
                title = "Api-Persona",
                version = "1.0",
                description = "Mantenimiento de una persona"
        )
)
@RestController
@RequestMapping("/v2/persona")
@RequiredArgsConstructor
public class PersonaController {
    private final PersonaServiceIn personaServiceIn;

    @Operation(summary = "Crea una persona")
    @PostMapping
    public ResponseEntity<PersonaDTO> registrar(@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }

    @Operation(summary = "Obten una persona por el numero de DNI")
    @GetMapping("/{numDoc}")
    public ResponseEntity<PersonaDTO>obtenerPersonaNumDoc(@PathVariable String numDoc){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerPersonaNumDocIn(numDoc).get());

    }

    @Operation(summary = "Obten todas las personas")
    @GetMapping()
    public ResponseEntity<List<PersonaDTO>>obtenerTodos(){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerTodosIn());

    }

    @Operation(summary = "Actualice a una persona")
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO>actualizar(@PathVariable Long id,@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.actualizarIn(id,requestPersona));

    }

    @Operation(summary = "Elimine una Persona por el DNI")
    @DeleteMapping("/{numDoc}")
    public ResponseEntity<PersonaDTO> eliminarPersona(@PathVariable String numDoc) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(personaServiceIn.deleteIn(numDoc));
    }
}
