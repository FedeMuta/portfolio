package com.federicoleal.portfolio.repository;

import com.federicoleal.portfolio.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository<Estudios, Long> {
    
}
