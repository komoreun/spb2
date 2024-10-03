package com.example.demo.service.serviceimpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.common.CommonSvcImpl;
import com.example.demo.models.clientesModel;
import com.example.demo.repository.clienteRepository;
import com.example.demo.service.clientesService;


@Service
public class clientesServiceImpl extends CommonSvcImpl<clientesModel, clienteRepository> implements clientesService {

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<clientesModel> findAll() {
        return this.repository.findAll();

    }

    @Override
    public Optional<clientesModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public clientesModel save(clientesModel entity) {
        return this.repository.save(entity);
    }

    @Override
    public Iterable<clientesModel> saveAll(Iterable<clientesModel> entities) {
        return this.repository.saveAll(entities);
    }
    
}
