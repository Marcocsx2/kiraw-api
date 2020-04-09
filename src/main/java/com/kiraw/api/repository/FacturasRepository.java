package com.kiraw.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiraw.api.entity.Factura;

public interface FacturasRepository extends JpaRepository<Factura, Integer> {

}
