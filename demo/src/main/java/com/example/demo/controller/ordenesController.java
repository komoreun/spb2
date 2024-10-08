package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.ordenesModel;
import com.example.demo.service.serviceimpl.ordenesService;

import java.util.Optional;

@RestController
@RequestMapping("/ordenes")
@CrossOrigin
public class ordenesController {

    @Autowired
    private ordenesService ordenesService;

    // Método para listar todas las órdenes
    @GetMapping("/listar")
    public Iterable<ordenesModel> findAll() {
        return this.ordenesService.findAll();
    }

    // Método para obtener una orden por su id
    @GetMapping("/{id}")
    public Optional<ordenesModel> findById(@PathVariable("id") int id) {
        return this.ordenesService.findById(id);
    }

    // Método para crear una nueva orden
    @PostMapping("/crear")
    public ordenesModel create(@RequestBody ordenesModel orden) {
        return this.ordenesService.save(orden);
    }

    // Método para actualizar una orden existente
    @PutMapping("/actualizar/{id}")
    public ordenesModel update(@PathVariable("id") int id, @RequestBody ordenesModel orden) {
        orden.setId(id);  // Asegurarse de que el ID sea el correcto
        return this.ordenesService.save(orden);
    }

    // Método para eliminar una orden
    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") int id) {
        this.ordenesService.deleteById(id);
    }
}

