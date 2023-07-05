package com.jluque.security.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jluque.security.app.entity.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
