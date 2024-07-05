
package com.tienda.service;

import java.util.List;
import com.tienda.domain.Categoria;


public interface CategoriaService {
    // Se obtiene un lista de categorias en un List
    
    public List<Categoria> getCategorias(boolean activos);
        
    
}
