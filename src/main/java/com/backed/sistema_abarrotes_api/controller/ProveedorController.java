package com.backed.sistema_abarrotes_api.controller;

import com.backed.sistema_abarrotes_api.entity.Proveedor;
import com.backed.sistema_abarrotes_api.service.ProveedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proveedores")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProveedorController {

    @Autowired
    ProveedorServiceImpl proveedorServiceImpl;

    @GetMapping
    public ResponseEntity<List<Proveedor>> getAllProveedores() {
        return new ResponseEntity<>(proveedorServiceImpl.getProveedores(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getProveedorById(@PathVariable Long id) {
        Optional<Proveedor> proveedor = proveedorServiceImpl.getProveedorByid(id);

        return proveedor.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(()->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<Proveedor> saveProveedor(@RequestBody Proveedor proveedor) {
        try {
            Proveedor savedProveedor = proveedorServiceImpl.saveProveedor(proveedor);

            return new ResponseEntity<>(savedProveedor, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
