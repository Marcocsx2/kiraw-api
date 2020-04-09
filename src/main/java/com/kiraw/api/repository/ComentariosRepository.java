package com.kiraw.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiraw.api.entity.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Integer> {

}
