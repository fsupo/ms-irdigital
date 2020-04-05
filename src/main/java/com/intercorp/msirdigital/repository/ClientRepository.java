package com.intercorp.msirdigital.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intercorp.msirdigital.model.dao.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    List<Client> findByActiveTrue();
}
