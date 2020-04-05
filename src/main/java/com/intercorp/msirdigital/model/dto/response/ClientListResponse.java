package com.intercorp.msirdigital.model.dto.response;

import com.intercorp.msirdigital.model.dto.model.Cliente;
import com.intercorp.msirdigital.model.util.BaseResponse;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientListResponse extends BaseResponse {

    List<Cliente> clientes;

    public ClientListResponse() {
        this.clientes = new ArrayList<Cliente>();
    }
}
