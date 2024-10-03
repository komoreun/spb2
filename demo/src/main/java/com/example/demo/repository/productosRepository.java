package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.productosModel;

public interface productosRepository extends CrudRepository<productosModel, Object> {
    
}
