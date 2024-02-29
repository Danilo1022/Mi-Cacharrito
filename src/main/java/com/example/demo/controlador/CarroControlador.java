package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Carro;
import com.example.demo.repositorio.RepositorioCarro;
import com.example.demo.repositorio.RepositorioReserva;

@RestController
@RequestMapping("/ver/e3/")

public class CarroControlador {
	@Autowired
	private RepositorioCarro repositorio;
	
	@GetMapping("/guardar")
	public List<Carro> guadarCarro(){
		Carro e = new Carro(124L,50,7);
		this.repositorio.save(e);
		
		return this.repositorio.findAll() ;
	}
}
