package com.intercorp.msirdigital.service;

import java.util.List;

import com.intercorp.msirdigital.model.dto.model.Cliente;
import com.intercorp.msirdigital.model.dto.request.ClientSaveRequest;
import com.intercorp.msirdigital.model.dto.response.ClientDeleteResponse;
import com.intercorp.msirdigital.model.dto.response.ClientMetricResponse;
import com.intercorp.msirdigital.model.dto.response.ClientSaveResponse;

public interface ClientService {

    public List<Cliente> list();

    public ClientMetricResponse metric();

    public ClientSaveResponse save(ClientSaveRequest request);

    public ClientDeleteResponse delete(Integer id);
}
