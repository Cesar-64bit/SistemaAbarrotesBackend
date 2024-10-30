package com.backed.sistema_abarrotes_api.controller;

import com.backed.sistema_abarrotes_api.entity.Categoria;
import com.backed.sistema_abarrotes_api.service.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:4200/")
public class CategoriaController {

    @Autowired
    CategoriaServiceImpl categoriaServiceImpl;

    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategorias() {
        return new ResponseEntity<>(categoriaServiceImpl.getCategorias(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable Long id) {
        Optional<Categoria> categoria = categoriaServiceImpl.getCategoriaById(id);

        return categoria.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(()->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Categoria> saveCategoria(@RequestBody Categoria categoria) {
        try {
            Categoria savedCategoria = categoriaServiceImpl.saveCategoria(categoria);

            return new ResponseEntity<>(savedCategoria, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<Categoria> updateCategoria(@RequestBody Categoria categoria) {
        try {
            Categoria savedCategoria = categoriaServiceImpl.updateCategoria(categoria);

            return new ResponseEntity<>(savedCategoria, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        Optional<Categoria> categoria = categoriaServiceImpl.getCategoriaById(id);

        if(categoria.isPresent()) {
            categoriaServiceImpl.deleteCategoria(categoria.get().getIdCategoria());

            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
