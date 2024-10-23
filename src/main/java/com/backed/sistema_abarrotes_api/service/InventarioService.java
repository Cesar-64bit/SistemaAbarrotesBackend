package com.backed.sistema_abarrotes_api.service;

import com.backed.sistema_abarrotes_api.entity.Inventario;

import java.util.List;
import java.util.Optional;

public interface InventarioService {

    Inventario saveInventario(Inventario inventario);

    Inventario updateInventario(Inventario inventario);

    List<Inventario> getInventario();

    Optional<Inventario> getInventarioById(long id);

    void deleteInventario(Long id);
}
