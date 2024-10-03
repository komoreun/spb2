package com.example.demo.service;

import java.util.Optional;

import com.example.demo.common.CommonSvc;
import com.example.demo.models.clientesModel;

public interface clientesService extends CommonSvc<clientesModel> {
    public Iterable<clientesModel> findAll();
    public Optional<clientesModel> findById(int Id);
    public clientesModel save(clientesModel entity);
    public void deleteById(int id);
    Iterable<clientesModel> saveAll(Iterable<clientesModel> entities);
    
}
