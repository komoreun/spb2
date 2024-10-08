package com.example.demo.service.serviceimpl;

import java.util.Optional;

import com.example.demo.common.CommonSvc;
import com.example.demo.models.ordenesModel;

public interface ordenesService extends CommonSvc<ordenesModel> {
    public Iterable<ordenesModel> findAll();
    public Optional<ordenesModel> findById(int id);
    public ordenesModel save(ordenesModel entity);
    public void deleteById(int id);
    Iterable<ordenesModel> saveAll(Iterable<ordenesModel> entities);
    
}

