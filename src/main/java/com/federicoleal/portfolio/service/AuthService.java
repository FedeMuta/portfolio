package com.federicoleal.portfolio.service;

import io.jsonwebtoken.Jwts;

import com.federicoleal.portfolio.model.Usuario;
import com.federicoleal.portfolio.repository.AuthRepository;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepository authRepo;
    
    public Usuario getUsuario(String usuario) {
        Usuario user = authRepo.findUsuarioByUsuario(usuario);
        return user;
    }
    
    public String generateToken(Usuario usuario) {
    // clave secreta para JWT
    String secretKey = "bemg8qed1iwkqo0o682w"; //no logro hacer funcionar las variables de entorno en netbeans. por ahora hardcodear

    // Establecemos una duración para el token (por ejemplo, 10 horas)
    long expirationTime = 10 * 60 * 60 * 1000;

    // Creamos el token
    // por falta de tiempo no voy a poder implementar JWT, voy a dejarlo aca por el momento.
    return Jwts.builder()
            .setSubject(usuario.getUsuario()) // utilizamos el usuario como el "subject" del token
            .claim("nombre", usuario.getId()) // Podemos añadir cualquier información adicional que queramos
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
            .signWith(SignatureAlgorithm.HS256, secretKey)
            .compact();
}
    
}
