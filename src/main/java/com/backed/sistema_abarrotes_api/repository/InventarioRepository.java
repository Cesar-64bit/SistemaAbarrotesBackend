package com.backed.sistema_abarrotes_api.repository;

import com.backed.sistema_abarrotes_api.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {

}
