package com.example.demo.service.serviceimpl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.CommonSvcImpl;
import com.example.demo.models.ordenesModel;
import com.example.demo.repository.ordenesRepository;

@Service
public class ordenesServiceImpl extends CommonSvcImpl<ordenesModel, ordenesRepository> implements ordenesService {

    @Override
    @Transactional
    public Iterable<ordenesModel> findAll() {
        return this.repository.findAll();
    }

    @Override
    @Transactional
    public Optional<ordenesModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional
    public ordenesModel save(ordenesModel entity) {
        return this.repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    @Transactional
    public Iterable<ordenesModel> saveAll(Iterable<ordenesModel> entities) {
        return this.repository.saveAll(entities);
    }
    
}
