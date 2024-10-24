package com.backed.sistema_abarrotes_api.service;

import com.backed.sistema_abarrotes_api.entity.Inventario;
import com.backed.sistema_abarrotes_api.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;

    @Override
    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public Inventario updateInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public List<Inventario> getInventario() {
        return inventarioRepository.findAll();
    }

    @Override
    public Optional<Inventario> getInventarioById(long id) {
        return inventarioRepository.findById(id);
    }

    @Override
    public void deleteInventario(Long id) {
        inventarioRepository.deleteById(id);
    }
}
