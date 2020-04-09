package com.kiraw.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiraw.api.entity.Producto;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
