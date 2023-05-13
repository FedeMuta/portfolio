package com.federicoleal.portfolio.repository;

import com.federicoleal.portfolio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Usuario, Long> {
    
    public Usuario findUsuarioByUsuario(String usuario);
    
}
