package com.federicoleal.portfolio.Controller;

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
import com.federicoleal.portfolio.model.Icono;
import com.federicoleal.portfolio.model.Usuario;
import com.federicoleal.portfolio.service.IIconosService;
import com.federicoleal.portfolio.service.UsuarioService;

@RestController
public class IconoController {

    @Autowired
    private IIconosService interIconos; 

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping ("/iconos/traer/{id}")
    public List<Icono> getIconos(@PathVariable Long id) {
    Usuario usuario = usuarioService.findUsuario(id);
    return interIconos.getIconos(usuario);
}

    @PostMapping ("/iconos/crear")
    public String createIcono(@RequestBody Icono icono) {
        interIconos.saveIcono(icono);
        return "Icono agregado correctamente";
    }

    @DeleteMapping ("/iconos/borrar/{id}")
    public String deleteIcono(@PathVariable Long id) {
        interIconos.deleteIcono(id);
        return "Icono eliminado";
    }

    @PutMapping ("/iconos/editar/{id}")
    public String editIcono(@PathVariable Long id,
                           @RequestParam ("img") String newImg,
                           @RequestParam ("link") String newLink,
                           @RequestParam ("name") String newName) {
        Icono iconoActual = interIconos.findIcono(id);
        iconoActual.setImg(newImg);
        iconoActual.setLink(newLink);
        iconoActual.setName(newName);
        interIconos.saveIcono(iconoActual);
        return "Icono Actualizado";
    }
    
}
