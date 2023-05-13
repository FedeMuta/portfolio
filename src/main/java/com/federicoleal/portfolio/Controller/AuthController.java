package com.federicoleal.portfolio.Controller;

import com.federicoleal.portfolio.model.Usuario;
import com.federicoleal.portfolio.service.AuthService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200") 
@RestController
public class AuthController {
    
    @Autowired
    private AuthService authService;
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("usuario");
        String password = loginData.get("password");

        Usuario usuario = authService.getUsuario(username);
        if (usuario.getUsuario().equals(username) && usuario.getPassword().equals(password)) {
            // Autenticación exitosa
            String token = authService.generateToken(usuario);
            Long userId = usuario.getId();
            
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("userId", userId);

            return ResponseEntity.ok(response);
            
        }

        // Autenticación fallida
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o contraseña inválidas");
    }
    

    
}
