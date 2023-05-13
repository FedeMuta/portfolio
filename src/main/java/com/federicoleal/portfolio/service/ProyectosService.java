package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {
    
    @Autowired
    private ProyectosRepository proyectosRepo;
    
}
