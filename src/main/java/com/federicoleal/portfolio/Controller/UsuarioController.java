package com.federicoleal.portfolio.Controller;

import com.federicoleal.portfolio.model.Usuario;
import com.federicoleal.portfolio.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService interUser;
    
    @GetMapping ("/usuarios/traer")
    public List<Usuario> getUsuarios() {
        return interUser.getUsuarios();
    }
    
    @PostMapping ("/usuarios/crear")
    public String createUser(@RequestBody Usuario user){
        interUser.saveUsuario(user);
        return "Usuario agregado correctamente";                
    }
    
    @DeleteMapping ("/usuarios/borrar/{id}")
    public String deleteUser(@PathVariable Long id){
        interUser.deleteUsuario(id);
        return "Usuario eliminado";
    }
    
    @PutMapping ("usuarios/editar/{id}")
    public Usuario editUser(@PathVariable Long id,
                            @RequestParam ("usuario") String nuevoUsuario,
                            @RequestParam ("password") String nuevoPass) {
        Usuario user = interUser.findUsuario(id);
        user.setUsuario(nuevoUsuario);
        user.setPassword(nuevoPass);
        
        interUser.saveUsuario(user);
        return user;
    }
            
}
