package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/ver/e1/")


public class UsuarioControlador {

	@Autowired
	private RepositorioUsuario repositorio;
	
	
	@GetMapping("/guardar")
	public List<Usuario> guardarUsuario(){
		Usuario e = new Usuario(222L, "felipe","echeverri", 112233 , "34567" , "28/02/2000");
		this.repositorio.save(e);
		
		return this.repositorio.findAll();
	}
	
	@GetMapping("/cancelar")
	public String cancelarReserva() {
		this.repositorio.deleteById(123L);
		
		return "Reserva Cancelada";
	}
	
	@GetMapping("/consultar")
	public List<Usuario>verTodosUsuarios(){
		return repositorio.findAll();
	}
	
}