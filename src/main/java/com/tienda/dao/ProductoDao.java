package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author erick
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
