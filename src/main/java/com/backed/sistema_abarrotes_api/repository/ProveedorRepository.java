package com.backed.sistema_abarrotes_api.repository;

import com.backed.sistema_abarrotes_api.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

}
