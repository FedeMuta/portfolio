package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.model.Icono;
import com.federicoleal.portfolio.model.Usuario;
import com.federicoleal.portfolio.repository.IconoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IconoService implements IIconosService {
    
    @Autowired
    private IconoRepository iconoRepo;

    @Override
    public List<Icono> getIconos(Usuario usuario) {
        List<Icono> listaIconos = iconoRepo.findIconoByUserId(usuario);
        return listaIconos;
    }

    @Override
    public void saveIcono(Icono icono) {
        iconoRepo.save(icono);
    }

    @Override
    public void deleteIcono(Long id) {
        iconoRepo.deleteById(id);
    }

    @Override
    public Icono findIcono(Long id) {
        Icono icono = iconoRepo.findById(id).orElse(null);
        return icono;
    }

}