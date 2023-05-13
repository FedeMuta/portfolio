package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.model.Usuario;
import com.federicoleal.portfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private UsuarioRepository userRepo;
    
    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> listaUsuarios = userRepo.findAll();
        return listaUsuarios;
    }

    @Override
    public void saveUsuario(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUsuario(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario user = userRepo.findById(id).orElse(null);
        return user;
    }
    
}
