package com.jluque.security.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jluque.security.app.entity.Contacto;
import com.jluque.security.app.repository.ContactoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {

	private final ContactoRepository contactoRepository;

	@GetMapping
	public List<Contacto> listContacto() {
		return contactoRepository.findAll();
	}

}
