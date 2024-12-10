package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author erick
 */
public interface CategoriaService {
    //Metodo retorna una lista con las categorias que esten activas.
    public List<Categoria> getCategorias(boolean activos);
}
