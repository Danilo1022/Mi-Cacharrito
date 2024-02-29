package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")

public class Usuario {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	

	@Column(name = "apellidos", length = 80, nullable = false)
	private String apellidos;
	
	@Column(name = "cedula", length = 100, nullable = false, unique = true)
	private Integer cedula;
	
	@Column(name = "telefono", length = 100, nullable = false)
	private String telefono;
	
	@Column(name = "FechaNacimiento", length = 100, nullable = false)
	private String FechaNacimiento;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long id, String nombre, String apellidos, Integer cedula, String telefono, String fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.telefono = telefono;
		FechaNacimiento = fechaNacimiento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	
	
}