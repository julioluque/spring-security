package com.jluque.security.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(schema = "security", name = "contacto")
public class Contacto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontacto")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "fechanac")
	private LocalDate fechaNacimiento;

	@Column(name = "celular")
	private String celular;

	@Column(name = "email")
	private String email;

}
