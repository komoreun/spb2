package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.cuentasModel;
import com.example.demo.service.serviceimpl.cuentasService;

@RestController
@RequestMapping("/cuentas")
@CrossOrigin
public class cuentasController {
    @Autowired
    private cuentasService cuentasService;

    // Método para listar todas las cuentas
    @GetMapping("/listar")
    public Iterable<cuentasModel> findAll() {
        return this.cuentasService.findAll();
    }

    // Método para obtener una cuenta por su id
    @GetMapping("/{id}")
    public Optional<cuentasModel> findById(@PathVariable("id") int id) {
        return this.cuentasService.findById(id);
    }

    // Método para crear una nueva cuenta
    @PostMapping("/crear")
    public cuentasModel create(@RequestBody cuentasModel cuenta) {
        return this.cuentasService.save(cuenta);
    }

    // Método para actualizar una cuenta existente
    @PutMapping("/actualizar/{id}")
    public cuentasModel update(@PathVariable("id") int id, @RequestBody cuentasModel cuenta) {
        cuenta.setId(id); // Asegurarse de que el ID sea el correcto
        return this.cuentasService.save(cuenta);
    }

    // Método para eliminar una cuenta
    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") int id) {
        this.cuentasService.deleteById(id);
    }
}
