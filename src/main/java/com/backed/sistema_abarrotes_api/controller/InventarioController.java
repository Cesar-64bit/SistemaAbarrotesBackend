package com.backed.sistema_abarrotes_api.controller;

import com.backed.sistema_abarrotes_api.entity.Inventario;
import com.backed.sistema_abarrotes_api.service.InventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventario")
@CrossOrigin(origins = "http://localhost:4200/")
public class InventarioController {

    @Autowired
    InventarioServiceImpl inventarioServiceImpl;

    @GetMapping
    public ResponseEntity<List<Inventario>> getAllInventario() {
        return new ResponseEntity<>(inventarioServiceImpl.getInventario(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inventario> getInventarioById(@PathVariable Long id) {
        Optional<Inventario> inventario = inventarioServiceImpl.getInventarioById(id);

        return inventario.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(()->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
