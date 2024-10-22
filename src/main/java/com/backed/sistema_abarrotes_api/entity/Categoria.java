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
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;

    @NotBlank
    @Column(name = "descripcion", nullable = false, unique = true)
    private String descripcion;

    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;

    @Column(name = "estatus")
    private Character estatus;
}
