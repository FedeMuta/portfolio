package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService {
    
    @Autowired
    private HabilidadesRepository habilidadesRepo;
    
}
