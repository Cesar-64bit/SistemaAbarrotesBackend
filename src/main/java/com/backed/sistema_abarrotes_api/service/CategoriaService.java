package com.backed.sistema_abarrotes_api.service;

import com.backed.sistema_abarrotes_api.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    Categoria saveCategoria(Categoria categoria);

    Categoria updateCategoria(Categoria categoria);

    List<Categoria> getCategorias();

    Optional<Categoria> getCategoriaById(Long id);

    void deleteCategoria(Long id);
}
