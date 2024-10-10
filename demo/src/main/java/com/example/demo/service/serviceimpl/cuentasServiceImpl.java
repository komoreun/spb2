package com.example.demo.service.serviceimpl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.CommonSvcImpl;
import com.example.demo.models.cuentasModel;
import com.example.demo.repository.cuentasRepository;

@Service
public class cuentasServiceImpl extends CommonSvcImpl<cuentasModel, cuentasRepository> implements cuentasService {
    
    @Override
    @Transactional
    public Iterable<cuentasModel> findAll() {
        return this.repository.findAll();
    }

    @Override
    @Transactional
    public Optional<cuentasModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional
    public cuentasModel save(cuentasModel entity) {
        return this.repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    @Transactional
    public Iterable<cuentasModel> saveAll(Iterable<cuentasModel> entities) {
        return this.repository.saveAll(entities);
    }
}
