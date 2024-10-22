package com.backed.sistema_abarrotes_api.service;

import com.backed.sistema_abarrotes_api.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    Producto saveProducto(Producto producto);

    Producto updateProducto(Producto producto);

    List<Producto> getProductos();

    Optional<Producto> getProductoByID(Long id);

    void deleteProducto(Long id);
}
