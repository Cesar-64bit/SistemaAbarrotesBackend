package com.backed.sistema_abarrotes_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @NotBlank
    @Column(name = "clave_proveedor", nullable = false, unique = true, length = 15)
    private String claveProveedor;

    @NotBlank
    @Column(name = "nombre_proveedor", nullable = false, unique = true, length = 30)
    private String nombreProveedor;

    @Column(name = "rfc", unique = true, length = 13)
    private String rfc;

    @Column(name = "codigo_postal", length = 6)
    private String codigoPostal;

    @Column(name = "pais", length = 30)
    private String pais;

    @Column(name = "ciudad", length = 100)
    private String ciudad;

    @Column(name = "direccion", length = 50)
    private String direccion;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "correo_electronico", length = 255)
    private String correoElectronico;

    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;

    @Column(name = "estatus")
    private Character estatus;
}
