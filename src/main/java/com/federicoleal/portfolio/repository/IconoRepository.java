package com.federicoleal.portfolio.repository;

import com.federicoleal.portfolio.model.Icono;
import com.federicoleal.portfolio.model.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconoRepository  extends JpaRepository<Icono, Long> {

    public List<Icono> findIconoByUserId(Usuario usuario);
    
}
