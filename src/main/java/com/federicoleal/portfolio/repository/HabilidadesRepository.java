package com.federicoleal.portfolio.repository;

import com.federicoleal.portfolio.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Long> {
    
}
