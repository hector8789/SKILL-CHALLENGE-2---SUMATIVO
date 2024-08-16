package com.HB.gestion_inventario.repository;

import com.HB.gestion_inventario.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

