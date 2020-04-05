package com.intercorp.msirdigital.controller;

import com.intercorp.msirdigital.model.dto.model.Cliente;
import com.intercorp.msirdigital.model.dto.request.ClientSaveRequest;
import com.intercorp.msirdigital.model.dto.response.ClientDeleteResponse;
import com.intercorp.msirdigital.model.dto.response.ClientMetricResponse;
import com.intercorp.msirdigital.model.dto.response.ClientSaveResponse;
import com.intercorp.msirdigital.service.ClientService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Fernando Supo
 *
 */
@RestController
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping("/listclientes")
    public ResponseEntity<List<Cliente>> list() {
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
    
    @GetMapping("/kpideclientes")
    public ResponseEntity<ClientMetricResponse> metric() {
        return new ResponseEntity<>(service.metric(), HttpStatus.OK);
    }

    @PostMapping("/creacliente")
    public ResponseEntity<ClientSaveResponse> save(@RequestBody ClientSaveRequest request) {
        return new ResponseEntity<>(service.save(request), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<ClientDeleteResponse> delete(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
