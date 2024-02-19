package com.codigo.msrenzocueva.domain.ports.out;

import com.codigo.msrenzocueva.domain.aggregates.response.ResponseReniec;

public interface RestReniecOut {
    ResponseReniec getInfoReniec(String numDoc);
}
