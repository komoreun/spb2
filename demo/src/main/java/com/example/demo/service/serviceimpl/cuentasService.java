package com.example.demo.service.serviceimpl;

import java.util.Optional;

import com.example.demo.common.CommonSvc;
import com.example.demo.models.cuentasModel;

public interface cuentasService extends CommonSvc<cuentasModel> {

    public Iterable<cuentasModel> findAll();
    public Optional<cuentasModel> findById(int Id);
    public cuentasModel save(cuentasModel entity);
    public void deleteById(int id);
    Iterable<cuentasModel> saveAll(Iterable<cuentasModel> entities);
    
}