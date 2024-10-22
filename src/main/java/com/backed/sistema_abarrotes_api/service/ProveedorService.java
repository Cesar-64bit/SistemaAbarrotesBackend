package com.backed.sistema_abarrotes_api.service;

import com.backed.sistema_abarrotes_api.entity.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {

    Proveedor saveProveedor(Proveedor proveedor);

    Proveedor updateProveedor(Proveedor proveedor);

    List<Proveedor> getProveedores();

    Optional<Proveedor> getProveedorByid(Long id);

    void deleteProveedor(Long id);
}
