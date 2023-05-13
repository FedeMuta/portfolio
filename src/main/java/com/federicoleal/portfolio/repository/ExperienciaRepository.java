package com.federicoleal.portfolio.repository;

import com.federicoleal.portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository  extends JpaRepository<Experiencia, Long> {
    
}
