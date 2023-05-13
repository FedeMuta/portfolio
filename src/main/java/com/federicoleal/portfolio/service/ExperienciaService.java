package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    
    @Autowired
    private ExperienciaRepository expreienciaRepo;
    
}
