package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.clientesModel;


public interface clienteRepository extends CrudRepository<clientesModel, Object> {

    clientesModel findByNombre(String nombre);
    
}
