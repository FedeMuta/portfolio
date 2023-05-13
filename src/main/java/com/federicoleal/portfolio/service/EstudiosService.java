package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.repository.EstudiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService {
    
    @Autowired
    private EstudiosRepository estudiosRepo;
    
}
