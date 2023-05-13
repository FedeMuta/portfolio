package com.federicoleal.portfolio.service;

import com.federicoleal.portfolio.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    // trae todos los usuarios
    public List<Usuario> getUsuarios();
    
    // alta usuario
    public void saveUsuario(Usuario user);
    
    // borrar usuario
    public void deleteUsuario(Long id);
    
    // encontrar usuario
    public Usuario findUsuario(Long id);
    
}
