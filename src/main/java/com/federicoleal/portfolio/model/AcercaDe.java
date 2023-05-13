package com.federicoleal.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    
    @Id
    private Long userId; // userId es la clave primaria y foránea
    
    private String img;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String ubicacion;
    
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Usuario usuario;
    
}
