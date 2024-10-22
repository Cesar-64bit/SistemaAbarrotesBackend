package com.backed.sistema_abarrotes_api.repository;

import com.backed.sistema_abarrotes_api.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
