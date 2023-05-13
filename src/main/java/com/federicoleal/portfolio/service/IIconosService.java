package com.federicoleal.portfolio.service;

import java.util.List;
import com.federicoleal.portfolio.model.Icono;
import com.federicoleal.portfolio.model.Usuario;

public interface IIconosService {

    /* trae todos los iconos del usuario*/
    public List<Icono> getIconos(Usuario usuario);

    /* alta icono */
    public void saveIcono(Icono icono);

    /* borrar icono */
    public void deleteIcono(Long id);

    /* encontrar icono */
    public Icono findIcono(Long id);
        
}
