package com.intercorp.msirdigital.service.impl;

import com.intercorp.msirdigital.exception.type.BadRequestException;
import com.intercorp.msirdigital.model.dao.Client;
import com.intercorp.msirdigital.model.dto.model.Cliente;
import com.intercorp.msirdigital.model.dto.request.ClientSaveRequest;
import com.intercorp.msirdigital.model.dto.response.ClientDeleteResponse;
import com.intercorp.msirdigital.model.dto.response.ClientMetricResponse;
import com.intercorp.msirdigital.model.dto.response.ClientSaveResponse;
import com.intercorp.msirdigital.repository.ClientRepository;
import com.intercorp.msirdigital.service.ClientService;
import com.intercorp.msirdigital.util.UtilMethod;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    
    @Autowired
    UtilMethod util;
    
    @Autowired
    ClientRepository repository;

    @Override
    public List<Cliente> list() {
        List<Cliente> clientes = repository.findByActiveTrue()
                                            .stream()
                                            .map(m -> new Cliente(m.getId(), m.getName(), m.getSurname(), m.getAge(), util.convertDateFormat(m.getBirthday()), util.getDateOfDeath(m.getAge())))
                                            .collect(Collectors.toList());
        return clientes;
    }
    
    @Override
    public ClientMetricResponse metric() {
        List<Client> clients = repository.findByActiveTrue();
        return new ClientMetricResponse(clients.size(), util.calculatedAverage(clients), util.calculatedStandarVariation(clients));
    }

    @Override
    public ClientSaveResponse save(ClientSaveRequest request) {
        Client client = new Client();
        client.setAge(request.getEdad());
        client.setName(request.getNombre());
        client.setSurname(request.getApellido());
        client.setBirthday(request.getNacimiento());
        
        repository.save(client);
        
        return new ClientSaveResponse();
    }

    @Override
    public ClientDeleteResponse delete(Integer id) {
        Client client = repository.findById(id).orElseThrow(() -> new BadRequestException("No se encontro cliente."));
        repository.delete(client);
        return new ClientDeleteResponse();
    }
    
}
