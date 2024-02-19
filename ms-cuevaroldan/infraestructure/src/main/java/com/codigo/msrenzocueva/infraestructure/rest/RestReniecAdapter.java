package com.codigo.msrenzocueva.infraestructure.rest;

import com.codigo.msrenzocueva.domain.aggregates.response.ResponseReniec;
import com.codigo.msrenzocueva.domain.ports.out.RestReniecOut;
import com.codigo.msrenzocueva.infraestructure.rest.client.ClienteReniec;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestReniecAdapter implements RestReniecOut {

    private final ClienteReniec reniec;

    @Value("${token.api}")
    private String tokenApi;

    @Override
    public ResponseReniec getInfoReniec(String numDoc) {
        String authorization = "Bearer " + tokenApi;
        ResponseReniec responseReniec = reniec.getInfoReniec(numDoc,authorization);
        return responseReniec;
    }
}
