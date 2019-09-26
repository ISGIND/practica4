package com.everis.practicacloudcompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.practicacloudcompra.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

}
