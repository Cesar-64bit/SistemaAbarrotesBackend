package com.backed.sistema_abarrotes_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @NotBlank
    @Column(name = "codigo_producto", nullable = false)
    private String codigoProducto;

    @NotBlank
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @NotBlank
    @Column(name = "precio_venta", nullable = false)
    private BigDecimal precioVenta;

    @NotBlank
    @Column(name = "precio_compra", nullable = false)
    private BigDecimal precioCompra;

    @Column(name = "unidad_medida", nullable = false)
    private String unidadMedida;

    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;

    @Column(name = "estatus")
    private Character estatus;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;
}
