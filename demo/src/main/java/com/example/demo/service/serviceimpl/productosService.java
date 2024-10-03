package com.example.demo.service.serviceimpl;

import java.util.Optional;

import com.example.demo.common.CommonSvc;
import com.example.demo.models.productosModel;

public interface productosService extends CommonSvc<productosModel> {
    public Iterable<productosModel> findAll();
    public Optional<productosModel> findById(int id);
    public productosModel save(productosModel entity);
    public void deleteById(int id);
    Iterable<productosModel> saveAll(Iterable<productosModel> entities);
    
}
